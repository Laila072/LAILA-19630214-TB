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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class TampilDataTransaksi extends javax.swing.JFrame {

    
    public TampilDataTransaksi() {
        initComponents();
        table();
        combo();
    }

    public void combo(){
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_penjualantiket");
            
            while(rs.next()){
                Object[] ob = new Object[1];
                ob[0] =rs.getString(1);
                
                CbbRute.addItem((String) ob[0]);
            }
            
            rs.close(); st.close();
        } catch (Exception e) {
        }
    }
    
    void hapus() {
        jTiket.setText("");
        jPembeli.setText("");
        jIPesawat.setText("");
        CbbRute.addItem("");
        jKursi.setText("");
        jHargaT.setText("");    
    }    
        
        
        
    void Pencarian(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id Tiket");
        tbl.addColumn("Id Pembeli");
        tbl.addColumn("Id Pesawat");
        tbl.addColumn("Rute");
        tbl.addColumn("Tanggal Berangkat");
        tbl.addColumn("Kelas");
        tbl.addColumn("Nomor Kursi");
        tbl.addColumn("Harga");
        
        try {
            String sql = "SELECT * FROM t_penjualantiket WHERE Id_Tiket like '%" + jTCari.getText() + "%'";
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("Id_Tiket"),
                    rs.getString("Id_Pembeli"),
                    rs.getString("Id_Pesawat"),
                    rs.getString("Rute"),
                    rs.getString("Tanggal_Berangkat"),
                    rs.getString("Kelas"),
                    rs.getString("No_Kursi"),
                    rs.getString("Harga")
                });
                jTable3.setModel(tbl);
            }
    
        } catch (Exception e) {
        }
    }
    
    public void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id Tiket");
        tbl.addColumn("Id Pembeli");
        tbl.addColumn("Id Pesawat");
        tbl.addColumn("Rute");
        tbl.addColumn("Tanggal Berangkat");
        tbl.addColumn("Kelas");
        tbl.addColumn("No Kursi");
        tbl.addColumn("Harga");
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_penjualantiket");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("Id_Tiket"),
                    rs.getString("Id_Pembeli"),
                    rs.getString("Id_Pesawat"),
                    rs.getString("Rute"),
                    rs.getString("Tanggal_Berangkat"),
                    rs.getString("Kelas"),
                    rs.getString("No_Kursi"),
                    rs.getString("Harga")
                });
                jTable3.setModel(tbl);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CbbRute = new javax.swing.JComboBox<>();
        jIPesawat = new javax.swing.JTextField();
        jPembeli = new javax.swing.JTextField();
        jTiket = new javax.swing.JTextField();
        jKursi = new javax.swing.JTextField();
        jHargaT = new javax.swing.JTextField();
        jREkonomi = new javax.swing.JRadioButton();
        jRBisnis = new javax.swing.JRadioButton();
        jRFirst = new javax.swing.JRadioButton();
        txttgl = new com.toedter.calendar.JDateChooser();
        bSimpan = new javax.swing.JButton();
        bTampil = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jBCetak = new javax.swing.JButton();
        bCari = new javax.swing.JButton();
        jTCari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        bExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id Tiket");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id Pembeli");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Id Pesawat");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Rute");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Berangkat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Kelas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nomor Kursi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Harga Tiket");

        CbbRute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         --- Pilih Rute ---   ", "Banjarmasin - Jakarta", "Jakarta - Banjarmasin", "Bandung - Jakarta", "Banjarmasinv - Surabaya" }));

        jREkonomi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jREkonomi.setText("Ekonomi");

        jRBisnis.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRBisnis.setText("Bisnis");

        jRFirst.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jRFirst.setText("First Class");

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

        jBCetak.setText("CETAK DATA");
        jBCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCetakMouseClicked(evt);
            }
        });

        bCari.setText("CARI DATA");
        bCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCariMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("DATA PEMBELIAN TIKET");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID TIKET", "ID PEMBELI", "ID PESAWAT", "RUTE", "TANGGAL BERANGKAT", "KELAS", "NO KURSI", "HARGA"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        bExit1.setText("EXIT");
        bExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel6)
                .addGap(102, 102, 102)
                .addComponent(jREkonomi)
                .addGap(10, 10, 10)
                .addComponent(jRBisnis)
                .addGap(18, 18, 18)
                .addComponent(jRFirst))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jIPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel7)
                .addGap(57, 57, 57)
                .addComponent(jKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel4)
                .addGap(69, 69, 69)
                .addComponent(CbbRute, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel8)
                .addGap(63, 63, 63)
                .addComponent(jHargaT, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(bSimpan)
                .addGap(37, 37, 37)
                .addComponent(bTampil)
                .addGap(32, 32, 32)
                .addComponent(bEdit)
                .addGap(36, 36, 36)
                .addComponent(bHapus)
                .addGap(36, 36, 36)
                .addComponent(jBCetak)
                .addGap(34, 34, 34)
                .addComponent(bExit1))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bCari)
                .addGap(18, 18, 18)
                .addComponent(jTCari, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jREkonomi)
                    .addComponent(jRBisnis)
                    .addComponent(jRFirst))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jIPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(CbbRute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jHargaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSimpan)
                    .addComponent(bTampil)
                    .addComponent(bEdit)
                    .addComponent(bHapus)
                    .addComponent(jBCetak)
                    .addComponent(bExit1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCari)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSimpanMouseClicked
        String date = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(date);
        String tanggal = String.valueOf(fm.format(txttgl.getDate()));
        
        String cb = CbbRute.getSelectedItem().toString();
        
        String kelas = null;
        if(jREkonomi.isSelected()) {
            kelas = "Ekonomi";
        } else if(jRBisnis.isSelected()) {
            kelas = "Bisnis";
        } else if(jRFirst.isSelected()) {
            kelas = "First Class";
         }
        
        try {
            String sql = "INSERT INTO t_penjualantiket VALUES ('" + jTiket.getText() + "','"
                    + jPembeli.getText() + "','" + jIPesawat.getText() + "','" + cb + "','"
                    + tanggal + "','" + kelas + "','"+ jKursi.getText() + "','"+ jHargaT.getText() + "')";
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
            String sql = "SELECT *  FROM t_penjualantiket WHERE Id_Tiket ='" + jTiket.getText() + "'";
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
        String date = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(date);
        String tanggal = String.valueOf(fm.format(txttgl.getDate()));
        
        String cb = CbbRute.getSelectedItem().toString();
        
        String kelas = null;
        if(jREkonomi.isSelected()) {
            kelas = "Ekonomi";
        } else if(jRBisnis.isSelected()) {
            kelas = "Bisnis";
        } else if(jRFirst.isSelected()) {
            kelas = "First Class";
         }
        
        try {
            String sql = "UPDATE t_penjualantiket SET Id_Tiket='" + jTiket.getText() + "',Id_Pembeli ='" + jPembeli.getText() + "',Id_Pesawat ='" + jIPesawat.getText() + "',Rute ='" + cb
                    + "',Tanggal_Berangkat ='" + tanggal + "',Kelas ='" + kelas + "',No_Kursi ='" + jKursi.getText() + "',Harga ='" + jHargaT.getText() + "'WHERE Id_Tiket='" + jTiket.getText() + "'";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst =con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bEditMouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int baris = jTable3.rowAtPoint(evt.getPoint());
        String Id_Tiket = jTable3.getValueAt(baris, 0).toString();
        jTiket.setText(Id_Tiket);
        String Id_Pembeli = jTable3.getValueAt(baris, 1).toString();
        jPembeli.setText(Id_Pembeli);
        String Id_Pesawat = jTable3.getValueAt(baris, 2).toString();
        jIPesawat.setText(Id_Pesawat);
        String No_Kursi = jTable3.getValueAt(baris, 6).toString();
        jKursi.setText(No_Kursi);
        String Harga = jTable3.getValueAt(baris, 7).toString();
        jHargaT.setText(Harga);
    }//GEN-LAST:event_jTable3MouseClicked

    private void bHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHapusMouseClicked
        try {
            String sql = "DELETE FROM t_penjualantiket WHERE Id_Tiket ='" + jTiket.getText() + "'";
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

    private void jBCetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCetakMouseClicked
        try {
            File namafile = new File("src/penjualantiket/LaporanTransaksi.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null,Koneksi.getConnection());
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e);
        } 
    }//GEN-LAST:event_jBCetakMouseClicked

    private void bExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExit1MouseClicked
        new Menu().show();
            this.dispose();
    }//GEN-LAST:event_bExit1MouseClicked

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
            java.util.logging.Logger.getLogger(TampilDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilDataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilDataTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbRute;
    private javax.swing.JButton bCari;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bExit1;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bTampil;
    private javax.swing.JButton jBCetak;
    private javax.swing.JTextField jHargaT;
    private javax.swing.JTextField jIPesawat;
    private javax.swing.JTextField jKursi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPembeli;
    private javax.swing.JRadioButton jRBisnis;
    private javax.swing.JRadioButton jREkonomi;
    private javax.swing.JRadioButton jRFirst;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCari;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTiket;
    private com.toedter.calendar.JDateChooser txttgl;
    // End of variables declaration//GEN-END:variables
}
