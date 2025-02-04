
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SafheNokhost extends javax.swing.JFrame {
      ArrayList list=new ArrayList();
      String search;
      
    public SafheNokhost() {
        initComponents();
        DefaultTableModel table=(DefaultTableModel) jTmoshakhasat.getModel();
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
            PreparedStatement pst= cn.prepareStatement("SELECT id,name,ghaymat,tedad,noa_mahsol FROM mahsolat");
            ResultSet rs=pst.executeQuery();
            while (rs.next()) {                
                product product1=new product(rs.getString("id"),rs.getString("name") ,rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                 table.addRow(new Object[]{product1.getid(),product1.getname(),product1.getghaymet(),product1.gettedad(),product1.getnoamahsol()});
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jsearch = new javax.swing.JTextField();
        jbsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTmoshakhasat = new javax.swing.JTable();
        jprofile = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jsearch.setText(" جستوجو         ");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });

        jbsearch.setBackground(new java.awt.Color(255, 255, 255));
        jbsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\search_icon2.jpg")); // NOI18N
        jbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsearchActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "دسته بندی کالا", "کود شیمیایی", "ادوات کشاورزی", "سموم کشاورزی", "" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(jComboBox2);

        jTmoshakhasat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTmoshakhasat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        jScrollPane2.setViewportView(jTmoshakhasat);

        jprofile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jprofile.setText("change profile");
        jprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprofileActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("sabt mahsol");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("sabt sefaresh & payghiri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu2.setText("شماره تماس");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("درباره ما |");
        jMenuBar1.add(jMenu1);

        jMenu5.setText("|123456789");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("|123456789");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jsearch)
                        .addComponent(jbsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
     
    }//GEN-LAST:event_jsearchActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      String list1=jComboBox2.getSelectedItem().toString();
       int removerow=jTmoshakhasat.getRowCount();
       DefaultTableModel table=(DefaultTableModel) jTmoshakhasat.getModel();
        if (list1.equals("کود شیمیایی")) {
               if (removerow!=0) {
                 for (int i = removerow-1; i >=0; i--) {
                table.removeRow(i);
            }
            }
              try {  
                Connection   cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
                PreparedStatement pst= cn.prepareStatement("SELECT id,name,ghaymat,tedad,noa_mahsol FROM mahsolat where noa_mahsol=? ");
                pst.setString(1,list1);
                ResultSet rs=pst.executeQuery();
                product product1;
                while (rs.next()) {                
                   product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    table.addRow(new Object[]{product1.getid(),product1.getname(),product1.getghaymet(),product1.gettedad(),product1.getnoamahsol()});
                     
            }
              }
                   catch (Exception ex) {
                Logger.getLogger(SafheNokhost.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                else if (list1.equals("ادوات کشاورزی")) {
            
               if (removerow!=0) {
                 for (int i = removerow-1; i >=0; i--) {
                table.removeRow(i);
            }
            }
             try {     
                Connection   cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
                PreparedStatement pst= cn.prepareStatement("SELECT id,name,ghaymat,tedad,noa_mahsol FROM mahsolat where noa_mahsol=? ");
                pst.setString(1,list1);
                ResultSet rs=pst.executeQuery();
                product product1;
                while (rs.next()) {                
                   product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    table.addRow(new Object[]{product1.getid(),product1.getname(),product1.getghaymet(),product1.gettedad(),product1.getnoamahsol()});       
                }
                  }
              
                   catch (Exception ex) {
                Logger.getLogger(SafheNokhost.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                else if (list1.equals("سموم کشاورزی")){
                    if (removerow!=0) {
                 for (int i = removerow-1; i >=0; i--) {
                table.removeRow(i);
            }
            }
            try {
                Connection   cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
                PreparedStatement pst= cn.prepareStatement("SELECT id,name,ghaymat,tedad,noa_mahsol FROM mahsolat where noa_mahsol=? ");
                pst.setString(1,list1);
                ResultSet rs=pst.executeQuery();
                product product1;
                while (rs.next()) {                
                   product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    table.addRow(new Object[]{product1.getid(),product1.getname(),product1.getghaymet(),product1.gettedad(),product1.getnoamahsol()});         
                }
                           }
                   catch (Exception ex) {
                Logger.getLogger(SafheNokhost.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
                else{
                        try {     
                 Connection   cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
                PreparedStatement pst= cn.prepareStatement("SELECT id,name,ghaymat,tedad,noa_mahsol FROM mahsolat ");
                ResultSet rs=pst.executeQuery();
                product product1;
                while (rs.next()) {                
                   product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    table.addRow(new Object[]{product1.getid(),product1.getname(),product1.getghaymet(),product1.gettedad(),product1.getnoamahsol()});
                }
                  }
              
                   catch (Exception ex) {
                Logger.getLogger(SafheNokhost.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprofileActionPerformed
        Changheprofile prof=new Changheprofile(this,true);
        prof.setVisible(true);
    }//GEN-LAST:event_jprofileActionPerformed

    private void jbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsearchActionPerformed
         search=jsearch.getText();
        int removerow=jTmoshakhasat.getRowCount();
        DefaultTableModel table=(DefaultTableModel) jTmoshakhasat.getModel();    
        if (removerow!=0) {
                 for (int i = removerow-1; i >=0; i--) {
                table.removeRow(i);
            }
        }
          try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
            PreparedStatement pst= cn.prepareStatement("SELECT id,name,ghaymat,tedad,noa_mahsol FROM mahsolat where name=? OR noa_mahsol=? ");
            pst.setString(1,search);
            pst.setString(2,search);
            ResultSet rs=pst.executeQuery();
              if( rs.next()){
                product product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    table.addRow(new Object[]{product1.getid(),product1.getname(),product1.getghaymet(),product1.gettedad(),product1.getnoamahsol()});
               } 
              
       } 
        catch (Exception ex) {
                Logger.getLogger(SafheNokhost.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        // shart bezar agar in now bod namayesh bede dar ghayre in sort khata bede
    }//GEN-LAST:event_jbsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SabtMahsol sabtm=new SabtMahsol(this, true);
        sabtm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SabtSefaresh sabtSefaresh=new SabtSefaresh(this, true);
        sabtSefaresh.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SafheNokhost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SafheNokhost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SafheNokhost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SafheNokhost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SafheNokhost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTmoshakhasat;
    private javax.swing.JButton jbsearch;
    private javax.swing.JButton jprofile;
    private javax.swing.JTextField jsearch;
    // End of variables declaration//GEN-END:variables
}
