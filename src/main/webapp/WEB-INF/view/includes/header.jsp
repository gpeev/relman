<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="org.apache.commons.codec.digest.DigestUtils" %>
<%@ page import="org.apache.commons.lang.StringEscapeUtils" %>

<div class="topbar">
    <div class="container fixed">
        <h3><a class="logo" href="/">
            <span>Release Qs</span>
        </a></h3>
        <ul style="float:right;">

            <sec:authorize access="isAuthenticated()">
                <c:set var="email">
                    <sec:authentication property="principal.email"/>
                </c:set>
                <c:set var="gravatarHash"
                       value='<%= DigestUtils.md5Hex(StringEscapeUtils.unescapeXml((String)pageContext.getAttribute("email")).trim().toLowerCase()) %>'/>
                    <li height="40" style="padding-right:10px;padding-top:10px;"><spring:message code="header.info"/> <sec:authentication property="principal.displayName"/> </li>
                    <li width="23" height="40" style="padding-top:10px;"> |</li>
                    <li><a href="/logout">Logout</a></li>
            </sec:authorize>
            <sec:authorize access="isAnonymous()">
                <li><a href="#" onclick="displayPopup('login');">Login</a></li>
                <li width="23" height="40" style="padding-top:10px;"> |</li>
                <li><a href="/register/create" temp="displayPopup('registration');">Register</a></li>
            </sec:authorize>

        </ul>
    </div>
</div>

<div style="background-color: rgba(0,0,0,0.5); border: none; padding: 40px 40px 40px 0px; display:none; float:left; z-index: 7000; position:fixed; height:100%; width: 100%;"
     id="login">
    <div class="modal" style="position: relative; top: auto; left: auto; margin: 0 auto; z-index: 6000;">
        <div class="modal-header">
            <h3>Login</h3>
            <a href="#" class="close" onclick="hidePopup('login');">&times;</a>
        </div>
        <div class="modal-body">

            <%@ include file="/WEB-INF/view/login.jsp" %>

        </div>
    </div>
</div>



<div id="masthead">
    <div class="inner">
        <div class="container">


            <div class="topbar-wrapper" style="z-index: 5;">
                <div class="topbar">
                    <div class="container fixed">
                        <ul>
                            <li class="active"><a href="/">Home</a></li>
                            <li><a href="">TV</a></li>
                            <li><a href="">Movies</a></li>
                            <li><a href="">Music</a></li>
                            <li><a href="">Games</a></li>
                            <li><a href="">Books</a></li>
                            <li><a href="">Gadgets</a></li>
                            <li><a href="addExample">Examples</a></li>
                        </ul>
                        <form action="" style="float:right;">
                            <input placeholder="Search" type="text">
                        </form>
                    </div>
                </div>
            </div>
            <!-- topbar-wrapper -->
        </div>
        <!-- /container -->
    </div>
</div>

