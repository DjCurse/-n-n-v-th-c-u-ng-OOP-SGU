package BTChuong2;

import java.util.Scanner; 
class SinHVIEN {  
    //thuộc tính
    private String hoten;  
    private String maSV;  
    private String lop; 
    private float diem1; 
    private float diem2; 
    private float diem3; 

    //hàm thiết lập

    public SinHVIEN() {
        maSV = "";
        hoten = "";
        lop = "";
        diem1 = 0;
        diem2 = 0;
        diem3 = 0;
    }

    public SinHVIEN(String maSV, String hoten, String lop, float diem1, float diem2, float diem3) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }  

    public SinHVIEN(SinHVIEN d) {
        maSV = d.maSV;
        hoten = d.hoten;
        lop = d.lop;
        diem1 = d.diem1;
        diem2 = d.diem2;
        diem3 = d.diem3;
    }
     


    //phương thức
    public void nhap(){ 
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ho va ten: "); 
        hoten = in.nextLine();  

        System.out.print("Nhap ma so sinh vien: "); 
        maSV = in.nextLine();  

        System.out.print("Nhap lop: "); 
        lop = in.nextLine();   

        System.out.print("Nhap diem mon 1: "); 
        diem1 = in.nextInt(); 

        System.out.print("Nhap diem mon 2: "); 
        diem2 = in.nextInt();  

        System.out.print("Nhap diem mon 3: "); 
        diem3 = in.nextInt(); 

    }

    public float DIEMTB(){ 
        return (diem1+diem2+diem3)/3; 
    } 

    public void XepHang(){
        float dtb = DIEMTB();
        if ( dtb >= 8){
            System.out.println("Sinh vien dat muc gioi!");
        } else if (dtb >= 6.5) {
            System.out.println("Sinh vien dat muc kha!");
        } else if (dtb >= 5) {
            System.out.println("Sinh vien dat muc trung binh!");
        } else {
            System.out.println("Sinh vien dat muc yeu!");
        }

    }  

    public void xuat(){ 
        

        System.out.println("\nTHONG Tin SinH VIEN:"); 
        System.out.println("\nHo va ten: "+ hoten); 
        System.out.println("\nMa so sinh vien: "+maSV); 
        System.out.println("\nLop: "+lop);  
        System.out.println("\nDiem mon 1: "+diem1);  
        System.out.println("\nDiem mon 2: "+diem2);  
        System.out.println("\nDiem mon 3: "+diem3);  
        System.out.println("\nDiem trung binh cua sinh vien: "+DIEMTB());  
        XepHang();
        
    }
}

public class Main4 { 
    public static void main(String[] args) {
        SinHVIEN d = new SinHVIEN();  
        d.nhap(); 
        d.xuat();
    }
    
}
