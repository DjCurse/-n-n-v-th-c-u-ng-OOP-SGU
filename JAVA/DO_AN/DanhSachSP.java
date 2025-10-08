
import java.util.Scanner;

class DanhSachSP {
    private int n; 
    private SanPham ds[]; 

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
        Scanner sc = new Scanner(System.in);  
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

    public boolean tonTaiMaSP(String ma) { // sử dụng hàm này để kiểm tra thuộc tính khóa chính
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

    public static void main(String[] args){

    }
}
