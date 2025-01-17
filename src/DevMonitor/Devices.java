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


/**
 *
 * @author Yaye
 */
public class Devices extends javax.swing.JFrame {
    
    final String PopulateQuery ="SELECT * FROM tblDevice;";
    public static Devices dev = new Devices();
    
    public Devices() {
        initComponents();
         this.setLocationRelativeTo(null);//to center the frame
    }
    
     public void clear(){
         txtSearch.setText("");
         txtDeviceName.setText("");
         txtDevType.setText("");
         txtDeviceID.setText("");
         chbxOutOfUse.setSelected(false);
     }
    
     public void refresh(){
         //This allows the jtable to refresh and include the newly added record
            try {
                LogIn.dbman.Display(tblDevice, PopulateQuery);
            } catch (SQLException ex) {
                Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error: "+ ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDeviceName = new javax.swing.JTextField();
        txtDevType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnhelp1 = new javax.swing.JButton();
        txtDeviceID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        chbxOutOfUse = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbxSort = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDevice = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        pnlHead4 = new javax.swing.JPanel();
        txtUserOutput4 = new javax.swing.JLabel();
        btnHelp4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel1.setText("Edit Records");

        txtDeviceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceNameActionPerformed(evt);
            }
        });

        txtDevType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Device Name");

        jLabel3.setText("Device Type");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnhelp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/help.png"))); // NOI18N
        btnhelp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhelp1ActionPerformed(evt);
            }
        });

        jLabel5.setText("DeviceID");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Out Of Use");

        jButton1.setText("Clear");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnhelp1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDeviceName, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(txtDeviceID)
                                        .addComponent(txtDevType))
                                    .addComponent(chbxOutOfUse))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeviceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDevType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxOutOfUse)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addComponent(btnhelp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, -1, 555));

        btnBack.setText("<<Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, 109, 44));

        cbxSort.setMaximumRowCount(3);
        cbxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Type", "OutOfUse" }));
        cbxSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSortActionPerformed(evt);
            }
        });
        getContentPane().add(cbxSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 112, 32));

        tblDevice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DeviceID", "DeviceName", "DeviceType"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDevice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeviceMouseClicked(evt);
            }
        });
        tblDevice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDeviceKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDevice);
        if (tblDevice.getColumnModel().getColumnCount() > 0) {
            tblDevice.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 77, 924, 490));

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
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 359, 27));

        pnlHead4.setBackground(new java.awt.Color(0, 0, 102));
        pnlHead4.setForeground(new java.awt.Color(0, 0, 102));
        pnlHead4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserOutput4.setFont(new java.awt.Font("Tribeca", 0, 24)); // NOI18N
        txtUserOutput4.setForeground(new java.awt.Color(255, 255, 51));
        txtUserOutput4.setText("   Devices");
        pnlHead4.add(txtUserOutput4, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 0, 498, 51));

        btnHelp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/help.png"))); // NOI18N
        btnHelp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp4ActionPerformed(evt);
            }
        });
        pnlHead4.add(btnHelp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 40, 30));

        jTextField5.setBackground(new java.awt.Color(0, 0, 102));
        jTextField5.setForeground(new java.awt.Color(0, 0, 102));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        pnlHead4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 57, 93, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        pnlHead4.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, -1, 30));

        getContentPane().add(pnlHead4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 41, 27));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("SORT BY:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 80, 60));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setText("SORT BY:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeviceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceNameActionPerformed

    private void txtDevTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);

        Home home = new Home ();
        home.setVisible(true); //Goes back to home
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Makes sure no field is left empty
        if(txtDeviceName.getText().isEmpty() || txtDevType.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"You can not leave Device Name and Device Type fields blank");
        }
        else{
        try {
            
            LogIn.dbman.addDevice(txtDeviceName.getText(), txtDevType.getText(),chbxOutOfUse.isSelected());  //uses addDevice method from DBManager class to add a new device
            JOptionPane.showMessageDialog(null,"Record added successfull" );
            clear();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex);
        }
         
        refresh();
        
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnhelp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhelp1ActionPerformed
        JOptionPane.showMessageDialog(null,"Adding a new record: Enter the device name and type in the fields provided and press 'Add' \n"
                                          + "Removing a record: Enter DeviceID of the record you want to remove. You can make use of the search bar \n"
                                          +"Updating a record: simply select a record and its details will be filled in the text boxes, afterwards edit the fields you want to change\n"
                                          +"Note: DeviceID is generated automatically and user input will be ignored for the adding of a record"              
                                          );
    }//GEN-LAST:event_btnhelp1ActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        //if field is empty
        if(txtDeviceID.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please enter the device id. You can\n"
                + " make use of the search bar to find the specific record you are looking for");
        }
        else 
        {
        try 
        {
            int a= JOptionPane.showConfirmDialog(null, " Deleting this device would also delete all records associated with it\n"
                                          + "If this device cannot be lended anymore you can simply tick the OutOfUse checkbox.\n"
                                          + "Do you want continue to delete this device and all its records? ","Warning", JOptionPane.YES_NO_OPTION);  
            if(a==0){
            LogIn.dbman.Remove(txtDeviceID.getText());   //removes record if user selects yes
            refresh();  //displays data from database and also refreshes the jTable to include newly made Changes
            JOptionPane.showMessageDialog(null,"Record removed successfuly" );
             clear(); //sets all text fields empty 
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ ex);
        }
        
        }
          
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //This allows the table to be populated as soon as the frame is opened
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void tblDeviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeviceMouseClicked
        // This puts the details of the selected record into the textfields
        int row =tblDevice.getSelectedRow();
      String  DevID =  tblDevice.getModel().getValueAt(row,0).toString();  // gets the DeviceID of the selected record
      String DeviceName = tblDevice.getModel().getValueAt(row,1).toString();
      String DeviceType = tblDevice.getModel().getValueAt(row,2).toString();
        Object chbx =    tblDevice.getModel().getValueAt(row, 3);
      txtDeviceID.setText(String.valueOf(DevID));
            txtDeviceName.setText(DeviceName);
            txtDevType.setText(DeviceType);
            chbxOutOfUse.setSelected((boolean) chbx);  

        
        
    }//GEN-LAST:event_tblDeviceMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
       
        
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        if(txtDeviceID.getText().isEmpty() || txtDeviceName.getText().isEmpty() || txtDevType.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"Please fill in all the details of the students");
        }
        else{
            try {
                
                LogIn.dbman.updateDeviceInfo(txtDeviceID.getText(), txtDeviceName.getText(), txtDevType.getText(), chbxOutOfUse.isSelected());
                refresh();  //displays data from database and also refreshes the jTable to include newly made Changes
                JOptionPane.showMessageDialog(null,"Record updated successfully" );
                clear();//sets all text fields empty
            }
            catch (SQLException ex) {
                Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHelp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp4ActionPerformed
        JOptionPane.showMessageDialog(null,"Here you can see and edit details of a device or create/remove one. "
                + "\nUse the drop down box to sort table by a column header of your choice. "
                + "\nYou can also type a name or Device Type into the search bar and press the search button to find their record. ");
    }//GEN-LAST:event_btnHelp4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
   //Checks if search bar is not empty then searches for what is entered
        if(txtSearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter something in the search box before pressing this button");
        }
        else{
            try {
                LogIn.dbman.SearchDevice(tblDevice,txtSearch.getText());
                txtSearch.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblDeviceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDeviceKeyPressed

    }//GEN-LAST:event_tblDeviceKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSortActionPerformed
        try {
        if(cbxSort.getSelectedItem()== "Name"){
          
           
                LogIn.dbman.Sort(tblDevice,"tblDevice", "DeviceName");
            
        }
            else if(cbxSort.getSelectedItem()== "Type"){
                LogIn.dbman.Sort(tblDevice,"tblDevice", "DeviceType");
        }
            else if(cbxSort.getSelectedItem()== "OutOfUse"){
                 LogIn.dbman.Sort(tblDevice,"tblDevice", "OutOfUse");
            }
          } catch (SQLException ex) {
                Logger.getLogger(Administrators.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_cbxSortActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked
     
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
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHelp4;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnhelp1;
    private javax.swing.JComboBox<String> cbxSort;
    private javax.swing.JCheckBox chbxOutOfUse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel pnlHead4;
    private javax.swing.JTable tblDevice;
    private javax.swing.JTextField txtDevType;
    private javax.swing.JTextField txtDeviceID;
    private javax.swing.JTextField txtDeviceName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtUserOutput4;
    // End of variables declaration//GEN-END:variables
}
