<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des catégories</title></head>
<body>
<h2>Catégories</h2>
<table border="1">
    <tr><th>ID</th><th>Nom</th><th>Description</th></tr>
    <c:forEach var="c" items="${categories}">
        <tr>
            <td>${c.id}</td>
            <td>${c.nom}</td>
            <td>${c.description}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>