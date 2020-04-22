/*
 * Author: Thomas Knupp
 * Date: 
 * Assignment:  
 * Purpose: 
 * 
.*/
package groupHW;

public class Student {

    private static int nextStudentID = 1000; // even numbers 1000 and up

    private String firstName;
    private String lastName;
    private String studentYear;
    private String studentMajor;
    private String studentEmail;
    private double GPA;
    private int studentID;

    public Student(String name, int year, String major, double GPA, String email) {
        setStudentName(name);
        setStudentMajor(major);
        setGPA(GPA);
        setStudentEmail(email);

        this.studentID = this.nextStudentID;
        this.nextStudentID += 2;
    }

    public void setGPA(double GPA) {
        if (GPA >= 0.0 && GPA <= 4.0) {
            this.GPA = GPA;
        }
        else {
            this.GPA = 0.0;
        }
    }

    public double getGPA() {
        return GPA;
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentName(String name) {
        // more error checking?
        // try trimming and checking for space in the middle. 
        name = name.trim();
        this.firstName = name.substring(0, name.indexOf(' '));
        this.lastName = name.substring(this.firstName.length());
        
    }

    public void setStudentEmail(String email) {
        if (email.contains("@")) {
            this.studentEmail = email;
        }
        else {
            //SOMETHING
            this.studentEmail = "N/A";
            System.out.println("INVALID EMAIL!!! Default value assigned.");
        }
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int year) {
        switch (year) {
            case 1:
                this.studentYear = "Freshman";
                break;
            case 2:
                this.studentYear = "Sophomore";
                break;
            case 3:
                this.studentYear = "Junior";
                break;
            case 4:
                this.studentYear = "Senior";
                break;
            default:
                this.studentYear = "N/A";
                break;
        }
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String major) {
        this.studentMajor = major.trim();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String toString() {

        return getStudentID() + " " + getName() + " " + getStudentYear() + " "
                + getStudentMajor() + " " + getGPA() + " " + getStudentEmail();
    }
}
