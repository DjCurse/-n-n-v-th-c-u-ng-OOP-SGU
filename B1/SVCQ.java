import java.util.Scanner;
class SinhVienChinhQuy extends SinhVien{
    private double diemRenLuyen; // Điểm tốt nghiệp THPT

    public SinhVienChinhQuy() {
        super();
        diemRenLuyen = 0;
    }

    public SinhVienChinhQuy(String maSV, String ho, String ten, String ngaySinh, 
                            String gioiTinh, String sdt, double diemRenLuyen) {
        super(maSV, ho, ten, ngaySinh, gioiTinh, sdt);
        this.diemRenLuyen = diemRenLuyen;
    } 

    public SinhVienChinhQuy(SinhVienChinhQuy d) {
        super((SinhVien)d);
        this.diemRenLuyen = d.diemRenLuyen;
    }

    @Override
    public void nhap() {
        super.nhap(); // gọi lại nhập chung từ lớp cha
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem tot nghiep THPT: ");
        diemRenLuyen = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); // in thông tin chung
        System.out.printf(" | Diem TN: %.2f\n", diemRenLuyen);
    }

    public double getDiemRenLuyen() {
        return diemRenLuyen;
    }
    public void setDiemRenLuyen(double diemRenLuyen) {
        this.diemRenLuyen = diemRenLuyen;
    }
}