/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3.Bab5.Bab6.Bab7.Bab8;
import TugasPraktikum.Bab1.Bab3.Bab5.Bab6.Bab7.*;
import TugasPraktikum.Bab1.Bab3.Bab5.Bab6.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LA
 */
public class GUI_PeminjamanAlatElektronik extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PeminjamanAlatElektronik
     */
    public GUI_PeminjamanAlatElektronik() {
        initComponents();
    }
    
    public Connection conn;
    
    public void batal(){
            txt_peminjam.setText("");
            txt_barangpinjam.setText("");
            txt_lokasi.setText("");
            txt_durasipinjam.setText("");
    }
    
    //masukkan conection (public Connection conn;)
    public void koneksi() throws SQLException {
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/OOP_2218108?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_PeminjamanAlatElektronik.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_PeminjamanAlatElektronik.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_PeminjamanAlatElektronik.class.getName()).log(Level.SEVERE, null, es);
        }
    }

    
    //masukkan attribut (String nim1, nama1, jk1, prodi1, ang1, alamat1;)
    String nama1, barang1, lokasi1, durasi1;
    //masukkan method itempilih()
    public void itempilih() {
        txt_peminjam.setText(nama1);
        txt_barangpinjam.setText(barang1);
        txt_lokasi.setText(lokasi1);
        txt_durasipinjam.setText(durasi1);
    }

    //masukkan method koneksi()
    
    //masukkan method tampil()
    public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("NAMA PEMINJAM");
        tabelhead.addColumn("NAMA BARANG");
        tabelhead.addColumn("LOKASI");
        tabelhead.addColumn("DURASI PINJAM");
        try {
            koneksi();
            String sql = "SELECT * FROM tb_peminjamanalatelektronik";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7),});
            }
            table_data_pinjam.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }

    
    //masukkan method delete()
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_peminjamanalatelektronik WHERE barang='" + txt_barangpinjam.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
                batal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus");
            }
        }
        refresh();
    }

    //masukkan method cari()
    public void cari() {
        try {
            try ( Statement statement = conn.createStatement()) {
                String sql = "SELECT * FROM tb_peminjamanalatelektorinik WHERE `barang`  LIKE '%" + txt_search.getText() + "%'";
                ResultSet rs = statement.executeQuery(sql); //menampilkan data dari sql query
                if (rs.next()) // .next() = scanner method
                {
                    txt_peminjam.setText(rs.getString(2));
                    txt_barangpinjam.setText(rs.getString(3));
                    txt_lokasi.setText(rs.getString(4));
                    txt_durasipinjam.setText(rs.getString(5));
                } else {
                    JOptionPane.showMessageDialog(null, "Data yang Anda cari tidak ada");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error." + ex);
        }
    }

    //masukkan method update()
    public void update() {
        String peminjam = txt_peminjam.getText();
        String barang = txt_barangpinjam.getText();
        String lokasi = txt_lokasi.getText();
        String durasi = txt_durasipinjam.getText();
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_peminjamanalatelektronik SET Nama_Peminjam='" + peminjam + "'," + "Barang_Dipinjam='" + barang + "',"
                    + ",Lokasi_Barang='" + lokasi + "',Durasi_Pinjam='" + durasi + "' WHERE barang = '" + barang + "'");
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data Peminjaman Berhasil!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
    }

    
    //masukkan method refresh()
    public void refresh() {
        new GUI_PeminjamanAlatElektronik().setVisible(true);
        this.setVisible(false);
    }

    //masukkan method insert()
    public void insert() {
        String peminjam = txt_peminjam.getText();
        String barang = txt_barangpinjam.getText();
        String lokasi = txt_lokasi.getText();
        String durasi = txt_durasipinjam.getText();
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_mahasiswa (nim, nama,jk, prodi, th_angkatan,alamat)"
                    + "VALUES('" + peminjam + "','" + barang + "','" + lokasi + "','" + durasi + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Peminjaman!" + "\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input!");
        }
        refresh();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_peminjam = new javax.swing.JTextField();
        txt_barangpinjam = new javax.swing.JTextField();
        txt_durasipinjam = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_data_pinjam = new javax.swing.JTable();
        btn_cetak = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_hitung = new javax.swing.JButton();
        txt_lokasi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Peminjaman Alat Elektronik");

        jLabel2.setText("Nama Peminjam");

        jLabel3.setText("Barang yang Dipinjam");

        jLabel4.setText("Durasi Peminjaman");

        table_data_pinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Peminjam", "Nama Barang", "Lokasi Barang", "Durasi Pinjam", "Biaya Pinjam"
            }
        ));
        jScrollPane1.setViewportView(table_data_pinjam);

        btn_cetak.setText("Cetak");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel6.setText("hari");

        btn_hitung.setText("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        jLabel8.setText("Lokasi Barang");

        btn_search.setText("cari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_barangpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txt_peminjam)
                            .addComponent(txt_lokasi)
                            .addComponent(btn_hitung, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_durasipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_cetak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal)
                                .addGap(170, 170, 170))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_close)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_barangpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_durasipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_hitung)
                                .addGap(55, 55, 55))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cetak)
                            .addComponent(btn_hapus)
                            .addComponent(btn_batal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_close)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        // TODO add your handling code here:
        // Menampilkan pesan dialog bahwa data telah ditambahkan ke tabel
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        // Mengatur atribut menggunakan nilai dari komponen 
    }//GEN-LAST:event_btn_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PeminjamanAlatElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PeminjamanAlatElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PeminjamanAlatElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PeminjamanAlatElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PeminjamanAlatElektronik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_data_pinjam;
    private javax.swing.JTextField txt_barangpinjam;
    private javax.swing.JTextField txt_durasipinjam;
    private javax.swing.JTextField txt_lokasi;
    private javax.swing.JTextField txt_peminjam;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
