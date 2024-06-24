# -School-Management-System-JAVA-
![School Management System](https://media.giphy.com/media/3oEjI6SIIHBdRxXI40/giphy.gif)

## Description

Le **School Management System** est une application Java conçue pour gérer les données d'une école de manière efficace et organisée. Ce système permet de gérer les informations des étudiants, des professeurs, des niveaux scolaires, et bien plus encore.

## Fonctionnalités

- **🏫 Gestion de l'école** :
  - Enregistrer les données de l'école (nom, adresse, numéro de téléphone).
- **🎓 Gestion des étudiants** :
  - Enregistrer les données des étudiants (nom, âge, numéro de téléphone).
  - Inscrire des étudiants dans un niveau scolaire.
  - Chercher un étudiant en utilisant son nom.
  - Écrire une liste contenant tous les noms des étudiants.
  - Supprimer un étudiant.
- **👨‍🏫 Gestion des professeurs** :
  - Enregistrer les données des professeurs (nom, âge, salaire).
  - Réserver un professeur à un seul niveau scolaire.
  - Chercher un professeur en utilisant son nom.
  - Écrire une liste contenant tous les noms des professeurs.
  - Supprimer un professeur.
- **🏷️ Gestion des niveaux scolaires** :
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
    git clone https://github.com/votre-utilisateur/votre-repository.git
    ```
    ![Cloning](https://media.giphy.com/media/l0HlPjez5Bx6rI11q/giphy.gif)

2. Naviguez dans le répertoire du projet :
    ```bash
    cd votre-repository
    ```

3. Compilez le projet :
    ```bash
    javac -d bin src/*.java
    ```

4. Exécutez l'application :
    ```bash
    java -cp bin Main
    ```
    ![Running](https://media.giphy.com/media/5xaOcLGvzHxDKjufnLW/giphy.gif)

## Contribution

Les contributions sont les bienvenues ! Veuillez suivre les étapes ci-dessous pour contribuer :

1. Forkez le projet.
    ![Fork](https://media.giphy.com/media/l0Exk8EUzSLsrErEQ/giphy.gif)
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/AmazingFeature`).
3. Commitez vos modifications (`git commit -m 'Add some AmazingFeature'`).
4. Poussez vers la branche (`git push origin feature/AmazingFeature`).
5. Ouvrez une Pull Request.

## Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

## Contact

Mohamed Amine Ait Jaakike - [mohamedamineaitjaakike@gmail.com](mailto:mohamedamineaitjaakike@gmail.com)

Lien du projet : [https://github.com/votre-utilisateur/votre-repository](https://github.com/votre-utilisateur/votre-repository)
