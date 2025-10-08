import java.util.Scanner;

public class NhanVien {
    private String MaNV;
    private String Ho;
    private String Ten;
    private int LuongThang;
    public NhanVien() {}
    
    public NhanVien(String maNV, String ho, String ten, int luongThang) {
        this.MaNV = maNV;
        this.Ho = ho;
        this.Ten = ten;
        this.LuongThang = luongThang;
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

    public int getLuongThang() {
        return LuongThang;
    }

    public void setLuongThang(int luongThang) {
        this.LuongThang = luongThang;
    }
    public void nhap(Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        MaNV = sc.nextLine();
        System.out.print("Nhập họ: ");
        Ho = sc.nextLine();
        System.out.print("Nhập tên: ");
        Ten = sc.nextLine();
        System.out.print("Nhập lương tháng: ");
        LuongThang = sc.nextInt();
        sc.nextLine(); // tránh lỗi trôi lệnh
    }
    public void xuat() {
        System.out.printf("Mã NV: %s | Họ: %s | Tên: %s | Lương tháng: %d\n",
                           MaNV, Ho, Ten, LuongThang);
    }
}

