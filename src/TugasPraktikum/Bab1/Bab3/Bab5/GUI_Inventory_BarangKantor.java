/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.Bab1.Bab3.Bab5;
import ProjectPraktikum.Bab1.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import TugasPraktikum.Bab1.*;

/**
 *
 * @author LA
 */
public class GUI_Inventory_BarangKantor extends javax.swing.JFrame{

    /**
     * Creates new form GUI_Inventory_BarangKantor
     */
    public GUI_Inventory_BarangKantor() {
        initComponents();
        //Mengambil model data dari tabel dan menyimpannya dalam objek DefaultTable
        DefaultTableModel dataModel = (DefaultTableModel) tabel_data_inventory.getModel();
        //Mendapatkan jumlah baris yang ada dalam model data saat ini
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
            //Menghapus baris terakhir dari model data
            dataModel.removeRow(rowCount-1);
            //Memperbarui nilai rowCount setelah penghapusan baris terakhir
            rowCount = dataModel.getRowCount();
        }
        //konstruktor 
        Inventory_BarangKantor data_barang = new Inventory_BarangKantor();
        txt_supplier.setText(data_barang.supplier_barang);
        txt_supplier.setEnabled(false);
        txt_stok.setText(Integer.toString(data_barang.stok_barang));
        txt_stok.setEnabled(false);
    }

    public void clear(){
            txt_kode.setText("");
            txt_nama.setText("");
            txt_harga.setText("");
            txt_merk.setText("");
            txt_stok.setText("");
            txt_supplier.setText("");
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup_status = new javax.swing.ButtonGroup();
        btngroup_kondisi = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_kode = new javax.swing.JTextField();
        txt_merk = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        radiobtn_tersedia = new javax.swing.JRadioButton();
        radiobtn_dipinjam = new javax.swing.JRadioButton();
        radiobtn_perbaikan = new javax.swing.JRadioButton();
        btn_simpan = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_supplier = new javax.swing.JTextField();
        radiobtn_baik = new javax.swing.JRadioButton();
        radiobtn_rusak = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_data_inventory = new javax.swing.JTable();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Inventory Barang Kantor");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Kode Barang");

        jLabel4.setText("Merk Barang");

        jLabel5.setText("Stok");

        jLabel6.setText("Harga Barang");

        jLabel7.setText("Status");

        btngroup_status.add(radiobtn_tersedia);
        radiobtn_tersedia.setText("Tersedia");

        btngroup_status.add(radiobtn_dipinjam);
        radiobtn_dipinjam.setText("Dipinjam");

        btngroup_status.add(radiobtn_perbaikan);
        radiobtn_perbaikan.setText("Perbaikan");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel8.setText("Kondisi");

        jLabel9.setText("Supplier");

        btngroup_kondisi.add(radiobtn_baik);
        radiobtn_baik.setText("Baik");

        btngroup_kondisi.add(radiobtn_rusak);
        radiobtn_rusak.setText("Rusak");

        tabel_data_inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Barang", "Kode Barang", "Merk Barang", "Harga Barang", "Stok", "Status", "Supplier", "Kondisi"
            }
        ));
        jScrollPane2.setViewportView(tabel_data_inventory);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(radiobtn_perbaikan)
                        .addComponent(radiobtn_dipinjam)
                        .addComponent(txt_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(txt_kode)
                        .addComponent(txt_merk)
                        .addComponent(txt_harga)
                        .addComponent(txt_stok)
                        .addComponent(radiobtn_tersedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_supplier))
                    .addComponent(radiobtn_rusak)
                    .addComponent(radiobtn_baik))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_close)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal)
                                .addGap(276, 276, 276))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radiobtn_tersedia)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiobtn_dipinjam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiobtn_perbaikan)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(radiobtn_baik))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiobtn_rusak)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btn_close)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_hapus)
                    .addComponent(btn_batal))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        // Menampilkan pesan dialog bahwa data telah ditambahkan ke tabel
        JOptionPane.showMessageDialog(null, "Data anda Ditambahkan Ke tabel");
        // Mengambil model data dari tabel
        DefaultTableModel dataModel = (DefaultTableModel) 
        tabel_data_inventory.getModel();
        // Inisialisasi sebuah ArrayList bernama 'list'
        List list = new ArrayList<>();
        // Mengatur tabel untuk membuat kolom dari model secara otomatis
        tabel_data_inventory.setAutoCreateColumnsFromModel(true);
        // Membuat instance dari kelas Inventory_BarangKantor
        Inventory_BarangKantor data_barang = new Inventory_BarangKantor();
        // Mengatur data nama, kode, merk menggunakan nilai dari komponen 
            data_barang.dataNamaBarang(txt_nama.getText());
            data_barang.setKode_barang(txt_kode.getText());
            data_barang.dataMerkBarang(txt_merk.getText());
        // Mengatur data harga, supplier, dan stok menggunakan nilai dari komponen 
            data_barang.dataHargaBarang(Integer.parseInt(txt_harga.getText()));
            txt_supplier.setText(data_barang.supplier_barang);
            txt_stok.setText(Integer.toString(data_barang.stok_barang));
        // Mengatur status dan kondisi sesuai dengan radio button yang dipilih
            String Status = "";
            if (radiobtn_tersedia.isSelected()){
                data_barang.dataStatusBarang(radiobtn_tersedia.getText());
            }else if(radiobtn_dipinjam.isSelected()){
                data_barang.dataStatusBarang(radiobtn_dipinjam.getText());
            }
            else{
                data_barang.dataStatusBarang(radiobtn_perbaikan.getText());
            }

            String Kondisi = "";
            if (radiobtn_baik.isSelected()){
                data_barang.dataKondisiBarang(radiobtn_baik.getText());
            }
            else{
                data_barang.dataKondisiBarang(radiobtn_rusak.getText());
                    }
            // Menambahkan data-data dari objek Inventory_BarangKantor ke dalam ArrayList 'list'
            list.add(data_barang.cetakNamaBarang());
            list.add(data_barang.getKode_barang());
            list.add(data_barang.cetakMerkBarang());
            list.add(data_barang.cetakHargaBarang());
            list.add(data_barang.cetakStokBarang());
            list.add(data_barang.cetakStatusBarang());
            list.add(data_barang.cetakSuppplierBarang());
            list.add(data_barang.cetakKondisiBarang());
            // Menambahkan baris baru ke model tabel menggunakan data dari ArrayList 'list'
            dataModel.addRow(list.toArray());
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dataModel = (DefaultTableModel)tabel_data_inventory.getModel();
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
            dataModel.removeRow(rowCount-1);
            rowCount = dataModel.getRowCount(); //Update
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Inventory_BarangKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Inventory_BarangKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Inventory_BarangKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Inventory_BarangKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Inventory_BarangKantor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.ButtonGroup btngroup_kondisi;
    private javax.swing.ButtonGroup btngroup_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radiobtn_baik;
    private javax.swing.JRadioButton radiobtn_dipinjam;
    private javax.swing.JRadioButton radiobtn_perbaikan;
    private javax.swing.JRadioButton radiobtn_rusak;
    private javax.swing.JRadioButton radiobtn_tersedia;
    private javax.swing.JTable tabel_data_inventory;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_merk;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_stok;
    private javax.swing.JTextField txt_supplier;
    // End of variables declaration//GEN-END:variables
}
