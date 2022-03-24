package com.ia.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id
	private int traineeId;
	private String traineeName;
	private int traineeSalary;
	private String traineeAdd;
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getTraineeSalary() {
		return traineeSalary;
	}
	public void setTraineeSalary(int traineeSalary) {
		this.traineeSalary = traineeSalary;
	}
	public String getTraineeAdd() {
		return traineeAdd;
	}
	public void setTraineeAdd(String traineeAdd) {
		this.traineeAdd = traineeAdd;
	}
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int traineeId, String traineeName, int traineeSalary, String traineeAdd) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeSalary = traineeSalary;
		this.traineeAdd = traineeAdd;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeSalary=" + traineeSalary
				+ ", traineeAdd=" + traineeAdd + "]";
	}
	
	

}
