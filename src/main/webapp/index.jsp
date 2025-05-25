<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bibliothèque - Page d'accueil</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }
        
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 30px;
        }
        
        .container {
            max-width: 800px;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        
        .menu {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            justify-content: center;
            margin-top: 20px;
        }
        
        .menu-item {
            background-color: #4CAF50;
            color: white;
            padding: 15px 25px;
            text-align: center;
            text-decoration: none;
            font-size: 16px;
            border-radius: 4px;
            transition: background-color 0.3s;
            min-width: 200px;
        }
        
        .menu-item:hover {
            background-color: #45a049;
        }
        
        footer {
            margin-top: 40px;
            text-align: center;
            color: #777;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Bibliothèque - Système de Gestion</h1>
        
        <div class="menu">
            <a href="<c:url value='/etudiants' />" class="menu-item">Étudiants</a>
            <a href="<c:url value='/livres' />" class="menu-item">Livres</a>
            <a href="<c:url value='/utilisateurs' />" class="menu-item">Utilisateurs</a>
            <a href="<c:url value='/emprunts' />" class="menu-item">Emprunts</a>
        </div>
        
        <footer>
            <p>Système de Gestion de Bibliothèque - Version 1.0</p>
            <p>Date actuelle: <%= new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date()) %></p>
        </footer>
    </div>
</body>
</html>
