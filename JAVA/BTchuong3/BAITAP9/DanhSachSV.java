import java.util.Scanner;
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

