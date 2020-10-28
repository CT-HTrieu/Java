package tuan2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        HOCSINH[] dshs = new HOCSINH[20];
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap vao so N = ");
        int n = x.nextInt();
        for (int i = 0; i < n; i++) {
            dshs[i] = new HOCSINH();
            dshs[i].input();
        }
        for (int i = 0; i < n; i++) {

            dshs[i].input();
        }
    }
}
