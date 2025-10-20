import java.util.Scanner;
public class maindsnv {
    public static void main(String[] args) {
        Dsnv ds = new Dsnv();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Them nhan vien");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Tim tim nhan vien");
            System.out.println("6. Sua thong tin nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> ds.input();
                case 2 -> ds.output();
                case 3 -> ds.addnv();
                case 4 -> ds.remove();
                case 5 -> ds.searchnv();
                case 6 -> ds.editnv();
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
