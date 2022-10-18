<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Anagrafe</title>
        <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>name</th>
                    <th>surname</th>
                    <th>sex</th>
                    <th>country</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${people}" var="person">
                    <tr>
                        <td>${person.name}</td>
                        <td>${person.surname}</td>
                        <td>${person.sex}</td>
                        <td>${person.country}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>