//a)
#include <iostream> 
#include <cmath>

using namespace std;
void NhapMang(int a[], int n){
    do {
        cout << "Nhap so phan tu n (5 <= n <= 50): "; 
        cin >> n; 
        if (n < 5 || n > 50){
            cout << "Nhap lai phan tu n!" <<endl;
        }
    } while (n < 5 || n > 50); 

    for (int i = 0; i < n; i++){
        cout << "Nhap gia tri phan tu a["<< i+1<< "]= "; 
        cin >> a[i];  
    }
}


//b) 
bool IsSoChinhPhuong(int n){ 
    int CanN = sqrt(n); 
    return (CanN * CanN == n);
}  

int SoChinhPNN(int a[], int n){
    int SCPNN = -1; 
    for (int i = 0; i < n; i++){
        if (IsSoChinhPhuong(a[i])){
            if (SCPNN == -1 || a[i] < SCPNN){
                SCPNN = a[i]; 
            } 
        }
    }  
    return (SCPNN == -1) ? 0 : SCPNN; 
} 
// c) 
void Deletedublicate(int a[], int &n){
    for (int i = 0; i < n -1 ; i++){
        for (int j = i + 1; j < n; ){
            if (a[i] == a[j]){
                for (int k = j; k < n - 1; k++){
                    a[k] = a[k+1];
                } 
                n--;
            }else {
                j++;
            }
        }
    }
}

int main(){
    int n; 
    int a[100]; 
    
    NhapMang(a, n);

    Deletedublicate(a, n);
    int SCPNN = SoChinhPNN(a, n); 
    cout << "So chinh phuong nho nhat trong mang la: " << SCPNN << endl;

    return 0;
}



