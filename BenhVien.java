package DoAn;

import java.util.Scanner;

public class BenhVien {
    protected String hoTen;
    protected String ngaySinh;
    protected int soDienThoai;
    
    public BenhVien(){
        hoTen = ngaySinh = null;
        soDienThoai = 0;
    }

    public BenhVien(String hoTen, String ngaySinh, int soDienThoai) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
    }
    
    public BenhVien(BenhVien obj) {
        this.hoTen = obj.hoTen;
        this.ngaySinh = obj.ngaySinh;
        this.soDienThoai = obj.soDienThoai;
    }

    // Các phương thức getter và setter

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    // Phương thức hiển thị thông tin của bệnh nhân
    public void Input() {
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        hoTen = x.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = x.nextLine();
        System.out.println("Nhap so dien thoai: ");
        soDienThoai = x.nextInt();
    }
    
    public void Output(){
        System.out.format("%20s|%12s|%12d|", hoTen, ngaySinh, soDienThoai);
    }
}



