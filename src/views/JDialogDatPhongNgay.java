/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import dao.KhachHang_dao;
import dao.Phong_dao;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import models.HoaDon;
import models.KhachHang;
import models.PhieuDatPhong;
import models.Phong;

public class JDialogDatPhongNgay extends javax.swing.JDialog{
    private Phong phongChon;
    private final Phong_dao phongDao;
    private final KhachHang_dao khachHangDao;
    private PhieuDatPhong phieuDatPhong;
    private HoaDon hoaDon;



    public JDialogDatPhongNgay(Phong phong) {
//        super(parent, modal); 
        phongChon= phong;
        initComponents();
        this.setLocationRelativeTo(null);
        phongDao= new Phong_dao();
        khachHangDao= new KhachHang_dao();
    }




    @SuppressWarnings("unchecked")
//================================================================================================================================//
//================================================================================================================================//
    public void khoiTao(Phong phong) {
       phongChon = phong; 
       phieuDatPhong = null;
       hoaDon = null;
       txt_maPhong.setText(phong.getMaPhong());
       txt_loaiPhong.setText(phong.getLoaiPhong());
       double giaPhong = phong.getGiaPhong();
       txt_giaPhong.setText(Double.toString(giaPhong));
       
       int nhomPhong= phong.getNhomPhong();
       if(nhomPhong == 1){
           txt_nhomPhong.setText("Nhỏ");
           txt_soNguoi.setText("Dưới 10 người");
       }else if(nhomPhong==2){
           txt_nhomPhong.setText("Trung");
           txt_soNguoi.setText("10-20 người");
       }else if(nhomPhong==3){
           txt_nhomPhong.setText("Lớn");
           txt_soNguoi.setText("20-30 người");
       }else{
           txt_nhomPhong.setText("Lớn");
           txt_soNguoi.setText("10-20 người");
       }
       
       Date date= new Date();
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       String ngayGioFormatted = dateFormat.format(date);
       txt_thoiGianDat.setText(ngayGioFormatted);
  
//        Nếu trạng thái của phòng là "cho" 
//        và cách thời gian nhận phòng ít hơn 2 giờ, bạn sẽ hiển thị một thông báo không cho phép đặt phòng
        if(phong.getTrangThaiPhong()== 2){
            Date now = new Date();
//            phieuDatPhong = phieuDatPhongDao.layPhieuDatPhongMoiNhatTheoPhong(phong.getMaPhong());
//			if (now.getDay() == phieuDatPhong.getThoiGianNhanPhong().getDay()
//					&& now.getHours() >= phieuDatPhong.getThoiGianNhanPhong().getHours() - 2) {
//				JOptionPane.showMessageDialog(this,
//						"Hiện tại bạn KHÔNG được phép đặt phòng này do có khách sắp tới nhận phòng");
//				this.setVisible(false);
//				hoaDon = null;
//				phieuDatPhong = null;
//				phong = null;
//				return;
//			}
        }
	this.setVisible(true);
    }
//================================================================================================================================//
//================================================================================================================================//
    public void setEdit(Phong phong){
       txt_maPhong.setText(phong.getMaPhong());
       txt_loaiPhong.setText(phong.getLoaiPhong());
       double giaPhong = phong.getGiaPhong();
       txt_giaPhong.setText(Double.toString(giaPhong));
       
       int nhomPhong= phong.getNhomPhong();
       if(nhomPhong == 1){
           txt_nhomPhong.setText("Nhỏ");
           txt_soNguoi.setText("Dưới 10 người");
       }else if(nhomPhong==2){
           txt_nhomPhong.setText("Trung");
           txt_soNguoi.setText("10-20 người");
       }else if(nhomPhong==3){
           txt_nhomPhong.setText("Lớn");
           txt_soNguoi.setText("20-30 người");
       }else{
           txt_nhomPhong.setText("Lớn");
           txt_soNguoi.setText("10-20 người");
       }
       
       Date date= new Date();
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       String ngayGioFormatted = dateFormat.format(date);
       txt_thoiGianDat.setText(ngayGioFormatted);
       
    }
//================================================================================================================================//
//================================================================================================================================//   
    public boolean kiemTraSDTKhach() {
	String sdt = txt_soDienThoai.getText();
	if (sdt.trim().length() == 0) {
	     JOptionPane.showMessageDialog(this, "Yêu cầu nhập số điện thoại khách hàng");
	     txt_soDienThoai.selectAll();
	     txt_soDienThoai.requestFocus();
	     return false;
	}
	if (!sdt.matches("(^(03)[2-9]\\d{7})|(^(07)[06-9]\\d{7})|(^(08)[1-5]\\d{7})|(^(056)\\d{7})|(^(058)\\d{7})|(^(059)\\d{7})|(^(09)[0-46-9]\\d{7})")) {
		JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
		txt_soDienThoai.selectAll();
		txt_soDienThoai.requestFocus();
		return false;
	}
        KhachHang kHang = khachHangDao.findKhachHangTheoSDT(sdt);
	if (kHang == null) {
	     int xacNhan = JOptionPane.showConfirmDialog(this,
					"Khách hàng không có trong hệ thống, Bạn có muốn thêm khách hàng không", "Thông báo",
					JOptionPane.YES_NO_OPTION);
		if (xacNhan == JOptionPane.YES_OPTION) {
//			DialogThemKhachHang dialogThemKhachHang = new DialogThemKhachHang(sdt);
//			dialogThemKhachHang.setVisible(true);
//			if (DialogThemKhachHang.khachHang == null) {
//				dialogThemKhachHang.dispose();
//				return false;
//			}
//			dialogThemKhachHang.dispose();
//			khachHang = DialogThemKhachHang.khachHang;
		}else{
                    txt_tenKhach.requestFocus();
                }
	}
        txt_tenKhach.setText(kHang.getTenKH());
	return true;
	}
//================================================================================================================================//
//================================================================================================================================//    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        lblTieuDe = new javax.swing.JLabel();
        pnl_ThongTinPhieuDat = new javax.swing.JPanel();
        pnl_Phong = new javax.swing.JPanel();
        lbl_maPhong = new javax.swing.JLabel();
        txt_maPhong = new javax.swing.JTextField();
        txt_loaiPhong = new javax.swing.JTextField();
        txt_nhomPhong = new javax.swing.JTextField();
        txt_thoiGianDat = new javax.swing.JTextField();
        lbl_thoiGianDat = new javax.swing.JLabel();
        lbl_loaiPhong = new javax.swing.JLabel();
        lbl_nhomPhong = new javax.swing.JLabel();
        pnl_KhachHang = new javax.swing.JPanel();
        lbl_tenKhach = new javax.swing.JLabel();
        lbl_soNguoi = new javax.swing.JLabel();
        lbl_soDienThoai = new javax.swing.JLabel();
        lbl_giaPhong = new javax.swing.JLabel();
        txt_tenKhach = new javax.swing.JTextField();
        txt_soNguoi = new javax.swing.JTextField();
        txt_soDienThoai = new javax.swing.JTextField();
        txt_giaPhong = new javax.swing.JTextField();
        btn_Tim = new javax.swing.JButton();
        pnl_ChucNang = new javax.swing.JPanel();
        btn_DatPhong = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTieuDe.setBackground(new java.awt.Color(0, 255, 255));
        lblTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieuDe.setText("ĐẶT PHÒNG NGAY");
        lblTieuDe.setOpaque(true);

        pnl_ThongTinPhieuDat.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Phong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        lbl_maPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_maPhong.setText("Mã phòng");

        txt_maPhong.setEditable(false);
        txt_maPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_loaiPhong.setEditable(false);
        txt_loaiPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_nhomPhong.setEditable(false);
        txt_nhomPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_thoiGianDat.setEditable(false);
        txt_thoiGianDat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_thoiGianDat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_thoiGianDat.setText("Thời gian đặt");

        lbl_loaiPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_loaiPhong.setText("Loại phòng");

        lbl_nhomPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nhomPhong.setText("Nhóm phòng");

        javax.swing.GroupLayout pnl_PhongLayout = new javax.swing.GroupLayout(pnl_Phong);
        pnl_Phong.setLayout(pnl_PhongLayout);
        pnl_PhongLayout.setHorizontalGroup(
            pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PhongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_thoiGianDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PhongLayout.createSequentialGroup()
                        .addGroup(pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_loaiPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nhomPhong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_nhomPhong, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_loaiPhong, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_thoiGianDat, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(txt_maPhong, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18))
        );
        pnl_PhongLayout.setVerticalGroup(
            pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PhongLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_loaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_loaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nhomPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nhomPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_thoiGianDat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_thoiGianDat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnl_KhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        pnl_KhachHang.setPreferredSize(new java.awt.Dimension(412, 29));

        lbl_tenKhach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tenKhach.setText("Tên khách hàng");

        lbl_soNguoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_soNguoi.setText("Số người");

        lbl_soDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_soDienThoai.setText("Số điện thoại");

        lbl_giaPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_giaPhong.setText("Giá phòng");

        txt_tenKhach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_soNguoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_soDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txt_giaPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_giaPhong.setForeground(new java.awt.Color(255, 0, 0));

        btn_Tim.setBackground(new java.awt.Color(0, 0, 255));
        btn_Tim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Tim.setForeground(new java.awt.Color(255, 255, 255));
        btn_Tim.setText("Tìm");
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_KhachHangLayout = new javax.swing.GroupLayout(pnl_KhachHang);
        pnl_KhachHang.setLayout(pnl_KhachHangLayout);
        pnl_KhachHangLayout.setHorizontalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_KhachHangLayout.createSequentialGroup()
                        .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_soDienThoai)
                            .addComponent(lbl_giaPhong)
                            .addComponent(lbl_soNguoi))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhachHangLayout.createSequentialGroup()
                        .addComponent(lbl_tenKhach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_soNguoi, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(txt_tenKhach)
                    .addComponent(txt_giaPhong)
                    .addGroup(pnl_KhachHangLayout.createSequentialGroup()
                        .addComponent(txt_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Tim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_KhachHangLayout.setVerticalGroup(
            pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhachHangLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tenKhach))
                .addGap(18, 18, 18)
                .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_soNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_soNguoi))
                .addGap(18, 18, 18)
                .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_soDienThoai))
                    .addComponent(btn_Tim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_giaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_giaPhong))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout pnl_ThongTinPhieuDatLayout = new javax.swing.GroupLayout(pnl_ThongTinPhieuDat);
        pnl_ThongTinPhieuDat.setLayout(pnl_ThongTinPhieuDatLayout);
        pnl_ThongTinPhieuDatLayout.setHorizontalGroup(
            pnl_ThongTinPhieuDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinPhieuDatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ThongTinPhieuDatLayout.setVerticalGroup(
            pnl_ThongTinPhieuDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinPhieuDatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ThongTinPhieuDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Phong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_ChucNang.setBackground(new java.awt.Color(255, 255, 255));

        btn_DatPhong.setBackground(new java.awt.Color(0, 153, 51));
        btn_DatPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DatPhong.setForeground(new java.awt.Color(255, 255, 255));
        btn_DatPhong.setText("ĐẶT PHÒNG");
        btn_DatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DatPhongActionPerformed(evt);
            }
        });

        btn_Thoat.setBackground(new java.awt.Color(255, 0, 0));
        btn_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(255, 255, 255));
        btn_Thoat.setText("THOÁT");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ChucNangLayout = new javax.swing.GroupLayout(pnl_ChucNang);
        pnl_ChucNang.setLayout(pnl_ChucNangLayout);
        pnl_ChucNangLayout.setHorizontalGroup(
            pnl_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChucNangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_DatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_ChucNangLayout.setVerticalGroup(
            pnl_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_DatPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btn_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_ThongTinPhieuDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnl_ChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_ThongTinPhieuDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_ChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DatPhongActionPerformed
        // TODO add your handling code here:
        if (!kiemTraSDTKhach()) {
	           return;
	} 
	int n = JOptionPane.showConfirmDialog(null, "Xác nhận đặt phòng " + phongChon.getMaPhong(),
			"Thông báo", JOptionPane.YES_NO_OPTION);
                        
	if (n == JOptionPane.YES_OPTION) { 
            phongDao.capNhatTrangThaiPhong(phongChon.getMaPhong(), 3);
            JOptionPane.showMessageDialog(null, "Đặt phòng "+ phongChon.getMaPhong()+ " thành công !!!");
            phongChon.setTrangThaiPhong(3);
//            panel_QuanLyPhong pnlQLP = new panel_QuanLyPhong();
//            pnlQLP.loadALLPhong();
	}
    }//GEN-LAST:event_btn_DatPhongActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed

        kiemTraSDTKhach();
    }//GEN-LAST:event_btn_TimActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DatPhong;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lbl_giaPhong;
    private javax.swing.JLabel lbl_loaiPhong;
    private javax.swing.JLabel lbl_maPhong;
    private javax.swing.JLabel lbl_nhomPhong;
    private javax.swing.JLabel lbl_soDienThoai;
    private javax.swing.JLabel lbl_soNguoi;
    private javax.swing.JLabel lbl_tenKhach;
    private javax.swing.JLabel lbl_thoiGianDat;
    private javax.swing.JPanel pnl_ChucNang;
    private javax.swing.JPanel pnl_KhachHang;
    private javax.swing.JPanel pnl_Phong;
    private javax.swing.JPanel pnl_ThongTinPhieuDat;
    private javax.swing.JTextField txt_giaPhong;
    private javax.swing.JTextField txt_loaiPhong;
    private javax.swing.JTextField txt_maPhong;
    private javax.swing.JTextField txt_nhomPhong;
    private javax.swing.JTextField txt_soDienThoai;
    private javax.swing.JTextField txt_soNguoi;
    private javax.swing.JTextField txt_tenKhach;
    private javax.swing.JTextField txt_thoiGianDat;
    // End of variables declaration//GEN-END:variables
}
