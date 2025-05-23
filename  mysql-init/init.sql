CREATE DATABASE IF NOT EXISTS etudiants_db;

USE etudiants_db;

CREATE TABLE etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100)
);

CREATE TABLE utilisateur (
    id INT PRIMARY KEY  AUTO_INCREMENT,
    nom VARCHAR(50),
    email VARCHAR(50)
);

CREATE TABLE categorie (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    description VARCHAR(255)
);

INSERT INTO etudiant (nom, prenom, email) VALUES
('Daaif', 'Achraf', 'ad@univ.ma'),
('Marimi', 'Jamila', 'jam@univ.ma'),
('Bodan', 'Lahcen', 'luc@univ.ma');

INSERT INTO utilisateur (nom, email) VALUES
('Doe', 'doe@univ.ma'),
('Doa', 'doa@univ.ma'),
('Doi', 'doi@univ.ma');

INSERT INTO categorie (nom, description) VALUES
('Informatique', 'Catégorie relative aux technologies informatiques'),
('Sciences', 'Catégorie des sciences exactes et naturelles'),
('Littérature', 'Catégorie des œuvres littéraires et linguistiques');