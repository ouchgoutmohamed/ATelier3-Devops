<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Emprunts</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
        tr:nth-child(even) { background-color: #f9f9f9; }
        h1 { color: #333; }
    </style>
</head>
<body>    
    <h1>Liste des Emprunts - Simple Example</h1>
    
    <table>
        <tr>
            <th>ID</th>
            <th>Livre</th>
            <th>Utilisateur</th>
            <th>Date d'emprunt</th>
            <th>Date de retour</th>
        </tr>
        <c:forEach var="emprunt" items="${emprunts}">
            <tr>
                <td>${emprunt.id}</td>
                <td>${emprunt.livre}</td>
                <td>${emprunt.utilisateur}</td>
                <td><fmt:formatDate value="${emprunt.dateEmprunt}" pattern="dd/MM/yyyy" /></td>
                <td>
                    <c:choose>
                        <c:when test="${empty emprunt.dateRetour}">
                            <span style="color: red;">En cours</span>
                        </c:when>
                        <c:otherwise>
                            <fmt:formatDate value="${emprunt.dateRetour}" pattern="dd/MM/yyyy" />
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
