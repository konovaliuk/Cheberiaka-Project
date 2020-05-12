package com.mcheberiaka.cusr.service;

import java.util.List;

import com.mcheberiaka.cusr.model.SystemStat;
import com.mcheberiaka.cusr.model.Train;

public interface SystemService {
	
	public String getTrainReservationPercent(String bound, String date);
	
	public String getDailyPercent(List<Train> trains, String date);
	
	public int getTotalSearchNumber(String date);
	
	public SystemStat[] getRequestStat(String date);
	
	

}
