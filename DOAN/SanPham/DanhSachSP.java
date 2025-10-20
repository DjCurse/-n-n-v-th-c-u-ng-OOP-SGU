
import java.util.Scanner;
import java.io.IOException; 
import java.io.FileWriter; 

class DanhSachSP {
    private int n; 
    private SanPham ds[];  
    Scanner sc = new Scanner(System.in);  

    public DanhSachSP(int MaxSize){
        this.n = 0; 
        ds = new SanPham[MaxSize];
    } 

    public DanhSachSP(int num, SanPham[] sp){
        this.n = num; 
        this.ds = sp;
    } 

    public DanhSachSP(DanhSachSP ds){
        this.n = ds.n;  
        this.ds = new SanPham[ds.ds.length];
        for (int i = 0; i < ds.n; i++){
            this.ds[i] = ds.ds[i];
        }
    } 

    public void nhapDS(){ 
        System.out.print("Nhap so luong san pham: ");
        n = sc.nextInt(); 
        sc.nextLine(); 
        ds = new SanPham[n];

        for (int i = 0 ; i < n; i++){
            System.out.println("Nhap thong tin do uong hoac do an? (1: do uong || 2: do an): ");
            int choice = sc.nextInt();
            switch(choice) { 
                case 1 -> {
                    System.out.println("Nhap thong tin do uong: " + (i + 1) + ":");
                    ds[i] = new Drink(); 
                    ds[i].nhap();
                } 
                
                case 2 -> { 
                    System.out.println("Nhap thong tin do an: " + (i + 1) + ":");
                    ds[i] = new Food();
                    ds[i].nhap();
                }
            }
        }
    }    

    public void ghiFile() {
    try (FileWriter fw = new FileWriter("DSSP.txt", false)) {
        for (int i = 0; i < n; i++) {
            fw.write(ds[i].toString() + "\n");
        }
        System.out.println("Da luu vao file");
    } catch (IOException e) {
        System.out.println(" Loi khi ghi file: " + e.getMessage());
    }
}


    public boolean tonTaiMaSP(String ma) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSP().equalsIgnoreCase(ma)) {
                return true; 
            }
        }
        return false; 
    }
     
    public void setN(int num){
        this.n = num; 
    } 
    public int getN(){
        return n; 
    } 

    public void setds(SanPham[] arr){ 
        this.ds = arr; 
        this.n = ds.length;     
    } 

    public SanPham[] getds(){
        return ds;
    }  

    public void xuatDS(){
        System.out.println("Danh sach san pham: "); 
        for (int i = 0; i < n; i++){
            ds[i].xuat(); 
        }
    } 

    public void themSP() { 
        System.out.println("Nhap thong tin do uong hoac do an? (1: do uong || 2: do an): "); 
        int choice = sc.nextInt(); 
        sc.nextLine(); 
        switch(choice){
            case 1 -> {
                ds[n] = new Drink();
            }
            case 2 -> {
                ds[n] = new Food();
                
            }
        }
        ds[n].nhap();
        n++;
    } 

    public void xemSP(){
        System.out.print("Nhap ma san pham muon xem: "); 
        String ma = sc.nextLine(); 
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSP().equalsIgnoreCase(ma)) {
                ds[i].xuat(); 
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Khong tim thay san pham voi ma: " + ma);
        }
    } 

    public void xoaSP(){
        System.out.print("Nhap ma san pham muon xoa: "); 
        String ma = sc.nextLine(); 
        boolean found = false; 
        for (int i = 0; i< n; i++){
            if (ds[i].getMaSP().equalsIgnoreCase(ma)){
                for (int j = i; j < n-1; j++){
                    ds[j] = ds[j+1]; 

                } 
                ds[n-1] = null; 
                n--; 
                found = true;
                System.out.println("Da xoa san pham co ma: " + ma);
            } 
        } 
        if (!found){
            System.out.println("Khong tim thay san pham co ma: " + ma);
        }

    } 

    public void suaSP(){
        System.out.print("Nhap ma san pham muon sua: "); 
        String ma = sc.nextLine(); 
        for (int i = 0; i < n; i++) { 
            if (ds[i].getMaSP().equalsIgnoreCase(ma)) {
                System.out.println("Nhap thong tin moi cho san pham co ma: " + ma);
                ds[i].nhap();
                System.out.println("Da cap nhat thong tin san pham!");
                return;
            }
        } 
    } 

    public void TimKiemSPtheoMa(){
        System.out.print("Nhap ma san pham muon tim: "); 
        String ma = sc.nextLine();  
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaSP().equalsIgnoreCase(ma)) {
                ds[i].xuat(); 
                found = true;
                return;
            }
        } 
        if (!found) {
            System.out.println("Khong tim thay san pham voi ma: " + ma);
        }
    } 

    public void TimKiemSPtheoTen(){
        System.out.print("Nhap ten san pham muon tim: "); 
        String ten = sc.nextLine();  
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ds[i].getTen().equalsIgnoreCase(ten)) {
                ds[i].xuat(); 
                found = true;  
                return;
            }
        } 
        if (!found) {
            System.out.println("Khong tim thay san pham voi ten: " + ten);
        }
    } 


    public void thongkeSPtheoSL(){
        System.out.print("Nhap so luong san pham can thong ke: "); 
        int sl = sc.nextInt(); 
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ds[i].getSL() < sl) {
                ds[i].xuat(); 
                found = true; 
            }
        } 
        if (!found) {
            System.out.println("Khong co san pham nao co so luong nho hon: " + sl);
        }
    } 

    public void thongkeSPtheoGia(){
        System.out.print("Nhap don gia san pham can thong ke: "); 
        long gia = sc.nextLong(); 
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ds[i].getDonGia() < gia) {
                ds[i].xuat(); 
                found = true; 
            }
        } 
        if (!found) {
            System.out.println("Khong co san pham nao co don gia nho hon: " + gia);
        }
    } 

    public void thongkeSPtheoSize(){ 
        sc.nextLine();
        System.out.print("Nhap size san pham can thong ke: "); 
        String s = sc.nextLine(); 
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ds[i].getSize().equalsIgnoreCase(s) ) { 
                ds[i].xuat(); 
                found = true; 
            }
        } 
        if (!found) {
            System.out.println("Khong co san pham nao co size: " + s);
        }   
    } 

    public static void main(String[] args){
        DanhSachSP dssp = new DanhSachSP(1000); 
        dssp.nhapDS(); 
        dssp.xuatDS(); 
        dssp.ghiFile();
    }
}
