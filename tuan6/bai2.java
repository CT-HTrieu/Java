package tuan6;

import java.util.Scanner;

class NhanVienCLCao extends NhanVien {
    private String trinhDo, Nganh, noiDaoTao;

    public NhanVienCLCao() {
        this.Nganh = this.trinhDo = this.noiDaoTao = "";
    }

    public NhanVienCLCao(String trinhDo, String nganh, String noi) {
        this.Nganh = nganh;
        this.noiDaoTao = noi;
        this.trinhDo = trinhDo;

    }

    public void setTrinhDO(String trinhdo) {
        this.trinhDo = trinhdo;
    }

    public void setNganh(String nganh) {
        this.Nganh = nganh;
    }

    public void setNoiDaoTao(String noi) {
        this.noiDaoTao = noi;
    }

    public String getTrinhDo() {
        return this.trinhDo;
    }

    public String getNganh() {
        return this.Nganh;
    }

    public String getNoiDaoTao() {
        return this.noiDaoTao;
    }

    public void Input() {
        super.Input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap trinh do cua ban: ");
        this.trinhDo = x.nextLine();
        System.out.print("Nhap Nganh cua ban: ");
        this.Nganh = x.nextLine();
        System.out.print("Nhap noi dao tao: ");
        this.noiDaoTao = x.nextLine();
    }

    public void Output() {
        super.Output();
        System.out.println("Trinh Do: " + this.trinhDo + " Nganh: " + this.Nganh + " Noi dao tao: " + this.noiDaoTao);
    }
}

class NVQuanLi extends NhanVienCLCao {
    private int phuCap;

    public NVQuanLi() {
        super();
        this.phuCap = 0;
    }

    public NVQuanLi(int p) {
        this.phuCap = p;
    }

    public int getPhuCap() {
        return this.phuCap;
    }

    public void setPhuCap(int p) {
        this.phuCap = p;
    }

    public void Input() {
        super.Input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap vao phu cap: ");
        this.phuCap = x.nextInt();
    }

    public void Output() {
        super.Output();
        System.out.println("Phu cap la: " + this.phuCap);
    }

}

class GiaoVien extends NhanVienCLCao {
    private int thuLao;

    public GiaoVien() {
        super();
        this.thuLao = 0;
    }

    public GiaoVien(int p) {
        this.thuLao = p;
    }

    public int getThuLap() {
        return this.thuLao;
    }

    public void setThuLao(int p) {
        this.thuLao = p;
    }

    public void Input() {
        super.Input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap vao thu lao: ");
        this.thuLao = x.nextInt();
    }

    public void Output() {
        super.Output();
        System.out.println("Thu lao la: " + this.thuLao);
    }

}

public class bai2 {
    public static void main(String[] args) {
        ConNguoi hv = new HocVien();
        NhanVien nvql = new NVQuanLi();
        NhanVien gv = new GiaoVien();
        hv.Input();
        System.out.println("In HV vua nhap");
        hv.Output();
        System.out.println("Nhap NVQL ");
        nvql.Input();
        System.out.println("In NVQL vua nhap");
        nvql.Output();
        System.out.println("Nhap GV: ");
        gv.Input();
        System.out.println("In GVvua nhap");
        gv.Output();
    }

}
