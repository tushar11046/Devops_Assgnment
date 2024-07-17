package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Mark Attendance");
            System.out.println("2. Print Attendance");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine();
                    attendanceSystem.markAttendance(name, subject);
                    break;
                case 2:
                    attendanceSystem.printAttendance();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}


