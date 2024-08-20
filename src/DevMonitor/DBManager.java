/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevMonitor;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;  //import for rs2xml.jar plugin(found in libraries)
import static oracle.jrockit.jfr.events.Bits.intValue; //to take int value of object

/**
 *
 * @author Yaye
 */
public class DBManager {
    private Connection conn;
    
   public DBManager()
    {
        //connect the project to the database
        try
        {
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Yaye\\Documents\\Zoom\\DeviceMonitor\\Borrowing.accdb") ; 
            System.out.println("Successful connection");
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
   //method to create an array that hold all Administrator details from the Admin table
   public Admin[] getadmin() throws SQLException{
        Admin [] admins = new Admin [200];   //Creating array of administrators
        int count = 0;
         String A_Name, A_Surname, A_Username, A_Password;
         int UserType;
         boolean deactivate;
       Statement stmt = conn.createStatement();
       String sql = "SELECT * FROM tblAdmin";
       ResultSet rs = stmt.executeQuery(sql);
       
       while(rs.next()){        
           int A_id= rs.getInt("AdminID");
            A_Name= rs.getString("AdminName");
            A_Surname= rs.getString("AdminSurname");
            A_Username= rs.getString("username");
            A_Password= rs.getString("password");
            UserType = rs.getInt("UserType");
            deactivate= rs.getBoolean("Deactivate");
    
        admins[count] = new Admin (A_id, A_Name, A_Surname, A_Username, A_Password,UserType,deactivate);
            count ++;
           
      }  
        return admins;
   }
   //method to create an array that hold all details from the Devices table
   public Device[] getDevice() throws SQLException{
       Device[] devices = new Device[200];   //Creating array of Administrators
       int count= 0;
              int Dev_id;
       String Dev_Name, Dev_Type;
       Statement stm = conn.createStatement();
       String selectDevice = "SELECT * FROM tblDevice";
       ResultSet dev = stm.executeQuery(selectDevice);
       boolean OutOfUse;
       while(dev.next()){        
            Dev_id= dev.getInt("DeviceID");
            Dev_Name= dev.getString("DeviceName");
            Dev_Type= dev.getString("DeviceType");
            OutOfUse = dev.getBoolean("OutOfUse");
           
        devices[count] = new Device(Dev_id, Dev_Name, Dev_Type,OutOfUse);
            count ++;
           
      }  
        return devices;
   }
   ////method to create an array that hold all details from the Student table
   public Student[] getStudent() throws SQLException{
       Student[] student = new Student[500];   //Creating array of type Student
       int count= 0;
       
       int S_id, grade;
       String S_Name, S_Surname;
       boolean departed;
       
       Statement stm = conn.createStatement();
       String selectStudent = "SELECT * FROM tblStudent";
       ResultSet rs = stm.executeQuery(selectStudent);
       Student temp= null;
       
       while(rs.next()){        
            S_id= rs.getInt("StudentId");
            S_Name= rs.getString("StudentName");
            S_Surname= rs.getString("StudentSurname");
            grade = rs.getInt("StudentGrade");
            departed=rs.getBoolean("Departed");
           
        student[count] = new Student(S_id, S_Name, S_Surname, grade, departed);
            count ++;
           
      }  
        return student;
   }
  //method that holds all details from tblBorrowings in an Array 
   public Borrowing[] getBorrowings() throws SQLException{
       Borrowing[] borrowing = new Borrowing[900];
       Statement stmt = conn.createStatement();
       String query= "SELECT * FROM tblBorrowings";
       ResultSet rs = stmt.executeQuery(query);
       int count=0;
       String remarks, DateBorrowed, DateReturned;
       int BorrowingID, DevID, StudentID, AdminID;
       boolean returned;
       while(rs.next()){
           BorrowingID = rs.getInt("BorrowingID");
           DevID= rs.getInt("DeviceID");
           StudentID= rs.getInt("StudentID");
           returned= rs.getBoolean("Returned");
           AdminID= rs.getInt("AdminID");
           remarks=rs.getString("Remarks");
           DateBorrowed=rs.getString("DateBorrowed");
           DateReturned=rs.getString("DateReturned");
           
           borrowing[count]= new Borrowing(BorrowingID,DevID,StudentID,
                   returned,AdminID,remarks,DateBorrowed,DateReturned);
           count++;
       }
        return borrowing;
   }
           
   //method to add a new device to tblDevice
   public void addDevice ( String DevName, String DevType, boolean OutOfUse) throws SQLException
    {
        Statement s = conn.createStatement();
        String query = "INSERT INTO tblDevice\n" 
                + "( DeviceName, DeviceType, OutOfUse)\n" 
                + "VALUES (" 
                + "'" + DevName + "', '" + DevType + "' ,"+OutOfUse+");";
        
        System.out.println(query);
        int rs = s.executeUpdate(query);        
    }
   //Allows jtable to be populated from db by using rs2xml.jar plugin(in libraries)
   public void Display(JTable TablSupply, String query) throws SQLException{
       Statement stm = conn.createStatement();
       ResultSet rs = stm.executeQuery(query);
       TablSupply.setModel(DbUtils.resultSetToTableModel(rs));    
   }
//  Method to remove from tblDevice
   public void Remove(String DeviceID) throws SQLException{ //DeviceID is a string because user input is String
       Statement stmt = conn.createStatement();
       String query = "DELETE FROM tblDevice WHERE DeviceID = "+DeviceID ;
       System.out.println(query);
       int rs2 = stmt.executeUpdate(query);
   }
   //Method to update details of a device
   public void updateDeviceInfo(String DeviceID,String DevName,String DevType, boolean OutOfUse) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "UPDATE tblDevice SET  DeviceName="+ "'" + DevName + "' , DeviceType= '" 
               + DevType + "' , OutOfUse = "+OutOfUse+" WHERE DeviceID= " + DeviceID+";" ;
       System.out.println(query);
       int rs = stmt.executeUpdate(query);
   }
   //method to add a new admin
    public void addAdmin ( String AdminName, String AdminSurname, String Username, String Password, int UserType, boolean deactivate) throws SQLException
    {
        Statement stmt = conn.createStatement();
        String query = "INSERT INTO tblAdmin\n" 
                + "(  AdminName, AdminSurname, username, password,UserType, Deactivate)\n" 
                + "VALUES " 
                + "('" + AdminName + "', '" + AdminSurname + "', '" + Username + "', '" + Password +"', '"+UserType+ "',"+deactivate+");"; 
        System.out.println(query);
        int rs = stmt.executeUpdate(query);
       
    }    
    //  Method to remove from tblAdmin
   public void RemoveAdmin(String AdminID) throws SQLException{ //DeviceID is a string because user input is String
       Statement stmt = conn.createStatement();
       String query = "DELETE FROM tblAdmin WHERE AdminID = "+AdminID ;
       System.out.println(query);
       int rs2 = stmt.executeUpdate(query);
   
   }
   
    //Method to update details of an administrator
   public void updateAdminInfo(String AdminID,String AdminName,String AdminSurname, String Username,String Password,String UserType, boolean Deactivate) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "UPDATE tblAdmin SET  AdminName="+ "'" + AdminName + "' , AdminSurname = '" + AdminSurname + "' , "
               + "username = '"+ Username+"' , UserType ='"+UserType +"', password ='"+Password+"',Deactivate ="+Deactivate+" WHERE AdminID= "+ AdminID +";" ;
       System.out.println(query);
       int rs = stmt.executeUpdate(query);
   }
   
   //method to add a new Student
    public void addStudent ( String StudentName, String StudentSurname, String StudentGrade, boolean departed) throws SQLException
    {
        Statement stmt = conn.createStatement();
        String query = "INSERT INTO tblStudent\n" 
                + "(  StudentName, StudentSurname, StudentGrade, Departed)\n" 
                + "VALUES " 
                + "('" + StudentName + "', '" + StudentSurname + "', " + StudentGrade + ", "+departed+");"; 
        System.out.println(query);
        int rs = stmt.executeUpdate(query);
       
    }
    
    //  Method to remove from tblStudent
   public void RemoveStudent(String StudentID) throws SQLException{ //DeviceID is a string because user input is String
       Statement stmt = conn.createStatement();
       String query = "DELETE FROM tblStudent WHERE StudentID = "+StudentID ;
       System.out.println(query);
       int rs2 = stmt.executeUpdate(query);
   
   }
   
   //Method to update details of a Student
   public void updateStudentInfo(String S_id,String S_Name,String S_Surname, String S_Grade, boolean departed) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "UPDATE tblStudent SET  StudentName="+ "'" + S_Name + "' , StudentSurname = '" + S_Surname + "' , "
               + "StudentGrade = '"+ S_Grade+"', Departed = "+ departed+" WHERE StudentID= " + S_id+";" ;
       System.out.println(query);
       int rs = stmt.executeUpdate(query);
   }
   
  //Method to sort a table 
    public void Sort(JTable tblSupp,String tblInDB, String s) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "SELECT * \n" +
        "FROM "+tblInDB+"\n" +
        "ORDER BY  " + s+" ASC" ;
       System.out.println(query);
        ResultSet rs = stmt.executeQuery(query);
        tblSupp.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    //Method to sort Borrowings table  
    public void SortBorrowings(JTable tblSupp, String s) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "SELECT BorrowingID, DeviceName, StudentName+StudentSurname AS Student, StudentGrade AS Grade,\n" +
                    "AdminName + AdminSurname AS Lender, Remarks, DateBorrowed, Returned ,  DateReturned\n" +
                    "FROM tblAdmin, tblStudent, tblDevice, tblBorrowings\n" +
                    "WHERE tblAdmin.AdminID= tblBorrowings.AdminID AND\n" +
                    "tblBorrowings.DeviceID = tblDevice.DeviceID AND\n" +
                    "tblBorrowings.StudentID = tblStudent.StudentID\n"
                      + "ORDER BY " +s+
                    " ";
       System.out.println(query);
        ResultSet rs = stmt.executeQuery(query);
         tblSupp.setModel(DbUtils.resultSetToTableModel(rs));
    }
    //Method to search through only admin table
    public void Search(JTable tblSupp, String s) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "SELECT * \n" +
        "FROM tblAdmin"+"\n" +
        "WHERE AdminName LIKE '*" + s+"*' OR AdminSurname LIKE '*"+s+"' OR Username LIKE '*" + s +"*'";
       System.out.println(query);
        ResultSet rs = stmt.executeQuery(query);
        tblSupp.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    //Method to search through only Student table
    public void SearchStudent(JTable tblSupp, String s) throws SQLException{
      
        Statement stmt = conn.createStatement();
       String query = "SELECT * \n" +
        "FROM tblStudent"+"\n" +
        "WHERE StudentName LIKE '*" + s+"*' OR StudentSurname LIKE '*"+s+"*'";
       System.out.println(query);
        ResultSet rs = stmt.executeQuery(query);
        tblSupp.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    //Method to search through only Device table
    public void SearchDevice( JTable tblSupp, String s) throws SQLException{
      
        Statement stmt = conn.createStatement();
       String query = "SELECT * \n" +
        "FROM tblDevice"+"\n" +
        "WHERE DeviceName LIKE '*" + s+"*' OR DeviceType LIKE '*"+s+"*'";
       System.out.println(query);
        ResultSet rs = stmt.executeQuery(query);
         tblSupp.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    //  Method to remove from tblBorrowings(only by chief admin)
   public void RemoveBorrowing(String B_ID) throws SQLException{ //B_ID is a string because user input is String
       Statement stmt = conn.createStatement();
       String query = "DELETE FROM tblBorrowings WHERE BorrowingID = "+B_ID ;
       System.out.println(query);
       int rs2 = stmt.executeUpdate(query);
   }
   
  //Method to search through tblBorrowings
    public void SearchBorrowings(JTable tblSupp, String s) throws SQLException{
      
        Statement stmt = conn.createStatement();
       String query = "SELECT TOP 1 BorrowingID, DeviceName, StudentName+StudentSurname AS Student, StudentGrade AS Grade,AdminName + AdminSurname AS Lender, Remarks, DateBorrowed, Returned ,  DateReturned\n" +
    "FROM tblAdmin, tblStudent, tblDevice, tblBorrowings\n" +
    "WHERE tblAdmin.AdminID= tblBorrowings.AdminID AND\n" +
    "tblBorrowings.DeviceID = tblDevice.DeviceID AND\n" +
    "tblBorrowings.StudentID = tblStudent.StudentID\n" +
    " \n" +
    "AND DeviceName LIKE '*"+s+"*' OR StudentName+' '+StudentSurname LIKE '*"+s+"*'OR StudentGrade LIKE '*"+s+"*' OR "+"AdminName+' '+AdminSurname LIKE '*"+s+"*' OR Remarks LIKE '*"+s+"*'";
       System.out.println(query);
        ResultSet rs = stmt.executeQuery(query);
        tblSupp.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
   
   //Method to insert a new record to table Borrowings
    public void Lend(int DeviceID, int StudentID, boolean Returned, int AdminID, String Remarks) throws SQLException{
       
            Statement stmt = conn.createStatement();
             
       String query = "INSERT INTO tblBorrowings(DeviceID, StudentID, Returned, AdminID, Remarks, DateBorrowed)"
               + "VALUES( "+ DeviceID+", "+ StudentID +" ,'"+Returned+"',"+AdminID+", '"+ Remarks+"', NOW() )";
       System.out.println(query);
       int rs = stmt.executeUpdate(query);
       
    }
    
   
        //Method to update device table when returning and lending
   public void DevStatus(int DeviceID, boolean s) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "UPDATE tblDevice SET  OutOfUse= "+ s + " WHERE DeviceID= " + DeviceID ;
       System.out.println(query);
       int rs = stmt.executeUpdate(query);
   }
   //Method to update tblBorrowings when returning device
     public void ReturnedBorrowing(int DeviceID) throws SQLException{
       Statement stmt = conn.createStatement();
       String query = "UPDATE tblBorrowings SET  Returned = true AND DateReturned = NOW() WHERE DeviceID= " + DeviceID ;
       System.out.println(query);
       int rs = stmt.executeUpdate(query);
   }
     
   
}
   
     

        
   


