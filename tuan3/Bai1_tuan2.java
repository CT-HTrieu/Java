package tuan3;

import java.util.Scanner;

class HOCSINH {
    private Scanner SCANNER = new Scanner(System.in);
    private String maSo;
    private String hoTen;
    private float dtb;

    public HOCSINH() {
        this.maSo = "";
        this.hoTen = "";
        this.dtb = 0;

    }

    public HOCSINH(String maSo, String hoTen, float dtb) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.dtb = dtb;

    }

    public HOCSINH(HOCSINH hs) {
        this.maSo = hs.maSo;
        this.hoTen = hs.hoTen;
        this.dtb = hs.dtb;

    }

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

public class Bai1_tuan2 {
    public static void main(String[] args) {
        HOCSINH hs = new HOCSINH();
        hs.input();
        hs.output();
        hs.rank();
        System.out.println("Ho Ten cua HS vua nhap: " + hs.gethoTen());
        String htMoi = "Nguyen Van A";
        String newMaSo = "113";
        float dtb = 10;
        HOCSINH hs1 = new HOCSINH(htMoi, newMaSo, dtb);
        hs1.output();
        hs1.rank();
        HOCSINH hs2 = new HOCSINH(hs1);
        hs2.output();
        hs2.rank();
    }
}
