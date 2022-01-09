/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantiket;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class DataPesawat extends javax.swing.JFrame {

    /**
     * Creates new form DataPesawat
     */
    public DataPesawat() {
        initComponents();
        table();
    }
    
    
    void Pencarian(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id Pesawat");
        tbl.addColumn("Nama Pesawat");
        tbl.addColumn("Kapten Pesawat");
        tbl.addColumn("Jumlah Awak");
        
        try {
            String sql = "SELECT * FROM t_pesawat WHERE Id_Pesawat like '%" + pCari.getText() + "%'";
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("Id_Pesawat"),
                    rs.getString("Nama_Pesawat"),
                    rs.getString("Kapten_Pesawat"),
                    rs.getString("Jumlah_Awak")
                });
                jTable2.setModel(tbl);
            }
    
        } catch (Exception e) {
        }
    }
    
    void hapus() {
        jPesawat.setText("");
        nPesawat.setText("");
        jKapten.setText("");
        jAwak.setText("");
    }

    public void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id Pesawat");
        tbl.addColumn("Nama Pesawat");
        tbl.addColumn("Kapten Pesawat");
        tbl.addColumn("Jumlah Awak");
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_pesawat");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("Id_Pesawat"),
                    rs.getString("Nama_Pesawat"),
                    rs.getString("Kapten_Pesawat"),
                    rs.getString("Jumlah_Awak")
                });
                jTable2.setModel(tbl);
            }
            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database gagal" + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPesawat = new javax.swing.JTextField();
        nPesawat = new javax.swing.JTextField();
        jKapten = new javax.swing.JTextField();
        jAwak = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bTampil = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bCetak = new javax.swing.JButton();
        bCari = new javax.swing.JButton();
        pCari = new javax.swing.JTextField();
        bExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("DATA PESAWAT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id Pesawat");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nama Pesawat");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Kapten Pesawat");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Jumlah Awak");

        bSimpan.setText("SIMPAN");
        bSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSimpanMouseClicked(evt);
            }
        });

        bTampil.setText("TAMPIL DATA");
        bTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bTampilMouseClicked(evt);
            }
        });

        bEdit.setText("EDIT");
        bEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEditMouseClicked(evt);
            }
        });

        bHapus.setText("HAPUS");
        bHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bHapusMouseClicked(evt);
            }
        });

        bCetak.setText("CETAK DATA");
        bCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCetakMouseClicked(evt);
            }
        });

        bCari.setText("CARI DATA");
        bCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCariMouseClicked(evt);
            }
        });

        bExit.setText("EXIT");
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExitMouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID PESAWAT", "NAMA PESAWAT", "KAPTEN PESAWAT", "JUMLAH AWAK"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(nPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jKapten, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jAwak, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(bSimpan)
                .addGap(18, 18, 18)
                .addComponent(bTampil)
                .addGap(18, 18, 18)
                .addComponent(bEdit)
                .addGap(18, 18, 18)
                .addComponent(bHapus)
                .addGap(18, 18, 18)
                .addComponent(bCetak)
                .addGap(18, 18, 18)
                .addComponent(bExit))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(bCari)
                .addGap(10, 10, 10)
                .addComponent(pCari, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(nPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jKapten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jAwak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSimpan)
                    .addComponent(bTampil)
                    .addComponent(bEdit)
                    .addComponent(bHapus)
                    .addComponent(bCetak)
                    .addComponent(bExit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCari)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(pCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSimpanMouseClicked

        try {
            String sql = "INSERT INTO t_pesawat VALUES ('" + jPesawat.getText() + "','"
                    + nPesawat.getText() + "','" + jKapten.getText() + "','" + jAwak.getText()+ "')";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst =con.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e.getMessage());
        }
    }//GEN-LAST:event_bSimpanMouseClicked

    private void bTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTampilMouseClicked
        try {
            String sql = "SELECT *  FROM t_pesawat WHERE Id_Pesawat ='" + jPesawat.getText() + "'";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
        hapus();
    }//GEN-LAST:event_bTampilMouseClicked

    private void bEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditMouseClicked
        try {
            String sql = "UPDATE t_pesawat SET Id_Pesawat='" + jPesawat.getText() + "',Nama_Pesawat ='" +nPesawat.getText()
                    + "',Kapten_Pesawat ='" +jKapten.getText() + "',Jumlah_Awak ='" + jAwak.getText() + "'WHERE Id_Pesawat='" + jPesawat.getText() + "'";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst =con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bEditMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int baris = jTable2.rowAtPoint(evt.getPoint());
        String Id_Pesawat = jTable2.getValueAt(baris, 0).toString();
        jPesawat.setText(Id_Pesawat);
        String Nama_Pesawat = jTable2.getValueAt(baris, 1).toString();
        nPesawat.setText(Nama_Pesawat);
        String Kapten_Pesawat = jTable2.getValueAt(baris, 2).toString();
        jKapten.setText(Kapten_Pesawat);
        String Jumlah_Awak = jTable2.getValueAt(baris, 3).toString();
        jAwak.setText(Jumlah_Awak);
    }//GEN-LAST:event_jTable2MouseClicked

    private void bHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHapusMouseClicked
        try {
            String sql = "DELETE FROM t_pesawat WHERE Id_Pesawat ='" + jPesawat.getText() + "'";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst =con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bHapusMouseClicked

    private void bCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCariMouseClicked
        Pencarian();
    }//GEN-LAST:event_bCariMouseClicked

    private void bCetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCetakMouseClicked
        try {
            File namafile = new File("src/penjualantiket/LaporanPesawat.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null,Koneksi.getConnection());
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e);
        } 
    }//GEN-LAST:event_bCetakMouseClicked

    private void bExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseClicked
        new Menu().show();
            this.dispose();
    }//GEN-LAST:event_bExitMouseClicked

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
            java.util.logging.Logger.getLogger(DataPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bTampil;
    private javax.swing.JTextField jAwak;
    private javax.swing.JTextField jKapten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jPesawat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nPesawat;
    private javax.swing.JTextField pCari;
    // End of variables declaration//GEN-END:variables
}
