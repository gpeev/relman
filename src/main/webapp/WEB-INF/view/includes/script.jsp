<script type="text/javascript" src="/js/json2.js"></script>
<script type="text/javascript" src="${pageContext.request.scheme}://www.google.com/jsapi?key=<c:choose><c:when test="${pageContext.request.scheme == 'http'}">${initParam.jsapiHttpKey}</c:when><c:otherwise>${initParam.jsapiHttpsKey}</c:otherwise></c:choose>"></script>
<script type="text/javascript">
    google.load("jquery", "<c:out value='${initParam.jQueryVersion}'/>");
</script>
<script type="text/javascript" src="/js/script.js"></script>
<!-- Le javascript -->
<script src="/js/application.js"></script>
<script language="javascript" type="text/javascript" src="/js/fixOnMouseOut.js"></script>
