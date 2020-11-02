package tuan4;

import java.util.Scanner;

class PhuongTrinhBacNhat {
    public int a, b;

    public PhuongTrinhBacNhat() {
        this.a = this.b = 0;

    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void setA(int A) {
        this.a = A;
    }

    public void setB(int B) {
        this.b = B;
    }

    public int getA(int A) {
        return this.a;

    }

    public int getB(int B) {
        return this.b;
    }

    public void input() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập vào số  A: ");
        this.a = x.nextInt();
        System.out.print("Nhập vào số  B: ");
        this.b = x.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + this.a + "x + " + this.b + " = 0.");
    }

    public void timNghiem() {
        if (this.a == 0) {
            if (this.b == 0) {
                System.out.print("Phuong trinh vo so nghiem");

            } else {
                System.out.print("PHuong trinh vo nghiem");
            }
        } else {

            double x = (double) -this.b / this.a;
            System.out.print("Phuong trinh co nghiem x = " + x);
        }
    }
}

public class bai5 {
    public static void main(String[] args) {
        PhuongTrinhBacNhat pt1 = new PhuongTrinhBacNhat();
        pt1.input();
        pt1.timNghiem();
    }
}
