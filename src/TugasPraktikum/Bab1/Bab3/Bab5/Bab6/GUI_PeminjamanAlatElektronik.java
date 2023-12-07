/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3.Bab5.Bab6;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
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
        
        PeminjamanAlatElektronik PinjamAE = new PeminjamanAlatElektronik();
        //Mengambil model data dari tabel dan menyimpannya dalam objek DefaultTable
        DefaultTableModel dataModel = (DefaultTableModel) table_data_pinjam.getModel();
        //Mendapatkan jumlah baris yang ada dalam model data saat ini
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
            //Menghapus baris terakhir dari model data
            dataModel.removeRow(rowCount-1);
            //Memperbarui nilai rowCount setelah penghapusan baris terakhir
            rowCount = dataModel.getRowCount();
        }
    }
    public void clear(){
            txt_peminjam.setText("");
            txt_barangpinjam.setText("");
            txt_durasipinjam.setText("");
            txt_biayapinjam.setText("");
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
        jLabel5 = new javax.swing.JLabel();
        txt_peminjam = new javax.swing.JTextField();
        txt_barangpinjam = new javax.swing.JTextField();
        txt_durasipinjam = new javax.swing.JTextField();
        txt_biayapinjam = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_data_pinjam = new javax.swing.JTable();
        btn_cetak = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_hitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Peminjaman Alat Elektronik");

        jLabel2.setText("Nama Peminjam");

        jLabel3.setText("Barang yang Dipinjam");

        jLabel4.setText("Durasi Peminjaman");

        jLabel5.setText("Biaya Peminjaman");

        table_data_pinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Peminjam", "Nama Barang", "Durasi Pinjam", "Biaya Pinjam"
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

        jLabel7.setText("Rp");

        btn_hitung.setText("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_hitung, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txt_barangpinjam)
                            .addComponent(txt_peminjam)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_durasipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_biayapinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(209, 209, 209))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cetak)
                            .addComponent(btn_hapus)
                            .addComponent(btn_batal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_close))
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
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_durasipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_hitung)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_biayapinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        // TODO add your handling code here:
        // Menampilkan pesan dialog bahwa data telah ditambahkan ke tabel
        JOptionPane.showMessageDialog(null, "Data anda Ditambahkan Ke tabel");
        // Mengambil model data dari tabel
        DefaultTableModel dataModel = (DefaultTableModel) 
        table_data_pinjam.getModel();
        // Inisialisasi sebuah ArrayList bernama 'list'
        List list = new ArrayList<>();
        // Mengatur tabel untuk membuat kolom dari model secara otomatis
        table_data_pinjam.setAutoCreateColumnsFromModel(true);
        PeminjamanAlatElektronik PinjamAE = new PeminjamanAlatElektronik();
        // Mengatur atribut menggunakan nilai dari komponen 
            PinjamAE.namaPinjam(txt_peminjam.getText());
            PinjamAE.namaBarangPinjam(txt_barangpinjam.getText());
            PinjamAE.durasiPinjam(Integer.parseInt(txt_durasipinjam.getText()));
            txt_biayapinjam.setText(Integer.toString(PinjamAE.tampil_biayaPinjam()));
        // Menambahkan data-data dari objek pinjamAE ke dalam ArrayList 'list'
            list.add(PinjamAE.tampil_namaPinjam());
            list.add(PinjamAE.tampil_namaBarangPinjam());
            list.add(PinjamAE.tampil_durasiPinjam());
            list.add(PinjamAE.tampil_biayaPinjam());
       // Menambahkan baris baru ke model tabel menggunakan data dari ArrayList 'list'
            dataModel.addRow(list.toArray());
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dataModel = (DefaultTableModel)table_data_pinjam.getModel();
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
            dataModel.removeRow(rowCount-1);
            rowCount = dataModel.getRowCount(); //Update
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        // Mengatur atribut menggunakan nilai dari komponen 
            PeminjamanAlatElektronik PinjamAE = new PeminjamanAlatElektronik();
            PinjamAE.namaPinjam(txt_peminjam.getText());
            PinjamAE.namaBarangPinjam(txt_barangpinjam.getText());
            PinjamAE.durasiPinjam(Integer.parseInt(txt_durasipinjam.getText()));
            txt_biayapinjam.setText(Integer.toString(PinjamAE.tampil_biayaPinjam()));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_data_pinjam;
    private javax.swing.JTextField txt_barangpinjam;
    private javax.swing.JTextField txt_biayapinjam;
    private javax.swing.JTextField txt_durasipinjam;
    private javax.swing.JTextField txt_peminjam;
    // End of variables declaration//GEN-END:variables
}
