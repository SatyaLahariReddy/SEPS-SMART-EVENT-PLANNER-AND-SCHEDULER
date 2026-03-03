package com.seps.model;
import java.time.LocalDateTime;

public class Event {
	 private int id; //Id of task
	    private int userId;//Id of the user
	    private String title; //Title of the Event
	    private LocalDateTime startTime; //Start Time of Event
	    private LocalDateTime endTime;
	    private LocalDateTime createdAt;
	    public Event() {}
        public Event(int id,int userId,String title,LocalDateTime startTime,LocalDateTime endTime,LocalDateTime createdAt) {
        	this.id=id;
        	this.userId=userId;
        	this.title=title;
        	this.startTime=startTime;
        	this.endTime=endTime;
        	this.createdAt = LocalDateTime.now();
        }
        public boolean conflictsWith(Event other) {
        	return this.startTime.isBefore(other.getEndTime())&& this.endTime.isAfter(other.getStartTime());
        }
        // Getters and Setters

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public LocalDateTime getStartTime() {
            return startTime;
        }

        public void setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
        }

        public LocalDateTime getEndTime() {
            return endTime;
        }

        public void setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
        }
        public LocalDateTime getCreatedAt() {
            return createdAt;
        }
        @Override
        public String toString() {
            return "Event ID: " + id +
                   ", Title: " + title +
                   ", Start: " + startTime +
                   ", End: " + endTime +
                   ", Created At: " + createdAt;
        }
    
}
