package com.mcheberiaka.cusr.service;

import com.mcheberiaka.cusr.model.OneWayList;
import com.mcheberiaka.cusr.model.SearchContent;

public interface TrainService {
	
	public boolean verfiyDateAndTime(SearchContent content, OneWayList result);
	
	public void searchOneWay(SearchContent content, OneWayList result);
	
	

}
