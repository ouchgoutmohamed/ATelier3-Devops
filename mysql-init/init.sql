CREATE DATABASE IF NOT EXISTS devops_db;

USE devops_db;

CREATE TABLE etudiant (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          nom VARCHAR(50),
                          prenom VARCHAR(50),
                          email VARCHAR(100));

INSERT INTO etudiant (nom, prenom, email) VALUES
                                              ('Daaif', 'Achraf', 'ad@univ.ma'),
                                              ('Marimi', 'Jamila', 'jam@univ.ma'),
                                              ('Bodan', 'Lahcen', 'luc@univ.ma');

CREATE TABLE livre (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       titre VARCHAR(100),
                       auteur VARCHAR(50),
                       annee INT);

INSERT INTO livre (titre, auteur, annee) VALUES
                                             ('Le Petit Prince', 'Antoine de Saint-Exupéry', 1943),
                                             ('1984', 'George Orwell', 1949),
                                             ('Cent ans de solitude', 'Gabriel García Márquez', 1967);
