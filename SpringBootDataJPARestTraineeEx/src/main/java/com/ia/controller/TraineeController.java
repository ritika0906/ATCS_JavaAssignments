package com.ia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Trainee;
import com.ia.service.TraineeService;

@RestController
@RequestMapping("/trainee")                  //http://localhost:6736/trainee
public class TraineeController {

	@Autowired
	TraineeService service;
	
	@PostMapping("/addTrainee")                        //http://localhost:6736/trainee/addTrainee
	public Trainee addTrainee(@RequestBody Trainee t)
	{
		return service.addTrainee(t);
		
	}
	
	@PutMapping("/updateTrainee")                         //http://localhost:6736/trainee/updateTrainee
	public Trainee updateTrainee(@RequestBody Trainee t)
	{
		return service.updateTrainee(t);
	}
	
	@GetMapping("/getTrainee/{traineeId}")                                 //http://localhost:6736/trainee/getTrainee/traineeId
	public Optional<Trainee> getTrainee(@PathVariable("traineeId") int traineeId) {
		
		return service.getTrainee(traineeId);
		
	}
	
	@GetMapping("/getAllTrainee")                                        //http://localhost:6736/trainee/getAllTrainee
	public Iterable<Trainee> getAllTrainee()
	{
		
		return service.getAllTrainee();
	}
	
	@DeleteMapping("/deleteTrainee/{traineeId}")                                     //http://localhost:6736/trainee/deleteTrainee/traineeId
	public void deleteTrainee(@PathVariable("traineeId") int traineeId)
	{
		service.deleteTrainee(traineeId);
	}
	
	
	
}
