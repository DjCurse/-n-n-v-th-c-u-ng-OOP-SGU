package BTChuong2;

import java.util.Scanner;

class SoNguyen { 
        // thuộc tính 
        private int n; 

        // hàm thiết lập
        public SoNguyen(){
            n = 0; 
        } 
        
        public SoNguyen(int n){
            this.n = n; 
        }  

        public SoNguyen(SoNguyen d){
            n = d.n; 
        }
        
        //get/set thuộc tính
        public int getN(){
            return n;
        } 

        public void setN(int N){
            n = N;
        }

        // phương thức 
        public void Nhap(int dn){
            n = dn;
        }

        public int TongSoTN(){ 
            int sumA = 0;   
            System.out.println("\ncau a) Tat ca so tu nhien <= "+n+": ");
        
            for (int i = 0; i <= n; i++){ 
                System.out.print(i + " "); 
                sumA += i;                  
            }  
            return sumA; 
        } 

        public int TongSoChan() {   
            int sumB = 0;  
            System.out.println("\ncau b) Tat ca so tu nhien chan <= "+n+": ");
        
            for (int i = 0; i <= n; i++){
                if ( i % 2 == 0) {
                    System.out.print(i + " ");
                    sumB += i;
                }
            }  
            return sumB;
        } 

        public int TongSoLe(){
            int sumC = 0;  
            System.out.println("\ncau c) Tat ca so tu nhien le <= "+n+": ");
        
            for (int i = 0; i <= n; i++){
                if ( i % 2 != 0) {
                    System.out.print(i + " ");
                    sumC += i;
                }
            }   
            return sumC;
        } 

        public int TongSoNT(){
            int sumD = 0; 
            System.out.println("\ncau d) Tat ca so tu nhien la so nguyen to <= "+n+": "); 
                
            for (int i = 2; i <= n; i++){ 
                boolean LaSoNguyenTo = true; 
                for (int j = 2; j <= Math.sqrt(i);j++){ 
                    if (i % j == 0){
                        LaSoNguyenTo = false; 
                        break;
                    } 

                    if (LaSoNguyenTo){ 
                        System.out.print(i+ " "); 
                        sumD += i;

                    }
                }
            }  
            return sumD;
        } 


        public void SoNguyenToSau(){
            System.out.println("\nCau e) "+ n + " so nguyen to dau tien"); 
            int count = 0, num = 2; 
            while (count < n){
                boolean LaSoNguyenTo = true; 
                for (int i = 2; i <= Math.sqrt(num);i++){ 
                    if (num % i ==0){
                        LaSoNguyenTo = false; 
                        break;   
                    }
                } 
                if (LaSoNguyenTo){
                    System.out.print(num + " ");
                    count++; 
                    
                }num++;
            }
        }


        public void Xuat(){ 
            TongSoTN(); 
            TongSoChan(); 
            TongSoLe(); 
            TongSoNT(); 
            SoNguyenToSau();
        }
}

public class Main6 { 
    public static void main(String[] args) {
        SoNguyen d = new SoNguyen(); 
        d.Nhap(6); 
        d.Xuat();   
        System.out.println("");
        System.out.println("\n ket qua cua ham get/set:");
        d.setN(24);
        System.out.println("Gia tri sau khi gan: "+d.getN()); 
        d.Xuat();
    }

}
