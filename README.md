# Gestionnaire de Tâches en Java

Ce projet consiste en un gestionnaire de tâches en ligne de commande développé en Java. L'application permet aux utilisateurs de
gérer leur liste de tâches de manière efficace, avec des fonctionnalités telles que l'ajout de tâches, le marquage comme
terminées, l'affichage de la liste, et plus encore.

## Fonctionnalités

- **Ajout de Tâches :** Ajoutez de nouvelles tâches à votre liste en spécifiant une description et une date d'échéance (
  facultative).

- **Affichage de la Liste :** Visualisez la liste actuelle des tâches avec des détails tels que la description, la date d'ajout,
  et la date d'échéance.

- **Marquer comme Terminée :** Indiquez qu'une tâche est terminée et retirez-la de la liste principale.

- **Affichage des Tâches à Venir :** Obtenez une vue des tâches dont la date d'échéance est à venir.

- **Tri des Tâches :** Triez la liste par date d'échéance, date d'ajout ou statut (terminée ou non terminée).

## Structure du Projet

```
To-Do-List
|-- src
|   |-- main
|       |-- java
|           |-- fr
|               |-- atlas
|                   |-- data
|                        |-- Task.text
|                   |-- task_manager
|                       |-- model
|                           |-- Task.java
|                       |-- service
|                           |-- TaskService.java
|                       |-- GestionTask.java
|                       |-- Main.java
```

## Utilisation

1. **Compilation :** Compilez le projet en utilisant votre environnement de développement Java préféré.

2. **Exécution :** Exécutez la classe `Main` pour démarrer l'application.

3. **Interaction :** Suivez les instructions en ligne de commande pour utiliser les fonctionnalités du gestionnaire de tâches.

## Personnalisation

- Ajoutez des fonctionnalités supplémentaires en étendant les classes existantes ou en créant de nouvelles classes selon vos
  besoins.

- Modifiez le format de stockage des tâches dans le fichier `tasks.txt` si nécessaire.

## Auteur

[`Atlas-00`]
