<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title><spring:message code="add.title" /></title>
    </head>
    <body>
    <section id="addRelease">
       	<div class="row">
       		<div style="display:block;" id="addReleaseForm"> 
			    <form:form modelAttribute="add" action="/add" method="post">
	            <fieldset>      
	               	<div class="page-header">
      					<h1><spring:message code="add.legend" /><small> Required Fields</small></h1>
    				</div>
	                <div class="clearfix">
	                    <form:label for="title" path="title" cssErrorClass="error"><spring:message code="add.label.title" /></form:label>
	                    <div class="input">
	                    <form:input path="title" cssClass="xlarge" size="30" type="text" />
	                    <form:errors path="title" cssClass="error" />     
	                    </div>    
	                </div>	                

	                <div class="clearfix">
		              <form:label for="type" path="type" cssErrorClass="error"><spring:message code="add.label.type" /></form:label>
		              <div class="input">
		                <form:select path="type">
		                  <form:option value="NONE" label="--- Select ---"/>
		                  <form:option value="TVSHOW" label="TV Show"/>
		                  <form:option value="MOVIE" label="Movie"/>
		                  <form:option value="MUSIC" label="Music"/>
		                  <form:option value="GAME" label="Video Game"/>
		                  <form:option value="BOOK" label="Book"/>
		                  <form:option value="GADGET" label="Gadget"/>
		                </form:select>
		              </div>
		            </div>
	                
	                <div class="clearfix">
	                    <form:label for="description" path="description" cssErrorClass="error"><spring:message code="add.label.description" /></form:label>
	                    <div class="input">
	                    <form:textarea path="description" cssClass="xxlarge" />
	                    <span class="help-block">
            				Keep it short and sweet.
          				</span>
	                    <form:errors path="description" cssClass="error" />
	                    </div>
	                </div>
	                
	                <script type="text/javascript">
		                $(function() {
		                    $("#datepicker").datepicker();
		                });
	                </script>
	                
	                <div class="clearfix">
	                    <form:label for="releaseDate" path="releaseDate" cssErrorClass="error"><spring:message code="add.label.releaseDate" /></form:label>
	                    <div class="input">
	                    	<div class="inline-inputs">
			                    <form:input path="releaseDate" cssClass="xlarge" type="text" id="datepicker"/>
			                    <form:errors path="releaseDate" cssClass="error" />
	                    	</div>
	                    </div>
	                </div>
	                
	                <div class="clearfix">
	                    <form:label for="imageLocation" path="imageLocation" cssErrorClass="error"><spring:message code="add.label.image" /></form:label>
	                    <div class="input">
		                    <form:input path="imageLocation" cssClass="input-file" id="fileInput" type="file" />
		                    <form:errors path="imageLocation" cssClass="error" />
	                    </div>
	                </div>

				    <div class="page-header">
				      <h3>More Info <small> Optional Fields</small></h3>
				    </div>
    
		            <div class="clearfix">
		              <form:label for="network" path="network">Network: </form:label>
		              <div class="input">
		                <form:input class="xlarge" path="network" size="10" type="text" style="width:100px;" />
		                <form:errors path="network" cssClass="error"/>
		              </div>
		            </div>
		    
		    		<div class="clearfix">
		              <form:label for="cast" path="cast">Cast: </form:label>
		              <div class="input">
		                <form:input class="xlarge" path="cast" size="30" type="text"/>
		                <form:errors path="cast" cssClass="error"/>
		              </div>
		            </div>
		            
		            <div class="clearfix">
		              <form:label for="director" path="director">Director: </form:label>
		              <div class="input">
		                <form:input class="xlarge" path="director" size="30" type="text"/>
		                <form:errors path="director" cssClass="error"/>
		              </div>
		            </div>
		            
		            <div class="clearfix">
		              <form:label for="rating" path="rating">Director: </form:label>
		              <div class="input">
		                <form:input class="xlarge" path="rating" size="10" type="text" style="width:50px;"/>
		                <form:errors path="rating" cssClass="error"/>
		              </div>
		            </div>
		            
		           	<div class="clearfix">
				        <input name="reset" type="reset" class="btn large secondary" style="width=auto;" value="<spring:message code="global.reset" />" /> 
				        <input name="submit" type="submit" class="btn large primary" style="width=auto;" value="<spring:message code="global.submit" />" />
			        </div>
		                             
	            </fieldset>
		        </form:form>
        	</div>
    	</div>
  	</section>

    </body>
</html>
