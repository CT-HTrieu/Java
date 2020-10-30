package tuan4;

import java.util.*;

class DSNHANVIEN {
    private NHANVIEN ds[];

    public void Input() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        NHANVIEN.slnv = x.nextInt();
        ds = new NHANVIEN[NHANVIEN.slnv];
        for (int i = 0; i < NHANVIEN.slnv; i++) {
            ds[i] = new NHANVIEN();
            ds[i].Input();
        }

    }

    public void Output() {
        for (int i = 0; i < NHANVIEN.slnv; i++) {
            System.out.println("Luong cua " + ds[i].toString() + " la : " + ds[i].luongNV());
        }
        NHANVIEN.inSLNV();
    }

}

public class bai3_2 {
    public static void main(String[] args) {
        DSNHANVIEN list = new DSNHANVIEN();
        list.Input();
        list.Output();
    }
}
