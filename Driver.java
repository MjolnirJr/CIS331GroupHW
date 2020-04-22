/*
 * Author: Thomas Knupp
 * Date: 
 * Assignment:  
 * Purpose: 
 * 
.*/
package groupHW;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static ArrayList<Student> studentArray = new ArrayList<>();
    public static ArrayList<Course> courseArray = new ArrayList<>();
    public static ArrayList<Instructor> instructorArray = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menuInput;
        Course newCourse;
        do {
            System.out.print("Student Management System\nPlease make a menu choise below:\n"
                    + "---------------------------------\n"
                    + "1: Create a Course\n2: Add student to Course\n3:Remove student from a course\n"
                    + "4: Add Instructor to a Course\n5: Print Roster for a Course\n6: Quit\n"
                    + "Choice: ");

            menuInput = in.nextInt();
            if (menuInput == 1) {
                // Adds a course.
                // Create a basic no arg constructor that does this?
                newCourse = new Course("N/A", "N/A", "N/A", 0);

                System.out.print("Creating Class . . .\nEnter Course Name: ");
                in.nextLine();
                newCourse.setCourseName(in.nextLine());

                System.out.print("Enter Building: ");
                newCourse.setCourseBuilding(in.nextLine());

                System.out.print("Enter Room Number: ");
                newCourse.setCourseBldgRoom(in.nextLine());

                System.out.print("Enter Room Capacity: ");
                newCourse.setCapacity(in.nextInt());

                courseArray.add(newCourse);

                continue;
            }
            else if (menuInput == 2) {
                // Add a student to an existing course.
                if (courseArray.size() == 0) {
                    System.out.println("\nNo Courses Found!\nReturning to Main Menu. . .\n");
                    continue;
                }
                else {
                    for (int i = 0; i < courseArray.size(); i++) {
                        System.out.println(courseArray.get(i).toString());
                    }
                    System.out.print("\nPlease enter a Class ID: ");
                    int courseSelection = in.nextInt();
                    in.nextLine();
                    // offer cancellation option?

                    Student newStudent = new Student("N/A, N/A", 0, "N/A", 0.0, "N/A");
                    System.out.print("Enter Student Information:\nName (firstname lastname): ");
                    String n = in.nextLine();
                    newStudent.setStudentName(n);

                    System.out.print("Major: ");
                    newStudent.setStudentMajor(in.nextLine());

                    System.out.print("Year: ");
                    newStudent.setStudentYear(in.nextInt());

                    System.out.print("GPA: ");
                    newStudent.setGPA(in.nextDouble());
                    in.nextLine();

                    System.out.print("Email: ");
                    newStudent.setStudentEmail(in.nextLine());

                    studentArray.add(newStudent);
                    courseArray.get(courseSelection).enrollStudent(newStudent);
                    System.out.println(courseArray.get(courseSelection).getRoster());
                }
            }
            else if (menuInput == 3) {
                // remove student - Jom
                System.out.println("worked");
            }
            else if (menuInput == 4) {
                // add instructor - Chris
                System.out.println("worked");
            }
            else if (menuInput == 5) {
                // print roster - Tran & Vincent
                System.out.println("worked");
            }
            else if (menuInput == 6) {
                // Exits the program.
                System.out.println("Exiting. . .");
                break;
            }

        }
        while (0 < 1);
    }

}
