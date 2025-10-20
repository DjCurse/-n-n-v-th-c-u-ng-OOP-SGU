import java.util.Scanner;
class DanhSachncc {
    private int n; 
    private NhaCungCap ds[]; 

    public DanhSachncc(int MaxSize){
        this.n = 0; 
        ds = new NhaCungCap[MaxSize];
    } 

    public DanhSachncc(int num, NhaCungCap[] ncc){
        this.n = num; 
        this.ds = ncc;
    } 

    public DanhSachncc(DanhSachncc dsncc){
        this.n = dsncc.n;  
        this.ds = new NhaCungCap[dsncc.ds.length];
        for (int i = 0; i < dsncc.n; i++){
            this.ds[i] = dsncc.ds[i];
        }
    } 

    public void nhapDS(){ 
        Scanner sc = new Scanner(System.in);  
        System.out.print("Nhap so luong nha cung cap: ");
        n = sc.nextInt(); 
        sc.nextLine(); 
        ds = new NhaCungCap[n];

        for (int i = 0 ; i < n; i++){
            System.out.println("Nhap thong tin nha cung cap: " + (i + 1) + ":"); 
            ds[i] = new NhaCungCap();
            ds[i].nhap(new DanhSachSP(1000));
        }
    } 

    public void xuatDS(){
        System.out.println("Danh sach nha cung cap: "); 
        for (int i = 0; i < n; i++){
            ds[i].xuat(); 
        }
    } 

    public boolean tonTaiMaNCC(String ma) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getManhacc().equalsIgnoreCase(ma)) {
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

    public void setDsNCC(NhaCungCap[] ncc){
        this.ds = ncc;  
        this.n = ncc.length; 
    }  

    public NhaCungCap[] getDsNCC(){
        return ds; 
    } 

    public void themNCC(NhaCungCap ncc) {
        ds[n] = ncc; 
        n++; 
    } 

    public void xemNCC(){

    } 

    public void xoaNCC(){

    } 

    public void suaNCC(){

    } 

    public void TimKiemNCC(){  

    } 

    public void thongkeNCCTheoTen(){

    } 

    public void thongkeNCCTheoMa() {

    } 

    public void thongkeNCCTheoSP(){
        
    } 

    

}
