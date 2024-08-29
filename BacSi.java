package DoAn;

import java.util.*;

public class BacSi extends NhanVien {
    protected String chuyenNganh;
    
    @Override
    public long TinhLuong(){
        return luongCB ;
    }
    
    public BacSi() {
        super();
        chuyenNganh = null;
    }

    public BacSi(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, BoPhan bp, int nhanVien_type, String chuyenNganh) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, bp, nhanVien_type);
        this.chuyenNganh = chuyenNganh;
    }
    
    public BacSi(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, String maBoPhan, String tenBoPhan, int nhanVien_type, String chuyenNganh) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, maBoPhan, tenBoPhan, nhanVien_type);
        this.chuyenNganh = chuyenNganh;
    }

    public BacSi(BacSi obj) {
        super(obj);
        this.chuyenNganh = obj.chuyenNganh;
    }

    // Phương thức getter và setter cho chuyenNganh

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    // Ghi đè phương thức Input() để nhập thông tin cho bác sĩ
    @Override
    public void Input() {
        super.Input(); // Gọi phương thức Input() của lớp cha để nhập thông tin cơ bản
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap chuyen nganh: ");
        chuyenNganh = x.nextLine();
    }

    // Ghi đè phương thức Output() để hiển thị thông tin của bác sĩ
    @Override
    public void Output() {
        super.Output(); // Gọi phương thức Output() của lớp cha để hiển thị thông tin cơ bản
        System.out.format("%20s|Luong: %d", chuyenNganh,TinhLuong());
    }
}

