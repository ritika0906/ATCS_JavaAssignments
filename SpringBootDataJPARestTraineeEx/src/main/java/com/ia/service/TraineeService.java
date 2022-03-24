package com.ia.service;

import java.util.List;
import java.util.Optional;

import com.ia.entity.Trainee;

public interface TraineeService {
	
	Trainee addTrainee(Trainee trainee);
	
	Trainee updateTrainee(Trainee trainee);
	
	Optional<Trainee> getTrainee(int traineeId);
	
	Iterable<Trainee> getAllTrainee();
	
	void deleteTrainee(int traineeId);

}
