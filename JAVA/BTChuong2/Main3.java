package BTChuong2;

import java.util.Scanner;

class HINHTRON { 
    // thuộc tính
    private float r; 
    private float pi = (float) Math.PI;  

    //hàm thiết lập 

    public HINHTRON(){
        r = 0; 
    }  

    public HINHTRON(float r){
        this.r = r;
    } 

    public HINHTRON(HINHTRON d){
        r = d.r; 
    }  

    // phương thức

    public void nhap(){
        Scanner input = new Scanner(System.in); 
        System.out.print("Nhap ban kinh: "); 
        r = input.nextFloat(); 
    }  

    public float chuviht(){
        return (float) 2*pi*r; 
        
    } 

    public float dientichht(){
        return (float) pi*r*r; 
    }

    public void xuat(){
        System.out.println("chu vi cua hinh tron la: " + chuviht());  
        System.out.println("dien tich cua hinh tron la: " + dientichht()); 
    }
    
}

public class Main3 {
        public static void main(String[] args){
            HINHTRON d = new HINHTRON(); 
            d.nhap();
            d.xuat(); 
            

        }
}
