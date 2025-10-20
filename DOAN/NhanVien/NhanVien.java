import java.util.Scanner;

public class NhanVien {
    private String MaNV;
    private String Ho;
    private String Ten;
    private int l1g;
    private int sogiolam;
    public NhanVien() {}
    
    public NhanVien(String maNV, String ho, String ten, int l1g,int sogiolam) {
        this.MaNV = maNV;
        this.Ho = ho;
        this.Ten = ten;
        this.l1g = l1g;
    }
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        this.MaNV = maNV;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String ho) {
        this.Ho = ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        this.Ten = ten;
    }

    public int getl1g() {
        return l1g;
    }

    public void setl1g(int l1g) {
        this.l1g = l1g;
    }
    public int getsogiolam() {
        return sogiolam;
    }

    public void setsogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nv: ");
        MaNV = sc.nextLine();
        System.out.print("Nhap ho: ");
        Ho = sc.nextLine();
        System.out.print("Nhap ten: ");
        Ten = sc.nextLine();
        System.out.print("Nhap tien luong 1 gio lam: ");
        l1g = sc.nextInt();
        System.out.print("Nhap so gio lam cua ca thang: ");
        sogiolam = sc.nextInt();
        sc.nextLine();
    }
    public void xuat() {
        System.out.printf("Ma NV: %s | Ho: %s | Ten: %s | Luong thang: %d\n",
                           MaNV, Ho, Ten, l1g*sogiolam);
    }
}

