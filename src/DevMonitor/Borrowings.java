/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevMonitor;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Yaye
 */
public class Borrowings extends javax.swing.JFrame {

    private final String PopulateQuery = "SELECT BorrowingID, DeviceName, StudentName+\" \"+StudentSurname AS Student, StudentGrade AS Grade,\n" +
                            " AdminName + \" \"+AdminSurname AS Lender, Remarks, DateBorrowed, Returned ,  DateReturned\n" +
                            "\n" + "FROM tblAdmin,tblDevice,tblStudent,tblBorrowings\n" +
                            "WHERE tblAdmin.AdminID = tblBorrowings.AdminID\n" +
                            "AND tblDevice.DeviceID = tblBorrowings.DeviceID\n" +
                            "AND tblStudent.StudentID=tblBorrowings.StudentID"
            + " ORDER BY BorrowingID";
    private final String unreturned = "SELECT BorrowingID, DeviceName, StudentName+\" \"+StudentSurname AS Student, StudentGrade AS Grade,\n" +
                                       " AdminName + \" \"+AdminSurname AS Lender, Remarks, DateBorrowed " +
                                       "FROM tblAdmin,tblDevice,tblStudent,tblBorrowings\n" +
                                       "WHERE tblAdmin.AdminID = tblBorrowings.AdminID\n" +
                                       "AND tblDevice.DeviceID = tblBorrowings.DeviceID\n" +
                                       "AND tblStudent.StudentID=tblBorrowings.StudentID\n" +
                                       "AND Returned= false "
            + " ORDER BY DateBorrowed DESC";
                            
    public Borrowings() {
        initComponents();
        this.setLocationRelativeTo(null);//to center the frame
    }
    
    public void refresh(){
        try {
            LogIn.dbman.Display(tblBorrowings, PopulateQuery);
        } catch (SQLException ex) {
            Logger.getLogger(Borrowings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtUserOutput = new javax.swing.JLabel();
        btnHelp4 = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBorrowings = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        chbxUnreturned = new javax.swing.JCheckBox();
        cbxSort = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserOutput.setFont(new java.awt.Font("Tribeca", 0, 24)); // NOI18N
        txtUserOutput.setForeground(new java.awt.Color(255, 255, 51));
        txtUserOutput.setText("Borrowing history");
        jPanel1.add(txtUserOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 498, 51));

        btnHelp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/help.png"))); // NOI18N
        btnHelp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 36, 32));

        btnRemove.setText("Remove a record");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("* Chief Admin Only");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 180, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBorrowings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblBorrowings);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 480));

        btnBack.setText("<<Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 500, 99, 40));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 359, 40));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 41, 49));

        chbxUnreturned.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chbxUnreturned.setText("Unreturned Only");
        chbxUnreturned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxUnreturnedActionPerformed(evt);
            }
        });
        jPanel2.add(chbxUnreturned, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        cbxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DeviceName", "Student", "Grade", "Lender", "Remarks", "DateBorrowed", "Returned", "DateReturned" }));
        cbxSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSortActionPerformed(evt);
            }
        });
        jPanel2.add(cbxSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, 130, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("SORT BY:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 490, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refresh();
        if(LogIn.user.getUserType()!=1){
            btnRemove.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Home h = new Home();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // To search for a record
      

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         //Checks if search bar is not empty then searches for what is entered
        if(txtSearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter something in the search box before pressing this button");
        }
        else{
            try {
                LogIn.dbman.SearchBorrowings(tblBorrowings,txtSearch.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnHelp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp4ActionPerformed
        JOptionPane.showMessageDialog(null," Use the search bar to search for a record. Press remove a record, enter borrowingID and press remove to delete a record \n"
                + "Only a ChiefAdmin can delete records "
                + "Use the Sort By box to sort table by column header of your choice. \n"
                + "tick the Unreturned only to show borrowings that haven't been complete returned yet");
    }//GEN-LAST:event_btnHelp4ActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        RemoveBHistory rem = new RemoveBHistory();
        rem.setVisible(true);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void chbxUnreturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxUnreturnedActionPerformed
        //to show unreturned fields only and go back to normal table if unchecked
        if(chbxUnreturned.isSelected()){
            try {
                LogIn.dbman.Display(tblBorrowings, unreturned);
            } catch (SQLException ex) {
                Logger.getLogger(Borrowings.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else if(chbxUnreturned.isSelected()==false){
            try {
                LogIn.dbman.Display(tblBorrowings, PopulateQuery);
            } catch (SQLException ex) {
                Logger.getLogger(Borrowings.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_chbxUnreturnedActionPerformed

    private void cbxSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSortActionPerformed
        try {
        if(cbxSort.getSelectedItem()== "DeviceName"){
          
           
                LogIn.dbman.SortBorrowings(tblBorrowings,"DeviceName");
            
        }
            else if(cbxSort.getSelectedItem()== "Student"){
                LogIn.dbman.SortBorrowings(tblBorrowings,"StudentName+StudentSurname");
             
        }
            else if(cbxSort.getSelectedItem()== "Grade"){
                 LogIn.dbman.SortBorrowings(tblBorrowings,"StudentGrade");
            
            }
            else if(cbxSort.getSelectedItem()== "Lender"){
                LogIn.dbman.SortBorrowings(tblBorrowings,"AdminName + AdminSurname");
             }
            else if(cbxSort.getSelectedItem()== "Remarks"){
                LogIn.dbman.SortBorrowings(tblBorrowings,"Remarks");
             }
            else if(cbxSort.getSelectedItem()== "DateBorrowed"){
                LogIn.dbman.SortBorrowings(tblBorrowings,"DateBorrowed");
             }
            else if(cbxSort.getSelectedItem()== "Returned"){
                LogIn.dbman.SortBorrowings(tblBorrowings,"Returned");
             }
            else if(cbxSort.getSelectedItem()== "DateReturned"){
                LogIn.dbman.SortBorrowings(tblBorrowings,"DateReturned");
             }

            
        
        } catch (SQLException ex) {
                Logger.getLogger(Administrators.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_cbxSortActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Borrowings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrowings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrowings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrowings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrowings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHelp4;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxSort;
    private javax.swing.JCheckBox chbxUnreturned;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBorrowings;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtUserOutput;
    // End of variables declaration//GEN-END:variables
}
