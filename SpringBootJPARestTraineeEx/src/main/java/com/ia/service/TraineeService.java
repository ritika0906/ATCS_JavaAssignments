package com.ia.service;

import java.util.List;

import com.ia.entity.Trainee;

public interface TraineeService {
	
	Trainee addTrainee(Trainee trainee);
	
	Trainee updateTrainee(Trainee trainee);
	
	Trainee getTrainee(int traineeId);
	
	List<Trainee> getAllTrainee();
	
	String deleteTrainee(int traineeId);

}
