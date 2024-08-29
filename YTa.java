package DoAn;

import java.util.Scanner;

public class YTa extends NhanVien {
    private int soNamKinhNghiem;
    private String chuyenMon;
    private long phuCapDocHai;
    
    @Override
    public long TinhLuong(){
        return luongCB + phuCapDocHai;
    }

    public YTa() {
        super();
        soNamKinhNghiem = 0;
        chuyenMon = null;
        phuCapDocHai = 0;
    }

    public YTa(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, BoPhan bp, int nhanVien_type, int soNamKinhNghiem, String chuyenMon, long phuCapDocHai) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, bp, nhanVien_type);
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }
    
    public YTa(String hoTen, String ngaySinh, int soDienThoai, String maNhanVien, String chucVu, String maBoPhan, String tenBoPhan, int nhanVien_type, int soNamKinhNghiem, String chuyenMon, long phuCapDocHai) {
        super(hoTen, ngaySinh, soDienThoai, maNhanVien, chucVu, maBoPhan, tenBoPhan, nhanVien_type);
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    public YTa(YTa obj) {
        super(obj);
        this.soNamKinhNghiem = obj.soNamKinhNghiem;
        this.chuyenMon = obj.chuyenMon;
        this.phuCapDocHai = obj.phuCapDocHai;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public long getPhuCapDocHai() {
        return phuCapDocHai;
    }

    public void setPhuCapDocHai(long phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }
   
    // Ghi đè phương thức Input() để nhập thông tin cho y tá
    @Override
    public void Input() {
        super.Input(); // Gọi phương thức Input() của lớp cha để nhập thông tin cơ bản
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap so nam kinh nghiem: ");
        soNamKinhNghiem = x.nextInt();
        System.out.println("Nhap chuyen mon: ");
        chuyenMon = x.nextLine();
        System.out.println("Nhap phu cao doc hai: ");
        phuCapDocHai = x.nextLong();
    }

    // Ghi đè phương thức Output() để hiển thị thông tin của y tá
    @Override
    public void Output() {
        super.Output(); // Gọi phương thức Output() của lớp cha để hiển thị thông tin cơ bản
        System.out.format("%20d|%20s|Luong: %d\n", soNamKinhNghiem, chuyenMon,TinhLuong());
    }
}
