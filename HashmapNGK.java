import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
abstract class NuocGiaiKhat{
    protected String maNuoc;
    protected String tenNuoc;
    protected int HSD;
    protected int trongLuong;
    abstract void nhap();
    abstract void xuat();
    abstract void sua();
    abstract float tinhTien();
    public String getMaNuoc() {
        return maNuoc;
    }
    public void setMaNuoc(String maNuoc) {
        this.maNuoc = maNuoc;
    }
    public String getTenNuoc() {
        return tenNuoc;
    }
    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }
    public int getHSD() {
        return HSD;
    }
    public void setHSD(int HSD) {
        this.HSD = HSD;
    }
    public int getTrongLuong() {
        return trongLuong;
    }
    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    
}
class NuocNgot extends NuocGiaiKhat{
    private float doNgot;
    @Override
    float tinhTien() {
        return trongLuong*300;
    }
    @Override
    void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma nuoc:");
        this.maNuoc=sc.nextLine();
        System.out.println("Nhap ten nuoc:");
        this.tenNuoc=sc.nextLine();
        System.out.println("Nhap hsd:");
        this.HSD=sc.nextInt();
        System.out.println("Nhap trong luong:");
        this.trongLuong=sc.nextInt();
        System.out.println("Nhap do ngot:");
        this.doNgot=sc.nextFloat();
    }
    @Override
    void xuat() {
        System.out.println("Ma nuoc: "+this.maNuoc);
        System.out.println("Ten nuoc: "+this.tenNuoc);
        System.out.println("HSD: "+this.HSD+" thang");
        System.out.println("Trong luong: "+this.trongLuong);
        System.out.println("Do Ngot: "+this.doNgot);
        System.out.println("Gia tien: "+tinhTien());
    }
    public float getDoNgot() {
        return doNgot;
    }
    public void setDoNgot(float doNgot) {
        this.doNgot = doNgot;
    }
    @Override
    void sua() {
        System.out.println("Chon thong tin muon sua: ");
        System.out.println("1. Ten nuoc.");
        System.out.println("2. Han su dung.");
        System.out.println("3. Trong luong.");
        System.out.println("4. Do ngot.");
        System.out.println("Lua chon cua ban: ");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();
        switch(luaChon){
            case 1:
                System.out.println("Nhap ten moi: ");
                sc.nextLine();
                this.setTenNuoc(sc.nextLine());
                break;
            case 2:
                System.out.println("Nhap HSD moi: ");
                this.setHSD(sc.nextInt());
                break;
            case 3:
                System.out.println("Nhap trong luong moi: ");
                this.setTrongLuong(sc.nextInt());
                break;
            case 4:
                System.out.println("Nhap do ngot moi: ");
                this.setDoNgot(sc.nextFloat());
                break;
        }
    }

    

    

    

    
}
class NuocCoGas extends NuocGiaiKhat{
    private String xuatXu;
    private float tiGia;
    @Override
    float tinhTien() {
        return  (float) (trongLuong*200*tiGia);
    }
    @Override
    void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma nuoc:");
        this.maNuoc=sc.nextLine();
        System.out.println("Nhap ten nuoc:");
        this.tenNuoc=sc.nextLine();
        System.out.println("Nhap hsd:");
        this.HSD=sc.nextInt();
        System.out.println("Nhap trong luong:");
        this.trongLuong=sc.nextInt();
        sc.nextLine();//bo qua enter
        System.out.println("Nhap xuat xu:");
        this.xuatXu = sc.nextLine();
        if(this.xuatXu.equals("Chau A")) this.tiGia = (float) 0.95;
        else this.tiGia = (float) 1.5;
    }
    @Override
    void xuat() {
        System.out.println("Ma nuoc: "+this.maNuoc);
        System.out.println("Ten nuoc: "+this.tenNuoc);
        System.out.println("HSD: "+this.HSD+" thang");
        System.out.println("Trong luong: "+this.trongLuong);
        System.out.println("Gia tien: "+tinhTien());
    }
    public String getXuatXu() {
        return xuatXu;
    }
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    public float getTiGia() {
        return tiGia;
    }
    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }
    @Override
    void sua() {
        System.out.println("Chon thong tin muon sua: ");
        System.out.println("1. Ten nuoc.");
        System.out.println("2. Han su dung.");
        System.out.println("3. Trong luong.");
        System.out.println("4. Xuat xu.");
        System.out.println("Lua chon cua ban: ");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();
        switch(luaChon){
            case 1:
                System.out.println("Nhap ten moi: ");
                sc.nextLine();
                this.setTenNuoc(sc.nextLine());
                break;
            case 2:
                System.out.println("Nhap HSD moi: ");
                this.setHSD(sc.nextInt());
                break;
            case 3:
                System.out.println("Nhap trong luong moi: ");
                this.setTrongLuong(sc.nextInt());
                break;
            case 4:
                System.out.println("Nhap xuat xu moi: ");
                sc.nextLine();
                this.setXuatXu(sc.nextLine());
                if(this.xuatXu.equals("Chau A")) this.tiGia = (float) 0.95;
                else this.tiGia = (float) 1.5;
                break;
        }
    }

    
}
class DanhSachNuocGiaiKhat{
    HashMap<String,NuocGiaiKhat> dsNuoc = new HashMap<String, NuocGiaiKhat>();
    public void themNuocGiaiKhat() {
        NuocGiaiKhat newNuoc;
        System.out.println("Chon loai nuoc muon nhap: ");
        System.out.println("1. Nuoc Ngot.");
        System.out.println("2. Nuoc Co Gas.");
        System.out.println("Lua chon cua ban: ");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();
        sc.nextLine();
        if(luaChon==1){
            newNuoc = new NuocNgot();
            newNuoc.nhap();
        }
        else{
            newNuoc = new NuocCoGas();
            newNuoc.nhap();
        }
        dsNuoc.put(newNuoc.maNuoc, newNuoc);
    }
    public void xuatDanhSach(){
        System.out.println("Danh sach nuoc giai khat:");
        for(NuocGiaiKhat NGK:dsNuoc.values()){
            NGK.xuat();
        }
    }
    public void xuatNuocTheoLoaiGiaTren35K() {
        System.out.println("Chon loai nuoc muon xem: ");
        System.out.println("1. Nuoc Ngot.");
        System.out.println("2. Nuoc Co Gas.");
        System.out.println("Lua chon cua ban: ");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();
        if(luaChon==1){
            System.out.println("Danh sach nuoc ngot tren 35k:");
            for(NuocGiaiKhat NGK:dsNuoc.values()){
                if(NGK.tinhTien()>35000 && (NGK instanceof NuocNgot))
                    NGK.xuat();
            }
        }
        else{
            System.out.println("Danh sach nuoc co gas tren 35k:");
            for(NuocGiaiKhat NGK:dsNuoc.values()){
                if(NGK.tinhTien()>35000 && (NGK instanceof NuocCoGas)) //instanceof: kt xem co loai do khong
                    NGK.xuat();
            }
        }
    }
    public void timKiemNuocGiaiKhatTheoTen(){
        System.out.println("Nhap ten muon tim: ");
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        for(NuocGiaiKhat NGK:dsNuoc.values()){
            if(NGK.getTenNuoc().equals(ten)){
                NGK.xuat();
                return;
            }
        }
        System.out.println("Khong tim thay");
    }
    public void suaThongTin(){
        System.out.println("Nhap ma nuoc muon sua: ");
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        NuocGiaiKhat nuoc = dsNuoc.get(ma);
        nuoc.sua();
    }
    public void sapXepNuocCoGasGiamDanTheoGiaTien(){
        ArrayList<NuocCoGas> gasList = new ArrayList<NuocCoGas>(); //Đổ ds vào ArrayList để sắp xếp
        for(NuocGiaiKhat NGK:dsNuoc.values()){
            if(NGK instanceof NuocCoGas){
                gasList.add((NuocCoGas)NGK);
            }
        }
        Comparator<NuocCoGas> cmp = new Comparator<NuocCoGas>() {
            @Override
            public int compare(NuocCoGas t, NuocCoGas t1) {
                return t.tinhTien()<t1.tinhTien() ? 1 : -1;
            }
        };
        Collections.sort(gasList, cmp);
        System.out.println("Danh sach nuoc co gas theo gia tien giam dan:");
        for(NuocCoGas NCG:gasList){
            NCG.xuat();
        }
    }
}

public class HashmapNGK {
     public static void main(String[] args) {
        DanhSachNuocGiaiKhat dsNuocGK = new DanhSachNuocGiaiKhat();
        while(true){
            System.out.println("Chon dieu muon lam: ");
            System.out.println("1. Them nuoc giai khat");
            System.out.println("2. Xuat danh sach nuoc giai khat");
            System.out.println("3. Xuat danh sach cac loai nuoc tren 35000 theo loai");
            System.out.println("4. Tim kiem nuoc theo ten");
            System.out.println("5. Sua thong tin theo ma nuoc");
            System.out.println("6. Sap xep nuoc co gas giam dan theo gia tien");
            System.out.println("Lua chon cua ban: ");
            Scanner sc = new Scanner(System.in);
            int luaChon = sc.nextInt();
            switch(luaChon){
                case 1:
                    dsNuocGK.themNuocGiaiKhat();
                    break;
                case 2:
                    dsNuocGK.xuatDanhSach();
                    break;
                case 3:
                    dsNuocGK.xuatNuocTheoLoaiGiaTren35K();
                    break;
                case 4:
                    dsNuocGK.timKiemNuocGiaiKhatTheoTen();
                    break;
                case 5:
                    dsNuocGK.suaThongTin();
                    break;
                case 6:
                    dsNuocGK.sapXepNuocCoGasGiamDanTheoGiaTien();
                    break;
            }
        }
    }
}
