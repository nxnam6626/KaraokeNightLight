/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;

import dao.DichVu_dao;
import interface_dao.DichVu_Interface;
import models.DichVu;


/**
 *
 * @author nxnam
 */
public class DichVu_bus implements DichVu_Interface{
	private DichVu_dao dichvu_dao =  new  DichVu_dao();
	
	public DichVu_bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public ArrayList<DichVu> getAllDichVu() {
//		 ArrayList<DichVu> danhSachDichVu = dichvu_dao.getAllDichVu();
//		    for (DichVu dv : danhSachDichVu) {
//		        System.out.println(dv.toString());
//		    }
		return dichvu_dao.getAllDichVu();
	}

	@Override
	public ArrayList<DichVu> getDichVuTheoMa(String maDichVu) {
		
		return dichvu_dao.getDichVuTheoMa(maDichVu);
	}

	@Override
	public boolean XoaDichVu(String maDichVu) {
		// TODO Auto-generated method stub
		return dichvu_dao.XoaDichVu(maDichVu);
	}

	@Override
	public boolean ThemDichVu(DichVu dichVu) {
		// TODO Auto-generated method stub
		return dichvu_dao.ThemDichVu(dichVu);
	}

	@Override
	public boolean capNhatDichVu(String maDichVu, DichVu dichvu) {
		// TODO Auto-generated method stub
		return dichvu_dao.capNhatDichVu(maDichVu, dichvu);
	}
    
}
