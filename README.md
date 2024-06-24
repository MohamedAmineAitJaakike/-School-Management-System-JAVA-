# School Management System

## Description

Le projet School Management System est une application Java conçue pour gérer les données d'une école, y compris les informations sur les étudiants, les professeurs, les niveaux scolaires, et bien plus encore. Ce système permet d'enregistrer, rechercher et manipuler les données de manière efficace et organisée.

## Fonctionnalités

- **Gestion de l'école** :
  - Enregistrer les données de l'école (nom, adresse, numéro de téléphone).
- **Gestion des étudiants** :
  - Enregistrer les données des étudiants (nom, âge, numéro de téléphone).
  - Inscrire des étudiants dans un niveau scolaire.
  - Chercher un étudiant en utilisant son nom.
  - Écrire une liste contenant tous les noms des étudiants.
  - Supprimer un étudiant.
- **Gestion des professeurs** :
  - Enregistrer les données des professeurs (nom, âge, salaire).
  - Réserver un professeur à un seul niveau scolaire.
  - Chercher un professeur en utilisant son nom.
  - Écrire une liste contenant tous les noms des professeurs.
  - Supprimer un professeur.
- **Gestion des niveaux scolaires** :
  - Enregistrer les données des niveaux scolaires (nom, code).
  - Chercher un niveau scolaire en utilisant son nom.

## Relations entre les classes

- **Classe `School`** :
  - Contient des collections de `Student`, `Teacher`, et `Grade`.
- **Classe `Grade`** :
  - Contient des collections de `Student` et `Teacher`.
- **Classes `Teacher` et `Student`** :
  - Héritent de la classe `Person`, qui inclut les attributs `name` et `age`.

## Installation

1. Clonez le repository :
    ```bash
    git clone https://github.com/MohamedAmineAitJaakike/-School-Management-System-JAVA.git
    ```
2. Naviguez dans le répertoire du projet :
    ```bash
    cd -School-Management-System-JAVA
    ```
3. Compilez le projet :
    ```bash
    javac -d bin src/*.java
    ```
4. Exécutez l'application :
    ```bash
    java -cp bin Main
    ```

## Contribution

Les contributions sont les bienvenues ! Veuillez suivre les étapes ci-dessous pour contribuer :

1. Forkez le projet.
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/AmazingFeature`).
3. Commitez vos modifications (`git commit -m 'Add some AmazingFeature'`).
4. Poussez vers la branche (`git push origin feature/AmazingFeature`).
5. Ouvrez une Pull Request.

## Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

## Contact

Mohamed Amine Ait Jaakike - [mohamedamineaitjaakike@gmail.com](mailto:mohamedamineaitjaakike@gmail.com)
