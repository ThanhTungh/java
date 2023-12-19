/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utils.JdbcHelper;
import com.mockrunner.mock.jdbc.MockConnection;
import com.mockrunner.mock.jdbc.MockResultSet;
import com.mockrunner.mock.jdbc.MockStatement;
import java.util.List;

import static org.junit.Assert.*;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author ADMIN
 */
@PrepareForTest({JdbcHelper.class, ThongKeDAO.class})
public class ThongKeDAONGTest extends PowerMockTestCase{
    
    ThongKeDAO daoSpy;
    
    @Mock
    MockConnection connection;
    @Mock
    MockStatement statement;
    @Spy
    @InjectMocks
    MockResultSet rs = new MockResultSet("myMock");
    
    public ThongKeDAONGTest() {
    }
    @ObjectFactory
    public IObjectFactory getObjectFactory(){
    return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
    @BeforeMethod
    public void setUp() {
        PowerMockito.mockStatic(JdbcHelper.class);
        daoSpy = PowerMockito.spy(new ThongKeDAO());
        connection = PowerMockito.mock(MockConnection.class);
        statement = PowerMockito.mock(MockStatement.class);
        rs = PowerMockito.mock(MockResultSet.class);
    }
    
    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testGetBangDiem() throws Exception {
        System.out.println("Bang Diem");
        int maKH = 5;
        
        rs = initMockBDResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(), ArgumentMatchers.any()))
                .thenReturn(rs);
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getBangDiem(maKH);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetBangDiemWithMultiValid() throws Exception {
        System.out.println("Bang Diem Multi Valid");
        int maKH = 5;
        
        rs = initMockBDMultiValidResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(), ArgumentMatchers.any()))
                .thenReturn(rs);
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getBangDiem(maKH);
        assertEquals(3, result.size());
    }

    @Test
    public void testGetLuongNguoiHoc() throws Exception {
        System.out.println("Luong Nguoi Hoc");
        
        rs = initMockNgHResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(),ArgumentMatchers.any()))
            .thenReturn(rs);   
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getLuongNguoiHoc();
        assertEquals(1, result.size());
    }

    @Test
    public void testGetLuongNguoiHocWithMultiValid() throws Exception {
        System.out.println("Luong Nguoi Hoc Multi Valid");
        
        rs = initMockNgHMultiValidResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(), ArgumentMatchers.any()))
            .thenReturn(rs);   
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getLuongNguoiHoc();
        assertEquals(4, result.size());
    }

    @Test
    public void testGetDiemChuyenDe() throws Exception {
        System.out.println("Diem Chuyen De");
        
        rs = initMockCDResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(), ArgumentMatchers.any()))
                .thenReturn(rs);
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getDiemChuyenDe();
        assertEquals(1, result.size());
    }

    @Test
    public void testGetDiemChuyenDeWithMultiValid() throws Exception {
        System.out.println("Diem Chuyen De Multi Valid");
        
        rs = initMockCDMultiValidResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(), ArgumentMatchers.any()))
                .thenReturn(rs);
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getDiemChuyenDe();
        assertEquals(3, result.size());
    }

    @Test
    public void testGetDoanhThu() throws Exception {
        System.out.println("Doanh Thu");
        int year = 2020;
        
        rs = initMockDTResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(), ArgumentMatchers.any()))
                .thenReturn(rs);
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getDoanhThu(year);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetDoanhThuWithMultiValid() throws Exception {
        System.out.println("Doanh Thu Multi Valid");
        int year = 2021;
        
        rs = initMockDTMultiValidResultSet();
        
        PowerMockito.when(JdbcHelper.query(ArgumentMatchers.anyString(), ArgumentMatchers.any()))
                .thenReturn(rs);
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = daoSpy.getDoanhThu(year);
        assertEquals(3, result.size());
    }

    private MockResultSet initMockNgHResultSet() throws Exception {
        rs.addColumn("Nam", new Integer[]{1}
        );
        rs.addColumn("SoLuong", new Integer[]{5}
        );
        rs.addColumn("DauTien", new java.sql.Date[]{
               new java.sql.Date(new java.util.Date().getTime())
        });
        rs.addColumn("CuoiCung", new java.sql.Date[]{
               new java.sql.Date(new java.util.Date().getTime())
        });
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockNgHMultiValidResultSet() throws Exception {
        rs.addColumn("Nam", new Integer[]{1,3,5,7}
        );
        rs.addColumn("SoLuong", new Integer[]{5,7,9,11}
        );
        rs.addColumn("DauTien", new java.sql.Date[]{
               new java.sql.Date(new java.util.Date().getTime()),
               new java.sql.Date(new java.util.Date().getTime()),
               new java.sql.Date(new java.util.Date().getTime()),
               new java.sql.Date(new java.util.Date().getTime())
        });
        rs.addColumn("CuoiCung", new java.sql.Date[]{
               new java.sql.Date(new java.util.Date().getTime()),
               new java.sql.Date(new java.util.Date().getTime()),
               new java.sql.Date(new java.util.Date().getTime()),
               new java.sql.Date(new java.util.Date().getTime())
        });
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockCDResultSet() throws Exception {
        rs.addColumn("ChuyenDe", new Object[]{1}
        );
        rs.addColumn("SoHV", new Object[]{5}
        );
        rs.addColumn("ThapNhat", new Object[]{3}
        );
        rs.addColumn("CaoNhat", new Object[]{10}
        );
        rs.addColumn("TrungBinh", new Object[]{5.5}
        );
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockCDMultiValidResultSet() throws Exception {
        rs.addColumn("ChuyenDe", new Object[]{1,5,10}
        );
        rs.addColumn("SoHV", new Object[]{5,25,125}
        );
        rs.addColumn("ThapNhat", new Object[]{3,1,2}
        );
        rs.addColumn("CaoNhat", new Object[]{10,9.5,10}
        );
        rs.addColumn("TrungBinh", new Object[]{5.5,6.8,5.2}
        );
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockDTResultSet() throws Exception{
        rs.addColumn("ChuyenDe", new Object[]{1}
        );
        rs.addColumn("SoKH", new Object[]{5}
        );
        rs.addColumn("SoHV", new Object[]{3}
        );
        rs.addColumn("DoanhThu", new Object[]{100000000}
        );
        rs.addColumn("ThapNhat", new Object[]{1400000}
        );
        rs.addColumn("CaoNhat", new Object[]{21000000}
        );
        rs.addColumn("TrungBinh", new Object[]{12550000}
        );
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockDTMultiValidResultSet() throws Exception{
        rs.addColumn("ChuyenDe", new Object[]{1,5,10}
        );
        rs.addColumn("SoKH", new Object[]{5,25,125}
        );
        rs.addColumn("SoHV", new Object[]{3,1,2}
        );
        rs.addColumn("DoanhThu", new Object[]{100000000, 120000000, 110000000}
        );
        rs.addColumn("ThapNhat", new Object[]{1400000,1600000, 1800000}
        );
        rs.addColumn("CaoNhat", new Object[]{21000000, 22500000, 26500000}
        );
        rs.addColumn("TrungBinh", new Object[]{12550000,13250000, 11000000}
        );
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockBDResultSet() throws Exception{
        rs.addColumn("MaNH", new Object[]{1}
        );
        rs.addColumn("HoTen", new Object[]{"KienTv"}
        );
        rs.addColumn("Diem", new Object[]{8}
        );
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockBDMultiValidResultSet() throws Exception{
        rs.addColumn("MaNH", new Object[]{1,5,10}
        );
        rs.addColumn("HoTen", new Object[]{"KienTv","HuyHn","DungLva"}
        );
        rs.addColumn("Diem", new Object[]{8,9,10}
        );
        rs.beforeFirst();
        return rs;
    }
    
}
