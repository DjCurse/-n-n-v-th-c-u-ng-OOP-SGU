import java.util.Scanner; 

class DONGVAT {
    private String ten; 
    private int tuoi; 
    private String loai;   

    public DONGVAT() {
        this.ten = ""; 
        this.tuoi = 0; 
        this.loai = ""; 
    } 

    public DONGVAT(String ten, int tuoi, String loai) {
        this.ten = ten; 
        this.tuoi = tuoi; 
        this.loai = loai; 
    }   

    public DONGVAT(DONGVAT dv1) {
        this.ten = dv1.ten; 
        this.tuoi = dv1.tuoi; 
        this.loai = dv1.loai; 
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap ten: "); 
        ten = sc.nextLine(); 
        System.out.print("Nhap tuoi: "); 
        tuoi = sc.nextInt(); 
        sc.nextLine(); 
        System.out.print("Nhap loai: "); 
        loai = sc.nextLine(); 
    } 

    public void xuat() {
        System.out.printf("Ten: %s, tuoi: %d, loai: %s",ten,tuoi,loai); 
    } 

    public void keu() {
        System.out.println("\nDong vat keu: GRR GRR"); 
    }

    public String getTen() {
        return ten; 
    } 
    public void setTen(String ten) {
        this.ten = ten; 
    } 
    public int getTuoi() {
        return tuoi; 
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi; 
    }
    public String getLoai() {
        return loai; 
    } 
    public void setLoai(String loai) {
        this.loai = loai; 
    } 
} 

class MEO extends DONGVAT {   

    private String MauLong; 
    
    public MEO() {
        super(); 
        this.MauLong = ""; 
    }  

    public MEO(String ten, int tuoi, String loai, String MauLong) {
        super(ten,tuoi,loai); 
        this.MauLong = MauLong; 
    } 

    public MEO(MEO m1) {
        super((DONGVAT)m1); 

        this.MauLong = m1.MauLong; 
    } 

    public void nhap() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap mau long: "); 
        MauLong = sc.nextLine(); 
    }  

    public void xuat() {
        super.xuat(); 
        System.out.printf(", mau long: %s",MauLong); 
    } 

    public void keu() {
        System.out.println("\nMeo keu: Meo Meo"); 
    } 

    public String getMauLong() {
        return MauLong; 
    } 
    public void setMauLong(String MauLong) {
        this.MauLong = MauLong; 
    }   
}

public class baitap4 {
    public static void main(String[] args) {
        DONGVAT dv = new DONGVAT(); 
        dv.xuat(); 
        dv.keu(); 

        System.out.println(); 

        MEO m1 = new MEO("Tom",2,"Meo muop","Trang Den");   
        m1.xuat(); 
        m1.keu();  

        MEO m2 = new MEO("Jerry",1,"Meo mun","Cam"); 
        m2.xuat(); 
        m2.keu(); 

        System.out.println("Boxing and Unboxing: "); 

        dv = m1; 
        dv.xuat(); 
        dv.keu(); 

        m2 = (MEO) dv; 
        m2.xuat(); 
        m2.keu();

    }
}
