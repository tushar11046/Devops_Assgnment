package com.example;

public class Student {
    private String name;
    private String subject;

    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', subject='" + subject + "'}";
    }
}

