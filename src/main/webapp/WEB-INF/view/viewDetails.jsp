<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.jappstart.model.vo.*, java.util.*" %>

<html>
    <head>
        <title><spring:message code="add.title" /></title>
    </head>
    <body>
    <%
        Release rel = (Release) request.getAttribute("releaseInfo");
    	if (rel == null){
    %>
    	<section id="viewDetails">
       		<div class="page-header">
	        	<h3>I can't find what your looking for!</h3>
	    	</div>
  		</section>
    <%
    	} else {
    %>
    
    <section id="viewDetails">
       	<div class="page-header">
	        <h1><%=rel.getTitle()%></h1>
	
	        <div style="float:right; top:-25px; position:relative;">
	            <a href="#">List</a> |
	            <a href="#">Images</a>
	        </div>
	    </div>

    	
  	</section>
	<% } %>
    </body>
</html>
