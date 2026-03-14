package com.seps.service;
import java.util.*;
import com.seps.model.Event;
import java.time.LocalDateTime;
public class FreeSlotFinder {
   public List<String> findFreeSlots(ArrayList<Event>events){
	   List<String>freeSlots=new ArrayList<>();
	   for(int i=0;i<events.size()-1;i++) {
		   LocalDateTime end=events.get(i).getEndTime();
		   LocalDateTime nextStart=events.get(i+1).getStartTime();
		   if(end.isBefore(nextStart)) {
			   freeSlots.add(end+"->"+nextStart);
		   }
	   }
	   return freeSlots;
   }
	

}
