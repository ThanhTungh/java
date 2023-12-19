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
public class NguoiHocNGTest {
    
    public NguoiHocNGTest() {
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
    public void testGetMaNH() {
        System.out.println("getMaNH");
        NguoiHoc instance = new NguoiHoc();
        String expResult = null;
        String result = instance.getMaNH();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetMaNH() {
        System.out.println("setMaNH");
        String maNH = "NH001";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNH(maNH);
        String Test = instance.getMaNH();
        assertEquals(maNH, Test);
    }

    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        NguoiHoc instance = new NguoiHoc();
        String expResult = null;
        String result = instance.getHoTen();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "ntdat";
        NguoiHoc instance = new NguoiHoc();
        instance.setHoTen(hoTen);
         String Test = instance.getHoTen();
        assertEquals(hoTen, Test);
    }

    @Test
    public void testGetGioiTinh() {
        System.out.println("getGioiTinh");
        NguoiHoc instance = new NguoiHoc();
        Boolean expResult = true;
        Boolean result = instance.getGioiTinh();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetGioiTinh() {
        System.out.println("setGioiTinh");
        Boolean gioiTinh = true;
        NguoiHoc instance = new NguoiHoc();
        instance.setGioiTinh(gioiTinh);
        
        assertTrue(gioiTinh);
    }

    @Test
    public void testGetNgaySinh() {
        System.out.println("getNgaySinh");
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgaySinh();
        assertEquals(result, expResult);
       
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetNgaySinh() {
        System.out.println("setNgaySinh");
        Date ngaySinh = Date.valueOf("20-02-2012");
        NguoiHoc instance = new NguoiHoc();
        instance.setNgaySinh(ngaySinh);
        Date test = instance.getNgaySinh();
        assertEquals(ngaySinh, test);
      
    }

    @Test
    public void testGetDienThoai() {
        System.out.println("getDienThoai");
        NguoiHoc instance = new NguoiHoc();
        String expResult = null;
        String result = instance.getDienThoai();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetDienThoai() {
        System.out.println("setDienThoai");
        String dienThoai = "0987654321";
        NguoiHoc instance = new NguoiHoc();
        instance.setDienThoai(dienThoai);
         String Test = instance.getDienThoai();
        assertEquals(dienThoai, Test);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        NguoiHoc instance = new NguoiHoc();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(result, expResult);
      
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "gatadsw@gmail.com";
        NguoiHoc instance = new NguoiHoc();
        instance.setEmail(Email);
         String Test = instance.getEmail();
        assertEquals(Email, Test);
    }

    @Test
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
        NguoiHoc instance = new NguoiHoc();
        String expResult = null;
        String result = instance.getGhiChu();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetGhiChu() {
        System.out.println("setGhiChu");
        String ghiChu = "asdasd";
        NguoiHoc instance = new NguoiHoc();
        instance.setGhiChu(ghiChu);
         String Test = instance.getGhiChu();
        assertEquals(ghiChu, Test);
    }

    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NguoiHoc instance = new NguoiHoc();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(result, expResult);
      
    }

    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "NV001";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNV(maNV);
          String Test = instance.getMaNV();
        assertEquals(maNV, Test);
    }

    @Test
    public void testGetNgayDK() {
        System.out.println("getNgayDK");
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgayDK();
        assertEquals(result, expResult);
        
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetNgayDK() {
        System.out.println("setNgayDK");
        Date ngayDK = Date.valueOf("02-02-2020");
        NguoiHoc instance = new NguoiHoc();
        instance.setNgayDK(ngayDK);
          Date Test = instance.getNgayDK();
        assertEquals(ngayDK, Test);
    }
    
}
