package tuan1;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args, Scanner scanner) {
        System.out.print("Nhap so luong cua mang N = ");
        int n = scanner.nextInt();
        int a[] = new int[n + 1];
        System.out.print("Nhap so muon ma hoa: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("");
        System.out.println("Ky tu duoc ma hoa la: ");
        for (int i = 0; i < n; i++) {
            System.out.println((char) a[i] + " - " + a[i]);
        }
    }
}
