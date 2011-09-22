<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title><decorator:title /></title>
    <decorator:head />
    <%@ include file="/WEB-INF/view/includes/style.jsp" %>
    <meta charset="utf-8">




	<script type="application/javascript">
		function displayPopup(id){
			document.getElementById(id).style.display = 'block';
		}

		function hidePopup(id){
			document.getElementById(id).style.display = 'none';
		}


	</script>

  </head>

    <body>
        <div id="header">
            <%@ include file="/WEB-INF/view/includes/header.jsp" %>
        </div>
        <div id="javascript" >
            <%@ include file="/WEB-INF/view/includes/script.jsp" %>
        </div>
        <div id="content">
        	<div class="container">
            	<decorator:body />
            </div>
        </div>
        <div id="footer">
            <%@ include file="/WEB-INF/view/includes/footer.jsp" %>
        </div>
    </body>
</html>
