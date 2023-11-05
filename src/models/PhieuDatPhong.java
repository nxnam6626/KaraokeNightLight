/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Date;

public class PhieuDatPhong implements Serializable{
    private String maPhieuDatPhong;
    private Phong phongDat;
    private Date thoiGianDangKyDatPhong;
    private Date thoiGianNhanPhong;
    private NhanVien nhanVienDat;
    private KhachHang khachHangDat;
    private int tinhTrang;

    public String getMaPhieuDatPhong() {
        return maPhieuDatPhong;
    }

    public void setMaPhieuDatPhong(String maPhieuDatPhong) {
        this.maPhieuDatPhong = maPhieuDatPhong;
    }

    public Phong getPhongDat() {
        return phongDat;
    }

    public void setPhongDat(Phong phongDat) {
        this.phongDat = phongDat;
    }

    public Date getThoiGianDangKyDatPhong() {
        return thoiGianDangKyDatPhong;
    }

    public void setThoiGianDangKyDatPhong(Date thoiGianDangKyDatPhong) {
        this.thoiGianDangKyDatPhong = thoiGianDangKyDatPhong;
    }

    public Date getThoiGianNhanPhong() {
        return thoiGianNhanPhong;
    }

    public void setThoiGianNhanPhong(Date thoiGianNhanPhong) {
        this.thoiGianNhanPhong = thoiGianNhanPhong;
    }

    public NhanVien getNhanVienDat() {
        return nhanVienDat;
    }

    public void setNhanVienDat(NhanVien nhanVienDat) {
        this.nhanVienDat = nhanVienDat;
    }

    public KhachHang getKhachHangDat() {
        return khachHangDat;
    }

    public void setKhachHangDat(KhachHang khachHangDat) {
        this.khachHangDat = khachHangDat;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public PhieuDatPhong(String maPhieuDatPhong, Phong phongDat, Date thoiGianDangKyDatPhong, Date thoiGianNhanPhong, NhanVien nhanVienDat, KhachHang khachHangDat, int tinhTrang) {
        this.maPhieuDatPhong = maPhieuDatPhong;
        this.phongDat = phongDat;
        this.thoiGianDangKyDatPhong = thoiGianDangKyDatPhong;
        this.thoiGianNhanPhong = thoiGianNhanPhong;
        this.nhanVienDat = nhanVienDat;
        this.khachHangDat = khachHangDat;
        this.tinhTrang = tinhTrang;
    }

    public PhieuDatPhong() {
    }

    @Override
    public String toString() {
        return "PhieuDatPhong{" + "maPhieuDatPhong=" + maPhieuDatPhong + ", phongDat=" + phongDat + ", thoiGianDangKyDatPhong=" + thoiGianDangKyDatPhong + ", thoiGianNhanPhong=" + thoiGianNhanPhong + ", nhanVienDat=" + nhanVienDat + ", khachHangDat=" + khachHangDat + ", tinhTrang=" + tinhTrang + '}';
    }
    
    
}
