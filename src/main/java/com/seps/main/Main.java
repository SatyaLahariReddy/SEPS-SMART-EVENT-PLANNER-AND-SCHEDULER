package com.seps.main;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.seps.model.Event;
import com.seps.service.EventManager;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Scanner scanner = new Scanner(System.in);
        EventManager manager = new EventManager();
        while(true) {
        	   System.out.println("\n===== SEPS MENU =====");
               System.out.println("1. Add Event");
               System.out.println("2. Delete Event");
               System.out.println("3. View Events");
               System.out.println("4. Exit");
               System.out.print("Choose option: ");

               int choice = scanner.nextInt();
               scanner.nextLine();
               switch (choice) {

               case 1:
                   System.out.print("Enter Event ID: ");
                   int id = scanner.nextInt();
                   scanner.nextLine();

                   System.out.print("Enter User ID: ");
                   int userId = scanner.nextInt();
                   scanner.nextLine();

                   System.out.print("Enter Title: ");
                   String title = scanner.nextLine();

                   LocalDateTime start = LocalDateTime.now();
                   LocalDateTime end = start.plusHours(1);

                   Event event = new Event(id, userId, title, start, end, false);

                   manager.addEvent(event);
                   break;
        }
	}

}
