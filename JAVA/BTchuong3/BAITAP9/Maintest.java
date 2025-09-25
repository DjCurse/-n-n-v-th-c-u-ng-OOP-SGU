
import java.util.Scanner;  

public class Maintest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dssv = new DanhSachSV(100);
        dssv.nhapDS();

        while (true) { 
            System.out.println();
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them SV");
            System.out.println("2. In danh sach");
            System.out.println("3. Xoa SV theo ma");
            System.out.println("4. Sua SV theo ma");
            System.out.println("5. Tim SV theo ma");
            System.out.println("6. Tim SV theo ho");
            System.out.println("7. Tim SV theo ten");
            System.out.println("8. Thong ke gioi tinh");
            System.out.println("9. Thong ke tuoi <20");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = sc.nextInt();  
            sc.nextLine();

            switch (chon) {
                case 1 -> dssv.themSV();
                case 2 -> dssv.inDanhSach();
                case 3 -> {
                    System.out.print("Nhap ma: ");  

                    dssv.xoaSV(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Nhap ma: "); 
                    dssv.suaSV(sc.nextLine());
                }
                case 5 -> {
                    System.out.print("Nhap ma: ");
                    dssv.timMaSV(sc.nextLine());
                }
                case 6 -> {
                    System.out.print("Nhap ho: ");
                    dssv.timHOSV(sc.nextLine());
                }
                case 7 -> {
                    System.out.print("Nhap ten: ");
                    dssv.timTENSV(sc.nextLine());
                }
                case 8 -> {
                    System.out.print("Nhap gioi tinh (Nam/Nu): ");
                    dssv.ThongKeTheoGT(sc.nextLine());
                }
                case 9 -> dssv.ThongKeTheoTuoi();
                case 0 -> {
                    System.out.println("Thoat!");
                    return;
                }
                default -> System.out.println("Nhap sai!");
            }
        }
    }
}
