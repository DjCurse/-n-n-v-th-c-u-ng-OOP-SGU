public class SanPham {
    private String MaSP; 
    private String Ten; 
    private char Size;  
    private long DonGia; 
    private int SoLuong; 
    private int Calories;  
    private String NgaySanXuat; 
    private String HSD; 

    public SanPham() { 
        MaSP = ""; 
        Ten = ""; 
        Size = ' '; 
        DonGia = 0; 
        SoLuong = 0;    
        Calories = 0; 
        NgaySanXuat = ""; 
        HSD = ""; 
    } 

    public SanPham(String MaSP, String Ten, char Size, long DonGia, int SoLuong, int Calories, String NgaySanXuat, String HSD) {
        this.MaSP = MaSP;
        this.Ten = Ten;
        this.Size = Size;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.Calories = Calories;
        this.NgaySanXuat = NgaySanXuat;
        this.HSD = HSD;
    } 

    public SanPham(SanPham fd) {
        this.MaSP = fd.MaSP;
        this.Ten = fd.Ten;
        this.Size = fd.Size;
        this.DonGia = fd.DonGia;
        this.SoLuong = fd.SoLuong;
        this.Calories = fd.Calories;
        this.NgaySanXuat = fd.NgaySanXuat;
        this.HSD = fd.HSD;
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
    public char getSize() {
        return Size;
    } 
    public void setSize(char Size) {
        this.Size = Size;
    } 
    public long getDonGia() {
        return DonGia;
    } 
    public void setDonGia(long DonGia) {
        this.DonGia = DonGia;
    } 
    public int getSoLuong() {
        return SoLuong;
    } 
    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    } 
    public int getCalories() {
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
    
}
