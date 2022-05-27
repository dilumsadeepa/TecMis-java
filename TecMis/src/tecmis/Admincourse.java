/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tecmis;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Admincourse extends javax.swing.JFrame {

    /**
     * Creates new form Admincourse
     */
    
    Course co = new Course();
    DB db = new DB();
    public String cid;
    
    public Admincourse() {
        initComponents();
        
        db.getconnect();
        codata();
    }
    
    public void codata(){
        try {
            DefaultTableModel model = (DefaultTableModel)cotable.getModel();
            
            String qu = "SELECT * FROM courses";
            ResultSet rs = db.stm.executeQuery(qu);
            
            while(rs.next()){
                Object[] row = {rs.getString("cu_id"),rs.getString("cu_name"),rs.getString("cu_did")};
                model.addRow(row);
                
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Adduseradmin.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        coname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        coaddbtn = new javax.swing.JButton();
        codep = new javax.swing.JComboBox<>();
        coresetbtn = new javax.swing.JButton();
        coupbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cotable = new javax.swing.JTable();
        codelete = new javax.swing.JButton();
        coeditbtn = new javax.swing.JButton();
        costext = new javax.swing.JLabel();
        clecopen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course profiles");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Add Course");

        jLabel3.setText("Course ID");

        jLabel4.setText("Course Name");

        jLabel5.setText("Department ID");

        coaddbtn.setBackground(new java.awt.Color(255, 0, 255));
        coaddbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        coaddbtn.setText("ADD");
        coaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coaddbtnActionPerformed(evt);
            }
        });

        codep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BST" }));

        coresetbtn.setBackground(new java.awt.Color(204, 0, 102));
        coresetbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        coresetbtn.setText("Reset");
        coresetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coresetbtnActionPerformed(evt);
            }
        });

        coupbtn.setBackground(new java.awt.Color(153, 0, 153));
        coupbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        coupbtn.setText("Update");
        coupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coupbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(coid)
                            .addComponent(jLabel4)
                            .addComponent(coname)
                            .addComponent(codep, 0, 191, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(coaddbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coresetbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coupbtn)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coaddbtn)
                    .addComponent(coresetbtn)
                    .addComponent(coupbtn))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        cotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "courese ID", "Course Name", "Department"
            }
        ));
        jScrollPane1.setViewportView(cotable);

        codelete.setBackground(new java.awt.Color(255, 0, 255));
        codelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codelete.setForeground(new java.awt.Color(255, 255, 255));
        codelete.setText("Delete");
        codelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeleteActionPerformed(evt);
            }
        });

        coeditbtn.setBackground(new java.awt.Color(102, 0, 102));
        coeditbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        coeditbtn.setForeground(new java.awt.Color(255, 255, 255));
        coeditbtn.setText("Edit");
        coeditbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeditbtnActionPerformed(evt);
            }
        });

        costext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        clecopen.setBackground(new java.awt.Color(153, 0, 153));
        clecopen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clecopen.setForeground(new java.awt.Color(255, 255, 255));
        clecopen.setText("Add lecture to course");
        clecopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clecopenActionPerformed(evt);
            }
        });

        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codelete)
                        .addGap(29, 29, 29)
                        .addComponent(coeditbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clecopen)
                        .addGap(41, 41, 41))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(costext, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(costext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codelete)
                            .addComponent(coeditbtn)
                            .addComponent(clecopen))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void coaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coaddbtnActionPerformed
        // TODO add your handling code here:
        co.setCo_id(coid.getText());
        co.setConame(coname.getText());
        co.setDepid(codep.getSelectedItem().toString());
        
        if(co.getCo_id().equals("") || co.getConame().equals("") || co.getDepid().equals("")){
            costext.setText("Fill all the filds");
        }else{
            try {
                String sql = "insert into courses (cu_id,cu_name,cu_did) values ('"+co.getCo_id()+"','"+co.getConame()+"','"+co.getDepid()+"')";
                
                int res = db.stm.executeUpdate(sql);
                if (res > 0) {
                    costext.setText("Course added Successfully");
                    DefaultTableModel dtm = (DefaultTableModel)cotable.getModel();
                    
                    String[] items = {co.getCo_id(),co.getConame(),co.getDepid()};
                    dtm.addRow(items);
                    
                    
                    
                }else{
                    costext.setText("database error");
                } 
            } catch (SQLException ex) {
                Logger.getLogger(Admincourse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_coaddbtnActionPerformed

    private void coresetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coresetbtnActionPerformed
        // TODO add your handling code here:
        coid.setText("");
        coname.setText("");
        
    }//GEN-LAST:event_coresetbtnActionPerformed

    private void codeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeleteActionPerformed
        // TODO add your handling code here:
        int drow = cotable.getSelectedRow();
        
        if(drow > 0){
            String cid = (String) cotable.getValueAt(drow, 0);
                       
            DefaultTableModel model = (DefaultTableModel)cotable.getModel();
            model.removeRow(drow);
            
            String dsql = "delete from courses where cu_id ='"+cid+"'";
            
            try {
                int rest = db.stm.executeUpdate(dsql);
                if(rest > 0){
                    costext.setText("Deleted successfully");
                }else{
                    costext.setText("Deleted Unsuccessfully");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Adduseradmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            costext.setText("Select a row");
        }
    }//GEN-LAST:event_codeleteActionPerformed

    private void coeditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeditbtnActionPerformed
        // TODO add your handling code here:
        int row = cotable.getSelectedRow();
        if(row>0){
            
            try {
                String co_id = (String) cotable.getValueAt(row, 0);
                String qu = "SELECT * FROM courses where cu_id = '"+co_id+"'";
                ResultSet rs = db.stm.executeQuery(qu);
                
                while(rs.next()){
                    cid = rs.getString("id");
                    coid.setText(rs.getString("cu_id"));
                    coname.setText(rs.getString("cu_name"));
                    
                    
                    
                }
                DefaultTableModel model = (DefaultTableModel)cotable.getModel();
                model.removeRow(row);
            } catch (SQLException ex) {
                Logger.getLogger(Adduseradmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }else{
            costext.setText("Select a row");
        }
    }//GEN-LAST:event_coeditbtnActionPerformed

    private void coupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coupbtnActionPerformed
        // TODO add your handling code here:
            co.setCo_id(coid.getText());
            co.setConame(coname.getText());
            co.setDepid(codep.getSelectedItem().toString());
            
          
                     
            
        
        try {
            
            if(co.getCo_id().equals("") || co.getConame().equals("") || co.getDepid().equals("")){
                costext.setText("Error in getting data");
                
            }else{
                
                
                    
                    String upsql = "UPDATE courses SET cu_id = ?, cu_name = ?, cu_did = ? WHERE id = ?";
                  
                  
                   PreparedStatement st = db.conn.prepareStatement(upsql);
                   
                   st.setString(1, co.getCo_id());
                   st.setString(2, co.getConame());
                   st.setString(3, co.getDepid());
                   st.setString(4, cid);
                   
                    int res = st.executeUpdate();
                    
                    if (res > 0) {
                        costext.setText("User added Successfully");
                        DefaultTableModel dtm = (DefaultTableModel)cotable.getModel();
                        
                        String[] items = {co.getCo_id(),co.getConame(),co.getDepid()};
                        dtm.addRow(items);
                        
                        coid.setText("");
                        coname.setText("");
                        
                    }else{
                        costext.setText("database error");
                    }
            }
        } catch (Exception e) {
            costext.setText("Did not run try");
        }
    }//GEN-LAST:event_coupbtnActionPerformed

    private void clecopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clecopenActionPerformed
        // TODO add your handling code here:
        Coursetolec colec = new Coursetolec();
        colec.show();
    }//GEN-LAST:event_clecopenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admincourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admincourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clecopen;
    private javax.swing.JButton coaddbtn;
    private javax.swing.JButton codelete;
    private javax.swing.JComboBox<String> codep;
    private javax.swing.JButton coeditbtn;
    private javax.swing.JTextField coid;
    private javax.swing.JTextField coname;
    private javax.swing.JButton coresetbtn;
    private javax.swing.JLabel costext;
    private javax.swing.JTable cotable;
    private javax.swing.JButton coupbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
