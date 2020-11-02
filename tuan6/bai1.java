package tuan6;

import java.util.Scanner;

class ConNguoi {
    protected String hoTen;
    protected String namSinh;

    public ConNguoi() {

        hoTen = "";
        namSinh = "";
    }

    public void sethoTen(String hoten) {
        this.hoTen = hoten;

    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;

    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getNamSinh() {
        return this.namSinh;
    }

    public void Input() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap Ho Ten: ");
        this.hoTen = x.nextLine();
        System.out.print("Nhap nam sinh dd/mm/yyyy: ");
        this.namSinh = x.nextLine();
    }

    public void Output() {
        System.out.println("Ho ten :" + this.hoTen);
        System.out.println("Nam Sinh: " + this.namSinh);
    }
}

class HocVien extends ConNguoi {
    private float d1, d2, d3;

    public HocVien() {
        super();
        this.d1 = this.d2 = this.d3;

    }

    public HocVien(float a, float b, float c) {
        this.d1 = a;
        this.d2 = b;
        this.d3 = c;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public void setD2(float d2) {
        this.d2 = d2;

    }

    public void setD3(float d3) {
        this.d3 = d3;
    }

    public float getD1() {
        return this.d1;
    }

    public float getD2() {
        return this.d2;
    }

    public float getD3() {
        return this.d3;
    }

    public void Input() {
        super.Input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap diem thu 1: ");
        this.d1 = x.nextFloat();
        System.out.print("Nhap diem thu 2: ");
        this.d2 = x.nextFloat();
        System.out.print("Nhap diem thu 3: ");
        this.d3 = x.nextFloat();
    }

    public void Output() {
        super.Output();
        System.out.println("Diem mon thu 1:" + this.d1 + " Diem mon thu 2: " + this.d2 + " Diem mon thu 3: " + this.d3);
    }
}

class NhanVien extends ConNguoi {
    private int luong;
    private String ngayNhanViec;
    private PhongBanKhoa Pbk;

    public NhanVien() {
        super();
        this.luong = 0;
        this.ngayNhanViec = "";
        this.Pbk = new PhongBanKhoa();
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setNgayNhanViec(String nn) {
        this.ngayNhanViec = nn;
    }

    public void Pbk(PhongBanKhoa pbk) {
        this.Pbk = pbk;
    }

    public int getLuong() {
        return this.luong;
    }

    public String getNgayNhanViec() {
        return this.ngayNhanViec;
    }

    public PhongBanKhoa getPbk() {
        return this.Pbk;
    }

    public void Input() {
        super.Input();
        Scanner x = new Scanner(System.in);
        System.out.println("NHap vao luong: ");
        this.luong = x.nextInt();
        System.out.print("Nhap vao ngay nhan viec dd/mm/yyyy: ");
        this.ngayNhanViec = x.next();
        this.Pbk.Input();

    }

    public void Output() {
        super.Output();
        System.out.println("Luong :" + this.luong + " Ngay nhan viec: " + this.ngayNhanViec);
        this.Pbk.Output();
    }

    class PhongBanKhoa {
        private String MaPBK;
        private String namePBK;

        public PhongBanKhoa() {
            MaPBK = "";
            namePBK = "";
        }

        public void setMaPBK(String a) {
            MaPBK = a;
        }

        public void setNamePBK(String a) {
            namePBK = a;
        }

        public String getMaPBK() {
            return MaPBK;
        }

        public String getNamePBK() {
            return namePBK;
        }

        public void Input() {
            Scanner x = new Scanner(System.in);
            System.out.println("Nhap vao ma PBK: ");
            this.MaPBK = x.nextLine();
            System.out.println("Nhap vao ten PBK: ");
            this.namePBK = x.nextLine();
        }

        public void Output() {
            System.out.println("Ma PBK: " + this.MaPBK);
            System.out.println("Ten PBK: " + this.namePBK);
        }
    }

}

public class bai1 {
    public static void main(String[] args) {
        ConNguoi n = new HocVien();
        ConNguoi m = new NhanVien();
        m.Input();
        m.Output();
    }
}
