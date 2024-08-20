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
public class Borrowing {
    private int BorrowingID;
    private int DevID;
    private int StudentID;
    private boolean returned;
    private int AdminID;
    private String remarks;
    private String DateBorrowed;
    private String DateReturned;

    public int getBorrowingID() {
        return BorrowingID;
    }

    public void setBorrowingID(int BorrowingID) {
        this.BorrowingID = BorrowingID;
    }

    public int getDevID() {
        return DevID;
    }

    public void setDevID(int DevID) {
        this.DevID = DevID;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public int getAdminID() {
        return AdminID;
    }

    public void setAdminID(int AdminID) {
        this.AdminID = AdminID;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDateBorrowed() {
        return DateBorrowed;
    }

    public void setDateBorrowed(String DateBorrowed) {
        this.DateBorrowed = DateBorrowed;
    }

    public String getDateReturned() {
        return DateReturned;
    }

    public void setDateReturned(String DateReturned) {
        this.DateReturned = DateReturned;
    }

    public Borrowing(int BorrowingID, int DevID, int StudentID, boolean returned, int AdminID, String remarks, String DateBorrowed, String DateReturned) {
        this.BorrowingID = BorrowingID;
        this.DevID = DevID;
        this.StudentID = StudentID;
        this.returned = returned;
        this.AdminID = AdminID;
        this.remarks = remarks;
        this.DateBorrowed = DateBorrowed;
        this.DateReturned = DateReturned;
    }
}
