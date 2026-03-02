package com.seps.model;
import java.time.LocalDateTime;

public class Event {
	 private int id; //Id of task
	    private int userId;//Id of the user
	    private String title; //Title of the Event
	    private LocalDateTime startTime; //Start Time of Event
	    private LocalDateTime endTime;
	    public Event() {}
        public Event(int userId,String title,LocalDateTime startTime,LocalDateTime endTime) {
        	this.userId=userId;
        	this.title=title;
        	this.startTime=startTime;
        	this.endTime=endTime;
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
    
}
