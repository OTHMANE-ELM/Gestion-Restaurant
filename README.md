# Gestion Restaurant 🍽️

<img width="400" height="400" alt="logo" src="https://github.com/user-attachments/assets/24824782-f371-43e0-8cb0-fd03e86155ca" />


---

## Contexte

Dans le secteur de la restauration, la gestion manuelle des commandes et des plats entraîne souvent des erreurs, une perte de temps et un manque de visibilité sur les performances. Ce projet s'inscrit dans un contexte où les petits établissements ont besoin d'un outil simple et efficace pour centraliser leurs opérations quotidiennes.

---

## Problématique

Comment permettre à un restaurant de gérer efficacement ses plats, ses commandes et ses clients, tout en ayant une vue claire sur les recettes générées et les plats les plus demandés ?

---

## Solution et objectifs

Cette application de bureau offre une interface graphique intuitive pour :

- Gérer le catalogue des plats (ajout, modification, suppression, filtrage par catégorie)
- Enregistrer et suivre les commandes des clients
- Identifier les plats les plus populaires
- Visualiser le chiffre d'affaires sous forme de graphique

---

## Technologies utilisées

| Technologie | Rôle |
|---|---|
| Java | Langage de développement principal |
| Java Swing | Interface graphique (GUI) |
| JDBC | Connexion entre Java et la base de données |
| MySQL | Système de gestion de base de données |
| phpMyAdmin | Administration de la base de données |
| JFreeChart | Génération de graphiques |
| Java Mail | Envoi de notifications par e-mail |
| NetBeans IDE | Environnement de développement |
| StarUML | Conception des diagrammes UML |
| Draw.io | Conception des diagrammes d'architecture |
| Inno Setup 6 | Création de l'installateur de l'application |

---

## Diagramme de cas d'utilisation



<img width="1187" height="822" alt="Use Case" src="https://github.com/user-attachments/assets/abd7c77e-2baa-4001-8c9c-46a821b12aaf" />




---

## Diagramme de classes


<img width="948" height="730" alt="CLASSE" src="https://github.com/user-attachments/assets/306cb9b5-b564-4f08-af51-0bb1d7c9f17c" />


---

## Description de la base de données

La base de données comprend quatre tables principales :

**Utilisateur** : gère les accès à l'application (id, login, mot de passe, e-mail).

**Plat** : représente les articles du menu (nom, catégorie, prix).

**Client** : regroupe les informations des clients (nom, téléphone).

**Commande** : enregistre chaque commande passée, en liant un client à un plat avec une date et une quantité.

---

## Scripts SQL
```sql
CREATE DATABASE IF NOT EXISTS restaurant_db;
USE restaurant_db;

CREATE TABLE Utilisateur (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50) NOT NULL UNIQUE,
    mdps VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Plat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    categorie VARCHAR(50) NOT NULL,
    prix DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    telephone VARCHAR(20)
);

CREATE TABLE Commande (
    id INT AUTO_INCREMENT PRIMARY KEY,
    client_id INT NOT NULL,
    plat_id INT NOT NULL,
    dateCommande DATE NOT NULL,
    quantite INT NOT NULL,
    FOREIGN KEY (client_id) REFERENCES Client(id),
    FOREIGN KEY (plat_id) REFERENCES Plat(id)
);
```

---

## Architecture en couches

L'application suit une architecture trois couches :

**Couche Présentation** (`présentation`) : contient les interfaces graphiques développées avec Java Swing. Elle gère l'affichage et les interactions avec l'utilisateur.

**Couche Service** (`service`) : contient la logique métier de l'application (calcul des recettes, identification des plats populaires, validation des données).

**Couche DAO** (`dao`) : contient les classes d'accès aux données. Elle assure la communication avec la base de données MySQL via JDBC.


<img width="1266" height="567" alt="Architecture en couches drawio" src="https://github.com/user-attachments/assets/da619ce2-3b16-423d-b079-dee2d2c54d4a" />




## Vidéo : Installation et désinstallation





https://github.com/user-attachments/assets/a5c44315-208b-4dfd-a84f-0def35e1d941



---

## Vidéo : Démonstration de l'application





https://github.com/user-attachments/assets/62bed4d1-4134-4536-92e6-6ca3abe240c5





---
