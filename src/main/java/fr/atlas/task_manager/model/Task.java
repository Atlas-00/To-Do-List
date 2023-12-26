package fr.atlas.task_manager.model;

import java.time.LocalDate;

public class Task {
	private final String name;
	private final String description;
	private final LocalDate creationDate;
	private final LocalDate dueDate;
	private boolean completed;

	// Constructeurs
	public Task(String name, String description, LocalDate creationDate, LocalDate dueDate, boolean completed) {
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
		this.dueDate = dueDate;
		this.completed = completed;
	}

	public String getName() {
		return name;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean newCompleted) {
		completed = newCompleted;
	}

	public Object getCreationDate() {
		return creationDate;
	}

	public Object getDueDate() {
		return dueDate;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "  \n{" + "Nom = '" + name + '\'' +
				", Description = '" + description + '\'' +
				", Date de créations = " + creationDate +
				", Date de fin = " + dueDate +
				", Complétions = " + (completed ? "(Finished)" : "(In progress)") + '}';
	}
}
