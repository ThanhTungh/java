/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HocVien;
import Utils.JdbcHelper;
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
@PrepareForTest({JdbcHelper.class, HocVienDAO.class})
public class HocVienDAONGTest {
     HocVienDAO HVDAO;
   HocVienDAO HVDAOspy;
    public HocVienDAONGTest() {
    }
 @ObjectFactory
    public IObjectFactory getObjectFactory() {
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
        HVDAO = new HocVienDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        HVDAOspy = PowerMockito.spy(new HocVienDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsert() {
        System.out.println("insert");
        HocVien entity = null;
        HVDAO.insert(entity);
      
    }
        @Test
    public void testInsertEmpty() {
        System.out.println("InsertEmpty");
        HocVien entity = new HocVien();
        HVDAO.insert(entity);
      
    }
        @Test
    public void testInsertVali() {
        System.out.println("InsertVali");
        HocVien entity = new HocVien();
        entity.setDiem(9.0);
        entity.setMaHV(2);
        entity.setMaKH(3);
        entity.setMaNH("CNTT");
        HVDAO.insert(entity);
      
    }

    @Test(expectedExceptions = Exception.class)
    public void testUpdateNull() {
        System.out.println("updateNull");
        HocVien entity = null;
        HVDAO.update(entity);
       
    }
    @Test
    public void testUpdateEmpty() {
        System.out.println("updateEmpty");
        HocVien entity = new  HocVien();
        HVDAO.update(entity);
       
    }
    @Test
    public void testUpdateVali() {
        System.out.println("updateVali");
        HocVien entity = new  HocVien();
        entity.setDiem(9.0);
        entity.setMaHV(2);
        entity.setMaKH(3);
        entity.setMaNH("CNTT");
        HVDAO.update(entity);
       
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = null;
       
        HVDAO.delete(id);
      
    }
 @Test
    public void testDeleteEmpty() {
        System.out.println("deleteEmpty");
       HocVien hv = new HocVien();
        String id =String.valueOf(hv.getMaHV());
        HVDAO.delete(id);
      
    }
     @Test
    public void testDeleteVali() {
        System.out.println("deleteVali");
        HocVien hv = new HocVien();
        hv.setMaHV(3);
        String id =String.valueOf(hv.getMaHV());
        HVDAO.delete(id);
      
    }
    @Test
    public void testSelectById() throws Exception {
       System.out.println("selectById");
        String id = "12";
        HocVienDAO instance = new HocVienDAO();
        HocVien expResult = new HocVien();
        expResult.setMaHV(Integer.parseInt(id));
         List<HocVien> list = new ArrayList<>();
        list.add(expResult);
        PowerMockito.doReturn(list)
                .when(HVDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        HocVien result = HVDAOspy.selectById(id);
        assertEquals(result, expResult);
    }
@Test
    public void testSelectByIdNotFound() throws Exception {
        System.out.println("selectByIdNotFound");
        String id = "12";
        HocVienDAO instance = new HocVienDAO();
        HocVien expResult = null;
        List<HocVien> list = new ArrayList<>();
        PowerMockito.doReturn(list)
                .when(HVDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        HocVien result = HVDAOspy.selectById(id);
        assertEquals(result, expResult);
      
    }
    @Test
    public void testSelectAll() throws Exception {
                  System.out.println("selectAll");
        ChuyenDeDAO instance = new ChuyenDeDAO();
         HocVien model = new HocVien();
        List<HocVien> expResult = new ArrayList<>();
        expResult.add(model);
        PowerMockito.doReturn(expResult).when(HVDAOspy,"selectBySql", ArgumentMatchers.anyString(),ArgumentMatchers.any());
        List<HocVien> result = HVDAOspy.selectAll();
      
        assertEquals(result, expResult);
    }

//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        HocVienDAO instance = new HocVienDAO();
//        List expResult = null;
//        List result = instance.selectBySql(sql, args);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSelectByKhoaHoc() {
//        System.out.println("selectByKhoaHoc");
//        int makh = 0;
//        HocVienDAO instance = new HocVienDAO();
//        List expResult = null;
//        List result = instance.selectByKhoaHoc(makh);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
//    
}
