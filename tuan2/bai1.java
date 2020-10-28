package tuan2;

import java.util.Scanner;

class HOCSINH {
    private static final Scanner SCANNER = new Scanner(System.in);
    private String maSo;
    private String hoTen;
    private float dtb;

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String ms) {
        maSo = ms;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String ht) {
        hoTen = ht;
    }

    public float getdtb() {
        return dtb;
    }

    public void setdtb(float diemTB) {
        dtb = diemTB;
    }

    public void rank() {
        if (dtb < 5) {
            System.out.print("Xep loai yeu");
        } else if (dtb >= 5 && dtb < 7) {
            System.out.print("Xep loai trung binh");
        } else if (dtb >= 7 && dtb < 8) {
            System.out.print("Xep loai Kha");
        } else {
            System.out.print("Xep loai gioi");
        }
    }

    public void input() {
        System.out.print("Nhap ho ten HS: ");
        hoTen = SCANNER.nextLine();
        System.out.print("Nhap ma so HS: ");
        maSo = SCANNER.nextLine();
        System.out.print("Nhap diem trung binh HS: ");
        dtb = SCANNER.nextFloat();
    }

    public void output() {
        System.out.println("Ma so Hs: " + maSo);
        System.out.println("Ho ten HS " + hoTen);
        System.out.println("Diem trung binh " + dtb);
    }
}

public class bai1 {
    public static void main(String[] args) {
        HOCSINH hs = new HOCSINH();
        hs.input();
        hs.output();
        hs.rank();
        System.out.println("Ho Ten cua HS vua nhap: " + hs.gethoTen());
        String htMoi = "Nguyen Ngoc Tien";
        hs.sethoTen(htMoi);
        System.out.println("Ho ten cus HS sau khi sua: " + hs.gethoTen());
    }
}
