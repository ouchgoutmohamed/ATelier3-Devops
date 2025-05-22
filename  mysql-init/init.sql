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

INSERT INTO etudiant (nom, prenom, email) VALUES
('Daaif', 'Achraf', 'ad@univ.ma'),
('Marimi', 'Jamila', 'jam@univ.ma'),
('Bodan', 'Lahcen', 'luc@univ.ma');

INSERT INTO utilisateur (nom, email) VALUES
('Doe', 'doe@univ.ma'),
('Doa', 'doa@univ.ma'),
('Doi', 'doi@univ.ma');

