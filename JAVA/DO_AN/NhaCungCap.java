import java.util.Scanner;
class NhaCungCap  {
    private String Manhacc; 
    private String tenncc; 
    private String diachi; 
    private SanPham masanpham;  

    public NhaCungCap(){
        Manhacc = ""; 
        tenncc = ""; 
        diachi = "";   
        masanpham = null;
    }  

    public NhaCungCap(String mancc, String tenncc, String diachi, SanPham sp){
        this.Manhacc = mancc; 
        this.tenncc = tenncc; 
        this.diachi = diachi; 
        this.masanpham = sp; 
    } 

    public NhaCungCap(NhaCungCap ncc){
        this.Manhacc = ncc.Manhacc; 
        this.tenncc = ncc.tenncc; 
        this.diachi = ncc.diachi; 
        this.masanpham = ncc.masanpham; 
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
    public void setMasanpham(SanPham sp){
        this.masanpham = sp; 
    } 
    public SanPham getMasanpham(){
        return masanpham; 
    } 
    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap ma nha cung cap: ");  
        Manhacc = sc.nextLine(); 
        System.out.print("Nhap ten nha cung cap: ");  
        tenncc = sc.nextLine(); 
        System.out.print("Nhap dia chi: ");  
        diachi = sc.nextLine(); 
        System.out.println("Nhap thong tin san pham cung cap: "); 
        System.out.println("Nhap thong tin do uong hoac do an? (1: do uong || 2: do an): ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        switch(choice) { 
            case 1 -> {
                System.out.println("Nhap thong tin do uong: ");
                masanpham = new Drink(); 
                masanpham.nhap();
            } 
            case 2 -> { 
                System.out.println("Nhap thong tin do an: ");
                masanpham = new Food();
                masanpham.nhap();
            }
        }
    }

    public void xuat(){
        System.out.printf("Ma nha cung cap: %s | Ten nha cung cap: %s | Dia chi: %s \n", Manhacc, tenncc, diachi); 
        System.out.println("Thong tin san pham cung cap: "); 
        masanpham.xuat(); 
    }




}
