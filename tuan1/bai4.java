package tuan1;

import java.util.*;

public class bai4 {
    public static void main(String[] args, Scanner scanner) {
        System.out.print("Nhap vao so cot: ");
        int n = scanner.nextInt();
        System.out.print("Nhap vao so hang: ");
        int m = scanner.nextInt();
        int a[][];
        a = new int[n + 1][];
        for (int i = 0; i < n; i++) {
            a[i] = new int[m + 1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += a[i][j];
            }
        }
        System.out.print("Tong cac phan tu torng ma tran la: " + sum);
    }
}
