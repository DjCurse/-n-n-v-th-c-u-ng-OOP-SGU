package CTPhieuNhapHang;   
import PhieuNhapHang.PhieuNhapHang;
import SanPham.SanPham;

public class ChiTietPhieuNhapHang {

    private SanPham sp;
    private int SL;
    private double donGia;

    public ChiTietPhieuNhapHang(SanPham s1, int SL, double donGia) {
        this.sp = s1;
        this.SL = SL;
        this.donGia = donGia;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public double setDonGia() {
        return donGia;
    }

    public void getDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Tinh thanh tien cho mot chi tiet phieu nhap
    public double tinhThanhTien() {
        return SL * donGia;
    }

    @Override
    public String toString() {
        return sp.getTen()
                + " | SL: " + SL
                + " | Don gia: " + donGia
                + " | Thanh tien: " + tinhThanhTien();
    }
}
