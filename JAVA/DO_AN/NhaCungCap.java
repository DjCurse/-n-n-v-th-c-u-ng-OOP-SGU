import java.util.Scanner;
class NhaCungCap  {
    private String Manhacc; 
    private String tenncc; 
    private String diachi; 
    private String Masanpham; 

    public NhaCungCap(){
        Manhacc = ""; 
        tenncc = ""; 
        diachi = "";   
        Masanpham = "";
    }  

    public NhaCungCap(String mancc, String tenncc, String diachi, String sp){
        this.Manhacc = mancc; 
        this.tenncc = tenncc; 
        this.diachi = diachi; 
        this.Masanpham = sp;
    } 

    public NhaCungCap(NhaCungCap ncc){
        this.Manhacc = ncc.Manhacc; 
        this.tenncc = ncc.tenncc; 
        this.diachi = ncc.diachi; 
        this.Masanpham = ncc.Masanpham; 
    } 

    public void setManhacc(String mancc){
        this.Manhacc = mancc; 
    } 
    public String getManhacc(){
        return Manhacc; 
    } 
    public void setTenncc(String tenncc){
        this.tenncc = tenncc; 
    } 
    public String getTenncc(){
        return tenncc; 
    } 
    public void setDiachi(String diachi){
        this.diachi = diachi; 
    } 
    public String getDiachi(){
        return diachi; 
    } 
    public void setMasanpham(String sp){
        this.Masanpham = sp; 
    } 
    public String getMasanpham(){
        return Masanpham; 
    } 
    public void nhap(DanhSachSP dsp){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap ma nha cung cap: ");  
        Manhacc = sc.nextLine(); 
        System.out.print("Nhap ten nha cung cap: ");  
        tenncc = sc.nextLine(); 
        System.out.print("Nhap dia chi: ");  
        diachi = sc.nextLine();  
        do { 
            System.out.print("Nhap ma san pham: ");
            Masanpham =  sc.nextLine();   
            if (!dsp.tonTaiMaSP(Masanpham)) { // áp dụng hàm kiểm tra bên danh sách sản phẩm
                System.out.println("Ma san pham khong ton tai. Vui long nhap lai.");
            } else {
                break; 
            }
        } while (true);
    } 

    public void xuat(){
        System.out.printf("Ma nha cung cap: %s | Ten nha cung cap: %s | Dia chi: %s | Ma san pham: %s \n", Manhacc, tenncc, diachi, Masanpham); 
        
    }

}
