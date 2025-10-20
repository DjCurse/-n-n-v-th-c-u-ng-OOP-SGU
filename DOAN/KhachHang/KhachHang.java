import java.util.Scanner;

public class KhachHang {
    private String MaKH;
    private String HoTen;
    private String SDT;
    private String CapBac;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, String sdt, String capBac) {
        this.MaKH = maKH;
        this.HoTen = hoTen;
        this.SDT = sdt;
        this.CapBac = capBac;
    }

    public String getMaKH() { return MaKH; }
    public void setMaKH(String maKH) { this.MaKH = maKH; }
    public String getHoTen() { return HoTen; }
    public void setHoTen(String hoTen) { this.HoTen = hoTen; }
    public String getSDT() { return SDT; }
    public void setSDT(String sdt) { this.SDT = sdt; }
    public String getCapBac() { return CapBac; }
    public void setCapBac(String capBac) { this.CapBac = capBac; }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        MaKH = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap so dt: ");
        SDT = sc.nextLine();
        System.out.print("Nhap cap bac: ");
        CapBac = sc.nextLine();
    }
    public void xuat() {
        System.out.printf("Ma KH: %s | Ho ten: %s | SĐT: %s | Cap bac: %s\n", 
                           MaKH, HoTen, SDT, CapBac);
    }
}
