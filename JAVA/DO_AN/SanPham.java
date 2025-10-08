
import java.util.Scanner;

abstract class SanPham {
    private String MaSP; 
    private String Ten; 
    private String Size;  
    private long DonGia; 
    private int SL; 
    private float Calories;  
    private String NgaySanXuat; 
    private String HSD; 

    public SanPham() { 
        MaSP = ""; 
        Ten = ""; 
        Size = ""; 
        DonGia = 0; 
        SL = 0;    
        Calories = 0; 
        NgaySanXuat = ""; 
        HSD = ""; 
    } 

    public SanPham(String MaSP, String Ten, String Size, long DonGia, int SL, float Calories, String NgaySanXuat, String HSD) {
        this.MaSP = MaSP;
        this.Ten = Ten;
        this.Size = Size;
        this.DonGia = DonGia;
        this.SL = SL;
        this.Calories = Calories;
        this.NgaySanXuat = NgaySanXuat;
        this.HSD = HSD;
    } 

    public SanPham(SanPham fd) {
        this.MaSP = fd.MaSP;
        this.Ten = fd.Ten;
        this.Size = fd.Size;
        this.DonGia = fd.DonGia;
        this.SL = fd.SL;
        this.Calories = fd.Calories;
        this.NgaySanXuat = fd.NgaySanXuat;
        this.HSD = fd.HSD;
    }  

    public void nhap(){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap ma san pham: ");  
        MaSP = sc.nextLine(); 
        System.out.print("Nhap ten san pham: ");  
        Ten = sc.nextLine(); 
        System.out.print("Nhap size: ");  
        Size = sc.nextLine();
        System.out.print("Nhap don gia: ");  
        DonGia = sc.nextLong(); 
        System.out.print("Nhap so luong: ");  
        SL = sc.nextInt(); 
        System.out.print("nhap luong Calories: ");  
        Calories = sc.nextFloat(); 

        System.out.print("Nhap ngay : ");  
        int ngay = sc.nextInt(); 

        System.out.print("Nhap thang : ");   
        int thang = sc.nextInt(); 

        System.out.print("Nhap nam : ");  
        int nam = sc.nextInt();   
        
        sc.nextLine(); 
        HSD = String.format("%02d/%02d/%04d", ngay, thang, nam);
    } 

    public void xuat(){
        System.out.printf("\n | Ma san pham: %s | Ten san pham: %s | Size: %s | don gia: %l | Calories: %f | HSD: %s "
                            , MaSP, Ten, Size, DonGia, SL, Calories, HSD); 
    } 

    public String getMaSP() {
        return MaSP;
    } 
    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    } 
    public String getTen() {
        return Ten;
    } 
    public void setTen(String Ten) {
        this.Ten = Ten;
    }   
    public String getSize() {
        return Size;
    } 
    public void setSize(String Size) {
        this.Size = Size;
    } 
    public long getDonGia() {
        return DonGia;
    } 
    public void setDonGia(long DonGia) {
        this.DonGia = DonGia;
    } 
    public int getSL() {
        return SL;
    } 
    public void setSL(int SL) {
        this.SL = SL;
    } 
    public float getCalories() {
        return Calories;
    } 
    public void setCalories(int Calories) {
        this.Calories = Calories;
    }
    public String getNgaySanXuat() {
        return NgaySanXuat;
    }
    public void setNgaySanXuat(String NgaySanXuat) {
        this.NgaySanXuat = NgaySanXuat;
    }
    public String getHSD() {
        return HSD;
    }
    public void setHSD(String HSD) {
        this.HSD = HSD;
    } 
    
    public abstract String danhGiaCalories();

}
