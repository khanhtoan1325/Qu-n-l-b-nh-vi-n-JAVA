package DoAn;

import java.util.*;


public class BSTongQuat extends BacSi {
    private long tienKhamCa;
    
    @Override
    public long TinhLuong(){
        return luongCB + tienKhamCa;
    }
    

    public BSTongQuat() {
        super();
        tienKhamCa = 0;
    }

    public BSTongQuat(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, BoPhan bp, int nhanVien_type, String chuyenNganh, long tienKhamCa) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, bp, nhanVien_type, chuyenNganh);
        this.tienKhamCa = tienKhamCa;
    }

    public BSTongQuat(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, String maBoPhan, String tenBoPhan, int nhanVien_type, String chuyenNganh, long tienKhamCa) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, maBoPhan, tenBoPhan, nhanVien_type, chuyenNganh);
        this.tienKhamCa = tienKhamCa;
    }
    
    public BSTongQuat(BSTongQuat obj) {
        super(obj);
        this.tienKhamCa = obj.tienKhamCa;
    }

    public long getTienKhamCa() {
        return tienKhamCa;
    }

    public void setTienKhamCa(long tienKhamCa) {
        this.tienKhamCa = tienKhamCa;
    }
    
    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tien kham ca: ");
        tienKhamCa = scanner.nextLong();
    }

    @Override
    public void Output() {
        super.Output(); // Gọi phương thức Output() của lớp cha để hiển thị thông tin cơ bản
        System.out.format("%20d|Luong: %d\n", tienKhamCa, TinhLuong());
    }
}
