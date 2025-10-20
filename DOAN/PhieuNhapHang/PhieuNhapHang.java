package PhieuNhapHang; 
import NhaCungCap.NhaCungCap; 
import NhanVien.NhanVien;

import java.util.Arrays;

public class PhieuNhapHang {

    private String maPhieu;
    private String ngayNhap;
    private ChiTietPhieuNhapHang[] danhSachChiTiet;
    private int soLuongChiTiet;

    public PhieuNhapHang(String maPhieu, String ngayNhap) {
        this.maPhieu = maPhieu;
        this.ngayNhap = ngayNhap;
        this.danhSachChiTiet = new ChiTietPhieuNhapHang[10];
        this.soLuongChiTiet = 0;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    // Them chi tiet phieu nhap
    public boolean themChiTiet(ChiTietPhieuNhapHang ct) {
        if (soLuongChiTiet == danhSachChiTiet.length) {
            danhSachChiTiet = Arrays.copyOf(danhSachChiTiet, danhSachChiTiet.length * 2);
        }
        danhSachChiTiet[soLuongChiTiet] = ct;
        soLuongChiTiet++;
        return true;
    }

    // Tinh tong tien
    public double tinhTongTien() {
        double tong = 0;
        for (int i = 0; i < soLuongChiTiet; i++) {
            tong += danhSachChiTiet[i].tinhThanhTien();
        }
        return tong;
    }

    // Hien thi phieu nhap
    public void hienThiPhieu() {
        System.out.println("===== PHIEU NHAP: " + maPhieu + " | Ngay: " + ngayNhap + " =====");
        for (int i = 0; i < soLuongChiTiet; i++) {
            System.out.println((i + 1) + ". " + danhSachChiTiet[i]);
        }
        System.out.println(">>> Tong tien: " + tinhTongTien());
    }

    // Xoa chi tiet theo vi tri
    public void xoaChiTiet(int index) {
        if (index < 0 || index >= soLuongChiTiet) {
            System.out.println("Vi tri xoa khong hop le!");
            return;
        }
        for (int i = index; i < soLuongChiTiet - 1; i++) {
            danhSachChiTiet[i] = danhSachChiTiet[i + 1];
        }
        danhSachChiTiet[soLuongChiTiet - 1] = null;
        soLuongChiTiet--;
    }

    // Sua chi tiet theo vi tri
    public void suaChiTiet(int index, ChiTietPhieuNhapHang moi) {
        if (index < 0 || index >= soLuongChiTiet) {
            System.out.println("Vi tri sua khong hop le!");
            return;
        }
        danhSachChiTiet[index] = moi;
    }

    public int getSoLuongChiTiet() {
        return soLuongChiTiet;
    }
}
