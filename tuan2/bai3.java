package tuan2;

import java.util.Scanner;

class DSHOCSINH {
    private HOCSINH ds[];
    private int sl;

    public void nhapds() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong HS: ");
        sl = x.nextInt();
        ds = new HOCSINH[sl];// cap phat vung nho cho mang ds
        for (int i = 0; i < sl; i++) {
            ds[i] = new HOCSINH();// cap phat vung nho cho doi tuong hs
            ds[i].input();
        }
    }

    public void xuatds() {
        System.out.println("Danh sach Hoc Sinh: ");
        for (int i = 0; i < sl; i++) {
            ds[i].output();
        }

    }

    public void sapxep() {// sawp xep theo gia tri DTB
        HOCSINH tamp = new HOCSINH();
        for (int i = 0; i < sl - 1; i++) {
            for (int j = i + 1; j < sl; j++) {
                if (ds[i].getdtb() < ds[j].getdtb()) {
                    tamp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tamp;
                }
            }
        }
    }
}

public class bai3 {
    public static void main(String[] args) {
        DSHOCSINH list = new DSHOCSINH();
        list.nhapds();
        list.xuatds();
        list.sapxep();
        list.xuatds();

    }
}
