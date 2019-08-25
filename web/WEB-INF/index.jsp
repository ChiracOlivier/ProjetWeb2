<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<p>écouté monsieur</p>
<p>
  <%
    String attribut = (String) request.getAttribute("test");
    out.println( attribut );
  %>
</p>
</body>
</html>