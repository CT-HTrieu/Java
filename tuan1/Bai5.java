package tuan1;

public class Bai5 {
    public static void main(String[] args) {
        int n = 9, m = 9;
        int a[][];
        a = new int[n + 1][];
        for (int i = 0; i < n; i++) {
            a[i] = new int[m + 1];
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                a[i][j] = i * j;
                System.out.print(i + " * " + j + " = " + a[i][j]);
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
