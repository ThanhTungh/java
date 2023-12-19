/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NhanVien;
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
@PrepareForTest({JdbcHelper.class, NhanVienDAO.class})
public class NhanVienDAONGTest {
       NhanVienDAO NVDAO;
   NhanVienDAO NVDAOspy;
    public NhanVienDAONGTest() {
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
           NVDAO = new NhanVienDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        NVDAOspy = PowerMockito.spy(new NhanVienDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertNull() {
        System.out.println("insertNull");
        NhanVien entity = null;
        NVDAO.insert(entity);
      
    }
    @Test
    public void testInsertEmpty() {
        System.out.println("insertEmpty");
        NhanVien entity = new NhanVien();
        NVDAO.insert(entity);
      
    }
        @Test
    public void testInsertVali() {
        System.out.println("insertVali");
        NhanVien entity = new NhanVien();
        entity.setHoTen("ntdat");
        entity.setMaNV("nv001");
        entity.setMatKhau("123123");
        entity.setVaiTro(true);
        NVDAO.insert(entity);
      
    }
 @Test(expectedExceptions = Exception.class)
    public void testUpdateNull() {
        System.out.println("insertNull");
        NhanVien entity = null;
        NVDAO.update(entity);
      
    }
    @Test
    public void testUpdateEmpty() {
        System.out.println("insertEmpty");
        NhanVien entity = new NhanVien();
        NVDAO.update(entity);
      
    }
        @Test
    public void testUpdateVali() {
        System.out.println("insertVali");
        NhanVien entity = new NhanVien();
        entity.setHoTen("ntdat");
        entity.setMaNV("nv001");
        entity.setMatKhau("123123");
        entity.setVaiTro(true);
        NVDAO.update(entity);
      
    }

   @Test
    public void testDeleteNull() {
        System.out.println("deleteNull");
        String id = null;
        NVDAO.delete(id);

    }
    @Test
    public void testDeleteEmpty() {
        System.out.println("deleteEmpty");
        NhanVien cd = new NhanVien();
        String id = cd.getMaNV();
        NVDAO.delete(id);
        }
 @Test
    public void testDeleteVali() {
        System.out.println("deleteVali");
        NhanVien cd = new NhanVien();
        cd.setMaNV("09");
        String id = cd.getMaNV();
        NVDAO.delete(id);

    }

       @Test
    public void testSelectById() throws Exception {
 System.out.println("selectById");
        String id = "13";
       
        NhanVien expResult = new NhanVien();
        expResult.setMaNV((id));
         List<NhanVien> list = new ArrayList<>();
        list.add(expResult);
        PowerMockito.doReturn(list)
                .when(NVDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        NhanVien result = NVDAOspy.selectById(id);
        assertEquals(result, expResult);
    }

    @Test
    public void testSelectAll() throws Exception {
   System.out.println("selectAll");
        ChuyenDeDAO instance = new ChuyenDeDAO();
         NhanVien model = new NhanVien();
        List<NhanVien> expResult = new ArrayList<>();
        expResult.add(model);
        PowerMockito.doReturn(expResult).when(NVDAOspy,"selectBySql", ArgumentMatchers.anyString(),ArgumentMatchers.any());
        List<NhanVien> result = NVDAOspy.selectAll();
      
        assertEquals(result, expResult);
    }

//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        NhanVienDAO instance = new NhanVienDAO();
//        List expResult = null;
//        List result = instance.selectBySql(sql, args);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
    
}
