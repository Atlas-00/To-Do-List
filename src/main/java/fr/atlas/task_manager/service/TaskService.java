package fr.atlas.task_manager.service;

import fr.atlas.task_manager.model.Task;

import java.util.List;

public interface TaskService {
	void addTask();

	void markTaskAsCompleted();

	void getAllTasks();

	void getUpcomingTasks();

	void saveTasksToFile(String filePath, List<Task> tasks);
}
