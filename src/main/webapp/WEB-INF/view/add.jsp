<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title><spring:message code="add.title"/></title>

</head>
<body>
<section id="addRelease">

<div style="display:block;" id="addReleaseForm">
<form:form modelAttribute="add" action="/add" method="post">
<fieldset>
<div class="row">
    <div class="page-header">
        <h1><spring:message code="add.legend"/>
            <small><spring:message code="add.required"/></small>
        </h1>
    </div>

    <div class="span6">
        <div class="clearfix">
            <form:label for="title" path="title" cssErrorClass="error"><spring:message
                    code="add.label.title"/></form:label>
            <div class="input">
                <form:input path="title" cssClass="xlarge" size="30" type="text"/>
                <form:errors path="title" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="title2" path="title2" cssErrorClass="error"><spring:message
                    code="add.label.alias"/></form:label>
            <div class="input">
                <form:input path="title2" cssClass="xlarge" size="30" type="text"/>
                <form:errors path="title2" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="type" path="type" cssErrorClass="error"><spring:message
                    code="add.label.type"/></form:label>
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
            <form:label for="description" path="description" cssErrorClass="error"><spring:message
                    code="add.label.description"/></form:label>
            <div class="input">
                <form:textarea path="description" cssClass="xlarge"/>
		                    <span class="help-block">
	            				<spring:message code="add.label.description.hint"/>
	          				</span>
                <form:errors path="description" cssClass="error"/>
            </div>
        </div>

        <script type="text/javascript">
            $(function()
            {
                $("#datepicker").datepicker();
            });
        </script>

        <div class="clearfix">
            <form:label for="releaseDate" path="releaseDate" cssErrorClass="error"><spring:message
                    code="add.label.releaseDate"/></form:label>
            <div class="input">
                <div class="inline-inputs">
                    <form:input path="releaseDate" cssClass="xlarge" type="text" id="datepicker"/>
                    <form:errors path="releaseDate" cssClass="error"/>
                </div>
            </div>
        </div>


    </div>

    <div class="span2" style="height:30px;">
    </div>

    <div class="span6">
        <div class="clearfix">
            <form:label for="purchaseLink1" path="purchaseLink1" cssErrorClass="error"><spring:message
                    code="add.label.purchase1"/></form:label>
            <div class="input">
                <form:input path="purchaseLink1" cssClass="xlarge" size="30" type="text"/>
                <form:errors path="purchaseLink1" cssClass="error"/>
            </div>
        </div>
        <div class="clearfix">
            <form:label for="purchaseLink2" path="purchaseLink2" cssErrorClass="error"><spring:message
                    code="add.label.purchase2"/></form:label>
            <div class="input">
                <form:input path="purchaseLink2" cssClass="xlarge" size="30" type="text"/>
                <form:errors path="purchaseLink2" cssClass="error"/>
            </div>
        </div>
        <div class="clearfix">
            <label>Images:</label>

            <div class="input">
                <button data-controls-modal="addImgModal" data-backdrop="true" data-keyboard="true" class="btn danger">
                    Add
                </button>
                <br>
                <br>

                <div id="images">none</div>

            </div>
        </div>
    </div>

</div>

<div class="row">

    <div class="page-header">
        <h3><spring:message code="add.moreinfo"/>
            <small><spring:message code="add.optional"/></small>
        </h3>
    </div>

    <div class="span6">
        <div class="clearfix">
            <form:label for="network" path="network"><spring:message code="add.label.network"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="network" size="10" type="text" style="width:100px;"/>
                <form:errors path="network" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="cast" path="cast"><spring:message code="add.label.cast"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="cast" size="30" type="text"/>
                <form:errors path="cast" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="director" path="director"><spring:message code="add.label.director"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="director" size="30" type="text"/>
                <form:errors path="director" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="rating" path="rating"><spring:message code="add.label.rating"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="rating" size="10" type="text" style="width:50px;"/>
                <form:errors path="rating" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="genre" path="genre"><spring:message code="add.label.genre"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="genre" type="text" size="30"/>
                <form:errors path="genre" cssClass="error"/>
            </div>
        </div>

    </div>

    <div class="span2" style="height:30px;">
    </div>

    <div class="span6">


        <div class="clearfix">
            <form:label for="imdbId" path="imdbId"><spring:message code="add.label.imdbId"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="imdbId" type="text" size="30" style="width:100px;"/>
                <form:errors path="imdbId" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="netflixId" path="netflixId"><spring:message
                    code="add.label.netflixId"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="netflixId" type="text" size="30" style="width:100px;"/>
                <form:errors path="netflixId" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="tvDbId" path="tvDbId"><spring:message code="add.label.tvDbId"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="tvDbId" type="text" size="30" style="width:100px;"/>
                <form:errors path="tvDbId" cssClass="error"/>
            </div>
        </div>

        <div class="clearfix">
            <form:label for="zapTvId" path="zapTvId"><spring:message code="add.label.zapTvId"/></form:label>
            <div class="input">
                <form:input class="xlarge" path="zapTvId" type="text" size="30" style="width:100px;"/>
                <form:errors path="zapTvId" cssClass="error"/>
            </div>
        </div>


    </div>


</div>

<div class="row">
    <div class="clearfix" style="padding-left:100px;">
        <input name="reset" type="reset" class="btn large secondary" style="width:auto;"
               value="<spring:message code="global.reset" />"/>
        <input name="submit" type="submit" class="btn large primary" style="width:auto;"
               value="<spring:message code="global.add" />"/>
    </div>
</div>

</fieldset>
</form:form>
</div>


<div id="addImgModal" class="modal hide fade">
    <form:form method="post" enctype="multipart/form-data" name="addForm" id="addForm" action="changeme">
        <div class="modal-header">
            <a href="#" class="close">&times;</a>

            <h3>Add an Image</h3>
        </div>
        <div class="modal-body">

            <input type="file" id="file">

        </div>
        <div class="modal-footer">
            <input type="reset" value="Cancel">
            <input type="button" value="Submit" id="addFormButton">
        </div>
    </form:form>
</div>


</section>

<script type="text/javascript">
    $(document).ready(function ()
    {

        $("#addFormButton").click(function()
        {
           // $("#file").attr("value","");
            sendJsonNoParams(
                    "/addImg/path",
                    function(result)
                    {
                        var bStore = result.destAction;
                        $('#addForm').attr('action', bStore);

                    });

            var uploadUrl = $("#addForm").attr("action");
            var data = new FormData();
            jQuery.each($('#file')[0].files, function(i, file)
            {
                data.append('file-' + i, file);
            });

            $.ajax({
                url: uploadUrl,
                cache: false,
                contentType: false,
                processData: false,
                dataType: 'json',
                data: data,
                type: 'post',
                success: function(data, textStatus, jqXHR)
                {
                    var j = "/imgBlob/" + data.blobKey;
                    var o = $("#images").html();

                    var n = "<img src='"
                            + j +
                            "' width='35px'/>" +
                            "<input type='hidden' id='imgBlob-" +
                            data.blobKey + "' value='" + data.blobKey + "'/>";
                    if (o == "none")
                        $("#images").html(n);
                    else
                        $("#images").html(o + n);

                },
                complete: function(data, textStatus, jqXHR)
                {
                    $('#addImgModal').modal('hide');
                }
            });


        });

    });


</script>


</body>
</html>
