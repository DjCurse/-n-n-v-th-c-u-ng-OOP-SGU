import java.util.Scanner; 

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dssv = new DanhSachSV(100);
        dssv.nhapDS(); 


        while (true) { 
            System.out.println();
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them SV chinh quy");
            System.err.println("2. Them SV lien thong");
            System.out.println("3. In danh sach");
            System.out.println("4. Xoa SV theo ma");
            System.out.println("5. Sua SV theo ma");
            System.out.println("6. Tim SV theo ma");
            System.out.println("7. Tim SV theo ho");
            System.out.println("8. Tim SV theo ten");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = sc.nextInt();  
            sc.nextLine();

            switch (chon) {
                case 1 -> {    
                    System.err.println("Them sinh vien (khong co tham so):");
                    dssv.themSV0TS();
                    System.err.println("Them sinh vien(co tham so):");    
                    System.out.println("Nhap thong tin sv chinh quy hoac sinh vien lien thong? (1: svcq || 2: svlt): ");
                    int choice = sc.nextInt(); 
                    if (choice == 1){
                        SVCQ sv1 = new SVCQ("312101", "Chau", "Khanh", "30/9/2006", "nam", "9453155", 50 ); 
                        dssv.themSVCOTS(sv1);
                    } else if (choice == 2){
                        SVLT sv2 = new SVLT("57897", "Nguyen", "Phuong Nam", "9/5/2003", "nu", "0986758", "Ke toan", 2024);  
                        dssv.themSVCOTS(sv2);
                    }
                    
                }
                case 3 -> dssv.inDanhSach();
                case 4-> {
                    System.err.println("Xoa sinh vien khong tham so: ");
                    dssv.xoaSV0TS();
                    System.out.println("Xoa sinh vien co tham so: ");  
                    dssv.xoaSVCOTS("57897"); 
                    dssv.xoaSVCOTS("312101");
                }
                case 5 -> {
                    System.out.print("Nhap ma: "); 
                    dssv.suaSV(sc.nextLine());
                }
                case 6 -> {
                    System.out.print("Nhap ma: ");
                    dssv.timMaSV(sc.nextLine());
                }
                case 7 -> {
                    System.out.print("Nhap ho: ");
                    dssv.timHOSV(sc.nextLine());
                }
                case 8 -> {
                    System.out.print("Nhap ten: ");
                    dssv.timTENSV(sc.nextLine());
                }
                case 0 -> {
                    System.out.println("Thoat!");
                    return;
                }
                default -> System.out.println("Nhap sai!");
            }
        }
    }
}

