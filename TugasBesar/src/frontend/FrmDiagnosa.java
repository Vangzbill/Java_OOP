package frontend;
import backend.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class FrmDiagnosa extends javax.swing.JFrame {

    public void kosongkanForm(){
        txtIdPemeriksaan.setText("0");
        txtTotalHarga.setText("");
    }
    
    public FrmDiagnosa() {
        initComponents();
        kosongkanForm();
        tampilkanData();
        txtTotalHarga.setText("0");
    }
    
    public void tampilkanData(){
        String[] kolom = {"id_pemeriksaan", "nama_dokter", "nama_pasien", "keluhan", "tanggal_periksa", "harga_obat","total_harga"};
        ArrayList<Diagnosa> list = new Diagnosa().getAll();
        Object rowData[] = new Object[7];
        
        tblDiagnosa.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Diagnosa diag : list){
            rowData[0] = diag.getIdPemeriksaan();
            rowData[1] = diag.getDokter().getNamaDokter();
            rowData[2] = diag.getPasien().getNama();
            rowData[3] = diag.getPasien().getKeluhan();
            rowData[4] = diag.getPendaftaran().getTanggalPeriksa();
            rowData[5] = diag.getObat().getHarga();
            rowData[6] = diag.getHargaTotal();
            
            ((DefaultTableModel)tblDiagnosa.getModel()).addRow(rowData);
        }
        cmbPasien.setModel(new DefaultComboBoxModel(new Pasien().getAll().toArray()));
        cmbPendaftaran.setModel(new DefaultComboBoxModel(new Pendaftaran().getAll().toArray()));
        cmbDokter.setModel(new DefaultComboBoxModel(new Dokter().getAll().toArray()));
        cmbObat.setModel(new DefaultComboBoxModel(new Obat().getAll().toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIdPemeriksaan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiagnosa = new javax.swing.JTable();
        cmbPendaftaran = new javax.swing.JComboBox<>();
        cmbPasien = new javax.swing.JComboBox<>();
        cmbDokter = new javax.swing.JComboBox<>();
        cmbObat = new javax.swing.JComboBox<>();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Pemeriksaan");

        txtIdPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPemeriksaanActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Pendaftaran");

        jLabel3.setText("Pasien");

        jLabel4.setText("Dokter");

        jLabel5.setText("Obat");

        txtTotalHarga.setText("0");
        txtTotalHarga.setToolTipText("");
        txtTotalHarga.setSelectionEnd(0);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        tblDiagnosa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDiagnosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiagnosaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDiagnosa);

        cmbPendaftaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPendaftaranActionPerformed(evt);
            }
        });

        cmbPasien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPasienActionPerformed(evt);
            }
        });

        cmbDokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDokterActionPerformed(evt);
            }
        });

        cmbObat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObatActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung Total");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnHitung, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahBaru)
                                .addGap(29, 29, 29)
                                .addComponent(btnHapus))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbObat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbDokter, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbPasien, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbPendaftaran, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdPemeriksaan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPasienActionPerformed
//        cmbPasien.setModel(new DefaultComboBoxModel(new Pasien().getAll().toArray()));
    }//GEN-LAST:event_cmbPasienActionPerformed

    private void cmbPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPendaftaranActionPerformed
//        cmbPendaftaran.setModel(new DefaultComboBoxModel(new Pendaftaran().getAll().toArray()));
    }//GEN-LAST:event_cmbPendaftaranActionPerformed

    private void cmbDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDokterActionPerformed
//        cmbDokter.setModel(new DefaultComboBoxModel(new Dokter().getAll().toArray()));
    }//GEN-LAST:event_cmbDokterActionPerformed

    private void cmbObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObatActionPerformed
//        cmbObat.setModel(new DefaultComboBoxModel(new Obat().getAll().toArray()));
    }//GEN-LAST:event_cmbObatActionPerformed

    private void txtIdPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPemeriksaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPemeriksaanActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Diagnosa diag = new Diagnosa();
        diag.setIdPemeriksaan(Integer.parseInt(txtIdPemeriksaan.getText()));
        Pendaftaran pdf = (Pendaftaran) cmbPendaftaran.getSelectedItem();
        Pasien ps = (Pasien) cmbPasien.getSelectedItem();
        Dokter dr = (Dokter) cmbDokter.getSelectedItem();
        Obat obt = (Obat) cmbObat.getSelectedItem();
        diag.setPendaftaran(pdf);
        diag.setPasien(ps);
        diag.setDokter(dr);
        diag.setObat(obt);
        diag.setHargaTotal(Integer.parseInt(txtTotalHarga.getText()));
        diag.save();
        int total = diag.HitungTotal(diag.getIdPemeriksaan());
        txtTotalHarga.setText(String.valueOf(total));
        System.out.println("Harga total = " + total);
        txtIdPemeriksaan.setText(Integer.toString(diag.getIdPemeriksaan()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void tblDiagnosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiagnosaMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblDiagnosa.getModel();
        int row = tblDiagnosa.getSelectedRow();

        txtIdPemeriksaan.setText(model.getValueAt(row, 0).toString());
        txtTotalHarga.setText(model.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblDiagnosaMouseClicked

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
         Diagnosa diag = new Diagnosa();
        diag.setIdPemeriksaan(Integer.parseInt(txtIdPemeriksaan.getText()));
        Pendaftaran pdf = (Pendaftaran) cmbPendaftaran.getSelectedItem();
        Pasien ps = (Pasien) cmbPasien.getSelectedItem();
        Dokter dr = (Dokter) cmbDokter.getSelectedItem();
        Obat obt = (Obat) cmbObat.getSelectedItem();
        diag.setPendaftaran(pdf);
        diag.setPasien(ps);
        diag.setDokter(dr);
        diag.setObat(obt);
        diag.setHargaTotal(Integer.parseInt(txtTotalHarga.getText()));
        diag.save();
        int total = diag.HitungTotal(diag.getIdPemeriksaan());
        txtTotalHarga.setText(String.valueOf(total));
        System.out.println("Harga total = " + total);
        txtIdPemeriksaan.setText(Integer.toString(diag.getIdPemeriksaan()));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblDiagnosa.getModel();
        int row = tblDiagnosa.getSelectedRow();

        Diagnosa diag = new Diagnosa().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        diag.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FrmDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDiagnosa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbDokter;
    private javax.swing.JComboBox<String> cmbObat;
    private javax.swing.JComboBox<String> cmbPasien;
    private javax.swing.JComboBox<String> cmbPendaftaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblDiagnosa;
    private javax.swing.JTextField txtIdPemeriksaan;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
