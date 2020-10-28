package tuan3;

import java.util.*;

class DSHOCSINH {
    private HOCSINH ds[];
    private int sl;

    public void nhapds() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong HS: ");
        sl = x.nextInt();
        ds = new HOCSINH[sl];// cap phat vung nho cho mang ds
        int tamp = 0;
        String htMoi = "Nguyen Van A";
        String newMaSo = "113";
        float dtb = 10;
        for (int i = 0; i < sl; i++) {
            if (tamp == 0) {
                ds[i] = new HOCSINH();
                ds[i].input();
                tamp = 1;
            } else if (tamp == 1) {
                ds[i] = new HOCSINH(htMoi, newMaSo, dtb);
                tamp = 2;
            } else if (tamp == 2) {
                ds[i] = new HOCSINH(ds[i - 1]);
                tamp = 0;
            }
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

public class Bai3_tuan2 {
    public static void main(String[] args) {
        DSHOCSINH list = new DSHOCSINH();
        list.nhapds();
        list.xuatds();
        list.sapxep();
        list.xuatds();

    }
}
