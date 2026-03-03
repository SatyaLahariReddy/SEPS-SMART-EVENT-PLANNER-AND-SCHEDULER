package com.seps.service;
import java.util.ArrayList;
import com.seps.model.Task;
public class TaskManager {
	 private ArrayList<Task> tasks;

	public TaskManager() {
		// TODO Auto-generated constructor stub
		tasks = new ArrayList<>();
	}
	 public void addTask(Task task) {
	        tasks.add(task);
	        System.out.println("Task added successfully!");
	    }
	public void deleteTask(int id) {
        boolean removed = tasks.removeIf(task -> task.getId() == id);
        if (removed) {
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }
	public void updateTaskStatus(int id, String newStatus) {
	    for (Task task : tasks) {
	        if (task.getId() == id) {
	            task.setStatus(newStatus);
	            System.out.println("Task status updated successfully!");
	            return;
	        }
	    }
	    System.out.println("Task not found.");
	}
    // Show All Tasks
    public void showAllTasks() {
    	tasks.sort((t1, t2) -> {
    	    int deadlineCompare = t1.getDeadline().compareTo(t2.getDeadline());
    	    
    	    if (deadlineCompare != 0) {
    	        return deadlineCompare;
    	    }
    	    
    	    return Integer.compare(t1.getPriority(), t2.getPriority());
    	});
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}





