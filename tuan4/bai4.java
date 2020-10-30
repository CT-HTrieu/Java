package tuan4;

import javax.swing.JOptionPane;

class tamGiac {
    public int chieuDai1, chieuDai2, chieuDai3;

    public tamGiac() {
        this.chieuDai1 = this.chieuDai2 = this.chieuDai3 = 0;
    }

    public tamGiac(int a, int b, int c) {
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "canh phai > 0", "Thong bao", JOptionPane.WARNING_MESSAGE);
            this.chieuDai1 = 0;
            return;
        }
        if (b < 0) {
            JOptionPane.showMessageDialog(null, "canh phai > 0", "Thong bao", JOptionPane.WARNING_MESSAGE);
            this.chieuDai2 = 0;
            return;
        }
        if (c < 0) {
            JOptionPane.showMessageDialog(null, "canh phai > 0", "Thong bao", JOptionPane.WARNING_MESSAGE);
            this.chieuDai3 = 0;
            return;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            JOptionPane.showMessageDialog(null, "Khong phai tam giac", "Thong bao", JOptionPane.WARNING_MESSAGE);
            this.chieuDai1 = this.chieuDai2 = this.chieuDai3 = 0;
            return;

        }
        this.chieuDai1 = a;
        this.chieuDai2 = b;
        this.chieuDai3 = c;

    }

    public int getChieuDai2() {
        return this.chieuDai2;
    }

    public int getChieuDai1() {
        return this.chieuDai1;
    }

    public int getChieuDai3() {
        return this.chieuDai3;
    }

    public void setChieuDai1(int a) {
        this.chieuDai1 = a;
    }

    public void setChieuDai2(int a) {
        this.chieuDai2 = a;
    }

    public void setChieuDai3(int a) {
        this.chieuDai3 = a;
    }

    public boolean laTamGiac() {
        return (this.chieuDai1 + this.chieuDai2 > this.chieuDai3 && this.chieuDai1 + this.chieuDai3 > this.chieuDai2
                && this.chieuDai2 + this.chieuDai3 > this.chieuDai1);
    }

    public int getChuVi() {
        return this.chieuDai1 + this.chieuDai2 + this.chieuDai3;
    }

    public double getDienTich() {
        double p = (double) (this.chieuDai1 + this.chieuDai2 + this.chieuDai3) / 2;
        return Math.sqrt(p * (p - this.chieuDai1) + p * (p - this.chieuDai2) + p * (p - this.chieuDai3));
    }

    public void kiemTra() {
        if (this.laTamGiac()) {
            if (this.chieuDai1 * this.chieuDai1 == this.chieuDai2 * this.chieuDai2 + this.chieuDai3 * this.chieuDai3
                    || this.chieuDai2 * this.chieuDai2 == this.chieuDai1 * this.chieuDai1
                            + this.chieuDai3 * this.chieuDai3
                    || this.chieuDai3 * this.chieuDai3 == this.chieuDai1 * this.chieuDai1
                            + this.chieuDai2 * this.chieuDai2) {
                System.out.println("Day la tam giac vuong");

            } else if (this.chieuDai1 == this.chieuDai2 && this.chieuDai2 == this.chieuDai3) {
                System.out.println("Day la tam giac deu");

            } else if (this.chieuDai1 == this.chieuDai2 || this.chieuDai2 == this.chieuDai3
                    || this.chieuDai1 == this.chieuDai3) {
                System.out.println("Day la tam giac can");
            } else if (this.chieuDai1 * this.chieuDai1 > this.chieuDai2 * this.chieuDai2
                    + this.chieuDai3 * this.chieuDai3
                    || this.chieuDai2 * this.chieuDai2 > this.chieuDai1 * this.chieuDai1
                            + this.chieuDai3 * this.chieuDai3
                    || this.chieuDai3 * this.chieuDai3 > this.chieuDai1 * this.chieuDai1
                            + this.chieuDai2 * this.chieuDai2) {
                System.out.println("Day la tam giac tu");
            } else
                System.out.println("Day la tam giac nhon");
        } else
            System.out.println("Khong phai tam giac");
    }

    public void show() {
        System.out.println("Chu vi tam giac la:" + this.getChuVi());
        System.out.println("Dien Tich Tam Gia la: " + this.getDienTich());
    }

}

public class bai4 {
    public static void main(String[] args) {
        tamGiac tamgiac = new tamGiac(2, 3, 4);
        tamgiac.show();
        tamgiac.kiemTra();
    }

}
