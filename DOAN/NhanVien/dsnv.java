import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
class Dsnv{
    private NhanVien[] dsnv;
    private int n;
    public Dsnv() {}
    public Dsnv(NhanVien[] dsnv,int n){
        this.dsnv=dsnv;
        this.n=n;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        n=sc.nextInt();
        dsnv = new NhanVien[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin nhan vien thu "+(i+1)+":");
            dsnv[i]=new NhanVien();
            dsnv[i].nhap();
             try (FileWriter fw = new FileWriter("nhanvien.txt", true);
                PrintWriter pw = new PrintWriter(fw)) {
                pw.printf("Ma NV: %s | Ho: %s | Ten: %s | Luong thang: %d\n",
                        dsnv[i].getMaNV(), dsnv[i].getHo(), dsnv[i].getTen(),
                        dsnv[i].getl1g() * dsnv[i].getsogiolam());
                } 
                catch (IOException e) {
                    System.out.println("Loi ghi file: " + e.getMessage());
                }   
        }
    }
    
    public void output(){
        System.out.println("Danh sach nhan vien:");
        for(int i=0;i<n;i++){
            dsnv[i].xuat();
        }
    }

    public void addnv(){
        dsnv= Arrays.copyOf(dsnv,dsnv.length+1);
        dsnv[n]=new NhanVien();
        dsnv[n].nhap();
        n++;
    }
    public void remove(){
        Scanner sc = new Scanner(System.in);   
        System.out.print("Nhap ma nahn vien can xoa: ");
        String manv=sc.nextLine();
        for(int i=0;i<n;i++){
            if(manv.equals(dsnv[i].getMaNV())){
                for(int j=i;j<dsnv.length-1;j++){
                    dsnv[j]=dsnv[j+1];
                    dsnv=Arrays.copyOf(dsnv,dsnv.length-1);
                    n--;
                    System.out.println("Xoa thanh cong!");
                    return;
                }
            }
        } 
    }
    public void searchnv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String manv=sc.nextLine();
        for(int i=0;i<n;i++){
            if(manv.equals(dsnv[i].getMaNV())){
                System.out.println("Thong tin nhan vien can tim:");
                dsnv[i].xuat();
                return;
            }
        } 
        System.out.println("Khong tim thay nhan vien can tim!");  
    }
    public void editnv(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can sua: ");
        String manv=sc.nextLine();
        
        for(int i=0;i<n;i++){
            if(manv.equals(dsnv[i].getMaNV())){
                System.out.println("Thong tin cu: ");
                dsnv[i].xuat();
                System.out.println("Nhap thong tin moi: ");
                dsnv[i].nhap();
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("khong tim thay nhan vien can sua!");
    }
}