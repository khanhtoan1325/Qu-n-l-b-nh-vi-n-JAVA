package DoAn;

import java.util.Scanner;

public abstract class NhanVien extends BenhVien {
    protected String maNhanVien;
    protected String chucVu;
    protected BoPhan bp = new BoPhan();
    protected int nhanVien_type;
    protected static int nhanVien_count = 0;
    protected static long luongCB = 50000000;
    
    abstract public long TinhLuong();

    public NhanVien() {
        super();
        maNhanVien = chucVu = null;
        luongCB = 0;
    }

    public NhanVien(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, BoPhan bp, int nhanVien_type) {
        super(hoTen, ngaySinh, soDienThoai);
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        this.bp = bp;
        this.nhanVien_type = nhanVien_type;
        nhanVien_count++;
    }
    
    public NhanVien(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, String maBoPhan, String tenBoPhan, int nhanVien_type) {
        super(hoTen, ngaySinh, soDienThoai);
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        this.bp = new BoPhan (maBoPhan, tenBoPhan);
        this.nhanVien_type = nhanVien_type;
        nhanVien_count++;
    }

    public NhanVien(NhanVien obj) {
        super(obj);
        this.maNhanVien = obj.maNhanVien;
        this.chucVu = obj.chucVu;
        this.bp = obj.bp;
        this.nhanVien_type = obj.nhanVien_type;
        nhanVien_count++;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public BoPhan getBp() {
        return bp;
    }

    public void setBp(BoPhan bp) {
        this.bp = bp;
    }

    public int getNhanVien_type() {
        return nhanVien_type;
    }

    public void setNhanVien_type(int nhanVien_type) {
        this.nhanVien_type = nhanVien_type;
    }

    public static int getNhanVien_count() {
        return nhanVien_count;
    }

    public static void setNhanVien_count(int nhanVien_count) {
        NhanVien.nhanVien_count = nhanVien_count;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        maNhanVien = x.nextLine();
        System.out.println("Nhap chuc vu: ");
        chucVu = x.nextLine();
        System.out.println("Nhap thong tin bo phan lam viec: ");
        bp.Input();
        System.out.println("Nhap loai nhan vien (0: Kinh nghiem tren 10 nam, 1: Kinh nghiem tren 2 nam, 2: Thuc tap sinh): ");
        nhanVien_type = x.nextInt();
        
        nhanVien_count++;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.format("%10s|%20s|%10s|%20s|", maNhanVien, chucVu, bp.getMaBoPhan(), bp.getTenBoPhan(), nhanVien_type,TinhLuong());
    }
}

