package tuan3;

import java.util.Scanner;

class PhanSo {
    private int tu, mau;

    public PhanSo(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;

    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int ucln(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutGon() {
        int i = ucln(this.tu, this.mau);
        this.setMau(this.getMau() / i);
        this.setTu(this.getTu() / i);

    }

    public PhanSo cong(PhanSo p) {
        int ts = this.getTu() * p.getMau() + this.getMau() * p.getTu();
        int ms = this.getMau() * p.getMau();
        PhanSo ps = new PhanSo(ts, ms);
        ps.rutGon();
        return ps;
    }

    public PhanSo tru(PhanSo p) {
        int ts = this.getTu() * p.getMau() - this.getMau() * p.getTu();
        int ms = this.getMau() * p.getMau();
        PhanSo ps = new PhanSo(ts, ms);
        ps.rutGon();
        return ps;
    }

    public PhanSo nhan(PhanSo p) {
        int ts = this.getTu() * p.getTu();
        int ms = this.getMau() * p.getMau();
        PhanSo ps = new PhanSo(ts, ms);
        ps.rutGon();
        return ps;
    }

    public PhanSo chia(PhanSo p) {
        int ts = this.getTu() * p.getMau();
        int ms = this.getMau() * p.getTu();
        PhanSo ps = new PhanSo(ts, ms);
        ps.rutGon();
        return ps;
    }

    public void show() {
        System.out.println(this.getTu() + "/" + this.getMau());
    }
}

public class Bai2 {
    public static void main(String[] args, Scanner scanner) {
        System.out.print("Nhap tu so: ");
        int tu = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        int mau = scanner.nextInt();
        PhanSo ps1 = new PhanSo(tu, mau);
        ps1.rutGon();
        System.out.print("P1 co gia tri la: ");
        ps1.show();
        PhanSo ps2 = new PhanSo(4, 16);
        ps2.rutGon();
        System.out.print("P2 co gia tri la: ");
        ps2.show();
        PhanSo ps3 = new PhanSo(1, 9);
        ps3.rutGon();
        System.out.print("P3 co gia tri la: ");
        ps3.show();
        PhanSo ps4 = new PhanSo(ps1);
        ps4.rutGon();
        System.out.print("P4 co gia tri la: ");
        ps4.show();
        System.out.print("Cong p1 voi p3: ");
        ps1.cong(ps3).show();
        System.out.print("Nhan p4 voi p2: ");
        ps4.nhan(ps2).show();

    }
}
