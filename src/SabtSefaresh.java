
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import static java.time.LocalDateTime.now;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SabtSefaresh extends javax.swing.JDialog {
    Product2 product2=null;
    SafheNokhost safheNokhost=new SafheNokhost();
    public SabtSefaresh(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         DefaultTableModel table=(DefaultTableModel) jTable.getModel();
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
            PreparedStatement pst= cn.prepareStatement("select id,username,password,first_name,last_name,email from log ");
            ResultSet rs=pst.executeQuery();
            while (rs.next()) {  
                    product2=new Product2(rs.getString("id"), rs.getString("username"), rs.getString("password"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"));
             }
                int id=Integer.valueOf(product2.getid());
                int newid=Math.max(id,id);
                String id2=String.valueOf(newid);
                System.out.println(id2);
                PreparedStatement pst2= cn.prepareStatement("select id,username,password,first_name,last_name,email from log WHERE id=?");
                pst2.setString(1, id2);
                ResultSet rs2=pst2.executeQuery();
                if (rs2.next()) {
                    Product2 product3=new Product2(rs2.getString("id"), rs2.getString("username"), rs2.getString("password"),rs2.getString("first_name"),rs2.getString("last_name"),rs2.getString("email"));
                 PreparedStatement prst= cn.prepareStatement("select num_paghiri,id,name,ghaymat,tedad,noa_mahsol,sale_date FROM sale_list WHERE customer_name=?");
                prst.setString(1,product3.getusername());
                ResultSet res=prst.executeQuery();
                while(res.next()) {
                  Proccessor proccessor=new Proccessor(res.getInt("num_paghiri"),res.getString("id"), res.getString("name"), res.getString("ghaymat"),res.getInt("tedad"),res.getString("noa_mahsol"),res.getString("sale_date"));
                    table.addRow(new Object[]{proccessor.getnumpayghiri(),proccessor.getid(),product2.getusername(),proccessor.getname(),proccessor.getghaymet(),proccessor.gettedad(),proccessor.getnoamahsol(),proccessor.getsaledate()});
             }
             }
         } catch (Exception ex) {
            Logger.getLogger(SabtSefaresh.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jpaghiri = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("name");

        jLabel3.setText("tedad");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButton1.setText("sabt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("payghiri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("num_payghiri");

        jpaghiri.setText("baray payghiri shomare paghiri ra vared konid");

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        jButton3.setText("cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpaghiri, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                        .addComponent(jTextField4))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpaghiri, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name=jTextField1.getText();
        String tedad=jTextField4.getText();
        Random random=new Random();
        DefaultTableModel table=(DefaultTableModel) jTable.getModel();
         Date date=new Date();
         int tedad1=Integer.valueOf(tedad);
          product product1;
         if(tedad1!=0){
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
            PreparedStatement pst= cn.prepareStatement("select id,name,ghaymat,tedad,noa_mahsol from mahsolat where name=?");
            pst.setString(1,name.trim());
            ResultSet rs=pst.executeQuery();
            if( rs.next()){
                PreparedStatement pst2= cn.prepareStatement("select id,username,password,first_name,last_name,email from log ");
                ResultSet rs1=pst2.executeQuery();
                while (rs1.next()) {  
                    product2=new Product2(rs1.getString("id"), rs1.getString("username"), rs1.getString("password"),rs1.getString("first_name"),rs1.getString("last_name"),rs1.getString("email"));
             }
                int id3=Integer.valueOf(product2.getid());
                int newid1=Math.max(id3,id3); newid1++;
                String id4=String.valueOf(newid1);
                    int numpaghiri=random.nextInt(9999); 
                   product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    table.addRow(new Object[]{numpaghiri,product1.getid(),product2.getusername(),product1.getname(),product1.getghaymet(),tedad,product1.getnoamahsol(),date.toString()});
                    int num=product1.gettedad();
                    int tedad2=num-tedad1;
                    if (tedad2<=10) {
                        JOptionPane.showMessageDialog(this,"tedad is lower than 10");
                  }
                    if (tedad2==0) {
                       PreparedStatement ps2= cn.prepareStatement("DELETE FROM mahsolat WHERE name=? ");
                       ps2.setString(1,name);
                       ps2.executeUpdate();
                       PreparedStatement ps= cn.prepareStatement("select id,name,ghaymat,tedad,noa_mahsol from mahsolat WHERE id>?");
                       ps.setString(1,product1.getid());
                       ResultSet rst=ps.executeQuery();
                       while(rst.next()){
                        product product2=new product(rst.getString("id"), rst.getString("name"), rst.getString("ghaymat"),rst.getInt("tedad"),rst.getString("noa_mahsol"));
                        int id=Integer.valueOf(product2.getid());
                        int id2=Integer.valueOf(product1.getid());
                           System.out.println(id);
                           System.out.println(id2);
                           if (id>id2) {
                                id--;
                                String newid=String.valueOf(id);
                                String id5=String.valueOf(id2);
                                PreparedStatement ps1= cn.prepareStatement("UPDATE mahsolat SET id=? WHERE id>? ");
                                ps1.setString(1,newid);
                                ps1.setString(2,id5);
                                ps1.executeUpdate();
                                id2++;
                           }
                       }
                  }
                    String newtedad=String.valueOf(tedad2);
                    PreparedStatement ps1= cn.prepareStatement("UPDATE mahsolat SET tedad=? WHERE name=? ");
                    ps1.setString(1,newtedad);
                    ps1.setString(2,name);
                    ps1.executeUpdate();
                    PreparedStatement pst1=cn.prepareStatement("INSERT INTO sale_list(num_paghiri,id,customer_name,name,ghaymat,tedad,noa_mahsol,sale_date) "
                            + "VALUES(?,?,?,?,?,?,?,?)");
                    pst1.setInt(1,numpaghiri);
                    pst1.setString(2,product1.getid());
                    pst1.setString(3,product2.getusername());
                    pst1.setString(4,product1.getname());
                    pst1.setString(5,product1.getghaymet());
                    pst1.setInt(6,tedad1);
                    pst1.setString(7,product1.getnoamahsol());
                    pst1.setString(8,date.toString());
                    pst1.executeUpdate();
               } 
       } 
        catch (SQLException ex) {
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        } 
       catch (ClassNotFoundException ex) { 
            Logger.getLogger(Loggin.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
         else{
             JOptionPane.showMessageDialog(this,"tedad mitavanad 0 bashad");
         }
        safheNokhost.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
         


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int paghiri=Integer.valueOf(jpaghiri.getText());
       DefaultTableModel table=(DefaultTableModel) jTable.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
            PreparedStatement pst= cn.prepareStatement("select num_paghiri,id,name,ghaymat,tedad,noa_mahsol from sale_list where num_paghiri=?");
            pst.setInt(1,paghiri);
            ResultSet rs=pst.executeQuery();
           if (rs.next()) {
               Proccessor proccessor=new Proccessor(rs.getInt("num_paghiri"),rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"),rs.getString("sale_date"));
                    table.addRow(new Object[]{paghiri,proccessor.getid(),proccessor.getname(),proccessor.getghaymet(),proccessor.gettedad(),proccessor.getnoamahsol(),proccessor.getsaledate()});
           }
        }
        catch (Exception ex) {
            Logger.getLogger(SabtSefaresh.class.getName()).log(Level.SEVERE, null, ex);
        }
        safheNokhost.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SabtSefaresh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SabtSefaresh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SabtSefaresh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SabtSefaresh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SabtSefaresh dialog = new SabtSefaresh(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jpaghiri;
    // End of variables declaration//GEN-END:variables
}
