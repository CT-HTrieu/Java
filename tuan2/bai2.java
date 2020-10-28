package tuan2;

import java.util.*;

class Mang {
    private int soPt;
    private int array[];

    Mang() {
        this.soPt = getsoPt();

    }

    public int getsoPt() {
        return soPt;
    }

    public void setsoPt(int so) {
        soPt = so;

    }

    public float oddNumber() {
        int sum = 0, count = 0;
        for (int i = 0; i < soPt; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                count++;
            }
        }
        if (count == 0)
            count = 1;
        float tamp = sum / count;
        return tamp;

    }

    public void sapXep() {
        Arrays.sort(array);
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < soPt; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public void input() {
        array = new int[soPt];
        for (int i = 0; i < soPt; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public void output() {
        System.out.println("Mang = " + Arrays.toString(array));
    }
}

public class bai2 {
    public static void main(String[] args) {
        Mang mang = new Mang();
        mang.setsoPt((int) (Math.random() * 100));
        mang.input();
        mang.output();
        System.out.println("Gia tri trung binh cac so le trong mang la: " + mang.oddNumber());
        System.out.println("Gia tri lon nhat trong mang la: " + mang.max());
        mang.sapXep();
        mang.output();

    }

}
