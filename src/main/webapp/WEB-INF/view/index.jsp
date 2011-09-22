<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
    <head>
        <title><spring:message code="index.title" /></title>
    </head>
    <body>

        <div class="container">

            <section id="grid-system">
                <div class="page-header">
                    <h1>Most Popular</h1>

                    <div style="float:right; top:-25px; position:relative;">
                        <a href="ReleaseQs.html#">List</a> |
                        <a href="ReleaseQs.html#">Images</a>
                    </div>
                </div>

                <div class="row">
                    <div class="span3 columns item itempop-well">
                        <img src="/img/avengers.jpg" onmouseover="displayPopup('it1popover1');"
                             onmouseout="hidePopup('it1popover1');" height="240" width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div class="itempop-wrapper">
                            <div style="display: none;" class="itempop right" id="it1popover1">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Avengers</h3>

                                    <div class="content">
                                        <p>Something blah blah blah hahahalskjflka kldj alksdj
                                            flkajsd flkja lksfj lkaj sldfjalkwejfliajsdvlalwrijvlsm l laewjfiamilvj
                                            li ijwel ijwlij laisj liawj liwj leij lija vlij ewlifj aweijlaj dliva
                                            wjlij laiwj lija lij lij wlijw elcij ldij liaj lij aliwj liwj lvijaliwje
                                            lavijalw ijli jlai wjli jlw</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well">
                        <img src="/img/avengers.jpg" onmouseover="displayPopup('it1popover2');"
                             onmouseout="hidePopup('it1popover2');" height="240" width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div class="itempop-wrapper">
                            <div style="display: none;" class="itempop right" id="it1popover2">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Avengers</h3>

                                    <div class="content">
                                        <p>Something blah blah blah hahahalskjflka kldj alksdj
                                            flkajsd flkja lksfj lkaj sldfjalkwejfliajsdvlalwrijvlsm l laewjfiamilvj
                                            li ijwel ijwlij laisj liawj liwj leij lija vlij ewlifj aweijlaj dliva
                                            wjlij laiwj lija lij lij wlijw elcij ldij liaj lij aliwj liwj lvijaliwje
                                            lavijalw ijli jlai wjli jlw</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well">
                        <img src="/img/avengers.jpg" onmouseover="displayPopup('it1popover3');"
                             onmouseout="hidePopup('it1popover3');" height="240" width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div class="itempop-wrapper">
                            <div style="display: none;" class="itempop right" id="it1popover3">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Avengers</h3>

                                    <div class="content">
                                        <p>Something blah blah blah.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well">
                        <img src="/img/spiderman.png" onmouseover="displayPopup('it1popover4');"
                             onmouseout="hidePopup('it1popover4');" height="240" width="160">

                        <div width="160" align="center"><h5>7/4/2012</h5></div>
                        <div class="itempop-wrapper-left">
                            <div style="display: none;" class="itempop left" id="it1popover4">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Amazing-Spiderman</h3>

                                    <div class="content">
                                        <p>Spiderman spiderman, does whatever a spider can.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well">
                        <img src="/img/underworld.jpg" onmouseover="displayPopup('it1popover5');"
                             onmouseout="hidePopup('it1popover5');" height="240" width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div class="itempop-wrapper-left">
                            <div style="display: none;" class="itempop left" id="it1popover5">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Underworld 4</h3>

                                    <div class="content">
                                        <p>Kate Beckinsale is hot!!!</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <br>

                <div class="row">
                    <div class="span3 columns item itempop-well">
                        <img src="/img/avengers.jpg" onmouseover="displayPopup('it2popover1');"
                             onmouseout="hidePopup('it2popover1');" height="240" width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div class="itempop-wrapper">
                            <div class="itempop right" id="it2popover1">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Avengers</h3>

                                    <div class="content">
                                        <p>Something blah blah blah hahahalskjflka kldj alksdj
                                            flkajsd flkja lksfj lkaj sldfjalkwejfliajsdvlalwrijvlsm l laewjfiamilvj
                                            li ijwel ijwlij laisj liawj liwj leij lija vlij ewlifj aweijlaj dliva
                                            wjlij laiwj lija lij lij wlijw elcij ldij liaj lij aliwj liwj lvijaliwje
                                            lavijalw ijli jlai wjli jlw</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well">
                        <img src="/img/avengers.jpg" onmouseover="displayPopup('it2popover2');"
                             onmouseout="hidePopup('it2popover2');" height="240" width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div class="itempop-wrapper">
                            <div class="itempop right" id="it2popover2">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Avengers</h3>

                                    <div class="content">
                                        <p>Something blah blah blah hahahalskjflka kldj alksdj
                                            flkajsd flkja lksfj lkaj sldfjalkwejfliajsdvlalwrijvlsm l laewjfiamilvj
                                            li ijwel ijwlij laisj liawj liwj leij lija vlij ewlifj aweijlaj dliva
                                            wjlij laiwj lija lij lij wlijw elcij ldij liaj lij aliwj liwj lvijaliwje
                                            lavijalw ijli jlai wjli jlw</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well">
                        <img src="/img/avengers.jpg" onmouseover="displayPopup('it2popover3');"
                             onmouseout="hidePopup('it2popover3');" height="240" width="160">

                        <div width="160" align="center"><h5>9/30/2011</h5></div>
                        <div class="itempop-wrapper">
                            <div style="display: none;" class="itempop right" id="it2popover3">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Avengers</h3>

                                    <div class="content">
                                        <p>Something blah blah blah.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="span3 columns item itempop-well">
                        <img src="/img/spiderman.png" onmouseover="displayPopup('it2popover4');"
                             onmouseout="hidePopup('it2popover4');" height="240" width="160">

                        <div width="160" align="center"><h5>7/4/2012</h5></div>
                        <div class="itempop-wrapper-left">
                            <div style="display: none;" class="itempop left" id="it2popover4">
                                <div class="arrow"></div>
                                <div class="inner">
                                    <h3 class="title">Amazing-Spiderman</h3>

                                    <div class="content">
                                        <p>Spiderman spiderman, does whatever a spider can.</p>
                                    </div>
                                </div>
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
                            <div style="width:160px; height:240px;"><h4 style="text-align:center; color:#FFF">The Avengers
                                Underworld</h4> <br>
                                <button type="submit" class="btn primary">Save Changes</button>
                                <button type="reset" class="btn">Cancel</button>
                            </div>
                        </div>
                    </div>
                </div>

            </section>


        </div>
        <!-- /container -->
    </body>
</html>
