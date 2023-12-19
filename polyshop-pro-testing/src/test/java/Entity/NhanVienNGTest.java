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
public class NhanVienNGTest {
    
    public NhanVienNGTest() {
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
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "nv001";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
       String Test = instance.getMaNV();
        assertEquals(maNV, Test);
    }

    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getMatKhau();
        assertEquals(result, expResult);
       
    }

    @Test
    public void testSetMatKhau() {
        System.out.println("setMatKhau");
        String matKhau = "123123";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
          String Test = instance.getMatKhau();
        assertEquals(matKhau, Test);
    }

    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getHoTen();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "ntdat";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen);
          String Test = instance.getHoTen();
        assertEquals(hoTen, Test);
    }

    @Test
    public void testGetVaiTro() {
        System.out.println("getVaiTro");
        NhanVien instance = new NhanVien();
        Boolean expResult = true;
        Boolean result = instance.getVaiTro();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        Boolean vaiTro = false;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
        
        assertFalse(vaiTro);
    }
    
}
