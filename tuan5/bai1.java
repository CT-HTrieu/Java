package tuan5;

import java.util.Scanner;

class HangHoa {
    protected String maHang, tenHang;
    protected float donGia;

    public HangHoa() {
        this.tenHang = "";
        this.maHang = "";
        this.donGia = 0;
    }

    public HangHoa(String mahang, String tenhang, float dongia) {

        this.tenHang = tenhang;
        this.maHang = mahang;
        this.donGia = dongia;
    }

    public void setTenHang(String a) {
        tenHang = a;
    }

    public void setMaHang(String a) {
        maHang = a;
    }

    public void setDonGia(float a) {
        donGia = a;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public void input() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ten don hang: ");
        this.tenHang = x.nextLine();
        System.out.print("Nhap ma don hang: ");
        this.maHang = x.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = x.nextFloat();

    }

    public void output() {
        System.out.println("Ten don hang: " + this.tenHang);
        System.out.println("Ma don hang: " + this.maHang);
        System.out.println("Don gia: " + this.donGia);

    }

}

class HangDM extends HangHoa {
    private int thoigianbh;
    private int dienap;
    private int congsuat;

    public void setthoibh(int bh) {
        thoigianbh = bh;
    }

    public void setdienap(int ap) {
        dienap = ap;

    }

    public void setcongsuat(int cs) {
        congsuat = cs;
    }

    public int getThoiBH() {
        return thoigianbh;
    }

    public int getDienAp() {
        return dienap;
    }

    public int getCongSuat() {
        return congsuat;
    }

    public HangDM() {
        super();
        thoigianbh = 0;
        dienap = 0;
        congsuat = 0;
    }

    public HangDM(String mh, String th, float dg, int tg, int da, int cs) {
        super(mh, th, dg);
        thoigianbh = tg;
        dienap = da;
        congsuat = cs;

    }

    public void input() {
        super.input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        thoigianbh = x.nextInt();

        System.out.print("Dien ap: ");
        dienap = x.nextInt();

        System.out.print("Cong suat: ");
        congsuat = x.nextInt();

    }

    public void output() {
        super.output();
        System.out.println("Nhap thoi gian bao hanh: " + thoigianbh);
        System.out.println("Dien ap: " + dienap);
        System.out.println("Cong suat: " + congsuat);
    }

}

class HangTp extends HangHoa {
    private String ngaysx, ngayhh;

    public HangTp() {
        super();
        ngayhh = "";
        ngaysx = "";
    }

    public HangTp(String mh, String th, float dg, String nsx, String nhh) {
        super(mh, th, dg);
        ngayhh = nhh;
        ngaysx = nsx;
    }

    public void setNgaysx(String sx) {
        ngaysx = sx;

    }

    public void setNgayhh(String hh) {
        ngayhh = hh;

    }

    public String getNgaysx() {
        return ngaysx;
    }

    public String getNgayhh() {
        return ngayhh;
    }

    public void input() {
        super.input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat ");
        ngaysx = x.nextLine();
        System.out.print("Nhap ngay het han ");
        ngayhh = x.nextLine();

    }

    public void output() {
        super.output();
        System.out.print("Nhap ngay san xuat " + ngayhh);
        System.out.print("Nhap ngay het han " + ngaysx);

    }
}

class DSHangHoa {
    public static int sl;
    HangHoa ds[];

    public int getSl() {
        return sl;
    }

    public DSHangHoa() {
        sl = 0;
        ds = new HangHoa[100];
    }

    public void themHN(HangHoa h, byte loai) {
        ds[sl] = h;
        sl++;

    }

    public void xuatDSTheoLoai(byte loai) {
        String s1 = "";
        if (loai == 0) {
            s1 = "class tuan5.HangDM";
        } else
            s1 = "class tuan5.HangTp";
        for (int i = 0; i < sl; i++) {
            String s = ds[i].getClass().toString();
            if (s.equals(s1)) {
                ds[i].output();
            }
            if (s.equals(s1)) {
                ds[i].output();
            }
        }
    }

}

public class bai1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int chon;
        DSHangHoa list = new DSHangHoa();
        HangHoa h;
        do {
            System.out.println("1: Them mot mat hang vao dang sach");
            System.out.println("2: Xuat mat hang theo loai");
            System.out.println("0: Thoat");
            System.out.println("Chon chuc nang:");
            chon = x.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("1: hang dien may, 2: hang thuc pham. Hay chon loai mat hang:");
                    byte loai = x.nextByte();
                    if (loai == 1) {
                        h = new HangDM();

                    } else {
                        h = new HangTp();
                    }
                    h.input();
                    list.themHN(h, loai);
                    break;
                case 2:
                    System.out.println("Xuat danh sach mat hang nao (0-DM/1-TP): ");
                    byte loaimh = x.nextByte();
                    list.xuatDSTheoLoai(loaimh);
                    break;
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);
    }
}
