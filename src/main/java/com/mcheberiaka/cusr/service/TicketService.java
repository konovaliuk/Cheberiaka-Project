package com.mcheberiaka.cusr.service;

import com.mcheberiaka.cusr.model.Booking;
import com.mcheberiaka.cusr.model.User;

public interface TicketService {
	
	public boolean purchase(User user, Booking booking);
	public boolean cancel(long ticketId);
	public boolean timeCheck (String date, String time, int diff); 
	
}