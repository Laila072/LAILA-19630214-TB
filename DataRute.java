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
public class DataRute extends javax.swing.JFrame {

    
    public DataRute() {
        initComponents();
        table();
        combo();
    }
    
    public void combo(){
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_rute");
            
            while(rs.next()){
                Object[] ob = new Object[1];
                ob[0] =rs.getString(1);
                
                cbRute1.addItem((String) ob[0]);
            }
            
            rs.close(); st.close();
        } catch (Exception e) {
        }
    }

    void Pencarian(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id Rute");
        tbl.addColumn("Rute");
        tbl.addColumn("Kelas");
        tbl.addColumn("Harga");
        
        try {
            String sql = "SELECT * FROM t_rute WHERE Id_Rute like '%" + tCari1.getText() + "%'";
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("Id_Rute"),
                    rs.getString("Rute"),
                    rs.getString("Kelas"),
                    rs.getString("Harga")
                });
                jTable1.setModel(tbl);
            }
    
        } catch (Exception e) {
        }
    }
    
    void hapus() {
        jRute.setText("");
        cbRute1.addItem("");
        jHarga.setText("");
    }

    public void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id Rute");
        tbl.addColumn("Rute");
        tbl.addColumn("Kelas");
        tbl.addColumn("Harga");
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_rute");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("Id_Rute"),
                    rs.getString("Rute"),
                    rs.getString("Kelas"),
                    rs.getString("Harga")
                });
                jTable1.setModel(tbl);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRute = new javax.swing.JTextField();
        rEkonomi = new javax.swing.JRadioButton();
        rBisnis = new javax.swing.JRadioButton();
        rFirst = new javax.swing.JRadioButton();
        jHarga = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bTampil = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jBtCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tCari1 = new javax.swing.JTextField();
        cData = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbRute1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("DATA RUTE PESAWAT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id Rute");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kelas");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Harga");

        rEkonomi.setText("Ekonomi");

        rBisnis.setText("Bisnis");

        rFirst.setText("First Class");

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

        jBtCetak.setText("CETAK DATA");
        jBtCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtCetakMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID RUTE", "RUTE", "KELAS", "HARGA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        cData.setText("CARI DATA");
        cData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cDataMouseClicked(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Rute");

        cbRute1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        ----- Pilih Rute -----", "Banjarmasin - Jakarta", "Jakarta - Banjarmasin", "Banjarmasin - Bandung", "Bandung - Banjarmasin" }));
        cbRute1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRute1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jRute, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(cbRute1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(rEkonomi)
                        .addGap(15, 15, 15)
                        .addComponent(rBisnis)
                        .addGap(19, 19, 19)
                        .addComponent(rFirst))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jBtCetak)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cData)
                        .addGap(32, 32, 32)
                        .addComponent(tCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jRute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRute1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(rEkonomi)
                    .addComponent(rBisnis)
                    .addComponent(rFirst))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSimpan)
                    .addComponent(bTampil)
                    .addComponent(bEdit)
                    .addComponent(bHapus)
                    .addComponent(jBtCetak)
                    .addComponent(jButton1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cData)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tCari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSimpanMouseClicked
        String cb = cbRute1.getSelectedItem().toString();
        
        String kelas = null;
        
        if(rEkonomi.isSelected()) {
            kelas = "Ekonomi";
        } else if(rBisnis.isSelected()) {
            kelas = "Bisnis";
        } else if(rFirst.isSelected()) {
            kelas = "First Class";
         }
        
        try {
            String sql = "INSERT INTO t_rute VALUES ('" + jRute.getText() + "','"
                    + cb + "','" + kelas + "','" + jHarga.getText() + "')";
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
            String sql = "SELECT *  FROM t_rute WHERE Id_Rute ='" + jRute.getText() + "'";
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
        String cb = cbRute1.getSelectedItem().toString();
        
        String kelas = null;
        
        if(rEkonomi.isSelected()) {
            kelas = "Ekonomi";
        } else if(rBisnis.isSelected()) {
            kelas = "Bisnis";
        } else if(rFirst.isSelected()) {
            kelas = "First Class";
         }
        
        try {
            String sql = "UPDATE t_rute SET Id_Rute='" + jRute.getText() + "',Rute ='" +cb
                    + "',Kelas ='" + kelas + "',Harga ='" + jHarga.getText() + "'WHERE Id_Rute='" + jRute.getText() + "'";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst =con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bEditMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String cb = cbRute1.getSelectedItem().toString();
        
        String kelas = null;
        
        if(rEkonomi.isSelected()) {
            kelas = "Ekonomi";
        } else if(rBisnis.isSelected()) {
            kelas = "Bisnis";
        } else if(rFirst.isSelected()) {
            kelas = "First Class";
         }
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String Id_Rute = jTable1.getValueAt(baris, 0).toString();
        jRute.setText(Id_Rute);
        String Harga = jTable1.getValueAt(baris, 3).toString();
        jHarga.setText(Harga);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHapusMouseClicked
        try {
            String sql = "DELETE FROM t_rute WHERE Id_Rute ='" + jRute.getText() + "'";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst =con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bHapusMouseClicked

    private void cDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cDataMouseClicked
        Pencarian();
    }//GEN-LAST:event_cDataMouseClicked

    private void jBtCetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtCetakMouseClicked
        try {
            File namafile = new File("src/penjualantiket/LaporanRute.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null,Koneksi.getConnection());
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e);
        } 
    }//GEN-LAST:event_jBtCetakMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Menu().show();
            this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void cbRute1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRute1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRute1ActionPerformed

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
            java.util.logging.Logger.getLogger(DataRute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataRute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataRute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataRute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataRute().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bTampil;
    private javax.swing.JButton cData;
    private javax.swing.JComboBox<String> cbRute1;
    private javax.swing.JButton jBtCetak;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jRute;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rBisnis;
    private javax.swing.JRadioButton rEkonomi;
    private javax.swing.JRadioButton rFirst;
    private javax.swing.JTextField tCari1;
    // End of variables declaration//GEN-END:variables
}
