/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAn;
import java.util.Scanner;

public class BSChuyenKhoa extends BacSi {
    private long phuCap;
    
    @Override
    public long TinhLuong(){
        return luongCB + phuCap;
    }

    public BSChuyenKhoa() {
        super();
        phuCap = 0;
    }

    public BSChuyenKhoa(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, BoPhan bp, int nhanVien_type, String chuyenNganh, long phuCap) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, bp, nhanVien_type, chuyenNganh);
        this.phuCap = phuCap;
    }
    
    public BSChuyenKhoa(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, String maBoPhan, String tenBoPhan, int nhanVien_type, String chuyenNganh, long phuCap) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, maBoPhan, tenBoPhan, nhanVien_type, chuyenNganh);
        this.phuCap = phuCap;
    }

    public BSChuyenKhoa(BSChuyenKhoa obj) {
        super(obj);
        this.phuCap = obj.phuCap;
    }

    public long getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(long phuCap) {
        this.phuCap = phuCap;
    }

    

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tien phu cap: ");
        phuCap = scanner.nextLong();
    }

    @Override
    public void Output() {
        super.Output(); // Gọi phương thức Output() của lớp cha để hiển thị thông tin cơ bản
        System.out.format("%20d|Luong: %d\n", phuCap, TinhLuong());
    }
}

