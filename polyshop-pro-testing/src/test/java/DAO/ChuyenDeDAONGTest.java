/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ChuyenDe;
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
@PrepareForTest({JdbcHelper.class, ChuyenDeDAO.class})
public class ChuyenDeDAONGTest {

    ChuyenDeDAO CDDAO;
    ChuyenDeDAO CDDAOspy;

    public ChuyenDeDAONGTest() {
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
        CDDAO = new ChuyenDeDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        CDDAOspy = PowerMockito.spy(new ChuyenDeDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertNull() {
        System.out.println("insertNull");
        ChuyenDe entity = null;
   
        CDDAO.insert(entity);

    }

    @Test
    public void testInsertEmpty() {
        System.out.println("insertEmpty");
        ChuyenDe entity2 = new ChuyenDe();
         
        CDDAO.insert(entity2);

    }

    @Test
    public void testInsertVali() {
        System.out.println("insertVali");
        ChuyenDe entity = new ChuyenDe();
        entity.setHinh("a.jpg");
        entity.setHocPhi(100.0);
        entity.setMaCD("cd001");
        entity.setMoTa("khoa hoc mo ta");
        entity.setTenCD("chuyen de ten");
        entity.setThoiLuong(200);
      
         CDDAO.insert(entity);

    }

    @Test(expectedExceptions = Exception.class)
    public void testUpdateNull() {
        System.out.println("updateNull");
        ChuyenDe entity = null;
      
        CDDAO.update(entity);

    }

    @Test
    public void testUpdateEmpty() {
        System.out.println("updateEmpty");
        ChuyenDe entity = new ChuyenDe();
        
        CDDAO.update(entity);

    }

    @Test
    public void testUpdateVali() {
        System.out.println("updateVali");
        ChuyenDe entity = new ChuyenDe();
        entity.setHinh("a.jpg");
        entity.setHocPhi(100.0);
        entity.setMaCD("cd001");
        entity.setMoTa("khoa hoc mo ta");
        entity.setTenCD("chuyen de ten");
        entity.setThoiLuong(200);
        
        CDDAO.update(entity);

    }

    @Test
    public void testDeleteNull() {
        System.out.println("deleteNull");
        String id = null;
        CDDAO.delete(id);

    }
    @Test
    public void testDeleteEmpty() {
        System.out.println("deleteEmpty");
        ChuyenDe cd = new ChuyenDe();
        String id = cd.getMaCD();
        CDDAO.delete(id);
        }
 @Test
    public void testDeleteVali() {
        System.out.println("deleteVali");
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD("09");
        String id = cd.getMaCD();
        CDDAO.delete(id);

    }
    @Test
    public void testSelectById() throws Exception {
        System.out.println("selectById");
        String id = "13";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        ChuyenDe expResult = new ChuyenDe();
        expResult.setMaCD((id));
         List<ChuyenDe> list = new ArrayList<>();
        list.add(expResult);
        PowerMockito.doReturn(list)
                .when(CDDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        ChuyenDe result = CDDAOspy.selectById(id);
        assertEquals(result, expResult);
         
    }
@Test
    public void testSelectByIdNotFound() throws Exception {
        System.out.println("selectByIdNotFound");
        String id = "12";
        KhoaHocDAO instance = new KhoaHocDAO();
        ChuyenDe expResult = null;
        List<ChuyenDe> list = new ArrayList<>();
        PowerMockito.doReturn(list)
                .when(CDDAOspy,"selectBySql",ArgumentMatchers.anyString(),ArgumentMatchers.any());
        ChuyenDe result = CDDAOspy.selectById(id);
        assertEquals(result, expResult);
      
    }
    @Test
    public void testSelectAll() throws Exception {

                System.out.println("selectAll");
        ChuyenDeDAO instance = new ChuyenDeDAO();
         ChuyenDe model = new ChuyenDe();
        List<ChuyenDe> expResult = new ArrayList<>();
        expResult.add(model);
        PowerMockito.doReturn(expResult).when(CDDAOspy,"selectBySql", ArgumentMatchers.anyString(),ArgumentMatchers.any());
        List<ChuyenDe> result = CDDAOspy.selectAll();
      
        assertEquals(result, expResult);
       
    }

//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        ChuyenDeDAO instance = new ChuyenDeDAO();
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
//        ChuyenDeDAO instance = new ChuyenDeDAO();
//        List expResult = null;
//        List result = instance.selectByKeyword(keyword);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }

}
