
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title><spring:message code="activate.title" /></title>
    </head>
    <body>
        <c:choose>
            <c:when test="${not empty error}">
                <h2><spring:message code="activate.error" /></h2>
            </c:when>
            <c:otherwise>
                <h2><spring:message code="activate.header" /></h2>
            </c:otherwise>
        </c:choose>
        <p><spring:message code="global.login" htmlEscape="false" /></p>
    </body>
</html>
