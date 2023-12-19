/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author TechCare
 */
public class ChuyenDeNGTest {
    
    public ChuyenDeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getMaCD();
        assertEquals(result, expResult);

    }

    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String MaCD = "CD001";
        ChuyenDe instance = new ChuyenDe();
        instance.setMaCD(MaCD);
        String MaCDTest = "CD001";
        assertEquals(MaCDTest, instance.getMaCD());
    }

    @Test
    public void testGetTenCD() {
        System.out.println("getTenCD");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getTenCD();
        assertEquals(result, expResult);
      
    }

    @Test
    public void testSetTenCD() {
        System.out.println("setTenCD");
        String TenCD = "CD001";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenCD(TenCD);
      String TenCDTest = "CD001";
        assertEquals(TenCDTest, instance.getTenCD());
    }

    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        ChuyenDe instance = new ChuyenDe();
        Double expResult = null;
        Double result = instance.getHocPhi();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetHocPhiWithZero() {
        System.out.println("setHocPhi");
        double HocPhi = 0.0;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(HocPhi);
        double HocPhiTest = instance.getHocPhi();
        assertEquals(HocPhi, HocPhiTest);
    }

      @Test
    public void testSetHocPhiWithPostive() {
        System.out.println("setHocPhi");
        double HocPhi = 10.0;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(HocPhi);
        double HocPhiTest = instance.getHocPhi();
        assertEquals(HocPhi, HocPhiTest);
    }
    
      @Test(expectedExceptions = Exception.class)
    public void testSetHocPhiWithNegative() {
        System.out.println("setHocPhi");
        double HocPhi = -10.0;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(HocPhi);
  
    }
    
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        ChuyenDe instance = new ChuyenDe();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetThoiLuongWithZero() {
        System.out.println("setThoiLuong");
        int ThoiLuong = 0;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(ThoiLuong);
       int ThoiLuongTest = instance.getThoiLuong();
        assertEquals(ThoiLuong, ThoiLuongTest);
    }
      @Test
    public void testSetThoiLuongWitthPostive() {
        System.out.println("setThoiLuong");
        int ThoiLuong = 10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(ThoiLuong);
       int ThoiLuongTest = instance.getThoiLuong();
        assertEquals(ThoiLuong, ThoiLuongTest);
    }
      @Test(expectedExceptions = Exception.class)
    public void testSetThoiLuongWithNegative() {
        System.out.println("setThoiLuong");
        int ThoiLuong = -10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(ThoiLuong);
       
    }

    @Test
    public void testGetHinh() {
        System.out.println("getHinh");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getHinh();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        String Hinh = "123";
        ChuyenDe instance = new ChuyenDe();
        instance.setHinh(Hinh);
      String HinhTest = instance.getHinh();
        assertEquals(Hinh, HinhTest);
    }

    @Test
    public void testGetMoTa() {
        System.out.println("getMoTa");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getMoTa();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetMoTa() {
        System.out.println("setMoTa");
        String MoTa = "oke";
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(MoTa);
      String Test = instance.getMoTa();
        assertEquals(MoTa, Test);
    }

//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        ChuyenDe instance = new ChuyenDe();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object obj = null;
//        ChuyenDe instance = new ChuyenDe();
//        boolean expResult = false;
//        boolean result = instance.equals(obj);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
    
}
