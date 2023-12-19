/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.NguoiHoc;
import Utils.JdbcHelper;
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
@PrepareForTest({JdbcHelper.class, NguoiHocDAO.class})
public class NguoiHocDAONGTest {
      NguoiHocDAO NHDAO;
   NguoiHocDAO NHDAOspy;
    public NguoiHocDAONGTest() {
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
           NHDAO = new NguoiHocDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        NHDAOspy = PowerMockito.spy(new NguoiHocDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsert() {
        System.out.println("insert");
        NguoiHoc entity = null;
        NHDAO.insert(entity);
    
    }
     @Test
    public void testInsertEmpty() {
        System.out.println("insertEmpty");
        NguoiHoc entity = new NguoiHoc();
        NHDAO.insert(entity);
    
    }
     @Test
    public void testInsertVali() {
        System.out.println("insertVali");
        NguoiHoc entity = new NguoiHoc();
        entity.setDienThoai("0987654321");
        entity.setEmail("datnt@gmail.com");
        entity.setGhiChu("hoc hanh cham chi");
        entity.setGioiTinh(true);
        entity.setHoTen("nt dat");
        entity.setMaNH("NH001");
        entity.setMaNV("NV002");
        entity.setNgayDK(Date.valueOf("2020-01-20"));
        entity.setNgaySinh(Date.valueOf("2020-01-20"));
        NHDAO.insert(entity);
    
    }

    @Test(expectedExceptions = Exception.class)
    public void testUpdate() {
        System.out.println("update");
        NguoiHoc entity = null;
        NHDAO.update(entity);
        
    }
    @Test
    public void testUpdateEmpty() {
        System.out.println("updateEmpty");
        NguoiHoc entity = new NguoiHoc();
        NHDAO.update(entity);
        
    }
        @Test
    public void testUpdateVali() {
        System.out.println("updateVali");
        NguoiHoc entity = new NguoiHoc();
        entity.setDienThoai("0987654321");
        entity.setEmail("datnt@gmail.com");
        entity.setGhiChu("hoc hanh cham chi");
        entity.setGioiTinh(true);
        entity.setHoTen("nt dat");
        entity.setMaNH("NH001");
        entity.setMaNV("NV002");
        entity.setNgayDK(Date.valueOf("2020-01-20"));
        entity.setNgaySinh(Date.valueOf("2020-01-20"));
        NHDAO.update(entity);
        
    }

@Test
    public void testDeleteNull() {
        System.out.println("deleteNull");
        String id = null;
        NHDAO.delete(id);

    }
    @Test
    public void testDeleteEmpty() {
        System.out.println("deleteEmpty");
        NguoiHoc cd = new NguoiHoc();
        String id = cd.getMaNH();
        NHDAO.delete(id);
        }
 @Test
    public void testDeleteVali() {
        System.out.println("deleteVali");
        NguoiHoc cd = new NguoiHoc();
        cd.setMaNH("09");
        String id = cd.getMaNH();
        NHDAO.delete(id);

    }
    @Test
    public void testSelectById() throws Exception {
 System.out.println("selectById");
        String id = "13";
      
        NguoiHoc expResult = new NguoiHoc();
        expResult.setMaNH((id));
         List<NguoiHoc> list = new ArrayList<>();
        list.add(expResult);
        PowerMockito.doReturn(list)
                .when(NHDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        NguoiHoc result = NHDAOspy.selectById(id);
        assertEquals(result, expResult);
    }

    @Test
    public void testSelectAll() throws Exception {
       
                System.out.println("selectAll");
        ChuyenDeDAO instance = new ChuyenDeDAO();
         NguoiHoc model = new NguoiHoc();
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(model);
        PowerMockito.doReturn(expResult).when(NHDAOspy,"selectBySql", ArgumentMatchers.anyString(),ArgumentMatchers.any());
        List<NguoiHoc> result = NHDAOspy.selectAll();
      
        assertEquals(result, expResult);
    }

//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        NguoiHocDAO instance = new NguoiHocDAO();
//        List expResult = null;
//        List result = instance.selectBySql(sql, args);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSelectByKeyword() {
//        System.out.println("selectByKeyword");
//        String keyword = "";
//        NguoiHocDAO instance = new NguoiHocDAO();
//        List expResult = null;
//        List result = instance.selectByKeyword(keyword);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSelectNotInCourse() {
//        System.out.println("selectNotInCourse");
//        int makh = 0;
//        String keyword = "";
//        NguoiHocDAO instance = new NguoiHocDAO();
//        List expResult = null;
//        List result = instance.selectNotInCourse(makh, keyword);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
    
}
