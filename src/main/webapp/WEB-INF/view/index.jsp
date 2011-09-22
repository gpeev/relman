<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
    <head>
        <title><spring:message code="index.title" /></title>
    </head>
    <body>

            <section id="grid-system">
                <div class="page-header">
                    <h1>Most Popular</h1>

                    <div style="float:right; top:-25px; position:relative;">
                        <a href="ReleaseQs.html#">List</a> |
                        <a href="ReleaseQs.html#">Images</a>
                    </div>
                </div>

                <div class="row"> <!-- Row 1 -->
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it1info1'));"
                         onmouseover="displayPopup('it1info1');">
                        <img src="/img/underworld.jpg" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it1info1"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it1info2'));"
                         onmouseover="displayPopup('it1info2');">
                        <img src="/img/underworld.jpg" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it1info2"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it1info3'));"
                         onmouseover="displayPopup('it1info3');">
                        <img src="/img/underworld.jpg" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it1info3"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it1info4'));"
                         onmouseover="displayPopup('it1info4');">
                        <img src="/img/underworld.jpg" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it1info4"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it1info5'));"
                         onmouseover="displayPopup('it1info5');">
                        <img src="/img/underworld.jpg" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it1info5"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                </div>

                <br>

                <div class="row"> <!-- Row 2 -->
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it2info1'));"
                         onmouseover="displayPopup('it2info1');">
                        <img src="/img/underworld.jpg" id="it2pic1" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it2info1"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it2info2'));"
                         onmouseover="displayPopup('it2info2');">
                        <img src="/img/underworld.jpg" id="it2pic2" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it2info2"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it2info3'));"
                         onmouseover="displayPopup('it2info3');">
                        <img src="/img/underworld.jpg" id="it2pic3" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it2info3"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it2info4'));"
                         onmouseover="displayPopup('it2info4');">
                        <img src="/img/underworld.jpg" id="it2pic4" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it2info4"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it2info5'));"
                         onmouseover="displayPopup('it2info5');">
                        <img src="/img/underworld.jpg" id="it2pic5" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it2info5"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                </div>

				<br>
				
				<div class="row"> <!-- Row 3 -->
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it3info1'));"
                         onmouseover="displayPopup('it3info1');">
                        <img src="/img/underworld.jpg" id="it2pic1" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it3info1"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it3info2'));"
                         onmouseover="displayPopup('it3info2');">
                        <img src="/img/underworld.jpg" id="it2pic2" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it3info2"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it3info3'));"
                         onmouseover="displayPopup('it3info3');">
                        <img src="/img/underworld.jpg" id="it2pic3" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it3info3"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it3info4'));"
                         onmouseover="displayPopup('it3info4');">
                        <img src="/img/underworld.jpg" id="it2pic4" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it3info4"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well" onmouseout="fixOnMouseOut(this, event, hidePopup('it3info5'));"
                         onmouseover="displayPopup('it3info5');">
                        <img src="/img/underworld.jpg" id="it2pic5" style="display: block; z-index: 5;" height="240"
                             width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div id="it3info5"
                             style="height: 240px; width: 160px; position: relative; top: -280px; display: none; z-index: 20; background-color: rgba(0, 0, 0, 0.5);">
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers</h4> <br>
                                <div align="center" style="top: 150px; position: relative;"><a href="detailPage" class="btn primary">More Info</a></div>
                            </div>
                        </div>
                    </div>
                </div>				

            </section>
    </body>
</html>
