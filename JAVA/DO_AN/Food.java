 class Food extends SanPham{
    private String DoChin; 
    private String LoaiThit; 

    public Food(){
        DoChin = ""; 
        LoaiThit = ""; 
    } 

    public Food(String m, String t, int sl, char s, long d, int cal,
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
