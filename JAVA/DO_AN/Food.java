
import java.util.Scanner;

 class Food extends SanPham{
    private String DoChin; 
    private String LoaiThit; 

    public Food(){
        DoChin = ""; 
        LoaiThit = ""; 
    } 

    public Food(String m, String t, int sl, String s, long d, float cal,
    String dochin, String Lt ,String nsx, String HSD){
        super(m,t,s,d,sl,cal,nsx,HSD); 
        DoChin = dochin; 
        LoaiThit = Lt; 
    } 

    public Food(Food f){
        super((SanPham)f); 
        DoChin = f.DoChin; 
        LoaiThit = f.LoaiThit; 
    }  

    @Override
    public void nhap(){ 
        Scanner sc = new Scanner(System.in); 
        super.nhap();
        System.out.print("Nhap do chin: "); 
        DoChin = sc.nextLine(); 
        System.out.print("Nhap loai thit: "); 
        LoaiThit = sc.nextLine(); 
    } 

    @Override
    public void xuat(){ 
        super.xuat();
        System.out.printf("| Do chin: %s | Loai thit: %s \n", DoChin, LoaiThit);
    }

    public void setDoChin(String dc){
        DoChin = dc; 
    }  

    public String getDoChin(){
        return DoChin; 
    } 

    public void setLoaiThit(String lt){
        LoaiThit = lt;
    }

    public String getLoaiThit(){
        return LoaiThit;
    }
    
}
