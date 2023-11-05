/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author nxnam
 */
public class HoaDon {
    private String maHD;
    private LocalDate ngayLapHD;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private int chietKhau;
    private int thue;
    private ArrayList<ChiTietHoaDonPhong> dsChiTietHoaDonPhong;
    private ArrayList<ChiTietHoaDonDichVu> dsChiTietHoaDonDichVu;
    private double tongTienHD;

    public HoaDon() {
    }

    public HoaDon(String maHD, LocalDate ngayLapHD, KhachHang khachHang, NhanVien nhanVien, int chietKhau, int thue, ArrayList<ChiTietHoaDonPhong> dsChiTietHoaDonPhong, ArrayList<ChiTietHoaDonDichVu> dsChiTietHoaDonDichVu, double tongTienHD) {
        this.maHD = maHD;
        this.ngayLapHD = ngayLapHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.chietKhau = chietKhau;
        this.thue = thue;
        this.dsChiTietHoaDonPhong = dsChiTietHoaDonPhong;
        this.dsChiTietHoaDonDichVu = dsChiTietHoaDonDichVu;
        this.tongTienHD = tongTienHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public LocalDate getNgayLapHD() {
        return ngayLapHD;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public int getThue() {
        return thue;
    }

    public ArrayList<ChiTietHoaDonPhong> getDsChiTietHoaDonPhong() {
        return dsChiTietHoaDonPhong;
    }

    public ArrayList<ChiTietHoaDonDichVu> getDsChiTietHoaDonDichVu() {
        return dsChiTietHoaDonDichVu;
    }

    public double getTongTienHD() {
        return tongTienHD;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.maHD);
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
        final HoaDon other = (HoaDon) obj;
        return Objects.equals(this.maHD, other.maHD);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}


