package tuan3;

import java.util.*;

class Mang {
    private int soPt;
    private int array[];

    public int getsoPt() {
        return soPt;
    }

    public void setsoPt(int so) {
        soPt = so;

    }

    public Mang() {
        this.soPt = 0;
        this.array = null;
    }

    public Mang(int soPt, int a[]) {
        this.soPt = soPt;
        this.array = a;
    }

    public Mang(Mang a) {
        this.array = a.array;
        this.soPt = a.soPt;
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

public class Bai2_tuan2 {
    public static void main(String[] args) {
        Mang mang = new Mang();
        mang.setsoPt((int) (Math.random() * 100));
        mang.input();
        mang.output();
        System.out.println("Gia tri trung binh cac so le trong mang la: " + mang.oddNumber());
        System.out.println("Gia tri lon nhat trong mang la: " + mang.max());
        mang.sapXep();
        mang.output();
        int[] myNum = { 20, 50, 30, 40 };
        int i = myNum.length;
        Mang mang1 = new Mang(i, myNum);
        mang1.output();
        mang1.sapXep();
        mang1.output();
        Mang mang2 = new Mang(mang);
        mang2.sapXep();
        mang2.output();

    }

}
