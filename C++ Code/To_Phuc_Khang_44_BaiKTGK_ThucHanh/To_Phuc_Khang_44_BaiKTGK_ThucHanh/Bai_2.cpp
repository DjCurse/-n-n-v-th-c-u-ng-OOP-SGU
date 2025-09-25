#include <iostream> 
#include <cmath> 
using namespace std; 
bool IsSoChinhPhuong(int n){ 
    int CanN = sqrt(n); 
    return (CanN * CanN == n);
} 

double TBCsoChinhP(int a[], int n){
    int count = 0; 
    int SumA = 0;
    for (int i = 0; i < n; i++){
        if (IsSoChinhPhuong(a[i])) { 
            SumA += a[i]; 
            count++;
        }
    } 
    return (count == 0) ? 0 : (double)SumA / count; 
} 

int main(){
    int n; 
    int a[100]; 
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

    cout << "Trung binh cong cua so chinh phuong trong phan tu la: " << TBCsoChinhP(a, n) << endl; 
    return 0;

}