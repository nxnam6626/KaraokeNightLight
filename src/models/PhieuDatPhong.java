/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class PhieuDatPhong implements Serializable{
    private String maPhieuDatPhong;
    private Phong phongDat;
    private Date thoiGianDatPhong;
    private Date thoiGianNhanPhong;
    private NhanVien nhanVienLap;
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

    public Date getThoiGianDatPhong() {
        return thoiGianDatPhong;
    }

    public void setThoiGianDatPhong(Date thoiGianDatPhong) {
        this.thoiGianDatPhong = thoiGianDatPhong;
    }

    public Date getThoiGianNhanPhong() {
        return thoiGianNhanPhong;
    }

    public void setThoiGianNhanPhong(Date thoiGianNhanPhong) {
        this.thoiGianNhanPhong = thoiGianNhanPhong;
    }

    public NhanVien getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(NhanVien nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
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

    public PhieuDatPhong(String maPhieuDatPhong, Phong phongDat, Date thoiGianDatPhong, Date thoiGianNhanPhong, NhanVien nhanVienLap, KhachHang khachHangDat, int tinhTrang) {
        this.maPhieuDatPhong = maPhieuDatPhong;
        this.phongDat = phongDat;
        this.thoiGianDatPhong = thoiGianDatPhong;
        this.thoiGianNhanPhong = thoiGianNhanPhong;
        this.nhanVienLap = nhanVienLap;
        this.khachHangDat = khachHangDat;
        this.tinhTrang = tinhTrang;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maPhieuDatPhong);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhieuDatPhong other = (PhieuDatPhong) obj;
        return Objects.equals(this.maPhieuDatPhong, other.maPhieuDatPhong);
    }

    
    
    
    @Override
    public String toString() {
        return "PhieuDatPhong{" + "maPhieuDatPhong=" + maPhieuDatPhong + ", phongDat=" + phongDat + ", thoiGianDatPhong=" + thoiGianDatPhong + ", thoiGianNhanPhong=" + thoiGianNhanPhong + ", nhanVienLap=" + nhanVienLap + ", khachHangDat=" + khachHangDat + ", tinhTrang=" + tinhTrang + '}';
    }
    
    
    
}
