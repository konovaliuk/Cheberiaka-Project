package com.mcheberiaka.cusr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcheberiaka.cusr.model.Station;
import com.mcheberiaka.cusr.model.Train;
import com.mcheberiaka.cusr.model.TrainSchedule;


public interface ScheduleRepository extends JpaRepository<TrainSchedule, Long>{
	
	
	TrainSchedule findByStopAndTrain(Station stop, Train train);
	
	List<TrainSchedule> findByStopAndDepartTimeGreaterThanEqual(Station stop, String departTime);
	
	List<TrainSchedule> findByStopAndArrivalTimeGreaterThan(Station stop, String departTime);
	
	List<TrainSchedule> findByStopAndDepartTime(Station stop, String departTime);
	
}
