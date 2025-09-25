package BTChuong2;

import java.util.Scanner;

class HINHCHUNHAT {
    // thuộc tính
    private int cd; 
    private int cr; 

    // hàm thiết lập

    public HINHCHUNHAT(){
        cd = 0; 
        cr = 0;
    } 
    public HINHCHUNHAT(int cd, int cr){
        this.cd = cd; 
        this.cr = cr;
    } 

    public HINHCHUNHAT(HINHCHUNHAT d){
        cd = d.cd; 
        cr = d.cr;
    } 

    public int getCd() {
        return cd;
    } 

    public void setCd(int X){
        cd = X;
    }

    // phuong thức 
    public void nhap(int x, int y){ 
        cd = x; 
        cr = y;  
        
    } 

    public int Dientich(){
        return cd*cr;
    } 

    public int ChuVi(){ 
        return (cd+cr)*2;
    } 
    
    public void xuat(){
        System.out.println("Chu vi cua hinh chu nhat: " +ChuVi()); 
        System.out.println("Dien tich cua hinh chu nhat: " + Dientich());
    } 

    
}

public class Main2 {
    public static void main(String[] args){
        HINHCHUNHAT d = new HINHCHUNHAT(); 
        d.nhap(6,7); 
        d.xuat(); 
    }
}








