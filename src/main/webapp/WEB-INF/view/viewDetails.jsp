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
	        	<h3>Opps, I can't find what your looking for!</h3>
	    	</div>
  		</section>
    <%
    	} else {
    		//TODO Make this adjustable to display different portions.
    		TVInfo info = rel.getReleaseInfo();
    %>
    
    <section id="viewDetails">
    	<div class="row">
	       	<div class="page-header">
		        <h3><%=rel.getTitle()%>  <span class="label important" style="font-size: 14px;"><%=rel.getDate()%></span></h3>
		        <div style="float:right; top:-35px; position:relative;">
                    <img src="/img/twitsmall.png"/>
            		<img src="/img/fbsmall.png" style="left-padding:10px;"/>
                </div>
		    </div>
			<div class="span4">
				<img src="/img/underworld.jpg" style="display: block; z-index: 5;" height="240" width="160">
			</div>
			<div class="span9">
				<h5>Cast:        <%=info.getCast()%></h5>
				<h5>Genre:       <%=info.getGenre()%></h5>
				<h5>Rating:      <%=info.getRating()%></h5>
				<h5>Network:     <%=info.getNetwork()%></h5>
				<h5 style="line-height:24px;">Description: <span style="font-weight:normal"><%=info.getDescription()%> + a bunch of other garbage that needs to be removed.  Just wanted to show you what the carry over on long paragraphs looks like.  :D.   I hope that does not get converted into a smiley.</span></h5>

			</div>
			<div class="span3">
			</div>
    	</div>
    	<div class="row">
    	
    	</div>
  	</section>
  	<section id="epDetails">
    	<div class="row">
	       	<div class="page-header">
		        <h3>Episodes</h3>
		    </div>
			<div class="span16">
				<table class="zebra-striped">
				    <thead>
				    <tr>
				        <th>Episode #</th>
				        <th>Title</th>
				        <th>Air Date</th>
				        <th>Description</th>
				    </tr>
				    </thead>
				    <tbody>
				    <tr>
				        <td>1
				        </td>
				        <td>Lion-O vs Mumra
				        </td>
				        <td>09/12/2011
				        </td>
				        <td>Lion-O comes face to face against Mumra
				        </td>
				     </tr>
				     <tr>
				        <td>2
				        </td>
				        <td>Lion-O vs Dad
				        </td>
				        <td>09/25/2011
				        </td>
				        <td>Lion-O must explain to his dad why he sucks at leading.
				        </td>
				    </tr>
				    </tbody>
				</table>
			</div>
    	</div>
  	</section>
  	
	<% } %>
    </body>
</html>
