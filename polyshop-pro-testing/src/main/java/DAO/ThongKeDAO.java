/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ThongKeDAO {
    
    public List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try{
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql,args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i = 0; i < cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public List<Object[]> getBangDiem(Integer makh){
        String sql = "{Call sp_BangDiem(?)}";
        String[] cols = {"MaNH", "HoTen", "Diem"};
        return this.getListOfArray(sql, cols, makh);
    }
    
    public List<Object[]> getLuongNguoiHoc(){
        String sql = "{Call sp_ThongKeNguoiHoc}";
        String[] cols = {"Nam", "SoLuong", "DauTien", "CuoiCung"};
        return this.getListOfArray(sql, cols);
    }
     public List<Object[]> getNguoiHoc(){
        List<Object[]> list = new ArrayList<>();
         try {
             ResultSet rs = null;
             try {
               
                 String sql = "{Call sp_ThongKeNguoiHoc}";
                 rs = JdbcHelper.query(sql);
                 while (rs.next()) {                     
                       Object[] model= {
                 rs.getInt("Nam"),
                 rs.getInt("SoLuong"),
                 rs.getDate("DauTien"),
                 rs.getDate("CuoiCung")
                 };
                       list.add(model);
                 }
             } finally {
                 rs.getStatement().getConnection().close();
             }
         } catch (Exception e) {
             throw new RuntimeException();
         }
         return list;
       
    }
    public List<Object[]> getDiemChuyenDe(){
        String sql = "{Call sp_DiemChuyenDe}";
        String[] cols = {"ChuyenDe", "SoHV", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDoanhThu(int nam){
        String sql = "{Call sp_DoanhThu(?)}";
        String[] cols = {"ChuyenDe", "SoKH", "SoHV", "DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols, nam);
    }
}
