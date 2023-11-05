/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import models.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KhachHang_dao {
    
  

    public KhachHang_dao() {
    }
    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=ten_csdl";
    private static final String JDBC_USERNAME = "ten_nguoi_dung";
    private static final String JDBC_PASSWORD = "mat_khau";

 
    
    public  KhachHang findKhachHangTheoSDT(String sdt){
        KhachHang khachhang = null;
        ConnectDB.getInstance();
	Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
			
	try {
	     String sql="Select * from KHACHHANG where soDienThoai = ?";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, sdt);
		ResultSet rs= stmt.executeQuery();
                while(rs.next()){
                    String maKhachHang = rs.getString(1);
		    String tenKhachHang = rs.getString(2);
		     String SDT= rs.getString(4);
					
		     boolean gt;
                     int gioiTinh= rs.getInt(3);
                     if(gioiTinh == 0){
                         gt= true;
                     }else{
                         gt= false;
                     }
			
                     
                     int loaiKhachHang = rs.getInt(5);
                     Date ngaySINH= rs.getDate(6);
	             int diemThanhVien = rs.getInt(7);
				
		     khachhang= new KhachHang(maKhachHang, tenKhachHang, SDT, gt, ngaySINH, diemThanhVien, loaiKhachHang);
                }
		     
	} catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                
            } catch (Exception e) {
            } finally {
            }
        }

        return khachhang;
    }
			
    
}
