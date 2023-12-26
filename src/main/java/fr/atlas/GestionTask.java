package fr.atlas;

import fr.atlas.task_manager.model.Task;
import fr.atlas.task_manager.service.TaskService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionTask implements TaskService {
	private final ArrayList<Task> tasks;

	public GestionTask() {
		this.tasks = new ArrayList<>();
	}

	@Override
	public void addTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nBienvenue sur ajouter une task : ");

		System.out.print("Entrez le nom de la taches : ");
		String nameTask = scanner.nextLine();

		System.out.print("Entrez la description de la taches : ");
		String descriptionTask = scanner.nextLine();

		System.out.print("Entrez la date de début de la tâche (format YYYY-MM-DD) : ");
		String startDateInput = scanner.nextLine();
		LocalDate startDate = LocalDate.parse(startDateInput);

		System.out.print("Entrez la date de fin de la tâche (format YYYY-MM-DD) : ");
		String endDateInput = scanner.nextLine();
		LocalDate endDate = LocalDate.parse(endDateInput);

		boolean taskCompleted = false;

		tasks.add(new Task(nameTask, descriptionTask, startDate, endDate, taskCompleted));

		System.out.println("La taches " + nameTask + " à été ajoutée avec succès !");
	}

	@Override
	public void markTaskAsCompleted() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("\nEntrer le nom de la tache à marquer comme complétée : ");
		String nameTask = scanner.nextLine();

		boolean taskFound = false;

		for (Task task : tasks) {
			if (task.getName().equals(nameTask)) {
				taskFound = true;

				if (task.isCompleted()) {
					System.out.println("La tâche est déjà terminée !");
				} else {
					task.setCompleted(true);
					System.out.println("La tâche '" + task.getName() + "' a bien été marquée comme terminée !");
				}
				break;
			}
		}

		if (! taskFound) {
			System.out.println("Aucune tâche trouvée avec le nom : " + nameTask);
		}
	}

	@Override
	public void getAllTasks() {
		System.out.println("Voici vos taches : ");
		int count = 1;

		for (Task task : tasks) {
			System.out.println("\nTaches n°" + count + " : " + task);
			count++;
		}
	}

	@Override
	public void getUpcomingTasks() {
		System.out.println("Les taches à venir : ");
		int count = 1;

		for (Task task : tasks) {
			if (! task.isCompleted()) {
				System.out.println("\nTaches n°" + count + " : " + task);
				count++;
			}
		}
	}

	public void saveTasks() {
		String filePath = "src/main/java/fr/atlas/data/tasks.txt";
		saveTasksToFile(filePath, tasks);
	}

	@Override
	public void saveTasksToFile(String filePath, List<Task> tasks) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			int count = 1;
			for (Task task : tasks) {
				writer.write("Taches n°" + count + "\n  {" +
						"Nom = '" + task.getName() + '\'' +
						", Description = '" + task.getDescription() + '\'' +
						", Date de créations = " + task.getCreationDate() +
						", Date de fin = " + task.getDueDate() +
						", Complétions = " + (task.isCompleted() ? "(Finished)" : "(In progress)") +
						'}');
				writer.newLine();
				count++;
			}
			System.out.println("Les tâches ont été sauvegardées avec succès dans le fichier : " + filePath);
		} catch (IOException e) {
			System.err.println("Erreur lors de la sauvegarde des tâches dans le fichier : " + filePath);
			e.fillInStackTrace();
		}
	}
}
