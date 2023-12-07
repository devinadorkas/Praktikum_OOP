/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3.Bab5.Bab6.Bab7.Bab8;

import TugasPraktikum.Bab1.Bab3.Bab5.Bab6.Bab7.*;
import TugasPraktikum.Bab1.Bab3.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LA
 */
public class GUI_PengembalianBarang extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PengembalianBarang
     */
    public GUI_PengembalianBarang() {
        initComponents();
        PeminjamanAlatElektronik PinjamAE = new PeminjamanAlatElektronik();
        //Mengambil model data dari tabel dan menyimpannya dalam objek DefaultTable
        DefaultTableModel dataModel = (DefaultTableModel) tabel_data_pengembalian.getModel();
        //Mendapatkan jumlah baris yang ada dalam model data saat ini
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
            //Menghapus baris terakhir dari model data
            dataModel.removeRow(rowCount-1);
            //Memperbarui nilai rowCount setelah penghapusan baris terakhir
            rowCount = dataModel.getRowCount();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idpinjam = new javax.swing.JTextField();
        txt_namabarangkembali = new javax.swing.JTextField();
        txt_tglkembali = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_jmlkembali = new javax.swing.JTextField();
        btn_cetakKembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_jmlpinjam = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_data_pengembalian = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Data Pengembalian Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("ID Peminjaman");

        jLabel4.setText("Tanggal Pengembalian");

        jLabel5.setText("Jumlah yang Dikembalikan");

        btn_cetakKembali.setText("Cetak Data Pengembalian");
        btn_cetakKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakKembaliActionPerformed(evt);
            }
        });

        jLabel6.setText("Jumlah yang Dipinjam");

        tabel_data_pengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pinjam", "Nama Barang", "Tanggal Kembali", "Jumlah Kembali", "Biaya Kembali"
            }
        ));
        jScrollPane2.setViewportView(tabel_data_pengembalian);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(196, 196, 196))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cetakKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_namabarangkembali)
                    .addComponent(txt_idpinjam)
                    .addComponent(txt_tglkembali)
                    .addComponent(txt_jmlkembali)
                    .addComponent(txt_jmlpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(txt_namabarangkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_jmlpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jmlkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addComponent(btn_cetakKembali)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cetakKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakKembaliActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Data anda Ditambahkan Ke tabel");
        // Mengambil model data dari tabel
        DefaultTableModel dataModel = (DefaultTableModel) 
        tabel_data_pengembalian.getModel();
        // Inisialisasi sebuah ArrayList bernama 'list'
        List list = new ArrayList<>();
        // Mengatur tabel untuk membuat kolom dari model secara otomatis
        tabel_data_pengembalian.setAutoCreateColumnsFromModel(true);
        dataPengembalianBarang data_kmbl = new dataPengembalianBarang();
        // Mengatur atribut menggunakan nilai dari komponen 
            data_kmbl.SetidKembali(txt_idpinjam.getText());
            data_kmbl.namaBarangPinjam(txt_namabarangkembali.getText());
            data_kmbl.tglKembali(txt_tglkembali.getText());
            data_kmbl.jmlPinjam(Integer.parseInt(txt_jmlpinjam.getText()));
            data_kmbl.jmlKembali(Integer.parseInt(txt_jmlkembali.getText()));
        // Menambahkan data-data dari objek pinjamAE ke dalam ArrayList 'list'
            list.add(data_kmbl.getId_pengembalian());
            list.add(data_kmbl.tampil_namaBarangPinjam());
            list.add(data_kmbl.tampil_tglKembali());
            list.add(data_kmbl.tampil_jmlKembali());
            list.add(data_kmbl.hitungBiayaPeminjaman());
       // Menambahkan baris baru ke model tabel menggunakan data dari ArrayList 'list'
            dataModel.addRow(list.toArray());
    }//GEN-LAST:event_btn_cetakKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PengembalianBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PengembalianBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetakKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel_data_pengembalian;
    private javax.swing.JTextField txt_idpinjam;
    private javax.swing.JTextField txt_jmlkembali;
    private javax.swing.JTextField txt_jmlpinjam;
    private javax.swing.JTextField txt_namabarangkembali;
    private javax.swing.JTextField txt_tglkembali;
    // End of variables declaration//GEN-END:variables
}