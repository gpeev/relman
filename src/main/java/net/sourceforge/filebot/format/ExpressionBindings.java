
package net.sourceforge.filebot.format;


import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.script.Bindings;

import net.sourceforge.tuned.ExceptionUtilities;


public class ExpressionBindings extends AbstractMap<String, Object> implements Bindings {
	
	protected final Object bindingBean;
	
	protected final Map<String, Method> bindings = new TreeMap<String, Method>(String.CASE_INSENSITIVE_ORDER);
	
	protected final Method undefined;
	

	public ExpressionBindings(Object bindingBean) {
		this.bindingBean = bindingBean;
		
		// get method bindings
		for (Method method : bindingBean.getClass().getMethods()) {
			Define define = method.getAnnotation(Define.class);
			
			if (define != null) {
				for (String name : define.value()) {
					Method existingBinding = bindings.put(name, method);
					
					if (existingBinding != null)
						throw new IllegalArgumentException(String.format("Illegal binding {%s} on %s", name, method.getName()));
				}
			}
		}
		
		// extract mapping that handles undefined bindings
		undefined = bindings.remove(Define.undefined);
	}
	

	public Object getBindingBean() {
		return bindingBean;
	}
	

	protected Object evaluate(final Method method) throws Exception {
		Object value = method.invoke(bindingBean);
		
		if (value != null) {
			return value;
		}
		
		// invoke fallback method
		return undefined.invoke(bindingBean);
	}
	

	@Override
	public Object get(Object key) {
		Method method = bindings.get(key);
		
		if (method != null) {
			try {
				return evaluate(method);
			} catch (Exception e) {
				throw new BindingException(key.toString(), ExceptionUtilities.getRootCauseMessage(e), e);
			}
		}
		
		return null;
	}
	

	@Override
	public Object put(String key, Object value) {
		// bindings are immutable
		return null;
	}
	

	@Override
	public Object remove(Object key) {
		// bindings are immutable
		return null;
	}
	

	@Override
	public boolean containsKey(Object key) {
		return bindings.containsKey(key);
	}
	

	@Override
	public Set<String> keySet() {
		return bindings.keySet();
	}
	

	@Override
	public boolean isEmpty() {
		return bindings.isEmpty();
	}
	

	@Override
	public Set<Entry<String, Object>> entrySet() {
		Set<Entry<String, Object>> entrySet = new HashSet<Entry<String, Object>>();
		
		for (final String key : keySet()) {
			entrySet.add(new Entry<String, Object>() {
				
				@Override
				public String getKey() {
					return key;
				}
				

				@Override
				public Object getValue() {
					return get(key);
				}
				

				@Override
				public Object setValue(Object value) {
					return put(key, value);
				}
			});
		}
		
		return entrySet;
	}
	
}
