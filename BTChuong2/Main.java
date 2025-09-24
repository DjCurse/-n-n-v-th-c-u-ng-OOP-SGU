package BTChuong2;

class DIEM {
    private float x; 
    private float y; // các thuộc tính điểm tọa độ x, y  

    // phhương thức đặc biệt ( hàm thiết lập khởi tạo đối tượng) 
    public DIEM(){
        x = 0; 
        y = 0; 
    } 
    
    public DIEM(float x, float y){
        this.x = x; 
        this.y = y; 
    } // hàm thiết lập có tham số (gán tham số vào thuộc tính của x, y), phân biệt đâu là biến, đâu là thuộc tính

    public DIEM(DIEM d){
        x = d.x; 
        y = d.y;
    } 

    // phương thức  
    public void nhap(int n, int m) {
        x = n;
        y = m;
    } 
    public void xuat(){
        System.out.println("(x= "+ x +", y= "+ y +")"); 
    } 
    public void dichuyen(float dx, float dy){
        x += dx; 
        y += dy;
    }    

    public float getX(){
        return x;
    }  

    public float getY(){ return y;}

    public void setX(float XX){
        x = XX;
    }  
    public void setY(float YY){
        x = YY;
    } 

    
} 

public class Main {
        public static void main(String[] args){
            DIEM d = new DIEM();// tạo điểm 
            d.nhap(5,8); 
            System.out.println("\nToa do vua nhap:"); 
            d.xuat();   
            System.out.println("\nToa do sau khi di chuyen:"); 
            d.dichuyen(-2, 3); 
            d.xuat();

            System.out.println("\nThu nghiem get/set thuoc tinh:"); 
            DIEM d1=new DIEM(); 
            d1.xuat();
	        DIEM d2=new DIEM(7,9); 
            d2.xuat();
	        DIEM d3=new DIEM(d2);
            d3.xuat();

            d2.setX(100);   
            d2.setY(555);

            System.out.println(d2.getX() + ", "+ d2.getY());
            
            d2.xuat();
            
        }
}
