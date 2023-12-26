package fr.atlas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GestionTask gestionTask = new GestionTask();
		boolean quiet = false;

		System.out.println("\t\tBienvenue sur To-Do-List");
		System.out.println("========================================");

		do {
			System.out.println("\nQue voulez vous faire : ");
			System.out.println("  1. Ajouter une taches :");
			System.out.println("  2. Marquer une taches comme complété :");
			System.out.println("  3. Voir toute les taches :");
			System.out.println("  4. Voir les taches à venir :");
			System.out.println("  5. Enregistrer les taches dans un fichier :");
			System.out.println("  6. Quitter :");

			System.out.print("\nEntrez votre choix : ");
			int chosenNumber = scanner.nextInt();

			switch (chosenNumber) {
				case 1:
					gestionTask.addTask();
					break;

				case 2:
					gestionTask.markTaskAsCompleted();
					break;

				case 3:
					gestionTask.getAllTasks();
					break;

				case 4:
					gestionTask.getUpcomingTasks();
					break;

				case 5:
					gestionTask.saveTasks();
					break;

				case 6:
					quiet = true;
					break;
			}
		} while (! quiet);
	}
}
