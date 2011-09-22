
package net.sourceforge.tuned.ui;


import javax.swing.Icon;


public interface LabelProvider<T> {
	
	public String getText(T value);
	

	public Icon getIcon(T value);
	
}
