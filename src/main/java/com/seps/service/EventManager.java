package com.seps.service;
import com.seps.model.Event;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EventManager {
	private ArrayList<Event>events;

	public EventManager() {
		// TODO Auto-generated constructor stub
		events=new ArrayList<>();
	}
	public void addEvent(Event event) {
		events.add(event);
		System.out.println("Event added successfully!");
	}
	public void deleteEvent(int id) {
		 boolean removed = events.removeIf(event -> event.getId() == id);
		 if (removed) {
	            System.out.println("Event deleted successfully!");
	        } else {
	            System.out.println("Event not found.");
	        }
	}
	public void showAllEvents() {
		  if (events.isEmpty()) {
	            System.out.println("No events available.");
	            return;
	        }
	        Collections.sort(events,
	                Comparator.comparing(Event::getCreatedAt).reversed());

	        for (Event event : events) {
	            System.out.println(event);
	        }

	}
	

}
