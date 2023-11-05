/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import java.util.Objects;

public final class KhachHang {
    private String maKH;
    private String tenKH;
    private String SĐT;
    private boolean gioiTinh;
    private Date ngaySinh;
    private int diemThanhVien;
    private int loaiKhachHang;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.maKH);
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
        final KhachHang other = (KhachHang) obj;
        return Objects.equals(this.maKH, other.maKH);
    }

    

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String SĐT, boolean gioiTinh, Date ngaySinh, int diemThanhVien, int loaiKhachHang) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.SĐT = SĐT;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diemThanhVien = diemThanhVien;
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getDiemThanhVien() {
        return diemThanhVien;
    }

    public void setDiemThanhVien(int diemThanhVien) {
        this.diemThanhVien = diemThanhVien;
    }

    public int getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(int loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    
   
@Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", S\u0110T=" + SĐT + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diemThanhVien=" + diemThanhVien + ", loaiKhachHang=" + loaiKhachHang + '}';
    }
    

    
    
    
    
}
