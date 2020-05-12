package com.mcheberiaka.cusr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcheberiaka.cusr.model.Train;
import com.mcheberiaka.cusr.model.TrainStatus;

public interface TrainStatusRepository extends JpaRepository<TrainStatus, Long>{
	
	TrainStatus findByTrainAndDate(Train train, String date);

}
