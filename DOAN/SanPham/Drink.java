
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
        System.out.print("Nhap luong cafein: ");  
        cafein = sc.nextFloat(); 
        System.out.print("Nhap luong duong: "); 
        sugar = sc.nextFloat(); 
    } 
    @Override 
    public void xuat(){
        super.xuat(); 
        System.out.printf("| Luong cafein: %.0f | Luong duong: %.0f ", cafein, sugar);  
        System.out.println("");
    }    

    @Override
    public String toString() {
        return super.toString() + " | " + cafein + " | " + sugar;
    }

    @Override 
    public String danhGiaCalories() {
        float cal = getCalories();
        String size = getSize().toLowerCase();

        if (size.equals("l")) { 
            if (cal > 250) return "Cao";
            else if (cal >= 100) return "Vừa";
            else return "Thấp";
        } 
        else if (size.equals("m")) { 
            if (cal > 180) return "Cao";
            else if (cal >= 80) return "Vừa";
            else return "Thấp";
        } 
        else { 
            if (cal > 120) return "Cao";
            else if (cal >= 60) return "Vừa";
            else return "Thấp";
        }
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
