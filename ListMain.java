package DoAn;

import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        byte luachon;
        ListBenhVien ds = new ListBenhVien();
        BenhVien bv;
        Scanner s = new Scanner(System.in);
        ds.init();
        do {
            System.out.println("\n\t================== MENU =====================");
            System.out.println("1. Them 1 y ta.");
            System.out.println("2. Them 1 bac si tong quat.");
            System.out.println("3. Them 1 bac si chuyen khoa.");
            System.out.println("4. Xuat danh sach y ta.");
            System.out.println("5. Xuat danh sach bac si tong quat.");
            System.out.println("6. Xuat danh sach bac si chuyen khoa.");
            System.out.println("7. Sap tang theo ho ten.");
            System.out.println("8. Sap giam theo ho ten.");
            System.out.println("9. Xoa cuoi danh sach.");
            System.out.println("10. Xoa dau danh sach.");
            System.out.println("0. Thoat.");
            System.out.print("Chon chuc nang: ");
            luachon = s.nextByte();

            switch (luachon) {
                case 1 -> {
                    System.out.println("Them thong tin cho 1 y ta: ");
                    bv = new YTa();
                    bv.Input();
                    ds.Input(bv);
                    break;
                }
                case 2 -> {
                    System.out.println("Them thong tin cho 1 bac si tong quat: ");
                    bv = new BSTongQuat();
                    bv.Input();
                    ds.Input(bv);
                    break;
                }
                case 3 -> {
                    System.out.println("Them thong tin cho 1 bac si tong quat: ");
                    bv = new BSChuyenKhoa();
                    bv.Input();
                    ds.Input(bv);
                    break;
                }
                case 4 -> {
                    System.out.println("Thong tin danh sach y ta: ");
                    ds.outputListYTa();
                    break;
                }
                case 5 -> {
                    System.out.println("Thong tin danh sach bac si tong quat: ");
                    ds.outputListBSTongQuat();
                    break;
                }
                case 6 -> {
                    System.out.println("Thong tin danh sach bac si chuyen khoa: ");
                    ds.outputListBSChuyenKhoa();
                    break;
                }
                case 7 -> {
                    ds.sapTangTheoTen();
                    break;
                }
                case 8 -> {
                    ds.sapGiamTheoTen();
                    break;
                }
                case 9 -> {
                    ds.xoaCuoiList();
                    break;
                }
                case 10 -> {
                    ds.xoaDauList();
                    break;
                }
                default -> luachon = 0;
            }
        } while (luachon != 0);
        s.close();
    }
}
