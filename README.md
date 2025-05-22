# ATelier3-Devops - Gestion d'une Bibliothèque

Système de gestion d'une bibliothèque permettant de suivre les emprunts de livres. L'objectif principal de cet atelier est de démontrer le déploiement d'une application Jakarta EE avec une base de données MySQL en utilisant Docker.

## Fonctionnalités

- Gestion des livres (affichage de la collection)
- Gestion des utilisateurs de la bibliothèque
- Gestion des emprunts de livres
- Suivi des dates d'emprunt et de retour

## Prérequis

- Docker et Docker Compose
- Maven (pour la compilation)

## Construction et Exécution avec Docker

1. Compilation de l'application (fichier WAR):
   ```
   mvn clean package
   ```

2. Construction et démarrage des conteneurs Docker:
   ```
   docker-compose up -d
   ```

3. Accès à l'application:
   ```
   http://localhost:8080/
   ```

## Base de Données

L'application utilise une base de données MySQL avec les tables suivantes:
- `livre` - Informations sur les livres disponibles dans la bibliothèque
- `utilisateur` - Informations sur les utilisateurs enregistrés
- `emprunt` - Suivi des emprunts avec titre du livre, nom d'utilisateur, date d'emprunt et date de retour

## Composants Docker

- Application Web (Tomcat)
- Base de données MySQL


## Arrêt de l'Application

```
docker-compose down
```