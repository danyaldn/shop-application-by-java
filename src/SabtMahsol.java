
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SabtMahsol extends javax.swing.JDialog {
    SafheNokhost safheNokhost=new SafheNokhost();
    public SabtMahsol(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jghaymat = new javax.swing.JTextField();
        jtedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jnoamahsol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("sabt mahsol");

        jok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jok.setText("sabt");
        jok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("clear");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("name mahsol");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ghaymat");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("tedad");

        jname.setText(" ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("noa mahsol");

        jnoamahsol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "کود شیمیایی", "ادوات کشاورزی", "سموم کشاورزی" }));
        jnoamahsol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnoamahsolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addGap(384, 384, 384))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jnoamahsol, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jghaymat)
                                            .addComponent(jtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jok, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jghaymat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnoamahsol, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokActionPerformed
       String list1=jnoamahsol.getSelectedItem().toString();
        if (jname.getText().isEmpty()||jghaymat.getText().isEmpty()||jtedad.getText().isEmpty()) {
             JOptionPane.showMessageDialog(this, ""); 
        }
        if (list1.equals("کود شیمیایی")){
           try {   Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
            PreparedStatement ps= cn.prepareStatement("select id,name,ghaymat,tedad,noa_mahsol from mahsolat WHERE name=? ");
            ps.setString(1,jname.getText());
            ResultSet rs=ps.executeQuery();
            product product1 = null;
                if( rs.next()) {
                    product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    int tedad=Integer.valueOf(jtedad.getText());
                    int newtedad=tedad+product1.gettedad();
                String tedad2=String.valueOf(newtedad);
                 System.out.println(tedad2);
                    PreparedStatement pst=cn.prepareStatement("UPDATE mahsolat SET tedad=? WHERE name=?");
                    pst.setString(1,tedad2);
                    pst.setString(2,jname.getText().trim());
                    pst.executeUpdate();
               }
                     else{                 
                    Statement pst2=cn.createStatement();
                    ResultSet rst=pst2.executeQuery("select id,name,ghaymat,tedad,noa_mahsol from mahsolat");
                    product product = null;
                    while (rst.next()) {
                       product=new product(rst.getString("id"), rst.getString("name"), rst.getString("ghaymat"),rst.getInt("tedad"),rst.getString("noa_mahsol"));
                     }
                    int id=Integer.valueOf(product.getid());
                    int newid=Math.max(id,id); newid++;
                     String id2=String.valueOf(newid);
                    PreparedStatement pst1= cn.prepareStatement("INSERT INTO mahsolat(id,name,ghaymat,tedad,noa_mahsol) VALUES(?,?,?,?,?)");
                    pst1.setString(1,id2);
                    pst1.setString(2,jname.getText().trim());
                    pst1.setString(3,jghaymat.getText());
                    pst1.setString(4,jtedad.getText());
                    pst1.setString(5,list1);
                    pst1.executeUpdate();
                     }
                 JOptionPane.showMessageDialog(this, "added mahsol");
                    dispose();
           }
            catch (Exception ex) {
               Logger.getLogger(SabtMahsol.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        else if (list1.equals("ادوات کشاورزی")){
              try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
             PreparedStatement ps= cn.prepareStatement("select id,name,ghaymat,tedad,noa_mahsol from mahsolat ");
            ResultSet rs=ps.executeQuery();
            product product1 = null;
                   if ( rs.next()) {
                     product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    int tedad=Integer.valueOf(jtedad.getText());
                    int newtedad=tedad+product1.gettedad();
                     String tedad2=String.valueOf(newtedad);
                    PreparedStatement pst=cn.prepareStatement("UPDATE mahsolat SET tedad=? WHERE name=?");
                    pst.setString(1,tedad2);
                    pst.setString(2,jname.getText().trim());
                        }
                    else{
                       Statement pst1=cn.createStatement();
                    ResultSet rst=pst1.executeQuery("select id,name,ghaymat,tedad,noa_mahsol from mahsolat");
                    product product = null;
                    while (rst.next()) {
                       product=new product(rst.getString("id"), rst.getString("name"), rst.getString("ghaymat"),rst.getInt("tedad"),rst.getString("noa_mahsol"));
                     }
                    int id=Integer.valueOf(product.getid());
                    int newid=Math.max(id,id); newid++;
                     String id2=String.valueOf(newid);

                        PreparedStatement pst= cn.prepareStatement("INSERT INTO mahsolat(id,name,ghaymat,tedad,noa_mahsol) VALUES(?,?,?,?,?)");
                        pst.setString(1,id2);
                        pst.setString(2,jname.getText().trim());
                        pst.setString(3,jghaymat.getText());
                        pst.setString(4,jtedad.getText());
                        pst.setString(5,list1);
                        pst.executeUpdate();
                }
            JOptionPane.showMessageDialog(this, "added mahsol");
            dispose();
           
           }
            catch (Exception ex) {
               Logger.getLogger(SabtMahsol.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        else if (list1.equals("سموم کشاورزی")){
             try {
               Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  cn =DriverManager.getConnection("jdbc:mysql://localhost:3307/tamrin","root","");
             PreparedStatement ps= cn.prepareStatement("select id,name,ghaymat,tedad,noa_mahsol from mahsolat WHERE name=?");
             ps.setString(1, jname.getText());
            ResultSet rs=ps.executeQuery();
            product product1 = null;
                 if( rs.next()) {
                     product1=new product(rs.getString("id"), rs.getString("name"), rs.getString("ghaymat"),rs.getInt("tedad"),rs.getString("noa_mahsol"));
                    int tedad=Integer.valueOf(jtedad.getText());
                    int newtedad=tedad+product1.gettedad();
                    String tedad2=String.valueOf(newtedad);
                    PreparedStatement pst=cn.prepareStatement("UPDATE mahsolat SET tedad=? WHERE name=?");
                    pst.setString(1,tedad2);
                    pst.setString(2,jname.getText().trim());
                 }
                 else{
                     Statement pst1=cn.createStatement();
                    ResultSet rst=pst1.executeQuery("select id,name,ghaymat,tedad,noa_mahsol from mahsolat");
                    product product = null;
                    while (rst.next()) {
                       product=new product(rst.getString("id"), rst.getString("name"), rst.getString("ghaymat"),rst.getInt("tedad"),rst.getString("noa_mahsol"));
                     }
                    int id=Integer.valueOf(product.getid());
                    int newid=Math.max(id,id); newid++;
                     String id2=String.valueOf(newid);
                    PreparedStatement pst= cn.prepareStatement("INSERT INTO mahsolat(id,name,ghaymat,tedad,noa_mahsol) VALUES(?,?,?,?,?)");
                    pst.setString(1,id2);
                    pst.setString(2,jname.getText().trim());
                    pst.setString(3,jghaymat.getText());
                    pst.setString(4,jtedad.getText());
                    pst.setString(5,list1);
                    pst.executeUpdate();
                }
            JOptionPane.showMessageDialog(this, "added mahsol");
            dispose();
           
             }
            catch (Exception ex) {
               Logger.getLogger(SabtMahsol.class.getName()).log(Level.SEVERE, null, ex);
           } 
        }
        safheNokhost.setVisible(true);
    }//GEN-LAST:event_jokActionPerformed

    private void jnoamahsolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnoamahsolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnoamahsolActionPerformed

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
            java.util.logging.Logger.getLogger(SabtMahsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SabtMahsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SabtMahsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SabtMahsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SabtMahsol dialog = new SabtMahsol(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jghaymat;
    private javax.swing.JTextField jname;
    private javax.swing.JComboBox<String> jnoamahsol;
    private javax.swing.JButton jok;
    private javax.swing.JTextField jtedad;
    // End of variables declaration//GEN-END:variables
}
