class DanhSachSP {
    private int n; 
    private SanPham arr[]; 

    public DanhSachSP(int MaxSize){
        this.n = 0; 
        arr = new SanPham[MaxSize];
    } 

    public DanhSachSP(int num, SanPham[] sp){
        this.n = num; 
        this.arr = sp;
    } 

    public DanhSachSP(DanhSachSP ds){
        this.n = ds.n;  
        this.arr = new SanPham[ds.arr.length];
        for (int i = 0; i < ds.n; i++){
            this.arr[i] = ds.arr[i];
        }
    } 

    public void nhapDS(){
        
    }
}
