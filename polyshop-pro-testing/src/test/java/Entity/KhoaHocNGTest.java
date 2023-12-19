/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;
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
public class KhoaHocNGTest {
    
    public KhoaHocNGTest() {
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
    public void testGetMaKH() {
        System.out.println("getMaKH");
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetMaKHZero() {
        System.out.println("testSetMaKHZero");
        int maKH = 0;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaKH(maKH);
       int Test = instance.getMaKH();
        assertEquals(Test, maKH);
    }
 @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        int maKH = 10;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaKH(maKH);
       int Test = instance.getMaKH();
        assertEquals(Test, maKH);
    }
     @Test(expectedExceptions = Exception.class)
    public void testSetMaKHNegative() {
        System.out.println("setMaKH");
        int maKH = -10;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaKH(maKH);
    
    }
    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
        String result = instance.getMaCD();
        assertEquals(result, expResult);
   
    }

    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String maCD = "CD001";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaCD(maCD);
     String Test = instance.getMaCD();
        assertEquals(maCD, Test);
    }

    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        KhoaHoc instance = new KhoaHoc();
        Double expResult = null;
        Double result = instance.getHocPhi();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetHocPhi() {
        System.out.println("setHocPhi");
        Double hocPhi = 10.0;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
       Double test = instance.getHocPhi();
        assertEquals(hocPhi, test);
    }

      @Test
    public void testSetHocPhiZero() {
        System.out.println("setHocPhi");
        Double hocPhi = 0.0;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
       Double test = instance.getHocPhi();
        assertEquals(hocPhi, test);
    }
      @Test(expectedExceptions = Exception.class)
    public void testSetHocPhiNegative() {
        System.out.println("setHocPhi");
        Double hocPhi = -10.0;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
     
    }
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(result, expResult);
      
    }

    @Test
    public void testSetThoiLuong() {
        System.out.println("setThoiLuong");
        int thoiLuong = 10;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
        int Test = instance.getThoiLuong();
        assertEquals(Test, thoiLuong);
    }
    @Test(expectedExceptions = Exception.class)
    public void testSetThoiLuongNegative() {
        System.out.println("setThoiLuong");
        int thoiLuong = -10;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
  
    }
    @Test
    public void testSetThoiLuongZero() {
        System.out.println("setThoiLuong");
        int thoiLuong = 0;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
        int Test = instance.getThoiLuong();
        assertEquals(Test, thoiLuong);
    }

    @Test
    public void testGetNgayKG() {
        System.out.println("getNgayKG");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayKG();
        assertEquals(result, expResult);
       
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetNgayKG() {
        System.out.println("setNgayKG");
        Date ngayKG = Date.valueOf("21-01-2010");
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayKG(ngayKG);
        Date Test = instance.getNgayKG();
        assertEquals(ngayKG, Test);
    }

    @Test
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
        String result = instance.getGhiChu();
        assertEquals(result, expResult);
      
    }

    @Test
    public void testSetGhiChu() {
        System.out.println("setGhiChu");
        String ghiChu = "123";
        KhoaHoc instance = new KhoaHoc();
        instance.setGhiChu(ghiChu);
        String Test = instance.getGhiChu();
        assertEquals(ghiChu, Test);
       
    }

    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        KhoaHoc instance = new KhoaHoc();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(result, expResult);
     
    }

    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "123";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaNV(maNV);
        String test = instance.getMaNV();
        assertEquals(test, maNV);
    }

    @Test
    public void testGetNgayTao() {
        System.out.println("getNgayTao");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayTao();
        assertEquals(result, expResult);
        
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetNgayTao() {
        System.out.println("setNgayTao");
        Date ngayTao = Date.valueOf("21-12-2020");
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayTao(ngayTao);
      Date test = instance.getNgayTao();
        assertEquals(test, ngayTao);
    }
    
}
