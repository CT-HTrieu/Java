
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

abstract class SinhVien {
    protected String maSV;
    protected String hoTen;
    protected int soTC;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
    
    abstract int tinhHocPhi();
    abstract void nhap();
    abstract void xuat();
    
}
class PhatTrienUngDung extends SinhVien {
    @Override
    public int tinhHocPhi () {
        return this.soTC*480000;
    }

    @Override
    void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        this.maSV=sc.nextLine();
        System.out.println("Nhap ho ten:");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap so tin chi:");
        this.soTC=sc.nextInt();
    }

    @Override
    void xuat() {
        System.out.println("Ma sinh vien:"+this.maSV);
        System.out.println("Ho ten:"+this.hoTen);
        System.out.println("Tong so tin chi:"+this.soTC);
        System.out.println("Hoc phi:"+tinhHocPhi());
        
    }
}
class ThietKe extends SinhVien {
    private int soMonKN;

    public int getSoMonKN() {
        return soMonKN;
    }

    public void setSoMonKN(int soMonKN) {
        this.soMonKN = soMonKN;
    }
    @Override
    public int tinhHocPhi() {
        return (this.soTC+this.soMonKN)*500000;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        this.maSV=sc.nextLine();
        System.out.println("Nhap ho ten:");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap so tin chi:");
        this.soTC=sc.nextInt();
        System.out.println("Nhap so mon ki nang:");
        this.soMonKN=sc.nextInt();
    }
    @Override
    public void xuat() {
        System.out.println("Ma sinh vien:"+this.maSV);
        System.out.println("Ho ten:"+this.hoTen);
        System.out.println("Tong so tin chi:"+this.soTC);
        System.out.println("So mon ki nang:"+this.soMonKN);
        System.out.println("Hoc phi:"+tinhHocPhi());
    }
}
class DaPhuongTien {
    TreeMap<String, SinhVien> dsSinhVien = new TreeMap<> ();
    Set<Entry<String,SinhVien>> ASC= dsSinhVien.entrySet();//cac sinh vien se sap xep tang dan theo khoa
    
    public void themSV () {
        Scanner sc=new Scanner(System.in);
        int luachon;
        SinhVien newSV;
        System.out.println("Chon chuyen nganh sinh vien muon nhap");
        System.out.println("1.Phat trien ung dung");
        System.out.println("2.Thiet ke");
        luachon=sc.nextInt();
        if(luachon==1) {
            newSV=new PhatTrienUngDung();
            newSV.nhap();
        }
        else {newSV=new ThietKe();
        newSV.nhap();}
        dsSinhVien.put(newSV.maSV, newSV);
    }
    public void xuatDS() {
        System.out.println("Danh sach sinh vien");
        for (SinhVien sv: dsSinhVien.values())
        {
            sv.xuat();
        }
    }
    public void xuatDSTheoHP() {
        System.out.println("Danh sach sinh vien co hoc phi tu 10trieu toi 15trieu");
        for(SinhVien sv:dsSinhVien.values())
        {
            if(sv.tinhHocPhi()>=10000000 && sv.tinhHocPhi()<=15000000) {
                sv.xuat();
            }
        }
    }
    public void timSVTheoTen() {
        Scanner sc=new Scanner(System.in);
        String tmpTen;
        System.out.println("Nhap ten sinh vien muon tim");
        tmpTen=sc.nextLine();       
        for(SinhVien sv:dsSinhVien.values())
        {
            if(sv.hoTen.equals(tmpTen)){
                sv.xuat();
                return;
            }
            
        }
        System.out.println("Khong tim thay sinh vien trong danh sach!");
    }
    public void xoaSVTheoMa() {
        System.out.println("Nhap ma sinh vien muon xoa");
        Scanner sc=new Scanner(System.in);
        String tmpMa;
        tmpMa=sc.nextLine();
        for(SinhVien sv: dsSinhVien.values()) {
            if(sv.getMaSV().equals(tmpMa)) {
                dsSinhVien.remove(tmpMa);
                return;
            }
        }
        System.out.println("Khong tim thay ma sinh vien can xoa");
    }
    public void sapXepASCTheoTen() {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        for(SinhVien sv: dsSinhVien.values())
        {
            listSV.add(sv);
                       
        }
        Comparator<SinhVien> cmp= new Comparator<SinhVien> () {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.hoTen.equals(o2.hoTen)) {
                    return o1.maSV.compareTo(o2.maSV);
                }
                else return o1.hoTen.compareTo(o2.hoTen);
            }
        };
        Collections.sort(listSV, cmp);
         System.out.println("Danh sach sinh vien da duoc sap xep");
        for(SinhVien sv: listSV)
        {
           
            sv.xuat();
        }
         
        
    }
    
}
public class Treemap_DPT {
    public static void main(String[] args) {
        DaPhuongTien dpt=new DaPhuongTien();
        int luachon;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("\t\t1.Nhap sinh vien ");
            System.out.println("\t\t2.Xuat danh sach sinh vien ");
            System.out.println("\t\t3.Xuat danh sach sinh vien co hoc phi tu 10trieu den 15 trieu ");
            System.out.println("\t\t4. Tim kiem sinh vien theo ten ");
            System.out.println("\t\t5. Xoa thong tin sinh vien theo ma ");
            System.out.println("\t\t6. Sap xep DSSV theo thu tu tang dan theo ten, neu cung ten, sap xep theo ma ");
            System.out.println("Nhap lua chon cua ban: ");
            luachon=sc.nextInt();
            switch(luachon) {
                case 1:
                    dpt.themSV();
                    break;
                case 2:
                    dpt.xuatDS();
                    break;
                case 3:
                    dpt.xuatDSTheoHP();
                    break;
                case 4:
                    dpt.timSVTheoTen();
                    break;
                case 5:
                    dpt.xoaSVTheoMa();
                    break;
                case 6:
                    dpt.sapXepASCTheoTen();
                    break;
            }
        }
    }
}
