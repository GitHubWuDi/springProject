package com.vrv.spring.springProject.bean;

public class Message {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	 public void printMessage(){  
	        System.out.println("Your Message : " + message);  
	 }  
	
	
}
