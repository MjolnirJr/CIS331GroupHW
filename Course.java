/*
 * Author: Thomas Knupp
 * Date: 
 * Assignment:  
 * Purpose: 
 * 
.*/
package groupHW;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private String courseBuilding;
    private String courseBldgRoom;
    private int courseCapacity;
    private int courseID;
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
    private Instructor courseInstructor;
    private static int nextCourseID = 0; // using 1-500 for courses

    public Course(String name, String building, String room, int capacity) {
        setCourseName(name);
        setCourseBuilding(building);
        setCourseBldgRoom(room);
        setCapacity(capacity);
        this.courseID = nextCourseID;
        nextCourseID++;
    }

    public void enrollStudent(Student newStudent) {
        // check that there is capacity available!!!
        if (courseCapacity > enrolledStudents.size()) {
            enrolledStudents.add(newStudent);
        }
        else {
            System.out.print("Course is at capacity!\nCouldn't enroll student. . .");
        }
    }

    public boolean removeStudent(int studentID) {
        // remove from list and return if successful or not
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getStudentID() == studentID) {
                enrolledStudents.remove(i);
                return true;
            }
        }
        return false;
    }

    public void assignInstructor(Instructor newInstr) {
        if (newInstr != null) {
            this.courseInstructor = newInstr;
        }
    }

    public void setCourseBldgRoom(String room) {
        if ((room == null) || (room.trim().isEmpty())) {
        }
        else {
            this.courseBldgRoom = room;
        }
    }

    public void setCourseBuilding(String building) {
        if ((building == null) || (building.trim().isEmpty())) {
        }
        else {
            this.courseBuilding = building;
        }
    }

    public void setCapacity(int newCapacity) {
        // courses must have at least one and less than 100 for capacity
        // could set min value to something like 10 or 20 to simulate smallest avail room size
        if (newCapacity > 0 && newCapacity <= 100) {
            this.courseCapacity = newCapacity;
        }
    }

    public void setCourseName(String name) {
        if ((name == null) || (name.trim().isEmpty())) {
        }
        else {
            this.courseName = name;
        }
    }

    public String toString() {
        String output
                = "Course ID: " + courseID + " Course Name: " + courseName + " Bulding: "
                + courseBuilding + " Room: " + courseBldgRoom + " Capacity: " + courseCapacity
                + " Instructor: ";
        if (courseInstructor == null) {
            output += "N/A";
        }
        else {
            output += courseInstructor.getName();
        }

        return output;
    }

    public String getRoster() {
        String output = "";
        for (int i = 0; i < enrolledStudents.size(); i++) {
            output += enrolledStudents.get(i).getName() + "\n";
        }
        return output;
    }

}
