import java.util.Scanner;
class SinhVienLienThong extends SinhVien{
    private String tenNganhCaoDang; 
    private int namTotnghiep;

    public SinhVienLienThong() {
        super(); 
        tenNganhCaoDang = " ";
        namTotnghiep = 0;
    }

    public SinhVienLienThong(String maSV, String ho, String ten, String ngaySinh, 
                             String gioiTinh, String sdt, String tenNganhCaoDang, int nam){
        super(maSV, ho, ten, ngaySinh, gioiTinh, sdt);
        this.tenNganhCaoDang = tenNganhCaoDang;  
        this.namTotnghiep = nam;
    } 

    public SinhVienLienThong(SinhVienLienThong d) {
        super((SinhVien)d);
        this.tenNganhCaoDang = d.tenNganhCaoDang; 
        this.namTotnghiep = d.namTotnghiep;
    }

    @Override
    public void nhap() {
        super.nhap(); // gọi lại nhập chung
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nganh cao dang: ");
        tenNganhCaoDang = sc.nextLine(); 
        System.err.print("Nhap nam tot nghiep: "); 
        namTotnghiep = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat(); // in thông tin chung
        System.out.printf(" | ten nganh cao dang: %s| nam tot nghiep: %d\n", tenNganhCaoDang, namTotnghiep); 
        
    } 

    public String gettenNganhCaoDang(){
        return tenNganhCaoDang;
    } 

    public int getNamTN(){
        return namTotnghiep; 
    }
        
    public void settenNganhCaoDangg(String tennganh){
        this.tenNganhCaoDang = tennganh;
    } 

    public void setnamTN(int ntn){
        this.namTotnghiep = ntn; 
    }
}