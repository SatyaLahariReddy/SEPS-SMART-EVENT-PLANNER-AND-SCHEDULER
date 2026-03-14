package com.seps.service;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.seps.model.Event;
import com.seps.model.Task;

public class SchedulerService {

	public void scheduleTasks(ArrayList<Event>events,ArrayList<Task>tasks) {
		// TODO Auto-generated constructor stub
		if(events.isEmpty() || tasks.isEmpty()) {
			System.out.println("No events or tasks to schedule");
			return;
		}
		Collections.sort(events,Comparator.comparing(Event::getStartTime));
		Collections.sort(tasks,
			    Comparator.comparing(Task::getDeadline)
			              .thenComparing(Task::getPriority)
			);
		for(Task t:tasks) {
			for(int i=0;i<events.size()-1;i++) {
				LocalDateTime freeStart=events.get(i).getEndTime();
				LocalDateTime freeEnd = events.get(i + 1).getStartTime();
				long freeMinutes = Duration.between(freeStart, freeEnd).toMinutes();
				 if (freeMinutes >= t.getDuration()) {

	                    LocalDateTime taskStart = freeStart;
	                    LocalDateTime taskEnd = taskStart.plusMinutes(t.getDuration());

	                    t.setScheduledStart(taskStart);
	                    t.setScheduledEnd(taskEnd);
	                    t.setStatus("SCHEDULED");

	                    System.out.println("Task scheduled: " + task.getTitle()
	                            + " from " + taskStart + " to " + taskEnd);

	                    break;

				
				
			}
			
		}
	}

}