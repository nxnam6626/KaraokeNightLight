/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Phong;
import java.sql.PreparedStatement;


public class Phong_dao {

    public Phong_dao() {
        
    }
 
    //Lay danh sach phong theo tieu chi
    public  ArrayList<Phong> LayDanhSachPhongTheoTieuChi(String maPhong, int trangThai, int loaiPhong, int soNguoi){
  
	ArrayList<Phong> dsP = new ArrayList<Phong>();
	ConnectDB.getInstance();
	Connection con = ConnectDB.getConnection();
	PreparedStatement stmt = null;
			
	try {
            String sql = "SELECT * FROM PHONG WHERE 1 = 1"; 
   
            if (maPhong != null && !maPhong.isEmpty()) {
                  sql += " AND maPhong = ?";
            }
            if (trangThai > 0) {
                  sql += " AND trangThaiPhong = ?";
            }
            if (loaiPhong > 0) {
                  sql += " AND loaiPhong = ?";
            }
            if (soNguoi >= 0) {
                  sql += " AND nhomPhong = ?";
            }

	    stmt = con.prepareStatement(sql);


            int parameterIndex = 1;

            if (maPhong != null && !maPhong.isEmpty()) {
                 stmt.setString(parameterIndex, maPhong);
                 parameterIndex++;
            }
            if (trangThai > 0) {
                 stmt.setInt(parameterIndex, trangThai);
                 parameterIndex++;
            }
            if (loaiPhong > 0) {
                 stmt.setInt(parameterIndex, loaiPhong);
                 parameterIndex++;
            }
            if (soNguoi >= 0) {
                 stmt.setInt(parameterIndex, soNguoi);
                 parameterIndex++;
             }
				
	    ResultSet rs= stmt.executeQuery();
				
	    while(rs.next())
	    {
                
                String maP = rs.getString("maPhong");
		int nhomP = rs.getInt("nhomPhong");
                int loaiP = rs.getInt("loaiPhong");
                String loai;
                if(loaiP == 1){
                    loai = "Thường";
                }else{
                    loai= "VIP";
                }
		int trangThaiP = rs.getInt("trangThaiPhong");
		double giaP = rs.getDouble("giaPhong");
				
		Phong p = new Phong(maP, nhomP, loai, trangThaiP, giaP);
		dsP.add(p);

	    }
    } catch (SQLException e) {
            // TODO Auto-generated catch block

    }
   
    return dsP;	
    }

    //Lay toan bo danh sach phong
    public ArrayList<Phong> getAllPhong() {
		ArrayList<Phong> dsP = new ArrayList<Phong>();
		ConnectDB.getInstance();
		Connection con= ConnectDB.getConnection();	
		
		
		try {
			String sql= "Select * from PHONG";
			PreparedStatement psm = con.prepareStatement(sql);
			ResultSet rs = psm.executeQuery();

		while (rs.next()) {
		String maP = rs.getString("maPhong");
		int nhomP = rs.getInt("nhomPhong");
                int loaiP = rs.getInt("loaiPhong");
                String loai;
                if(loaiP == 1){
                    loai = "Thường";
                }else{
                    loai= "VIP";
                }
		int trangThaiP = rs.getInt("trangThaiPhong");
		double giaP = rs.getDouble("giaPhong");
				
		Phong p = new Phong(maP, nhomP, loai, trangThaiP, giaP);
		dsP.add(p);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dsP;

	}

    
    //Lay so luong cac phong theo trang thai
    public int laySoLuongPhongTheoTrangThai(int tt) {
	
	return 0;

	}
    
    public boolean capNhatTrangThaiPhong(String mp, int ttp) {
	ConnectDB.getInstance();
	Connection con= ConnectDB.getConnection();	
	PreparedStatement stmt = null;
			
	int n=0;
			
			
	try {
	     stmt= con.prepareStatement("update PHONG SET trangThaiPhong=? WHERE maPhong=?");
	     stmt.setInt(1,ttp );
	     stmt.setString(2,mp);
	     
	     n= stmt.executeUpdate();
	    } catch (SQLException e) {
            // TODO Auto-generated catch block

	    }
	    finally {
		try {
	            stmt.close();
		} catch (SQLException e2) {
                    // TODO: handle exception
                    
		}
	   }
            return n>0;
    }
//    public boolean capNhatTrangThaiPhong(String maPhong, int trangThaiPhong) {
//		// TODO Auto-generated method stub
//		String sql = "UPDATE Phong set maTTP = :maTTP WHERE maPhong = :maPhong ";
//		Session session = sessionFactory.openSession();
//		Transaction tr = session.getTransaction();
//		try {
//			tr.begin();
//			@SuppressWarnings("rawtypes")
//			Query query = session.createQuery(sql);
//			query.setParameter("maTTP", maTTP);
//			query.setParameter("maPhong", maPhong);
//			int result = query.executeUpdate();
//			if (result != 0) {
//				return true;
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			tr.rollback();
//
//		} finally {
//			session.close();
//		}
//		return false;
//	}
}
