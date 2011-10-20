<%@ page import="com.jappstart.model.vo.*, java.util.*" %>
<h3>
    Releases
</h3>

<table class="zebra-striped">
    <thead>
    <tr>
        <th>#</th>
        <th>Title</th>
        <th>Type</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Release> p = (List<Release>) request.getAttribute("releaseList");
        for (int i = 0; i < p.size(); i++)
        {
            Release release = p.get(i);
    %>

    <tr>
        <td><%=i + 1%>
        </td>
        <td><%=release.getTitle()%>
        </td>
        <td><%=release.getDate()%>
        </td>
    </tr>
    <%
        }
    %>

    </tbody>
</table>