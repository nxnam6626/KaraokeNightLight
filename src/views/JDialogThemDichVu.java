/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import controller.DichVu_bus;
import java.io.File;
import javax.swing.JFileChooser;
import models.DichVu;
import models.Phong;

public class JDialogThemDichVu extends javax.swing.JDialog {

  
    public JDialogThemDichVu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTieuDe = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        pnlBox1 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        lblMaDichVu = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        txtMaDichVu = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        lblSoLuong = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        txtSoLuong = new javax.swing.JTextField();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        pnlBox2 = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        lblTenDichVu = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        txtTenDichVu = new javax.swing.JTextField();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        lblGiaBan = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        txtGiaBan = new javax.swing.JTextField();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        pnlBox3 = new javax.swing.JPanel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        lblHinhAnh = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0));
        HinhAnh = new javax.swing.JLabel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(14, 0));
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));
        lblLoaiDichVu = new javax.swing.JLabel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        cbxLoaiDichVu = new javax.swing.JComboBox<>();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30));
        jPanel4 = new javax.swing.JPanel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));
        lblDonViDo = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(32767, 0));
        cbxDonViTinh = new javax.swing.JComboBox<>();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        pnlSouth = new javax.swing.JPanel();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(32767, 0));
        btnThem = new javax.swing.JButton();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(32767, 0));
        btnHuyBo = new javax.swing.JButton();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 430));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pnlTieuDe.setPreferredSize(new java.awt.Dimension(0, 100));

        lblTieuDe.setText("THÊM DỊCH VỤ");

        javax.swing.GroupLayout pnlTieuDeLayout = new javax.swing.GroupLayout(pnlTieuDe);
        pnlTieuDe.setLayout(pnlTieuDeLayout);
        pnlTieuDeLayout.setHorizontalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTieuDeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTieuDe)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlTieuDeLayout.setVerticalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTieuDeLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(lblTieuDe)
                    .addGap(0, 42, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlTieuDe, java.awt.BorderLayout.NORTH);

        pnlCenter.setLayout(new javax.swing.BoxLayout(pnlCenter, javax.swing.BoxLayout.Y_AXIS));

        pnlBox1.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        pnlBox1.setPreferredSize(new java.awt.Dimension(400, 50));
        pnlBox1.setLayout(new javax.swing.BoxLayout(pnlBox1, javax.swing.BoxLayout.X_AXIS));
        pnlBox1.add(filler4);

        lblMaDichVu.setText("Mã dịch vụ:");
        pnlBox1.add(lblMaDichVu);
        pnlBox1.add(filler1);

        txtMaDichVu.setBackground(new java.awt.Color(204, 204, 204));
        txtMaDichVu.setText("DV006");
        txtMaDichVu.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        txtMaDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDichVuActionPerformed(evt);
            }
        });
        pnlBox1.add(txtMaDichVu);
        pnlBox1.add(filler2);

        lblSoLuong.setText("Số lượng");
        pnlBox1.add(lblSoLuong);
        pnlBox1.add(filler3);

        txtSoLuong.setText("10");
        txtSoLuong.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        pnlBox1.add(txtSoLuong);
        pnlBox1.add(filler5);

        pnlCenter.add(pnlBox1);

        pnlBox2.setMaximumSize(new java.awt.Dimension(32767, 50));
        pnlBox2.setPreferredSize(new java.awt.Dimension(400, 50));
        pnlBox2.setLayout(new javax.swing.BoxLayout(pnlBox2, javax.swing.BoxLayout.LINE_AXIS));
        pnlBox2.add(filler6);

        lblTenDichVu.setText("Tên dịch vụ:");
        pnlBox2.add(lblTenDichVu);
        pnlBox2.add(filler7);

        txtTenDichVu.setText("Number one");
        txtTenDichVu.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        pnlBox2.add(txtTenDichVu);
        pnlBox2.add(filler8);

        lblGiaBan.setText("Giá bán:");
        pnlBox2.add(lblGiaBan);
        pnlBox2.add(filler9);

        txtGiaBan.setText("10000");
        txtGiaBan.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        pnlBox2.add(txtGiaBan);
        pnlBox2.add(filler10);

        pnlCenter.add(pnlBox2);

        pnlBox3.setMaximumSize(new java.awt.Dimension(2147483647, 150));
        pnlBox3.setLayout(new javax.swing.BoxLayout(pnlBox3, javax.swing.BoxLayout.LINE_AXIS));
        pnlBox3.add(filler11);

        lblHinhAnh.setText("Hình ảnh:");
        pnlBox3.add(lblHinhAnh);
        pnlBox3.add(filler12);

        HinhAnh.setBackground(new java.awt.Color(153, 153, 153));
        HinhAnh.setMaximumSize(new java.awt.Dimension(100, 100));
        HinhAnh.setOpaque(true);
        HinhAnh.setPreferredSize(new java.awt.Dimension(110, 100));
        HinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HinhAnhDoubleClick(evt);
            }
        });
        pnlBox3.add(HinhAnh);
        pnlBox3.add(filler13);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(filler22);

        lblLoaiDichVu.setText("Loại dịch vụ:");
        jPanel3.add(lblLoaiDichVu);
        jPanel3.add(filler23);

        cbxLoaiDichVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại dịch vụ", "Thức ăn", "Nước uống", "Bia", "Rượu" }));
        cbxLoaiDichVu.setMaximumSize(new java.awt.Dimension(32767, 25));
        cbxLoaiDichVu.setPreferredSize(new java.awt.Dimension(72, 25));
        jPanel3.add(cbxLoaiDichVu);
        jPanel3.add(filler24);

        jPanel2.add(jPanel3);
        jPanel2.add(filler14);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));
        jPanel4.add(filler16);

        lblDonViDo.setText("Đơn vị tính:");
        jPanel4.add(lblDonViDo);
        jPanel4.add(filler17);

        cbxDonViTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đơn vị tính", "Chai", "Lon", "Phần" }));
        cbxDonViTinh.setMaximumSize(new java.awt.Dimension(32767, 25));
        cbxDonViTinh.setPreferredSize(new java.awt.Dimension(72, 25));
        jPanel4.add(cbxDonViTinh);
        jPanel4.add(filler18);

        jPanel2.add(jPanel4);

        pnlBox3.add(jPanel2);

        pnlCenter.add(pnlBox3);

        jPanel1.add(pnlCenter, java.awt.BorderLayout.CENTER);

        pnlSouth.setPreferredSize(new java.awt.Dimension(400, 150));
        pnlSouth.setLayout(new javax.swing.BoxLayout(pnlSouth, javax.swing.BoxLayout.LINE_AXIS));
        pnlSouth.add(filler20);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemthemDichVU(evt);
            }
        });
        pnlSouth.add(btnThem);
        pnlSouth.add(filler19);

        btnHuyBo.setText("Hủy bỏ");
        pnlSouth.add(btnHuyBo);
        pnlSouth.add(filler21);

        jPanel1.add(pnlSouth, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDichVuActionPerformed

    private void HinhAnhDoubleClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HinhAnhDoubleClick
        // TODO add your handling code here:
        if (evt.getClickCount()==2){
            JFileChooser f = new JFileChooser("D:\\Nam3HK1\\PhatTrienUngDung\\Image");
            f.setDialogTitle("Mở File");
            f.showOpenDialog(null);
            File ftenAnh = f.getSelectedFile();
            String duongdananh = ftenAnh.getAbsolutePath();
//            HinhAnh.setIcon(ResizeImage(String.valueOf(duongdananh)));

        }
    }//GEN-LAST:event_HinhAnhDoubleClick

    private void btnThemthemDichVU(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemthemDichVU
        DichVu dichvu;
        String maDichVu;
        String tenDichVu;
        int soLuong;
        double giaBan;
        String loaiDichVu;
        String hinhAnh;
        String donViTinh;

        maDichVu = txtMaDichVu.getText().trim();
        tenDichVu = txtTenDichVu.getText().trim();
        soLuong = Integer.parseInt(txtSoLuong.getText().trim());
        giaBan = Double.parseDouble(txtGiaBan.getText().trim());
        String duongdananh = null;
        hinhAnh = duongdananh;
        loaiDichVu = cbxLoaiDichVu.getSelectedItem().toString();
        donViTinh = cbxDonViTinh.getSelectedItem().toString();

        dichvu = new DichVu(maDichVu, tenDichVu, soLuong, giaBan, loaiDichVu, donViTinh, hinhAnh);
        DichVu_bus dichVu_bus = new DichVu_bus();
        dichVu_bus.ThemDichVu(dichvu);
        try {
            throw new Exception("Thêm thành công!");
        } catch (Exception ex) {
            //            Logger.getLogger(panel_ThemDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemthemDichVU

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
            java.util.logging.Logger.getLogger(JDialogThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogThemDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogThemDichVu dialog = new JDialogThemDichVu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HinhAnh;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbxDonViTinh;
    private javax.swing.JComboBox<String> cbxLoaiDichVu;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDonViDo;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblLoaiDichVu;
    private javax.swing.JLabel lblMaDichVu;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenDichVu;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pnlBox1;
    private javax.swing.JPanel pnlBox2;
    private javax.swing.JPanel pnlBox3;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JPanel pnlTieuDe;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenDichVu;
    // End of variables declaration//GEN-END:variables
}
