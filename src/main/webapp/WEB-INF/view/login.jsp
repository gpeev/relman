<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
    <head>
        <title><spring:message code="login.title" /></title>
    </head>
    <body>
        <sec:authorize access="isAnonymous()">
		        <h3><spring:message code="login.header" /></h3>
		
		        <c:if test="${not empty error}">
      			    <p class="error"><spring:message code="login.error" /></p>
		        </c:if>
		
	    	    <p id="userWarning" class="error" style="display:none"><spring:message code="login.nouser" /></p>
		
    		    <form action="/login/submit" method="post">
    		    <fieldset>      
                <div class="clearfix">
                	<spring:message code="login.label.username" />
                    <input type="text" name="username" class="xlarge" value="<c:if test="${not empty error}"><c:out value="${SPRING_SECURITY_LAST_USERNAME}" escapeXml="false" /></c:if>"/>
                </div>
                <div class="clearfix">
                    <spring:message code="login.label.password" />
                    <input type="password" name="password" class="xlarge"/>
                </div>
                <div class="clearfix">
                	<spring:message code="login.label.remember" />
                    <input type="checkbox" name="remember_me" />
                </div>
                
                <div class="clearfix modal-footer">
                    <a href="#" class="btn secondary" onclick="hidePopup('login');">Cancel</a>
                    <input name="submit" type="submit" class="btn primary" value="<spring:message code="global.submit" />" />
                </div>
            </fieldset>
		        </form>
		
		        <p><spring:message code="login.create" htmlEscape="false" /></p>
		    </sec:authorize>

        <sec:authorize access="isAuthenticated()">
            <p><spring:message code="global.logout" htmlEscape="false" /></p>
        </sec:authorize>

		    <script type="text/javascript">
            $(document).ready(function () {
                $("input[name='username']").blur(function () {
                    var values = {};
                    values['username'] = this.value;
                    
                    sendJson(
                        values,
                        '/login/validate',
                        function(result) { 
                            if (result.found) {
                                $('#userWarning').hide();
                            } else {
                                $('#userWarning').show();
                            }
                        }
                    );
                });
            });
        </script>
	  </body>
</html>
