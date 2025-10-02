
import java.util.Scanner;

 class Drink extends SanPham{
    private float cafein; // dv: mg 
    private float sugar; // dv: mg/dL 

    public Drink(){ 
        super();
        cafein = 0; 
        sugar = 0; 
    } 

    public Drink(String MaSP, String Ten, String Size, 
                long DonGia, int SoLuong, float Calories, 
                String NgaySanXuat, String HSD, float caf, float su){
        super(MaSP, Ten, Size, DonGia, SoLuong, Calories, NgaySanXuat, HSD); 
        this.cafein = caf; 
        this.sugar = su; 
    } 

    public Drink(Drink dk) { 
        super((SanPham)dk); 
        this.cafein = dk.cafein; 
        this.sugar = dk.sugar; 
    } 
    @Override
    public void nhap(){ 
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap luong cafein: ");  
        cafein = sc.nextFloat(); 
        System.out.println("Nhap luong duong: "); 
        sugar = sc.nextFloat(); 
    } 
    @Override 
    public  void xuat(){
        super.xuat(); 
        System.out.printf("| Luong cafein: %f | Luong duong: %f \n", cafein, sugar); 
        
    }  

    public void setCafein(float cafe){
        this.cafein = cafe; 
    }  
    
    public void setSugar(float su){
        this.sugar = su;
    }

    public float getCafein(){
        return cafein; 
    } 

    public float getSugar(){
        return sugar;
    }



}
