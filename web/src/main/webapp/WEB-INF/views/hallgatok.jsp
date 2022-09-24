<%--
  Created by IntelliJ IDEA.
  User: Judit
  Date: 2022. 09. 24.
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Hallgatóink</title>
</head>
<body>

<c:if test="${empty hallgatok}">
    <h1>Nincs hallgatónk</h1>
</c:if>
<c:if test="${!empty hallgatok}">
<table>
    <tr>
        <th>
            Azonosító
        </th>
        <th>Név</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${hallgatok}" var="hallgato">
        <tr>
            <td>
                ${hallgato.id}
            </td>
            <td>
                ${hallgato.teljesNev}
            </td>
            <td>
                ${hallgato.email}
            </td>
        </tr>
    </c:forEach>
</table>
</c:if>


</body>
</html>
