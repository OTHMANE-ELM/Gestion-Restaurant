# RestaurantApp

<p align="center">
  <!-- Remplacez le lien ci-dessous par votre logo -->
  <img src="assets/logo.png" alt="Logo RestaurantApp" width="180"/>
</p>

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
- Calculer les recettes générées par plat et par période
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



<p align="center">
  <img src="assets/use_case_diagram.png" alt="Diagramme de cas d'utilisation" width="700"/>
</p>

---

## Diagramme de classes



<p align="center">
  <img src="assets/class_diagram.png" alt="Diagramme de classes" width="700"/>
</p>

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
```

```

---

## Vidéo : Installation et désinstallation


[![Installation](assets/thumbnail_install.png)](https://lien-vers-votre-video-installation)


---

## Vidéo : Démonstration de l'application



[![Démonstration](assets/thumbnail_demo.png)](https://lien-vers-votre-video-demo)



---
