package tuan3;

import java.util.Scanner;

class NhanVien {
    private String maSo, hoTen;
    private float luongCB, heSo;

    public NhanVien() {
        this.maSo = this.hoTen = "";
        this.luongCB = this.heSo = 0;

    }

    public NhanVien(String maSo, String hoTen, float luong, float heSo) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCB = luong;
        this.heSo = heSo;

    }

    public NhanVien(NhanVien p) {
        this.maSo = p.maSo;
        this.hoTen = p.hoTen;
        this.luongCB = p.luongCB;
        this.heSo = p.heSo;
    }

    public void Input() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        this.hoTen = x.nextLine();
        System.out.println("");
        System.out.print("Ma So NV: ");
        this.maSo = x.nextLine();
        System.out.println("");
        System.out.print("Luong CB: ");
        this.luongCB = x.nextFloat();
        System.out.println("");
        System.out.print("He so luong: ");
        this.heSo = x.nextFloat();

    }

    public void Output() {
        System.out.println("Ho va ten:" + this.hoTen);
        System.out.println("Ma So NV:" + this.maSo);
        System.out.println("Luong :" + this.luongCB * this.heSo);
    }

}

class DSNV {
    private NhanVien ds[];
    private int sl;

    public void Input() {
        String maSo = "113", hoTen = "Nguyen Van A";
        float luong = 1000000, heSo = 3;
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        this.sl = x.nextInt();
        ds = new NhanVien[sl];
        int tamp = 0;

        for (int i = 0; i < sl; i++) {
            if (tamp == 0) {
                ds[i] = new NhanVien();
                ds[i].Input();
                tamp = 1;
            } else if (tamp == 1) {
                ds[i] = new NhanVien(maSo, hoTen, luong, heSo);
                tamp = 2;
            } else if (tamp == 2) {
                ds[i] = new NhanVien(ds[i - 1]);
                tamp = 0;
            }
        }
    }

    public void Output() {
        System.out.println("Danh sach nhan vien ");
        for (int i = 0; i < sl; i++) {
            ds[i].Output();
            System.out.println("");
        }
        System.out.println("So luong nhan vien: " + this.sl);
    }

}

public class bai4 {
    public static void main(String[] args) {
        DSNV A = new DSNV();
        A.Input();
        A.Output();
    }
}
