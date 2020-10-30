package tuan4;

import java.util.Scanner;

class NHANVIEN {
    String maSo, hoTen;
    static float lcb;
    static int slnv = 0;
    float hsl;

    public NHANVIEN() {
        this.maSo = "";
        this.hoTen = "";
        lcb = 3000000;
        this.hsl = 1;
    }

    public NHANVIEN(String maSo, String hoTen, float lcb, float hsl) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        NHANVIEN.lcb = lcb;
        this.hsl = hsl;

    }

    public NHANVIEN(NHANVIEN p) {
        this.maSo = p.maSo;
        this.hoTen = p.hoTen;
        lcb = p.lcb;
        this.hsl = p.hsl;
    }

    public void setMaSo(String maso) {
        this.maSo = maso;
    }

    public void setHoTen(String hoten) {
        this.hoTen = hoten;
    }

    public void setHSL(float i) {
        this.hsl = i;
    }

    public void setLuongCB(float luong) {
        lcb = luong;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getMaSo() {
        return this.maSo;
    }

    public float getHSL() {
        return this.hsl;
    }

    public float getLuongCB() {
        return NHANVIEN.lcb;
    }

    public String toString() {
        return ("Ma so: " + this.maSo + " HoTen: " + this.hoTen + " HSL: " + this.hsl);
    }

    public float luongNV() {
        return lcb * this.hsl;
    }

    static void inSLNV() {
        System.out.print("So luong " + slnv);
    }

    public void Input() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap Ho Ten NV: ");
        this.hoTen = x.nextLine();
        System.out.print("Nhap Ma So: ");
        this.maSo = x.nextLine();
        System.out.print("Nhap He So Luong: ");
        this.hsl = x.nextFloat();
        System.out.print("Nhap Luong: ");
        lcb = x.nextFloat();
    }

}

public class bai3 {
    public static void main(String[] args) {
        NHANVIEN nv1 = new NHANVIEN();
        nv1.Input();
        NHANVIEN nv2 = new NHANVIEN("112", "Nguyen Van Ba", 300000, 6);

        float max = nv1.getHSL();
        NHANVIEN nv3 = new NHANVIEN(nv1);
        NHANVIEN nvt = new NHANVIEN(nv1);
        if (nv2.getHSL() > max) {
            max = nv2.getHSL();
            nvt = nv2;
        }
        if (nv3.getHSL() > max) {
            max = nv3.getHSL();
            nvt = nv3;
        }
        System.out.print("Nhan Vien co hsl max: " + nvt.toString());
    }
}
