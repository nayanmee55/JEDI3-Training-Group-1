/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.Student;

/**
 * @author Nayan
 *
 */
public class RegisteredCourseImpl implements RegisteredCourse {

	@Override
	public boolean dropCourse(String studentId, int courseId) {
		// TODO Auto-generated method stub
		System.out.println("Course dropped");
		return false;
	}

	@Override
	public String viewGrade(String studentId, int courseId) {
		// TODO Auto-generated method stub
		System.out.println("Returns Grade");
		return null;
	}

	@Override
	public void addGrade(String studentRollNumber, int courseId) {
		// TODO Auto-generated method stub
		System.out.println("Student graded for the course");
	}

	@Override
	public Student[] getStudents(int courseId) {
		// TODO Auto-generated method stub
		System.out.println("return list of student enrolled in a course");
		return null;
	}
	
}
