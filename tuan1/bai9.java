package tuan1;

public class bai9 {
    public static void main(String[] args, String string) {
        long a[] = new long[101];
        a[0] = a[1] = 1;
        System.out.print("Day Fibonacci : " + a[0] + " " + a[1]);
        for (int i = 2; i <= 100; i++) {
            a[i] = a[i - 1] + a[i - 2];
            a[i] = a[i] % 1000000007;
            System.out.printf(" " + a[i] + " ");
        }
        System.out.println(string);
    }
}
