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
public class HocVienNGTest {
    
    public HocVienNGTest() {
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
    public void testGetMaHV() {
        System.out.println("getMaHV");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaHV();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetMaHV() {
        System.out.println("setMaHV");
        int maHV = 10;
        HocVien instance = new HocVien();
        instance.setMaHV(maHV);
        int Test = instance.getMaHV();
        assertEquals(Test, maHV);
        
    }

      @Test(expectedExceptions = Exception.class)
    public void testSetMaHVNegative() {
        System.out.println("testSetMaHVNegative");
        int maHV = -10;
        HocVien instance = new HocVien();
        instance.setMaHV(maHV);
        
    }
      @Test
    public void testSetMaHVZero() {
        System.out.println("testSetMaHVZero");
        int maHV = 0;
        HocVien instance = new HocVien();
        instance.setMaHV(maHV);
          int Test = instance.getMaHV();
        assertEquals(Test, maHV);
        
    }
    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        int maKH = 10;
        HocVien instance = new HocVien();
        instance.setMaKH(maKH);
         int Test = instance.getMaKH();
        assertEquals(Test, maKH);
    }
 @Test(expectedExceptions = Exception.class)
    public void testSetMaKHNegative() {
        System.out.println("testSetMaKHNegative");
        int maKH = -10;
        HocVien instance = new HocVien();
        instance.setMaKH(maKH);
      
    }
     @Test
    public void testSetMaKHZero() {
        System.out.println("testSetMaKHZero");
        int maKH = 0;
        HocVien instance = new HocVien();
        instance.setMaKH(maKH);
         int Test = instance.getMaKH();
        assertEquals(Test, maKH);
    }
    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        HocVien instance = new HocVien();
        String expResult = null;
        String result = instance.getMaNH();
        assertEquals(result, expResult);
    
    }

    @Test
    public void testSetMaNH() {
        System.out.println("setMaNH");
        String maNH = "1111";
        HocVien instance = new HocVien();
        instance.setMaNH(maNH);
       String Test = instance.getMaNH();
        assertEquals(Test, maNH);
    }

    @Test
    public void testGetDiem() {
        System.out.println("getDiem");
        HocVien instance = new HocVien();
        Double expResult = null;
        Double result = instance.getDiem();
        assertEquals(result, expResult);
      
    }

    @Test
    public void testSetDiem() {
        System.out.println("setDiem");
        Double Diem = 0.0;
        HocVien instance = new HocVien();
        instance.setDiem(Diem);
          Double Test = instance.getDiem();
        assertEquals(Test, Diem);
    }
        @Test
    public void testSetDiemNegative() {
        System.out.println("testSetDiemNegative");
        Double Diem = 0.0;
        HocVien instance = new HocVien();
        instance.setDiem(Diem);
          Double Test = instance.getDiem();
        assertEquals(Test, Diem);
    }
        @Test
    public void testSetDiemZero() {
        System.out.println("setDiem");
        Double Diem = 0.0;
        HocVien instance = new HocVien();
        instance.setDiem(Diem);
          Double Test = instance.getDiem();
        assertEquals(Test, Diem);
    }
    
}
