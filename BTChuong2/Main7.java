package BTChuong2;
import java.util.Scanner; 
import java.util.Arrays;

class Array { 
    private int n; 
    private int[] arr;

    public Array() {
        n = 0;   
        arr = new int[0]; 
    } 

    public Array(int n, int[] arr) {
        this.n = n; 
        this.arr = arr;
    }   

    public Array(Array d){
        n = d.n; 
        arr = d.arr;
    } 

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
        this.n = arr.length; 
    }

    public void Nhap() { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Nhap so phan tu n: ");
        n = input.nextInt();
        arr = new int[n];  
        System.out.print("Nhap phan tu cua mang: "); 
        for (int i = 0; i < n; i++) {
            
            arr[i] = input.nextInt();
        }
    } 

    public void XuatVaTong() {
        int sum = 0;
        System.out.print("\nCac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nTong tat ca cac phan tu trong mang = " + sum); 
    }

    public void ChanVaTong() {
        int sum = 0; 
        System.out.print("\nPhan tu chan trong mang: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }
        System.out.println("\nTong cac phan tu chan = " + sum); 
    }

    public void LeVaTong() {
        int sum = 0; 
        System.out.print("\nPhan tu le trong mang: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }
        System.out.println("\nTong cac phan tu le = " + sum); 
    }

    public void NguyenToVaTong() {
        int sum = 0;
        System.out.print("\nPhan tu nguyen to: ");
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean laNguyenTo = true;
            if (num <= 1) {
                laNguyenTo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        laNguyenTo = false;
                        break;
                    }
                }
            }
            if (laNguyenTo) {
                System.out.print(num + " ");
                sum += num;
            }
        }
        System.out.println("\nTong nguyen to = " + sum); 
    }

    public void ThemPhanTu() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap phan tu moi vao mang: "); 
        int PhantuMoi = input.nextInt(); 

        arr = Arrays.copyOf(arr, n + 1);
        arr[n] = PhantuMoi; // thêm phần tử mới vào cuối
        n++; 

        System.out.println("Mang sau khi them: ");
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }
    }


    public void XoaPhanTu() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap vi tri muon xoa: "); 
        int k = input.nextInt(); 
        if (k >= 0 && k < n) {
            for (int i = k; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
        
            arr = Arrays.copyOf(arr, n - 1);
            n--; 
            
            System.out.println("Mang sau khi xoa: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Vi tri k khong hop le!");
        } 
    }

    public void TimKiem() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap so x can tim: ");
        int x = input.nextInt();
        boolean found = false;
        System.out.print("Cac vi tri tim thay " + x + ": ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println(x + " khong co trong mang.");
        } else {
            System.out.println(); // xuống dòng cho đẹp
        }
    }


    public void Xuat(){
        XuatVaTong();
        ChanVaTong();
        LeVaTong();
        NguyenToVaTong();
        ThemPhanTu();
        XoaPhanTu();
        TimKiem();
    }
}

public class Main7 {
    public static void main(String[] args) {
        Array a = new Array();
        a.Nhap();
        a.Xuat(); 

        System.out.println("\n\n----------------");

        System.out.println("So phan tu n = " + a.getN());

        System.out.print("Mang hien tai (qua getArr): ");
        for (int x : a.getArr()) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Thay mảng mới bằng setter
        int[] newArr = {10, 20, 30, 20 , 55};
        a.setArr(newArr);

        System.out.println("Mang sau khi setArr 10,20,30: ");
        for (int x : a.getArr()) {
            System.out.print(x + " ");
        }
        System.out.println("\nSo phan tu moi = " + a.getN()); 
        a.Xuat();
        
    }
}
