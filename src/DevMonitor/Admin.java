/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevMonitor;


public class Admin {
    private int AdminID;
    private String AdminName;
    private String AdminSurname;
    private String username;
    private String password;
    private int UserType;
    private boolean Deactivate;

    public Admin(int AdminID, String AdminName, String AdminSurname, String username, String password, int UserType, boolean Deactivate) {
        this.AdminID = AdminID;
        this.AdminName = AdminName;
        this.AdminSurname = AdminSurname;
        this.username = username;
        this.password = password;
        this.UserType = UserType;
        this.Deactivate = Deactivate;
    }

    public int getAdminID() {
        return AdminID;
    }

    public void setAdminID(int AdminID) {
        this.AdminID = AdminID;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    public String getAdminSurname() {
        return AdminSurname;
    }

    public void setAdminSurname(String AdminSurname) {
        this.AdminSurname = AdminSurname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserType() {
        return UserType;
    }

    public void setUserType(int UserType) {
        this.UserType = UserType;
    }

    public boolean isDeactivate() {
        return Deactivate;
    }

    public void setDeactivate(boolean Deactivate) {
        this.Deactivate = Deactivate;
    }
    
    

   


   

    
    
}
