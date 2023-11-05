/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Objects;


public class DichVu {
    private String id;
    private String tenDichVu;
    private int soLuong;
    private double giaBan;
    private String loai;
    private String donViDo;
    private String hinhAnh;
    
	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DichVu(String id, String tenDichVu, int soLuong, double giaBan, String loai, String donViDo,
			String hinhAnh) {
		super();
		this.id = id;
		this.tenDichVu = tenDichVu;
		this.soLuong = soLuong;
		setGiaBan(giaBan);
		this.loai = loai;
		this.donViDo = donViDo;
		this.hinhAnh = hinhAnh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		if (giaBan>=0)
			this.giaBan = giaBan;
		else
			this.giaBan = 0;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getDonViDo() {
		return donViDo;
	}

	public void setDonViDo(String donViDo) {
		this.donViDo = donViDo;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DichVu other = (DichVu) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "DichVu [id=" + id + ", tenDichVu=" + tenDichVu + ", soLuong=" + soLuong + ", giaBan=" + giaBan
				+ ", loai=" + loai + ", donViDo=" + donViDo + ", hinhAnh=" + hinhAnh + "]";
	}


    
}
