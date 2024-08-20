/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevMonitor;

/**
 *
 * @author Yaye
 */
public class Student {
    private int StudentID;
    private String Name;
    private String Surname;
    private int Grade;
    private boolean Departed;

    public Student(int StudentID, String Name, String Surname, int Grade, boolean Departed) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.Surname = Surname;
        this.Grade = Grade;
        this.Departed = Departed;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }

    public boolean isDeparted() {
        return Departed;
    }

    public void setDeparted(boolean Departed) {
        this.Departed = Departed;
    }


}
