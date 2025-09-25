import java.util.Scanner;

class DIEM{
    private int x; 
    private int y; 
    public DIEM(){
        x = 0; 
        y = 0; 
    } 

    public DIEM(int d1, int d2){
        this.x = d1; 
        this.y = d2;
    } 

    public DIEM(DIEM d){
        this.x = d.x; 
        this.y = d.y; 
    } 

    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        x = sc.nextInt(); 
        y = sc.nextInt(); 
    } 

    public void xuat(){
        System.out.printf("x: %d, y: %d", x, y);  
    } 

    public int getx(){
        return x; 
    } 

    public void setx(int d){
        this.x = d; 
    }

    public int gety(){
        return y;
    } 
    public void sety(int d){
        this.y = d; 
    }
} 

class DiemMau extends DIEM{
    private int mau; 

    public DiemMau(){ 
        super();
        mau = 0; 
    } 
    public DiemMau(int d1, int d2, int m){
        super(d1, d2); 
        this.mau = m; 
    } 

    public DiemMau(DiemMau dm){
        super((DIEM)dm); 
        this.mau = dm.mau; 
    }  

    @Override
    public void nhap() {
        super.nhap(); // gọi lại nhập của lớp Diem
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau (int): ");
        mau = sc.nextInt();
    } 

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" | Mau: %d\n", mau);
    }
    public int getmau(){
        return mau; 
    } 

    public void setmau(int m){
        this.mau = m; 
    }
    
}

public class baitap1 {
    public static void main(String[] args) { 
        DIEM d1 = new DIEM(); 
        d1.nhap(); 
        d1.xuat(); 
        System.out.println();
        DiemMau dm1 = new DiemMau(5, 6, 128); 
        dm1.xuat(); 

        DiemMau dm2 = new DiemMau(3, 4, 255); 
        dm2.xuat(); 
        
        d1 = dm1; 
        d1.xuat(); 

        // dm1 = d1; // lỗi vì d1 là kiểu Diem, ko thể gán cho kiểu DiemMau 

        dm2 = (DiemMau)d1; // ép kiểu tường minh
        dm2.xuat();

        
    }
}
