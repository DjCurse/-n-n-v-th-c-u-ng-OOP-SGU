
import java.util.Scanner; 

class SinhVien {
    private String maSV;
    private String ho;
    private String ten;
    private String ngaySinh; // định dạng: dd/MM/yyyy
    private String gioiTinh; // Nam/Nu
    private String sdt; 

    public SinhVien() {
        maSV = "";
        ho = "";
        ten = "";
        ngaySinh = "";
        gioiTinh = "";
        sdt = "";
    }

    public SinhVien(SinhVien d) {
        maSV = d.maSV;
        ho = d.ho;
        ten = d.ten;
        ngaySinh = d.ngaySinh;
        gioiTinh = d.gioiTinh;
        sdt = d.sdt;
    }

    public SinhVien(String maSV, String ho, String ten, String ngaySinh, String gioiTinh, String sdt) {
        this.maSV = maSV;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ho: ");
        ho = sc.nextLine();
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();

        System.out.print("Nhap ngay : ");  
        int ngay = sc.nextInt();

        System.out.print("Nhap thang : ");   
        int thang = sc.nextInt();

        System.out.print("Nhap nam : ");  
        int nam = sc.nextInt();  

        sc.nextLine(); // Đọc bỏ ký tự newline còn sót lại 
        ngaySinh = String.format("%02d/%02d/%04d", ngay, thang, nam);
        System.out.print("Nhap gioi tinh (Nam/Nu): ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sdt = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("MaSV: %s | Ho: %s | Ten: %s | NS: %s | GT: %s | SDT: %s\n",
                          maSV, ho, ten, ngaySinh, gioiTinh, sdt); 

    } 

    public void setMaSV(String maSV) { 
        this.maSV = maSV;
      }
    public void setHo(String ho) { 
        this.ho = ho; 
    }
    public void setTen(String ten) { 
        this.ten = ten; 
    }
    public void setNgaySinh(String ngaySinh) { 
        this.ngaySinh = ngaySinh;
    }
    public void setGioiTinh(String gioiTinh) { 
        this.gioiTinh = gioiTinh; 
    }
    
    public String getMaSV() { return maSV; }
    public String getHo() { return ho; }
    public String getTen() { return ten; }
    public String getNgaySinh() { return ngaySinh; }
    public String getGioiTinh() { return gioiTinh; }
}

class DanhSachSV {
    private SinhVien[] ds;
    private int n;

    public DanhSachSV(int maxSize) {
        ds = new SinhVien[maxSize];
        n = 0;
    }

    public DanhSachSV(DanhSachSV d) {
        n = d.n;
        this.ds = new SinhVien[d.ds.length];
        for (int i = 0; i < d.n; i++) {
            this.ds[i] = d.ds[i];
        }
    }

    public DanhSachSV(int n, SinhVien[] ds) {
        this.n = n;
        this.ds = ds;
    }

    public int getN() {
        return n;
    }

    public SinhVien[] getDs() {
        return ds;
    }

    public void setDS(SinhVien[] ds) {
        this.ds = ds;
        this.n = ds.length;
    }

    public void nhapDS() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien n= ");
        n = input.nextInt();
        input.nextLine();
        ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            ds[i] = new SinhVien();
            ds[i].nhap();
        }
    }

    public void themSV() {
        if (n < ds.length) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            ds[n] = sv;
            n++;
        } else {
            System.out.println("Danh sach day, khong the them!");
        }
    }

    public void xoaSV(String ma) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSV().equalsIgnoreCase(ma)) {
                for (int j = i; j < n - 1; j++) {
                    ds[j] = ds[j + 1];
                }
                ds[n - 1] = null;
                n--;
                found = true;
                System.out.println("Da xoa sinh vien co ma: " + ma);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ma: " + ma);
        }
    }

    public void suaSV(String ma) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSV().equalsIgnoreCase(ma)) {
                System.out.println("Nhap thong tin moi cho sinh vien co ma: " + ma);
                ds[i].nhap();
                System.out.println("Da cap nhat thong tin sinh vien!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co ma: " + ma);
    }

    public int timTENSV(String ten) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i].getTen().equalsIgnoreCase(ten)) {
                ds[i].xuat();
                count++;
            }
        }
        return count;
    }

    public int timHOSV(String ho) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i].getHo().equalsIgnoreCase(ho)) {
                ds[i].xuat();
                count++;
            }
        }
        return count;
    }

    public int timMaSV(String maSV) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSV().equalsIgnoreCase(maSV)) {
                ds[i].xuat();
                count++;
            }
        }
        return count;
    }

    public void ThongKeTheoGT(String GT) {
        System.out.println("Danh sach SV gioi tinh = " + GT + ":");
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i].getGioiTinh().equalsIgnoreCase(GT)) {
                ds[i].xuat();
                count++;
            }
        }
        System.out.println("Tong so: " + count);
    }

    public void ThongKeTheoTuoi() {
        int duoi20 = 0, tren20 = 0;
        for (int i = 0; i < n; i++) {
            int tuoi = tinhTuoi(ds[i].getNgaySinh());
            if (tuoi < 20) {
                duoi20++;
                System.out.print("Duoi 20: ");
                ds[i].xuat();
            } else {
                tren20++;
                System.out.print("Tu 20 tro len: ");
                ds[i].xuat();
            }
        }
        System.out.println("Tong so SV duoi 20: " + duoi20);
        System.out.println("Tong so SV tu 20 tro len: " + tren20);
    }

    private int tinhTuoi(String ngaySinh) {
        try {
            String[] parts = ngaySinh.split("/");
            int namSinh = Integer.parseInt(parts[2]);
            java.util.Calendar c = java.util.Calendar.getInstance();
            int namHienTai = c.get(java.util.Calendar.YEAR);
            return namHienTai - namSinh;
        } catch (Exception e) {
            return 0;
        }
    }

    public void inDanhSach() {
        System.out.println("===== DANH SACH SINH VIEN =====");
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
            System.out.println("---------------------------");
        }
    }
}


public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dssv = new DanhSachSV(100);
        dssv.nhapDS();

        while (true) { 
            System.out.println();
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them SV");
            System.out.println("2. In danh sach");
            System.out.println("3. Xoa SV theo ma");
            System.out.println("4. Sua SV theo ma");
            System.out.println("5. Tim SV theo ma");
            System.out.println("6. Tim SV theo ho");
            System.out.println("7. Tim SV theo ten");
            System.out.println("8. Thong ke gioi tinh");
            System.out.println("9. Thong ke tuoi <20");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = sc.nextInt();  
            sc.nextLine();

            switch (chon) {
                case 1 -> dssv.themSV();
                case 2 -> dssv.inDanhSach();
                case 3 -> {
                    System.out.print("Nhap ma: ");  

                    dssv.xoaSV(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Nhap ma: "); 
                    dssv.suaSV(sc.nextLine());
                }
                case 5 -> {
                    System.out.print("Nhap ma: ");
                    dssv.timMaSV(sc.nextLine());
                }
                case 6 -> {
                    System.out.print("Nhap ho: ");
                    dssv.timHOSV(sc.nextLine());
                }
                case 7 -> {
                    System.out.print("Nhap ten: ");
                    dssv.timTENSV(sc.nextLine());
                }
                case 8 -> {
                    System.out.print("Nhap gioi tinh (Nam/Nu): ");
                    dssv.ThongKeTheoGT(sc.nextLine());
                }
                case 9 -> dssv.ThongKeTheoTuoi();
                case 0 -> {
                    System.out.println("Thoat!");
                    return;
                }
                default -> System.out.println("Nhap sai!");
            }
        }
    }
}
