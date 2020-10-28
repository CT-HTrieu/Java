package tuan1;

import java.util.Arrays;

public class bai7 {
    public static void main(String[] args) {
        int array[] = new int[] { 99, 9, 999, 10, 15, 77, 88, 75, 76, 45 };
        System.out.print("Mang chua  sap xep: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("");
        System.out.println("Mang da sap xep" + Arrays.toString(array));

    }

}
