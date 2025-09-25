#include <iostream> 
#include <string>
using namespace std; 

int DemSoLuongKT(const string &s){
    int countKT = 0; 
    for (int i = 0; i <= s.length(); i++){
        for (int j = 0; j <= s.length(); j++){
            while (j != i){
                if (s[j] == s[i] || s[j] == (s[i] - abs('a' - 'A')) || s[j] == (s[i] + abs('a' - 'A'))  ) {
                    countKT++; 
                }  
            } 
        } 
    } 
    return countKT; 
}


int main(){
    string s;
    cout << "Nhap chuoi s: "; 
    getline(cin, s); 

    int count = DemSoLuongKT(s); 
    for (int i = 0; i <= s.length(); i++){
        cout << "Ki tu " << s[i] << " co so luong la: " << count << endl; 
    }

    return 0;
}