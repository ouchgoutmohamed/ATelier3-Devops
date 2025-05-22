<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des Livres</title></head>
<body>
<h2>Livres</h2>
<table border="1">
    <tr><th>ID</th><th>Titre</th><th>Auteur</th><th>Année</th></tr>
    <c:forEach var="l" items="${livres}">
        <tr>
            <td>${l.id}</td>
            <td>${l.titre}</td>
            <td>${l.auteur}</td>
            <td>${l.annee}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>