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
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien n= ");
        n = sc.nextInt();
        sc.nextLine();
        ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {  
            System.out.println("Nhap thong tin sv chinh quy hoac sinh vien lien thong? (1: svcq || 2: svlt): ");
            int choice = sc.nextInt();
            switch(choice) {  // sử dụng tính đa hình
                case 1 -> {
                    System.out.println("Nhap thong tin sinh vien chinh quy: " + (i + 1) + ":");
                    ds[i] = new SVCQ(); 
                    ds[i].nhap();
                } 
                case 2 -> { // sử dụng tính đa hình
                    System.out.println("Nhap thong tin sinh vien lien thong: " + (i + 1) + ":");
                    ds[i] = new SVLT();
                    ds[i].nhap();
                }
            }
            
        }
    }

    public void themSV0TS() {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sv chinh quy hoac sinh vien lien thong? (1: svcq || 2: svlt): ");
        int choice = sc.nextInt();
        switch(choice) {  // sử dụng tính đa hình                
            case 1 -> {
                System.out.println("Nhap thong tin sinh vien chinh quy: ");
                ds[n] = new SVCQ();            
            } 
            case 2 -> { // sử dụng tính đa hình
                System.out.println("Nhap thong tin sinh vien lien thong: ");
                ds[n] = new SVLT();
            }
        } 
        ds[n].nhap();
        n++;
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

    public void inDanhSach() { 
        if (n == 0) {
            System.out.println("Danh sach rong!");
            return;
        }
        System.out.println("===== DANH SACH SINH VIEN =====");
        for (int i = 0; i < n; i++) {
            ds[i].xuat(); 
            System.out.println("---------------------------");
        }
    } 

}

