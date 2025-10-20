import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
class Dskh{
    private KhachHang[] dskh;
    private int n;
    public Dskh() {}
    public Dskh(KhachHang[] dskh,int n){
        this.dskh=dskh;
        this.n=n;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong khach hang: ");
        n=sc.nextInt();
        sc.nextLine();
        dskh = new KhachHang[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin khach hang thu "+(i+1)+":");
            dskh[i]=new KhachHang();
            dskh[i].nhap();
            try (FileWriter fw = new FileWriter("KhachHang.txt", true);
                PrintWriter pw = new PrintWriter(fw)) {
                pw.printf("Ma KH: %s | Ho ten: %s | SDT: %s | Cap bac: %s \n",
                        dskh[i].getMaKH(), dskh[i].getHoTen(),
                        dskh[i].getSDT(), dskh[i].getCapBac());
            } 
            catch (IOException e) {
                System.out.println("Loi ghi file: " + e.getMessage());
            }
        }
    }
    public void output(){
        System.out.println("Danh sach khach hang:");
        for(int i=0;i<n;i++){
            dskh[i].xuat();
        }
    }
    public void addkh(){
        dskh= Arrays.copyOf(dskh,dskh.length+1);
        dskh[n]=new KhachHang();
        dskh[n].nhap();
        n++;
    }
    public void remove(){
        Scanner sc = new Scanner(System.in);   
        System.out.print("Nhap ma khach hang can xoa: ");
        String makh=sc.nextLine();
        for(int i=0;i<n;i++){
            if(makh.equals(dskh[i].getMaKH())){
                for(int j=i;j<dskh.length-1;j++){
                    dskh[j]=dskh[j+1];
                }
                    dskh=Arrays.copyOf(dskh,dskh.length-1);
                    n--;
                    System.out.println("Xoa thanh cong!");
                    return;
            }
        } 
        System.out.println("Khong tim thay khach hang can xoa!");
    }
    public void searchkh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang can tim: ");
        String makh=sc.nextLine();
        for(int i=0;i<n;i++){
            if(makh.equals(dskh[i].getMaKH())){
                System.out.println("Thong tin khach hang can tim:");
                dskh[i].xuat();
                return;
            }
        }   
    }
    public void editKh(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma khach hang can sua: ");
        String makh=sc.nextLine();

        for(int i=0;i<n;i++){
            if(makh.equals(dskh[i].getMaKH())){
                System.out.println("Thong tin cu: ");
                dskh[i].xuat();
                System.out.println("Nhap thong tin moi: ");
                dskh[i].nhap();
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("khong tim thay khach hang can sua!");
    }
} 