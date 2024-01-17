/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package repositorys;

import domainmodel.NhanVienDomainModel;
import java.sql.Blob;
import java.sql.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttuan
 */
public class NhanVienRepositoryTest {
    NhanVienRepository repo = new NhanVienRepository();
    
    @Test
    public void testGetByIdAccount() {
    }

    @Test
    public void testGetMaNhanVienByEmail() {
    }

    @Test
    public void testCheckEmail() {
    }

    @Test
    public void testGetAll_intArr() {
    }

    @Test
    public void testGetById() {
    }

    @Test
    public void testInsert() {
    }

    @Test
    public void testUpdate_NhanVienDomainModel() {
    }

    @Test
    public void testDeleteById() {
    }

    @Test
    public void testGetBySql() {
    }

    @Test
    public void testGetAll_0args() {
    }
    //Thêm thành công với ảnh trống
    @Test    
    public void testInsertNhanVien() {      
        NhanVienDomainModel nv= new NhanVienDomainModel(0, "Tuấn Anh",Date.valueOf("2003-05-02"), 
   "Nghệ An", "012345675673", 1, "tuqsdnh@gmail.com", "0538736689","Nhiệt huyết",null, "Nhân viên");
        boolean thuc= repo.insertNhanVien(nv);
        boolean mong= true;
        assertEquals(thuc, mong);
    }
    //Thêm thất bại với email đã tồn tại
    @Test    
    public void testInsertNhanVien1() {      
        NhanVienDomainModel nv= new NhanVienDomainModel(0, "Tuấn Anh",Date.valueOf("2003-05-02"), 
    "Nghệ An", "012345675671", 1, "tuqsdnh@gmail.com", "0538736681","Nhiệt huyết",null, "Nhân viên");
        boolean thuc= repo.insertNhanVien(nv);
        boolean mong= true;
        assertEquals(thuc, mong);
    }
    //Thêm thất bại với CCCD đã tồn tại
    @Test    
    public void testInsertNhanVien2() {      
        NhanVienDomainModel nv= new NhanVienDomainModel(0, "Tuấn Anh",Date.valueOf("2003-05-02"), 
   "Nghệ An", "012345675673", 1, "tuqsdnh1@gmail.com", "0538736681","Nhiệt huyết",null, "Nhân viên");
        boolean thuc= repo.insertNhanVien(nv);
        boolean mong= true;
        assertEquals(thuc, mong);
    }

    @Test
    public void testLoadMouseClick() {
    }

    @Test
    public void testUpdate_int_NhanVienDomainModel() {
    }

    @Test
    public void testCheckTrungEmail() {
    }

    @Test
    public void testGetNhanVienById() {
    }

    @Test
    public void testGetNhanVienByTen() {
    }

    @Test
    public void testGetNhanVienByTrangThai() {
    }

    @Test
    public void testGetNhanVienByCCCD() {
    }

    @Test
    public void testGetSoDienThoaiBySDT() {
    }

    private byte[] getImageDataFrom(ImageIcon icon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Blob createBlobFromImageData(byte[] imageData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
