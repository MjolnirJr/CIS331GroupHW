/*
 * Author: Thomas Knupp
 * Date: 
 * Assignment:  
 * Purpose: 
 * 
.*/
package groupHW;

public class Instructor {

    private String name;
    private String prefix;
    private String officeLocation;
    private String department;
    private String email;
    private int instructorID;
    private int nextInstructorID = 1001; //odd numbers 1001 and up (students are even nums)

    public Instructor(String name, String prefix, String office, String dept, String email) {
        // Use setters here.
        this.name = name;
        this.prefix = prefix;
        this.officeLocation = office;
        this.department = dept;
        this.email = email;
        
        this.instructorID = this.nextInstructorID;
        this.nextInstructorID += 2;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOfficeLocation(String office) {
        this.officeLocation = office;
    }

    public String getTitle() {
        return prefix;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "";
    }

}
