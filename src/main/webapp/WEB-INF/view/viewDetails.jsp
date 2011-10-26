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
				<h5><span class="detailText">Cast:</span>       <span class="text"><%=info.getCast()%></span></h5>
				<h5><span class="detailText">Genre:  </span>     <span class="text"><%=info.getGenre()%></span></h5>
				<h5><span class="detailText">Rating:</span>     <span class="text"> <%=info.getRating()%></span></h5>
				<h5><span class="detailText">Network: </span>  <span class="text">  <%=info.getNetwork()%></span></h5>
				<h5 class="lineHeight24"><span class="detailText">Description:</span> <span class="text"><%=info.getDescription()%> + a bunch of other garbage that needs to be removed.  Just wanted to show you what the carry over on long paragraphs looks like.  :D.   I hope that does not get converted into a smiley.</span></h5>

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
				    <%
				        List<TVEp> p = info.getEpisodes();
				        for (int i = 0; i < p.size(); i++)
				        {
				            TVEp ep = p.get(i);
				    %>
				
				    <tr>
				        <td><%=i + 1%>
				        </td>
				        <td><%=ep.getEpisodeTitle()%>
				        </td>
				        <td><%=ep.getAir_date()%>
				        </td>
				        <td><%=ep.getDescription()%>
				        </td>
				    </tr>
				    <%
				        }
				    %>
				
				    </tbody>
				</table>
			</div>
    	</div>
  	</section>
  	
	<% } %>
    </body>
</html>
