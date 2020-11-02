package tuan2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args, Scanner scanner) {
        HOCSINH[] dshs = new HOCSINH[20];
        System.out.print("Nhap vao so N = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            dshs[i] = new HOCSINH();
            dshs[i].input();
        }
        for (int i = 0; i < n; i++) {

            dshs[i].input();
        }
    }
}
