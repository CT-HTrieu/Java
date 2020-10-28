package tuan1;

public class bai6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long x;
            x = (int) Math.pow(i, 2);
            System.out.println(i + "^" + 2 + " = " + x);
            x = (int) Math.pow(i, 3);
            System.out.println(i + "^" + 3 + " = " + x);
            System.out.println("");
        }
    }
}
