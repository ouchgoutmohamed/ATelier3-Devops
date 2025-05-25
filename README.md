# ATelier3-Devops - Gestion d'une Bibliothèque

Système de gestion d'une bibliothèque permettant de suivre les emprunts de livres. L'objectif principal de cet atelier est de démontrer le déploiement d'une application Jakarta EE avec une base de données MySQL en utilisant Docker.

## Technologies Utilisées

- **Backend**: Jakarta EE (Servlets, JSP)
- **Base de données**: MySQL 8.0
- **Conteneurisation**: Docker & Docker Compose
- **Serveur d'application**: Apache Tomcat
- **Build tool**: Maven
- **ORM**: DAO Pattern avec JDBC

## Architecture

L'application suit une architecture MVC (Model-View-Controller):
- **Model**: Classes d'entités (`Livre`, `Utilisateur`, `Emprunt`, `Categorie`, `Reservation`)
- **View**: Pages JSP pour l'interface utilisateur
- **Controller**: Servlets pour la logique métier
- **DAO**: Couche d'accès aux données

## Fonctionnalités

- 📚 **Gestion des livres**: Affichage et gestion de la collection de livres
- 👥 **Gestion des utilisateurs**: Inscription et gestion des utilisateurs de la bibliothèque
- 📖 **Gestion des emprunts**: Création et suivi des emprunts de livres
- 🏷️ **Gestion des catégories**: Classification des livres par catégories
- 📅 **Gestion des réservations**: Système de réservation de livres
- ⏰ **Suivi temporel**: Gestion des dates d'emprunt et de retour

## Prérequis

- **Docker** (version 20.10 ou supérieure)
- **Docker Compose** (version 2.0 ou supérieure)
- **Maven** 3.6+ (pour la compilation)
- **Java** 11 ou supérieur
## Construction et Exécution avec Docker

### Méthode rapide (recommandée)

1. **Clone du projet et navigation**:
   ```bash
   cd ATelier3-Devops
   ```

2. **Construction et démarrage**:
   ```bash
   docker-compose up --build -d
   ```

3. **Accès à l'application**:
   - Application web: http://localhost:8080/
   - Base de données: localhost:3306 (utilisateur: `root`, mot de passe: `rootpassword`)

### Méthode détaillée

1. **Compilation manuelle de l'application** (optionnel):
   ```bash
   mvn clean package
   ```

2. **Construction des images Docker**:
   ```bash
   docker-compose build
   ```

3. **Démarrage des services**:
   ```bash
   docker-compose up -d
   ```

4. **Vérification du statut des conteneurs**:
   ```bash
   docker-compose ps
   ```

## Pages Disponibles

Une fois l'application démarrée, vous pouvez accéder aux pages suivantes:

- **Page d'accueil**: http://localhost:8080/
- **Liste des livres**: http://localhost:8080/livres
- **Gestion des utilisateurs**: http://localhost:8080/utilisateurs
- **Gestion des emprunts**: http://localhost:8080/emprunts
- **Gestion des catégories**: http://localhost:8080/categories
- **Liste des réservations**: http://localhost:8080/reservations

## Base de Données

L'application utilise une base de données MySQL avec les tables suivantes:

### Schéma de la base de données

- **`livre`** - Informations sur les livres disponibles dans la bibliothèque
  - ID, titre, auteur, ISBN, catégorie, disponibilité
  
- **`utilisateur`** - Informations sur les utilisateurs enregistrés
  - ID, nom, prénom, email, date d'inscription
  
- **`emprunt`** - Suivi des emprunts avec relations
  - ID, ID_livre, ID_utilisateur, date_emprunt, date_retour_prevue, date_retour_effective
  
- **`categorie`** - Classification des livres
  - ID, nom, description
  
- **`reservation`** - Système de réservation
  - ID, ID_livre, ID_utilisateur, date_reservation, statut

### Configuration de la base de données

- **Host**: `mysql-db` (dans le réseau Docker) / `localhost:3306` (accès externe)
- **Database**: `bibliotheque`
- **Username**: `root`
- **Password**: `rootpassword`

Les scripts d'initialisation se trouvent dans le dossier `mysql-init/` et sont automatiquement exécutés au premier démarrage du conteneur MySQL.

## Composants Docker

Le projet utilise Docker Compose pour orchestrer deux services principaux:

### 1. Application Web (Tomcat)
- **Image**: Basée sur `tomcat:10.1-jdk11`
- **Port**: 8080 (mappé sur l'hôte)
- **Contenu**: Application WAR deployée automatiquement
- **Dépendances**: Base de données MySQL

### 2. Base de données MySQL
- **Image**: `mysql:8.0`
- **Port**: 3306 (mappé sur l'hôte)
- **Volumes**: 
  - Données persistantes
  - Scripts d'initialisation (`mysql-init/`)
- **Configuration**: Utilisateur root avec mot de passe

