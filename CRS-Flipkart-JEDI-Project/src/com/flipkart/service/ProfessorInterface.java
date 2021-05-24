/**
 * 
 */
package com.flipkart.service;

/**
 * @author dhruv
 *
 */
public interface ProfessorInterface {
	
	
	/**
	 * Grade a student using RegisteredCourse and Grade class
	 * @param courseId
	 * @param studentId
	 * @param gradeAlloted
	 */
	public void gradeStudent(int courseId,int studentId,char gradeAlloted);
	
	
	/**
	 * Enrol a professor for teaching a course
	 * @param courseId
	 * @return boolean indicating if professor was registered to a course or not
	 */
	public boolean registerCourse(int courseId);
	
	
	/**
	 * Prof. enters the course Id and the enrolled students are returned
	 * @param courseId
	 * @return list of students enrolled in a course
	 */
	public Student[] getEnrolledStudents(int courseId);
	
}
