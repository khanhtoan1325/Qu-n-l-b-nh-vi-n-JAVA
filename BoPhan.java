/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAn;

import java.util.Scanner;

public class BoPhan {
    private String maBoPhan;
    private String tenBoPhan;

    public BoPhan() {
        maBoPhan = tenBoPhan = null;
    }

    public BoPhan(String maBoPhan, String tenBoPhan) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
    }

    public BoPhan(BoPhan obj) {
        this.maBoPhan = obj.maBoPhan;
        this.tenBoPhan = obj.tenBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public String getMaBoPhan() {
        return maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bộ phận: ");
        maBoPhan = scanner.nextLine();
        System.out.print("Nhập tên bộ phận: ");
        tenBoPhan = scanner.nextLine();
    }

    public void Output() {
        System.out.printf("%6s|%-12s|", maBoPhan, tenBoPhan);
    }
}
