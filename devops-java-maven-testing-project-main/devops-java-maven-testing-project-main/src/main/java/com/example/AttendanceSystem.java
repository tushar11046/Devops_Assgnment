package com.example;

import java.util.ArrayList;
import java.util.List;

public class AttendanceSystem {
    private List<Student> attendanceList;

    public AttendanceSystem() {
        this.attendanceList = new ArrayList<>();
    }

    public void markAttendance(String name, String subject) {
        Student student = new Student(name, subject);
        attendanceList.add(student);
        System.out.println("Attendance marked for " + student);
    }

    public void printAttendance() {
        System.out.println("Attendance List:");
        for (Student student : attendanceList) {
            System.out.println(student);
        }
    }
}
