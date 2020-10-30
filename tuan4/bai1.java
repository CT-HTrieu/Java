package tuan4;

import java.util.Scanner;

class HCN {
    public int chieuDai, chieuRong;

    public void nhap() {
        Scanner x = new Scanner(System.in);
        do {
            System.out.println("Nhập chiều dài hình chữ nhật: ");
            chieuDai = x.nextInt();
            System.out.println("Nhập chiều rộng hình chữ nhật: ");
            chieuRong = x.nextInt();
        } while (chieuDai < chieuRong);
    }

    public HCN() {
        chieuDai = chieuRong = 1;
    }

    public HCN(int a) {
        chieuDai = chieuRong = a;

    }

    public HCN(int a, int b) {
        chieuDai = a;
        chieuRong = b;
    }

    public void setChieuDai(int cd) {
        this.chieuDai = cd;
    }

    public void setChieuRong(int cr) {
        this.chieuRong = cr;
    }

    public int getChieuDai() {
        return this.chieuDai;
    }

    public int getChieuRong() {
        return this.chieuRong;
    }

    public int tinhChuVi(int a, int b) {
        return (a + b) * 2;
    }

    public int tinhDienTich(int a, int b) {
        return a * b;
    }

    public void showDienTichVaChuVi(int a, int b) {
        System.out.println("Chu vi hình chữ nhật = " + a);
        System.out.println("Diện tích hình chữ nhật = " + b);
    }

}

public class bai1 {
    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.nhap();
        int chuVi = hcn.tinhChuVi(hcn.chieuDai, hcn.chieuRong);
        int dienTich = hcn.tinhDienTich(hcn.chieuDai, hcn.chieuRong);
        hcn.showDienTichVaChuVi(chuVi, dienTich);
    }

}
