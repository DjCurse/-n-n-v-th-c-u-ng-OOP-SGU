package BTChuong2;

import java.util.Scanner;

class Chuoi {
    private String s;     

    public Chuoi() {
        this.s = "";
    }

    public Chuoi(String s) {
        this.s = s;
    } 

    public String getS(){
        return s; 
    }

    public void setS(String s){
        this.s = s; 
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        s = input.nextLine();

    } 

    public void Xoakhoangtrang() {
    String BoTrang = "";
    int start = 0, end = s.length() - 1;

    // Bỏ khoảng trắng đầu
    while (start <= end && s.charAt(start) == ' ') {
        start++;
    }
    // Bỏ khoảng trắng cuối
    while (end >= start && s.charAt(end) == ' ') {
        end--;
    }

    boolean space = false;  
    for (int i = start; i <= end; i++) {
        char c = s.charAt(i);
        if (c == ' ') {
            if (!space) {  // chỉ thêm 1 khoảng trắng nếu trước đó chưa có
                BoTrang += " ";
                space = true;
            }
        } else {
            BoTrang += c;
            space = false;
        }
    }

    s = BoTrang;
    }


    public void DoDai() {
        System.out.println("\nDo dai cua chuoi la: " + s.length());
    }

    public void SoTu() {
        System.out.println("\nChuoi sau khi xoa khoang trang thua: \"" + s + "\"");
        String[] words = s.split(" ");
        System.out.println("So tu trong chuoi = " + words.length);
        System.out.println("Cac tu trong chuoi:");
        for (String w : words) {
            System.out.println(w);
        }
    }

    public void LayKyTuTraiPhai() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap so tu nhien k: ");
        int k = input.nextInt();
        if (k <= s.length()) {
            String left = s.substring(0, k);
            String right = s.substring(s.length() - k);
            System.out.println("k ky tu ben trai: " + left);
            System.out.println("k ky tu ben phai: " + right);
        } else {
            System.out.println("k > do dai chuoi!");
        }
    }

    public void CatChuoi() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap vi tri k: ");
        int k2 = input.nextInt();
        System.out.print("Nhap so n: ");
        int n = input.nextInt();

        if (k2 >= 0 && k2 < s.length()) {
            int end = Math.min(k2 + n, s.length());
            String sub = s.substring(k2, end);
            System.out.println(n + " ky tu bat dau tu vi tri " + k2 + ": " + sub);
        } else {
            System.out.println("Vi tri k khong hop le!");
        }
    } 

    public void Xuat(){  
        System.out.println("Chuoi ban vua nhap: \"" + s + "\"");
        Xoakhoangtrang();
        DoDai();             
        SoTu();           
        LayKyTuTraiPhai();  
        CatChuoi();
    }
}

public class Main8 {
    public static void main(String[] args) {
        Chuoi d = new Chuoi();

        d.Nhap(); 
        d.Xuat();          

        d.setS("To Phuc Khang   Dai hoc Sai Gon SGU  University"); 
        System.out.println(d.getS()); 
        d.Xuat();
    }
}
