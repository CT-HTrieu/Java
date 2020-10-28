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
        System.out.print(this.getTu() + "/" + this.getMau());
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        int tu = x.nextInt();
        System.out.print("Nhap mau so: ");
        int mau = x.nextInt();
        PhanSo ps = new PhanSo(tu, mau);

    }
}
