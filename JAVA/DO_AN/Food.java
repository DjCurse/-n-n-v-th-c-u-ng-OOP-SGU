
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
        System.out.printf("| Do chin: %s | Loai thit: %s ", DoChin, LoaiThit);
        System.out.printf("| Danh gia calories: %s \n", danhGiaCalories());
    }  

    @Override
    public String danhGiaCalories() {
        float cal = getCalories();
        String size = getSize().toLowerCase();

        if (size.equals("l")) {
            if (cal > 400) return "Cao";
            else if (cal >= 200) return "Vừa";
            else return "Thấp";
        } 
        else if (size.equals("m")) {
            if (cal > 300) return "Cao";
            else if (cal >= 150) return "Vừa";
            else return "Thấp";
        } 
        else {
            if (cal > 200) return "Cao";
            else if (cal >= 100) return "Vừa";
            else return "Thấp";
        }
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
