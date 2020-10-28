
package tuan1;

import java.util.*;

public class Bai3 {
    public static void main(String[] args, Scanner scanner) {
        int a[], n = 0;
        System.out.print("Nhap So N = ");
        n = scanner.nextInt();
        a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap So A[" + i + "]:");
            a[i] = scanner.nextInt();
            int tamp = a[i];

            if (tamp >= max)
                max = tamp;
        }
        System.out.print("Phan tu lon nhat trong mang la:" + max);
    }
}
