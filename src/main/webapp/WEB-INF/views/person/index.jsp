<%@ page import="com.naby.model.Person" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
</head>
<body>

    <form action="/person/save.do">
        <input type="text" name="name" value="${requestScope.x.name}"/>
        <input type="text" name="family" value="${requestScope.x.family}"/>
        <input type="submit" value="save"/>
    </form>

<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>FAMILY</td>
        <td>OPER</td>
        <td>OPER</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="person">
        <tr>
            <form action="/person/update.do">
            <td><input type="text" readonly name="id" value="${person.id}"/></td>
            <td><input type="text" name="name" value="${person.name}"/></td>
            <td><input type="text" name="family" value="${person.family}"/></td>
            <td><input type="submit" value="update"/></td>
            <td><input type="button" onclick="deletePerson(${person.id})" value="delete"></td>
            </form>
        </tr>

    </c:forEach>
    <script>
        function deletePerson(id)
        {
            window.location = '/person/delete.do?id='+id;
        }
    </script>
</table>
</body>
</html>