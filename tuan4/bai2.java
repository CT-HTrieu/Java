package tuan4;

import java.util.Scanner;

class DSHCN {
    private HCN ds[];
    public int sl;

    public void nhap() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong hinh chu nhat ");
        this.sl = x.nextInt();
        ds = new HCN[sl];
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap HCN thu " + (i + 1));
            ds[i] = new HCN();
            ds[i].nhap();
        }
    }

    public void show() {
        for (int i = 0; i < sl; i++) {
            System.out.println("HNC thu " + (i + 1));
            ds[i].showDienTichVaChuVi(ds[i].tinhChuVi(ds[i].chieuDai, ds[i].chieuRong),
                    ds[i].tinhDienTich(ds[i].chieuDai, ds[i].chieuRong));
        }
    }
}

public class bai2 {
    public static void main(String[] args) {
        DSHCN list = new DSHCN();
        list.nhap();
        list.show();
    }
}
