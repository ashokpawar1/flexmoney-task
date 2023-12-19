package com.flexmoney.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String username;
    private int age;
    private String selectedBatch;
    private LocalDate joiningDate;
    private boolean paymentStatus;
    private String firstJoiningUtr;
    
    
    
	public User() {
		
	}

	public User(String name,String username, int age, String selectedBatch,LocalDate date,String firstJoiningUtr) {
		super();
		this.name = name;
		this.username=username;
		this.age = age;
		this.selectedBatch = selectedBatch;
		this.joiningDate=date;
		this.paymentStatus =true;
		this.firstJoiningUtr=firstJoiningUtr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSelectedBatch() {
		return selectedBatch;
	}

	public void setSelectedBatch(String selectedBatch) {
		this.selectedBatch = selectedBatch;
	}
	
	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	

	public String getFirstJoiningUtr() {
		return firstJoiningUtr;
	}

	public void setFirstJoiningUtr(String firstJoiningUtr) {
		this.firstJoiningUtr = firstJoiningUtr;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", age=" + age + ", selectedBatch="
				+ selectedBatch + ", joiningDate=" + joiningDate + ", paymentStatus=" + paymentStatus
				+ ", firstJoiningUtr=" + firstJoiningUtr + "]";
	}

	

	

	
    
}
