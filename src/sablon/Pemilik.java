/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sablon;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Pemilik extends javax.swing.JFrame {

    /**
     * Creates new form Pemilik
     */
    public Pemilik() {
        initComponents();
        
        jPanel3.setBackground(new java.awt.Color(0,0,204,50));
        load_table();




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        textId = new javax.swing.JTextField();
        textStok = new javax.swing.JTextField();
        textHarga = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1017, 462));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 100, 40));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel3.setPreferredSize(new java.awt.Dimension(1020, 695));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID BARANG");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 69, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAMA BARANG");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 108, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STOK");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 156, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HARGA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 207, -1, -1));

        textNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaActionPerformed(evt);
            }
        });
        jPanel3.add(textNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 108, 329, 36));

        textId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdActionPerformed(evt);
            }
        });
        jPanel3.add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 69, 329, 33));

        textStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStokActionPerformed(evt);
            }
        });
        jPanel3.add(textStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 155, 329, 31));

        textHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHargaActionPerformed(evt);
            }
        });
        jPanel3.add(textHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 204, 329, 34));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("TAMBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 350, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("EDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 350, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_BARANG", "NAMA_BARANG", "HARGA", "STOK"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 69, -1, 281));

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });
        jPanel3.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 25, 353, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cari:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 27, -1, -1));

        jTabbedPane1.addTab("DATA BARANG", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1020, 670));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Documents\\1-7-1024x683.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama barang");
        model.addColumn("Harga");
        model.addColumn("Stok");
        //menampilkan data database kedalam tabel
        try {
            String sql;
            if(!cari.getText().equals("")){
                sql = "select * from barang where Id_barang like '%"+cari.getText()+"%'"
                        + "or Nama_barang like '%"+cari.getText()+"%' "
                        + "or Harga like '%"+cari.getText()+"%' "
                        + "or Stok like '%"+cari.getText()+"%'";
            } else{
                sql = "select*from barang";
            }
            java.sql.Connection conn=(Connection)Koneksi.bukaKoneksi();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            jTable1.setModel(model);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 0);
        }
    }
    
    private void pilihData(){
        int baris = jTable1.getSelectedRow();
        textId.setText(jTable1.getValueAt(baris, 0).toString());
        textNama.setText(jTable1.getValueAt(baris, 1).toString());
        textStok.setText(jTable1.getValueAt(baris, 2).toString());
        textHarga.setText(jTable1.getValueAt(baris, 3).toString());
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int b = JOptionPane.showConfirmDialog(this, "Anda yakin untuk LOGOUT ?", "PERINGATAN", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION){
            this.dispose();
            new login().setVisible(true);
        } else if (b == JOptionPane.NO_OPTION){
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tambah();
        load_table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHargaActionPerformed
        textHarga.setText("");
    }//GEN-LAST:event_textHargaActionPerformed

    private void textStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStokActionPerformed
        textStok.setText("");
    }//GEN-LAST:event_textStokActionPerformed

    private void textIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdActionPerformed
        textId.setText("");
    }//GEN-LAST:event_textIdActionPerformed

    private void textNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaActionPerformed
        textNama.setText("");
    }//GEN-LAST:event_textNamaActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        load_table();
    }//GEN-LAST:event_cariKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String sql ="UPDATE barang SET Nama_barang = '"+textNama.getText()+"', "
                    + "Harga = '"+textHarga.getText()+"', "
                    + "Stok= '"+textStok.getText()+"'"
                    + " WHERE Id_barang = '"+textId.getText()+"'";
            java.sql.Connection conn=(Connection)Koneksi.bukaKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit", "Berhasil", 1);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal:\n"+e.getMessage(),"Error",0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        pilihData();
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        pilihData();
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String sql = "delete from barang where Id_barang = "+textId.getText();
            Connection conn=(Connection)Koneksi.bukaKoneksi();
            PreparedStatement pst=conn.prepareStatement(sql);
            Object[] tombol = {"Hapus","Batal"};
            int yatidak = JOptionPane.showOptionDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi hapus",
                    0, 2, null, tombol, tombol[1]);
            if(yatidak == JOptionPane.NO_OPTION){
                this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            } else if(yatidak == JOptionPane.YES_OPTION){
                pst.execute();
                load_table();
            }
            
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data:\n"+e.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemilik().setVisible(true);
            }
        });
    }
    void Tambah()
    {
        try
        {
         Koneksi ObjKoneksi = new Koneksi();
         Connection con = ObjKoneksi.bukaKoneksi();
         Statement st = con.createStatement();
         //tempat data ditambahkan
         String sql = "insert into barang values('"+textId.getText()+
                 "','"+textNama.getText()+
                 "','"+textHarga.getText()+
                 "','"+textStok.getText()+"')";
         
         int row = st.executeUpdate(sql);
         
         //pesan jika data sukses ditambahkan
         if(row==1){
             JOptionPane.showMessageDialog(null,"Data sudah ditambahkan ke"+"database","informasi",JOptionPane.INFORMATION_MESSAGE);
             
             con.close();
         }
        }
        //data gagal dimasukkan pada database
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak ditambahkan ke"+"database\n"+e.getMessage(),"informasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textHarga;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textStok;
    // End of variables declaration//GEN-END:variables
}

