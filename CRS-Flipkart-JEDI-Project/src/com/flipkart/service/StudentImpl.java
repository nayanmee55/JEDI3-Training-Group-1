package com.flipkart.service;

import com.flipkart.bean.ReportCard;

public class StudentImpl implements StudentInterface{
    @Override
    public ReportCard viewReportCard(int rollNumber) {
        System.out.println("Report Card Generated");
        return null;
    }

    @Override
    public Course[] viewRegisteredCourses(String studentId) {
        System.out.println("fetching courses");
        return new Course[0];
    }

    @Override
    public boolean payFes(String studentId) {
        System.out.println("payment Initiated");
        return false;
    }
}
