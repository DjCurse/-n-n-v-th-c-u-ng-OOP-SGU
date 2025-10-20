import java.util.Scanner;
public class maindskh {
    public static void main(String[] args) {
        Dskh ds = new Dskh();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach khach hang");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Them khach hang");
            System.out.println("4. Xoa khach hang");
            System.out.println("5. Tim khach hang");
            System.out.println("6. Sua thong tin khach hang");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> ds.input();
                case 2 -> ds.output();
                case 3 -> ds.addkh();
                case 4 -> ds.remove();
                case 5 -> ds.searchkh();
                case 6 -> ds.editKh();
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
