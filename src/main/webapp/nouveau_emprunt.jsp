<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Nouvel Emprunt</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        .nav { margin-bottom: 20px; }
        .nav a { margin-right: 15px; text-decoration: none; color: #0066cc; }
        h1 { color: #333; }
        
        form {
            max-width: 500px;
            margin: 0 auto;
        }
        
        label {
            display: block;
            margin-top: 10px;
        }
        
        select, input {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        
        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 10px;
        }
        
        button:hover {
            background-color: #45a049;
        }
        
        .btn-back {
            display: inline-block;
            margin-top: 20px;
            padding: 8px 12px;
            background-color: #f1f1f1;
            color: #333;
            text-decoration: none;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <div class="nav">
        <a href="<c:url value='/' />">Accueil</a>
        <a href="<c:url value='/etudiants' />">Étudiants</a>
        <a href="<c:url value='/livres' />">Livres</a>
        <a href="<c:url value='/utilisateurs' />">Utilisateurs</a>
        <a href="<c:url value='/emprunts' />">Emprunts</a>
    </div>
    
    <h1>Nouvel Emprunt</h1>
    
    <c:if test="${not empty message}">
        <div style="color: red; margin-bottom: 10px;">${message}</div>
    </c:if>
    
    <form action="<c:url value='/emprunts' />" method="post">
        <input type="hidden" name="action" value="create" />
        
        <label for="livreId">Livre:</label>
        <select id="livreId" name="livreId" required>
            <option value="">--Sélectionner un livre--</option>
            <c:forEach var="livre" items="${livres}">
                <option value="${livre.id}">${livre.titre} (${livre.auteur})</option>
            </c:forEach>
        </select>
        
        <label for="utilisateurId">Utilisateur:</label>
        <select id="utilisateurId" name="utilisateurId" required>
            <option value="">--Sélectionner un utilisateur--</option>
            <c:forEach var="utilisateur" items="${utilisateurs}">
                <option value="${utilisateur.id}">${utilisateur.nom} (${utilisateur.email})</option>
            </c:forEach>
        </select>
        
        <button type="submit">Enregistrer</button>
    </form>
    
    <a href="<c:url value='/emprunts' />" class="btn-back">Retour à la liste</a>
</body>
</html>
