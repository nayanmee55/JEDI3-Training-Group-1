package com.flipkart.client;

import com.flipkart.dao.*;


public class Demo {

	public static void main(String[] args) {
		
	ProfessorDaoImpl obj = new ProfessorDaoImpl();
	System.out.println(obj.getEnrolledStudents(1).get(0));

	}

}
