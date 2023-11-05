/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interface_dao.DichVu_Interface;

import java.util.ArrayList;
/*import ConnectDB.ConnectDB;*/
import java.sql.*;
import models.DichVu;
import utilities.connect.ConnectDB;




/**
 *
 * @author nxnam
 */
public class DichVu_dao implements DichVu_Interface{
	
    @Override
    public ArrayList<DichVu> getAllDichVu() {
        ArrayList<DichVu> list = new ArrayList<>();
        String query = "Select * from DichVu";
        try {
            Statement st = ConnectDB.conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String maDV = rs.getString("maDichVu");
                String tenDV = rs.getString("tenDichVu");
                int soLuong = rs.getInt("soLuong");
                String hinhAnh = rs.getString("hinhAnh");
                double giaNhap = rs.getDouble("giaNhap");
                String loaiDichVu = rs.getString("loaiDichVu");
                String donViDo = "";// rs.getString("donViDo"); // Thiếu dòng này
                DichVu dv = new DichVu(maDV, tenDV, soLuong, giaNhap, loaiDichVu, hinhAnh, donViDo);
                list.add(dv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public ArrayList<DichVu> getDichVuTheoMa(String maDichVu) {
    	ArrayList<DichVu> list = new ArrayList<>();
        String query = "Select * from DichVu where maDichVu = ?";
        try {
            PreparedStatement st = ConnectDB.conn.prepareStatement(query);
            st.setString(1, maDichVu);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
            	String maDV = rs.getString("maDichVu");
            	String tenDV = rs.getString("tenDichVu");
            	int soLuong = rs.getInt("soLuong");
            	String hinhAnh = rs.getString("hinhAnh");
            	double giaBan = rs.getDouble("giaNhap");
            	String loaiDichVu = rs.getString("loaiDichVu");
                String donvido = "";
            	DichVu dv = new DichVu(maDV, tenDV, soLuong, giaBan, loaiDichVu, hinhAnh,donvido);
            	list.add(dv);
            }
        } catch (Exception e) {
         
        }   
        return list;
    }

    @Override
    public boolean XoaDichVu(String maDichVu) {
    	int n=0;
    	String query = "delete from DichVu where maDichVu = ?";
    	try {
			PreparedStatement st = ConnectDB.conn.prepareStatement(query);
			st.setString(1, maDichVu);
			n= st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return n>0;
    }

    @Override
    public boolean ThemDichVu(DichVu dichVu) {
    	int n=0;
    	String query = "insert into DichVu "+"values (?,?,?,?,?,?,?)";//Thieu ? cho DonViTinh tai sql chua co
    	try {
			PreparedStatement st = ConnectDB.conn.prepareStatement(query);
			st.setString(1, dichVu.getId());
			st.setString(2, dichVu.getTenDichVu());
			st.setInt(3, dichVu.getSoLuong());
			st.setString(4, dichVu.getHinhAnh());
			st.setDouble(5, dichVu.getGiaBan());
			st.setString(6, dichVu.getLoai());
                        st.setString(7, dichVu.getDonViDo());
			n=st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return n>0;
    }

    @Override
    public boolean capNhatDichVu(String maDichVu,DichVu dichvu) {
    	int n=0;
    	String query = "update DichVu "+"set tenDichVu = ? , soLuong = ?, giaNhap = ?"+"where maDichVu = ?";
    	try {
			PreparedStatement st = ConnectDB.conn.prepareStatement(query);
			st.setString(1, dichvu.getTenDichVu());
			st.setInt(2, dichvu.getSoLuong());
			st.setDouble(3, dichvu.getGiaBan());
			st.setString(4, maDichVu);
			n=st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return n>0;
    }

    
}
