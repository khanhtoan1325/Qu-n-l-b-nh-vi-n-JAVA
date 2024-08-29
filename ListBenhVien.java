//Ho va ten: Nguyen Cong Thinh
//MSSV: 2280603090
//Lop: 22DTHG1



package DoAn;

import java.util.*;

public class ListBenhVien {
    ArrayList<BenhVien> list = new ArrayList<>();
    
    public void init() {
    	// Init list nhan vien chat luong ca
        list.add(new YTa("Le Van P"         ,"01/03/2010"   ,111111   ,"YT111"    ,"Y ta truong"        ,"AAA","Khoa ngoai"         ,1  ,5  ,"Cham soc benh nhan", 50000));
        list.add(new YTa("Pham Thi Q"       ,"01/04/2015"   ,222222   ,"YT222"    ,"Y ta thuc tap"      ,"BBB","Khoa noi"           ,0  ,3  ,"Cham soc benh nhan", 50000));
        list.add(new YTa("Pham Van T"       ,"03/09/1994"   ,333333   ,"YT333"    ,"Y ta "              ,"CCC","Khoa Tai Mui Hong"  ,1  ,6  ,"Cham soc benh nhan", 50000));
        list.add(new YTa("Nguyen Van L"     ,"30/4/1996"    ,444444   ,"YT444"    ,"Bac Si Thuc Tap "   ,"DDD","Khoa Mat"           ,2  ,8  ,"Cham soc benh nhan", 50000));
        list.add(new BSTongQuat("Hoang Van E",      "01/05/2020",555555,"BSTQ111" ,"Truong khoa"        ,"EEE","Khoa mat"           ,1,"Mat"            ,2000));
        list.add(new BSTongQuat("Hoang Thi L",      "02/09/2018",666666,"BSTQ222" ,"Pho Khoa"           ,"FFF","Khoa Xuong Khop"    ,2,"Xuong Khop"     ,1000));
        list.add(new BSTongQuat("Nguyen Thi H",     "08/03/2017",777777,"BSTQ333" ,"Truong khoa"        ,"GGG","Tay Chan Mieng"     ,0,"Tay Chan Mieng" ,2500));
        list.add(new BSChuyenKhoa("Le Van J",       "01/03/2010",888888,"BSCK111" ,"Truong khoa"        ,"HHH","Rang"               ,1,"Rang ham"       ,20000));
        list.add(new BSChuyenKhoa("Le Van T",       "20/03/2018",999999,"BSCK222" ,"Truong khoa"        ,"TTT","Mat"                ,2,"Mat mui"        ,15000));
        list.add(new BSChuyenKhoa("Nguyen Thi A",   "20/04/2018",989799,"BSCK333" ,"Truong khoa"        ,"KKK","Xuong khop"         ,0,"Xuong"          ,10000));
        list.add(new BSChuyenKhoa("Nguyen Van H",   "15/04/2017",991299,"BSCK444" ,"Truong khoa"        ,"XXX","Tay chan mieng"     ,1,"Tay"            ,30000));
    }

    
    public void Input(BenhVien obj) {
    	list.add(obj);
    }
    
    public void outputListYTa() {
    	for(BenhVien ele : list) {
			if(ele instanceof YTa)
				ele.Output();
    	}
    }
    
    public void outputListBSTongQuat() {
    	for(BenhVien ele : list) {
    		if(ele instanceof BSTongQuat)
    			ele.Output();
    	}
    }
    
    public void outputListBSChuyenKhoa() {
    	for(BenhVien ele : list) {
			if(ele instanceof BSChuyenKhoa)
				ele.Output();
    	}
    }
    
    public void sapTangTheoTen(){
        list.sort((obj1, obj2) -> obj1.getHoTen().compareToIgnoreCase(obj2.getHoTen()) );
    }
    
    public void sapGiamTheoTen(){
        list.sort((obj1, obj2) -> obj2.getHoTen().compareToIgnoreCase(obj1.getHoTen()) );
    }
    
    public void xoaCuoiList() {
    	list.remove(3);
    }
    
    public void xoaDauList() {
    	list.remove(0);
    }
}
