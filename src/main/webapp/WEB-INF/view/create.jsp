<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title><spring:message code="create.title" /></title>
    </head>
    <body>
    	<div class="row">
		    <form:form modelAttribute="register" action="/register/create" method="post">
            <fieldset>      
                <h1><spring:message code="create.legend" /></h1>
                <div class="clearfix">
                    <form:label for="displayName" path="displayName" cssErrorClass="error"><spring:message code="create.label.displayName" /></form:label>
                    <div class="input">
                    <form:input path="displayName" cssClass="xlarge" />
                    <form:errors path="displayName" cssClass="error" />     
                    </div>    
                </div>
                <div class="clearfix">
                    <form:label for="username" path="username" cssErrorClass="error"><spring:message code="create.label.username" /></form:label>
                    <div class="input">
                    <form:input path="username" cssClass="xlarge" />
                    <form:errors path="username" cssClass="error" />
                    </div>
                </div>
                <div class="clearfix">
                    <form:label for="email" path="email" cssErrorClass="error"><spring:message code="create.label.email" /></form:label>
                    <div class="input">
                    <form:input path="email" cssClass="xlarge"/>
                    <form:errors path="email" cssClass="error" />
                    </div>
                </div>
                <div class="clearfix">
                    <form:label for="password" path="password" cssErrorClass="error"><spring:message code="create.label.password" /></form:label>
                    <div class="input">
                    <form:password path="password" cssClass="xlarge" />
                    <form:errors path="password" cssClass="error" />
                    </div>
                </div>
                <div class="clearfix">
                    <input name="reset" type="reset" class="btn secondar" value="<spring:message code="global.reset" />" /> 
                    <input name="submit" type="submit" class="btn primary" value="<spring:message code="global.submit" />" />
                </div>
            </fieldset>
        </form:form>
        </div>
 
    </body>
</html>
