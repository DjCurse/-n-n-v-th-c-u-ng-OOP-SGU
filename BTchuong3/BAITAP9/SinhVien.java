import java.util.Scanner;
class SinhVien {
    private String maSV;
    private String ho;
    private String ten;
    private String ngaySinh; 
    private String gioiTinh; 
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
    public void setSdt(String sdt) { 
        this.sdt = sdt; 
    }
    
    public String getMaSV() { return maSV; }
    public String getHo() { return ho; }
    public String getTen() { return ten; }
    public String getNgaySinh() { return ngaySinh; }
    public String getGioiTinh() { return gioiTinh; } 
    public String getSdt() { return sdt;}

}
