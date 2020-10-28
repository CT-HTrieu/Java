package tuan3;

import java.util.Scanner;

class COODINATE {
    private float x, y;

    public COODINATE() {
        this.x = 0;
        this.y = 0;

    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getT() {
        return y;
    }

    public COODINATE(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public double khoangCach(COODINATE b) {
        double result;
        result = Math.sqrt((double) ((this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y)));
        return result;
    }

    public void show() {
        System.out.print("( " + this.x + " , " + this.y + ")");
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        this.x = scanner.nextFloat();
        System.out.print("Nhap toa do y: ");
        this.y = scanner.nextFloat();
        System.out.println("");
    }

    public void DDX() {
        this.x = -this.x;
        this.y = -this.y;

    }
}

public class bai3 {
    public static void main(String[] args) {
        COODINATE A = new COODINATE();
        System.out.println("Nhap toa do cua A");
        A.nhap();
        System.out.print("Diem A co toa do: ");
        A.show();
        System.out.println("Nhap toa do cua B");
        COODINATE B = new COODINATE(5, 5);
        B.show();
        System.out.println("Khoang cach cua A va B:" + A.khoangCach(B));
        System.out.println("Diem doi xung cua A: ");
        A.DDX();
        A.show();
    }
}
