CREATE DATABASE IF NOT EXISTS devops_db;

USE devops_db;


CREATE TABLE livre (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       titre VARCHAR(100),
                       auteur VARCHAR(50),
                       annee INT);

INSERT INTO livre (titre, auteur, annee) VALUES
                                             ('Le Petit Prince', 'Antoine de Saint-Exupéry', 1943),
                                             ('1984', 'George Orwell', 1949),
                                             ('Cent ans de solitude', 'Gabriel García Márquez', 1967);

-- Create the emprunt table
CREATE TABLE emprunt (
    id INT PRIMARY KEY AUTO_INCREMENT,
    livre VARCHAR(100) NOT NULL,
    utilisateur VARCHAR(100) NOT NULL,
    date_emprunt DATE NOT NULL,
    date_retour DATE
);

-- Add some sample data
INSERT INTO emprunt (livre, utilisateur, date_emprunt, date_retour) VALUES
('Le Petit Prince', 'John Doe', '2023-05-01', NULL),
('1984', 'Jane Smith', '2023-04-20', '2023-05-03'),
('Cent ans de solitude', 'Alice Johnson', '2023-05-10', NULL);
