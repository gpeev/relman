<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title><spring:message code="add.title" /></title>
    </head>
    <body>
		<section id="addRelease">
    <div class="page-header">
      <h1><spring:message code="add.legend" /><small> Required Fields</small></h1>
    </div>
    <div class="row">
      <div style="display:block;" id="addReleaseForm"> 
        
        <!--data. titile, type, airdate, graphics, clips, etc. -->
        <form>
          <fieldset>
            <div class="clearfix">
              <label for="">Title: </label>
              <div class="input">
                <input class="xlarge" id="xlInput" name="xlInput" size="30" type="text" />
              </div>
            </div>
            <!-- /clearfix -->
            
      <div class="clearfix">
        <label for="textarea">Description</label>
        <div class="input">
          <textarea class="xxlarge" id="textarea" name="textarea"></textarea>
          <span class="help-block">
            Keep it short and sweet.
          </span>
        </div>
      </div> <!-- /clearfix -->
      
            <div class="clearfix">
              <label for="">Type</label>
              <div class="input">
                <select>
                  <option>TV Show</option>
                  <option>Movie</option>
                  <option>Music</option>
                  <option>Games</option>
                  <option>Books</option>
                  <option>Gadgets</option>
                </select>
              </div>
            </div>
            <!-- /clearfix -->
              	<script type="text/javascript">
                $(function() {
                    $("#datepicker").datepicker();
                });
                </script>
            <div class="clearfix">
              <label>Release Date</label>
              <div class="input">
                <div class="inline-inputs">
                  <input type="text" id="datepicker">
                 </div>
              </div>
            </div>
            <!-- /clearfix -->
            
            <div class="clearfix">
              <label for="xlInput">Upload Image</label>
              <div class="input">
                <input class="input-file" id="fileInput" name="fileInput" type="file" />
              </div>
            </div>
            <!-- /clearfix -->

    <div class="page-header">
      <h3>More Info <small> Optional Fields</small></h3>
    </div>
    
            <div class="clearfix">
              <label for="">Network: </label>
              <div class="input">
                <input class="xlarge" id="xlInput" name="xlInput" size="10" type="text" style="width:100px;" />
              </div>
            </div>
    
                <div class="clearfix">
              <label for="">Cast: </label>
              <div class="input">
                <input class="xlarge" id="xlInput" name="xlInput" size="30" type="text" />
              </div>
            </div>
            <!-- /clearfix -->
                  <div class="clearfix">
              <label for="">Director: </label>
              <div class="input">
                <input class="xlarge" id="xlInput" name="xlInput" size="30" type="text" />
              </div>
            </div>
            
                  <div class="clearfix">
              <label for="">Rating: </label>
              <div class="input">
                <input class="xlarge" id="xlInput" name="xlInput" size="10" type="text" style="width:50px;" />
              </div>
            </div>
            
            
                        
            <a href="#" class="btn large primary" style="left:150px; position:relative;">Add Release</a>
            
          </fieldset>
        </form>
        
      </div>
    </div>
  </section>
  

    </body>
</html>
