package com.ia.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.dao.TraineeDao;
import com.ia.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	TraineeDao dao;
	

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return dao.save(trainee);
	}
	
	@Override
	public Optional<Trainee> getTrainee(int traineeId) {
		
		return dao.findById(traineeId);
	}

	@Override
	public Iterable<Trainee> getAllTrainee() {
		
		return dao.findAll();
	}

	@Override
	public void deleteTrainee(int traineeId) {
		
		dao.deleteById(traineeId);
	}

	

}
