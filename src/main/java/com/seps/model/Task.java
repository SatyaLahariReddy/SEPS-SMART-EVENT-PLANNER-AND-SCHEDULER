
package com.seps.model;
import java.time.LocalDateTime;
public class Task {
	 private int id;
	    private int userId;
	    private String title;
	  private int duration; // in minutes
	   private LocalDateTime deadline;
	   private int priority;
	   // 1 = High, 2 = Medium, 3 = Low
	   private LocalDateTime scheduledStart;
	    private LocalDateTime scheduledEnd;
	    private String status; // PENDING, SCHEDULED, COMPLETED
	    public Task() {}

	public Task (int userId, String title,
        int duration,
        LocalDateTime deadline,
        int priority){
        	this.userId = userId;
            this.title = title;
            this.duration = duration;
            this.deadline = deadline;
            this.priority = priority;
            this.status = "PENDING";
        }
	 public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public int getUserId() { return userId; }
	    public void setUserId(int userId) { this.userId = userId; }

	    public String getTitle() { return title; }
	    public void setTitle(String title) { this.title = title; }

	    public int getDuration() { return duration; }
	    public void setDuration(int duration) { this.duration = duration; }

	    public LocalDateTime getDeadline() { return deadline; }
	    public void setDeadline(LocalDateTime deadline) { this.deadline = deadline; }

	    public int getPriority() { return priority; }
	    public void setPriority(int priority) { this.priority = priority; }

	    public LocalDateTime getScheduledStart() { return scheduledStart; }
	    public void setScheduledStart(LocalDateTime scheduledStart) {
	        this.scheduledStart = scheduledStart;
	    }

	    public LocalDateTime getScheduledEnd() { return scheduledEnd; }
	    public void setScheduledEnd(LocalDateTime scheduledEnd) {
	        this.scheduledEnd = scheduledEnd;
	    }

	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }
	    @Override
	    public String toString() {
	        return "Task ID: " + id +
	               ", Title: " + title +
	               ", Duration: " + duration + " mins" +
	               ", Deadline: " + deadline +
	               ", Priority: " + priority +
	               ", Status: " + status;
	    }
	}

	

