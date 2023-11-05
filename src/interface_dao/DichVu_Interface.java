/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interface_dao;

import java.util.ArrayList;
import models.DichVu;

/**
 *
 * @author CEGROUP
 */
public interface DichVu_Interface {
    public ArrayList<DichVu> getAllDichVu();
    public ArrayList<DichVu> getDichVuTheoMa(String maDichVu);
    public boolean XoaDichVu(String maDichVu);
    public boolean ThemDichVu(DichVu dichVu);
    public boolean capNhatDichVu(String maDichVu,DichVu dichvu);
}
