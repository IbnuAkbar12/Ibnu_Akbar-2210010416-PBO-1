/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import CRUD.Koneksi;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Frameuser extends javax.swing.JFrame {
    
    private Koneksi CRUD;

    /**
     * Creates new form Frameuser
     */
    public Frameuser() {
        
        CRUD = new Koneksi();
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtid_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtuser_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnama_lengkap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttgl_lahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtJK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtno_tlpn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("id_user");
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel1KeyTyped(evt);
            }
        });

        txtid_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtid_userKeyTyped(evt);
            }
        });

        jLabel2.setText("user_name");

        jLabel3.setText("password");

        jLabel4.setText("nama_lengkap");

        jLabel5.setText("tgl_lahir");

        jLabel6.setText("JK");

        txtJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJKActionPerformed(evt);
            }
        });

        jLabel7.setText("alamat");

        jLabel8.setText("no_tlpn");

        jButton1.setText("simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton2KeyTyped(evt);
            }
        });

        jButton3.setText("hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid_user)
                                    .addComponent(txtuser_name)
                                    .addComponent(txtpassword)
                                    .addComponent(txtnama_lengkap)
                                    .addComponent(txtJK)
                                    .addComponent(txtalamat)
                                    .addComponent(txtno_tlpn)
                                    .addComponent(txttgl_lahir, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addComponent(jButton4))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnama_lengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtno_tlpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJKActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtJKActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //tabel hapus
        try {
            if (
                 txtid_user.getText().equals("") &&
                    txtuser_name.getText().equals("") &&
                    txtpassword.getText().equals("") &&
                    txtnama_lengkap.getText().equals("") &&
                    txtJK.getText().equals("") &&
                    txtalamat.getText().equals("") &&
                    txtno_tlpn.getText().equals("") &&
                    txttgl_lahir.getText().equals("")
                )
            {
                JOptionPane.showMessageDialog(this, "Silahkan cari data terlebih dahulu");
                txtid_user.requestFocus();
            } else {
                CRUD.hapusUser(txtid_user.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                txtid_user.getText();
                txtuser_name.getText();
                txtpassword.getText();
                txtnama_lengkap.getText();
                txtJK.getText();
                txtalamat.getText();
                txtno_tlpn.getText();
                txttgl_lahir.getText();
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //tabel simpan
        try {
            
            if(txtid_user.getText().equals("")){
                JOptionPane.showMessageDialog(this, "id_user belum diisi");
                txtid_user.requestFocus();
            } else if(txtuser_name.getText().equals("")){
                JOptionPane.showMessageDialog(this, "user_name belum diisi");
                txtuser_name.requestFocus();
            }else if(txtpassword.getText().equals("")){
                JOptionPane.showMessageDialog(this, "password belum diisi");
                txtpassword.requestFocus();
            }else if(txtnama_lengkap.getText().equals("")){
                JOptionPane.showMessageDialog(this, "nama_lengkap belum diisi");
                txtnama_lengkap.requestFocus();
            }else if(txtJK.getText().equals("")){
                JOptionPane.showMessageDialog(this, "JK belum diisi");
                txtJK.requestFocus();
            }else if(txtalamat.getText().equals("")){
                JOptionPane.showMessageDialog(this, "alamat belum diisi");
                txtalamat.requestFocus();
            }else if(txtno_tlpn.getText().equals("")){
                JOptionPane.showMessageDialog(this, "no_tlpn belum diisi");
                txtno_tlpn.requestFocus();
            }else if(txttgl_lahir.getText().equals("")){
                JOptionPane.showMessageDialog(this, "tgl_lahir belum diisi");
                txttgl_lahir.requestFocus();
            }else {
                CRUD.simpanUser(txtid_user.getText(), txtuser_name.getText(), txtpassword.getText(), txtnama_lengkap.getText(), txtJK.getText(), txtalamat.getText(), txtno_tlpn.getText(), txttgl_lahir.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtid_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_userKeyTyped
        // TODO add your handling code here:
        
        try {
            String sql = "SELECT * FROM user WHERE id_user = '"+txtid_user.getText()+"'";
            Statement perintah = CRUD.Koneksidb.createStatement();
            ResultSet data = perintah.executeQuery(sql);
            if (data.next()){
                txtuser_name.setText(data.getString("user_name"));
                txtpassword.setText(data.getString("password"));
                txtnama_lengkap.setText(data.getString("nama_lengkap"));
                txtJK.setText(data.getString("JK"));
                txtalamat.setText(data.getString("alamat"));
                txtno_tlpn.setText(data.getString("no_tlpn"));
                txttgl_lahir.setText(data.getString("tgl_lahir"));
           } else {
                txtuser_name.setText(null);
                txtpassword.setText(null);
                txtnama_lengkap.setText(null);
                txtJK.setText(null);
                txtalamat.setText(null);
                txtno_tlpn.setText(null);
                txttgl_lahir.setText(null);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_txtid_userKeyTyped

    private void jButton2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton2KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //tabel ubah
        try {
            if (
                txtid_user.getText().equals("") &&
                txtuser_name.getText().equals("") &&
                txtpassword.getText().equals("") &&
                txtnama_lengkap.getText().equals("") &&
                txtJK.getText().equals("") &&
                txtalamat.getText().equals("") &&
                txtno_tlpn.getText().equals("") &&
                txttgl_lahir.getText().equals("")
                )
            {
                JOptionPane.showMessageDialog(this, "Silahkan cari data terlebih dahulu");
                txtid_user.requestFocus();
            } else {
                CRUD.ubahUser(txtid_user.getText(), txtuser_name.getText(), txtpassword.getText(), txtnama_lengkap.getText(), txtJK.getText(), txtalamat.getText(), txtno_tlpn.getText(), txttgl_lahir.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String id_user = txtid_user.getText();
        try {
            if (!id_user.equals("")) {
                ResultSet rs = CRUD.caridatauser(id_user);
                if (rs.next()) {
                    String user_name = rs.getString("user_name");
                    String password = rs.getString("password");
                    String nama_lengkap = rs.getString("nama_lengkap");
                    String JK = rs.getString("JK");
                    String alamat = rs.getString("alamat");
                    String no_tlpn = rs.getString("no_tlpn");
                    String tgl_lahir = rs.getString("tgl_lahir");
                    // Tampilkan informasi pada antarmuka pengguna
                    txtuser_name.setText(user_name);
                    txtpassword.setText(password);
                    txtnama_lengkap.setText(nama_lengkap);
                    txtJK.setText(JK);
                    txtalamat.setText(alamat);
                    txtno_tlpn.setText(no_tlpn);
                    txttgl_lahir.setText(tgl_lahir);
                    JOptionPane.showMessageDialog(this, "Data user ditemukan");
                } else {
                    JOptionPane.showMessageDialog(this, "Data user tidak ditemukan");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Masukkan id_user terlebih dahulu");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frameuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtJK;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtid_user;
    private javax.swing.JTextField txtnama_lengkap;
    private javax.swing.JTextField txtno_tlpn;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txttgl_lahir;
    private javax.swing.JTextField txtuser_name;
    // End of variables declaration//GEN-END:variables
}
