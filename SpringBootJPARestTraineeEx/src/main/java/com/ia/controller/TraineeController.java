package com.ia.controller;

import java.util.List;

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
@RequestMapping("/trainee")                  //http://localhost:6798/trainee
public class TraineeController {

	@Autowired
	TraineeService service;
	
	@PostMapping("/addTrainee")                        //http://localhost:6798/trainee/addTrainee
	public Trainee addTrainee(@RequestBody Trainee t)
	{
		return service.addTrainee(t);
		
	}
	
	@PutMapping("/updateTrainee")                         //http://localhost:6798/trainee/updateTrainee
	public Trainee updateTrainee(@RequestBody Trainee t)
	{
		return service.updateTrainee(t);
	}
	
	@GetMapping("/getTrainee/{traineeId}")                                 //http://localhost:6798/trainee/getTrainee/traineeId
	public Trainee getTrainee(@PathVariable("traineeId") int traineeId) {
		
		return service.getTrainee(traineeId);
		
	}
	
	@GetMapping("/getAllTrainee")                                        //http://localhost:6798/trainee/getAllTrainee
	public List<Trainee> getAllTrainee()
	{
		
		return service.getAllTrainee();
	}
	
	@DeleteMapping("/deleteTrainee/{traineeId}")                                     //http://localhost:6798/trainee/deleteTrainee/traineeId
	public String deleteTrainee(@PathVariable("traineeId") int traineeId)
	{
		return service.deleteTrainee(traineeId);
	}
	
	
	
}
