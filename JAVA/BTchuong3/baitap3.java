import java.util.Scanner; 

class Point {
    private int x; 
    private int y; 

    public Point(){
        x = 0; 
        y = 0; 
    } 

    public Point(int d1, int d2){
        this.x = d1; 
        this.y = d2;
    } 

    public Point(Point d){
        this.x = d.x; 
        this.y = d.y; 
    } 

    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap x: ");
        x = sc.nextInt(); 
        System.out.print("Nhap y: ");
        y = sc.nextInt(); 
    } 

    public void xuat(){
        System.out.printf("(%d, %d)", x, y);  
    } 

    public int getx(){
        return x; 
    } 
    public void setx(int d){
        this.x = d; 
    }
    public int gety(){
        return y;
    } 
    public void sety(int d){
        this.y = d; 
    }
}

class DOANTHANG{
    private Point diem1; // has-a
    private Point diem2; 

    public DOANTHANG(){
        diem1 = new Point(); 
        diem2 = new Point(); 
    } 

    public DOANTHANG(Point d1, Point d2){
        this.diem1 = d1; 
        this.diem2 = d2;
    } 

    public DOANTHANG(DOANTHANG d){
        this.diem1 = d.diem1; 
        this.diem2 = d.diem2; 
    } 

    public void nhap(){
        System.out.println("Nhap diem 1: "); 
        diem1 = new Point();
        diem1.nhap(); 

        System.out.println("Nhap diem 2: "); 
        diem2 = new Point(); 
        diem2.nhap();
    } 

    public void xuat(){
        System.out.print("Diem 1: ");
        diem1.xuat(); 
        System.out.print(", Diem 2: ");
        diem2.xuat(); 
        System.out.println();
    }  

    public double doDai() {
        double dx = diem1.getx() - diem2.getx();
        double dy = diem1.gety() - diem2.gety();
        return Math.sqrt(dx*dx + dy*dy);
    }
}

public class baitap3 {
    public static void main(String[] args) {   
        Point p1 = new Point(5, 7); 
        p1.xuat(); 
        Point p2 = new Point(3,4); 
        p2.xuat(); 

        System.out.println("\n");

        DOANTHANG d1 = new DOANTHANG(p1, p2); 
        d1.xuat();  
        System.out.printf("Do dai doan thang: %.2f\n", d1.doDai());

        System.out.println(); 
        System.err.println("Nhap doan thang 2: "); 

        DOANTHANG d2 = new DOANTHANG(); 
        d2.nhap(); 
        d2.xuat(); 
        System.out.printf("Do dai doan thang: %.2f\n", d2.doDai()); 
    }
}
