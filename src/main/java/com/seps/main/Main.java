package com.seps.main;
import java.time.LocalDateTime;
import java.util.Scanner;
import com.seps.model.Event;
import com.seps.model.Task;
import com.seps.service.EventManager;
import com.seps.service.TaskManager;
import com.seps.service.EventManager;
import com.seps.service.TaskManager;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Scanner scanner = new Scanner(System.in);
        EventManager manager = new EventManager();
        TaskManager taskManager = new TaskManager();
        boolean running=true;
        while(running) {
        	   System.out.println("\n===== SEPS MENU =====");
               System.out.println("1. Add Event");
               System.out.println("2. View Events");
               System.out.println("3. Delete Event");
               System.out.println("4. Add Task");
               System.out.println("5. View Tasks");
               System.out.println("6. Delete Task");
              
               
               System.out.println("7. Exit");
               System.out.print("Choose option: ");

               int choice = scanner.nextInt();
               scanner.nextLine();
               switch (choice) {
               case 1:
                   System.out.println("Add Event feature coming next...");
                   break;

               case 2:
                   manager.showAllEvents();
                   break;

               case 3:
                   System.out.print("Enter Event ID to delete: ");
                   int eventId = scanner.nextInt();
                   scanner.nextLine();
                   manager.deleteEvent(eventId);
                   break;

               case 4:
                   System.out.println("Add Task feature coming next...");
                   break;

               case 5:
                   taskManager.showAllTasks();
                   break;

               case 6:
                   System.out.print("Enter Task ID to delete: ");
                   int taskId = scanner.nextInt();
                   scanner.nextLine();
                   taskManager.deleteTask(taskId);
                   break;

               case 7:
                   running = false;
                   System.out.println("Exiting planner...");
                   break;

               default:
                   System.out.println("Invalid choice.");
           }
        }
	}

}
