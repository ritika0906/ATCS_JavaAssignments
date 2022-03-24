package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.ia.entity.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entity;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.getTraineeId());
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		return entity.merge(trainee);
		 
	}

	@Override
	public Trainee getTrainee(int traineeId) {
		
		return entity.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> getAllTrainee() {
		
		TypedQuery<Trainee> result = entity.createQuery("select e from Trainee e", Trainee.class);
		return result.getResultList();
	}

	@Override
	public String deleteTrainee(int traineeId) {
		
		Trainee trainee = entity.find(Trainee.class, traineeId);
		
		if(trainee!=null)
		{
			entity.remove(trainee);
			return "trainee deleted";
		}
		else {
			return "no trainee found";
		}
	}

	

	
}
