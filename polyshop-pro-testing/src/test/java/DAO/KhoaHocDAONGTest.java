/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.KhoaHoc;
import Utils.JdbcHelper;
import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author TechCare
 */
@PrepareForTest({JdbcHelper.class, KhoaHocDAO.class})
public class KhoaHocDAONGTest {
    
    KhoaHocDAO KHDAO;
     KhoaHocDAO KHDAOspy;
    public KhoaHocDAONGTest() {
    }
@ObjectFactory
public IObjectFactory getObjectFactory(){
return new org.powermock.modules.testng.PowerMockObjectFactory();
}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
      KHDAO = new KhoaHocDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        KHDAOspy = PowerMockito.spy(new KhoaHocDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertNull() {
        System.out.println("testInsertNull");
        KhoaHoc entity = null;
        
        KHDAO.insert(entity);
        
    }
     @Test
    public void testInsertEmpty() {
        System.out.println("testInsertEmpty");
        KhoaHoc entity = new KhoaHoc();
      
        KHDAO.insert(entity);
        
    }
     @Test
    public void testInsertVali() {
        System.out.println("testInsertVali");
        KhoaHoc entity = new KhoaHoc();
       
        entity.setGhiChu("");
        entity.setHocPhi(2000.0);
        entity.setMaCD("cd001");
        entity.setMaKH(1);
        entity.setMaNV("nv001");
        entity.setNgayKG(Date.valueOf("2020-01-20"));
        entity.setNgayTao(Date.valueOf("2020-01-20"));
        entity.setThoiLuong(200);
        KHDAO.insert(entity);
        
    }

  
  @Test(expectedExceptions = Exception.class)
    public void testUpdateNull() {
        System.out.println("testUpdateNull");
        KhoaHoc entity = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(entity);
        
    }
     @Test
    public void testUpdateEmpty() {
        System.out.println("testUpdateEmpty");
        KhoaHoc entity = new KhoaHoc();
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(entity);
        
    }
     @Test
    public void testUpdateVali() {
        System.out.println("testUpdateVali");
        KhoaHoc entity = new KhoaHoc();
        KhoaHocDAO instance = new KhoaHocDAO();
        entity.setGhiChu("");
        entity.setHocPhi(2000.0);
        entity.setMaCD("cd001");
        entity.setMaKH(1);
        entity.setMaNV("nv001");
        entity.setNgayKG(Date.valueOf("2020-01-20"));
        entity.setNgayTao(Date.valueOf("2020-01-20"));
        entity.setThoiLuong(200);
        instance.update(entity);
        
    }
    @Test
    public void testDeleteNull() {
        System.out.println("testDeleteNull");
        String id = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(id);
      
    }
     @Test
    public void testDeleteEmpty() {
        System.out.println("testDeleteEmpty");
       
         KhoaHoc kh = new KhoaHoc();
          String id = String.valueOf(kh.getMaKH());
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(id);
      
    }
    @Test
    public void testDeleteVali() {
        System.out.println("testDeleteVali");
        String id = "01";
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(id);
      
    }
    @Test
    public void testSelectById() throws Exception {
        System.out.println("selectById");
        String id = "12";
        KhoaHocDAO instance = new KhoaHocDAO();
        KhoaHoc expResult = new KhoaHoc();
        expResult.setMaKH(Integer.parseInt(id));
        List<KhoaHoc> list = new ArrayList<>();
        list.add(expResult);
        PowerMockito.doReturn(list)
                .when(KHDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        KhoaHoc result = KHDAOspy.selectById(id);
        assertEquals(result, expResult);
      
    }
    @Test
    public void testSelectByIdNotFound() throws Exception {
        System.out.println("selectByIdNotFound");
        String id = "12";
        KhoaHocDAO instance = new KhoaHocDAO();
        KhoaHoc expResult = null;
        List<KhoaHoc> list = new ArrayList<>();
        PowerMockito.doReturn(list)
                .when(KHDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        KhoaHoc result = KHDAOspy.selectById(id);
        assertEquals(result, expResult);
      
    }
    @Test
    public void testSelectAll() throws Exception {
        System.out.println("selectAll");
        KhoaHocDAO instance = new KhoaHocDAO();
         KhoaHoc model = new KhoaHoc();
        List<KhoaHoc> expResult = new ArrayList<>();
        expResult.add(model);
        PowerMockito.doReturn(expResult).when(KHDAOspy,"selectBySql", ArgumentMatchers.anyString(),ArgumentMatchers.any());
        List<KhoaHoc> result = KHDAOspy.selectAll();
      
        assertEquals(result, expResult);
        
      
        
    }

//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        KhoaHocDAO instance = new KhoaHocDAO();
//        List expResult = null;
//        List result = instance.selectBySql(sql, args);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSelectByChuyenDe() throws Exception {
//        System.out.println("selectByChuyenDe");
//        String macd = "123";
//        KhoaHocDAO instance = new KhoaHocDAO();
//        KhoaHoc expResult = new KhoaHoc();
//        expResult.setMaCD(macd);
//        List<KhoaHoc> list = new ArrayList<>();
//        list.add(expResult);
//        PowerMockito.doReturn(list)
//                .when(KHDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
//        List<KhoaHoc> result = KHDAOspy.selectByChuyenDe(macd);
//        assertEquals(result, expResult);
//       
// 
//    }
//
//    @Test
//    public void testSelectByChuyenDe_MaKH_String() {
//        System.out.println("selectByChuyenDe_MaKH");
//        String macd = "";
//        KhoaHocDAO instance = new KhoaHocDAO();
//        List expResult = null;
//        List result = instance.selectByChuyenDe_MaKH(macd);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSelectByChuyenDe_MaKH_0args() {
//        System.out.println("selectByChuyenDe_MaKH");
//        KhoaHocDAO instance = new KhoaHocDAO();
//        List expResult = null;
//        List result = instance.selectByChuyenDe_MaKH();
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }

//    @Test
//    public void testSelectYears() {
//        System.out.println("selectYears");
//        KhoaHocDAO instance = new KhoaHocDAO();
//        List expResult = null;
//        List result = instance.selectYears();
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
    
}
