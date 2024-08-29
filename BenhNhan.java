package DoAn;

import java.util.Scanner;

public class BenhNhan extends BenhVien {
    private String maBenhNhan;
    private String trieuChung;
    private String diaChi;

    public BenhNhan() {
        super();
        maBenhNhan = trieuChung = diaChi = null;
    }

    public BenhNhan(String hoTen, String ngaySinh, int soDienThoai, String maBenhNhan, String trieuChung, String diaChi) {
        super(hoTen, ngaySinh, soDienThoai);
        this.maBenhNhan = maBenhNhan;
        this.trieuChung = trieuChung;
        this.diaChi = diaChi;
    }

    public BenhNhan(BenhNhan obj) {
        super(obj);
        this.maBenhNhan = obj.maBenhNhan;
        this.trieuChung = obj.trieuChung;
        this.diaChi = obj.diaChi;
    }
    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getDiaChi() {
        return diaChi;
    }

    // Các phương thức getter và setter cho maBenhNhan và trieuChung
    public void setDiaChi(String diaChi) {    
        this.diaChi = diaChi;
    }

    // Ghi đè phương thức Input() để nhập thông tin cho bệnh nhân
    @Override
    public void Input() {
        super.Input(); // Gọi phương thức Input() của lớp cha để nhập thông tin cơ bản
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap ma benh nhan: ");
        maBenhNhan = x.nextLine();
        System.out.println("Nhap dia chi: ");
        trieuChung = x.nextLine();
        System.out.println("Nhap trieu chung: ");
        trieuChung = x.nextLine();
    }

    // Ghi đè phương thức Output() để hiển thị thông tin của bệnh nhân
    @Override
    public void Output() {
        super.Output(); // Gọi phương thức Output() của lớp cha để hiển thị thông tin cơ bản
        System.out.format("%12s|%12s|%12s|", maBenhNhan, diaChi, trieuChung);
    }
}