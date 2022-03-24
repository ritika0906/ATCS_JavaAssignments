package com.ia.dao;

import org.springframework.data.repository.CrudRepository;

import com.ia.entity.Trainee;

public interface TraineeDao extends CrudRepository<Trainee,Integer> {
	
}
