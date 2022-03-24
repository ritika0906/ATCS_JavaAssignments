package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Trainee;
import com.ia.service.TraineeService;

@SpringBootTest
class SpringBootTraineeExApplicationTests {

	@Autowired
	TraineeService service;
//	@Test
//	void testAddTrainee() {
//		Trainee trainee = new Trainee(1345,"ritika",500,"jaipur");
//		Trainee b = service.addTrainee(trainee);
//		assertEquals(b.getTraineeName(),"ritika");
//	}
	
//	@Test
//	void testAddTrainee() {
//		Trainee trainee = new Trainee(1346,"ranu",600,"jaipur");
//		Trainee b = service.addTrainee(trainee);
//		assertEquals(b.getTraineeName(),"ranu");
//	}
	
//	@Test
//	void testUpdateTrainee() {
//		Trainee trainee = new Trainee(1345,"tanisha",600,"jaipur");
//		Trainee b = service.updateTrainee(trainee);
//		assertEquals(b.getTraineeName(),"tanisha");
//	}

	@Test
	void testDeleteTrainee()
	{
		String d = service.deleteTrainee(1345);
		assertEquals(d,"trainee deleted");
	}
	
}
