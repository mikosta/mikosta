#include <iostream>
using namespace std;

int main(){
    int pil;
    char back;
    int a = 10;
    int b = 5;
    int c;

    do{
        cout<<"0.exit"<<endl;
        cout<<"1.penjumlahan"<<endl;
        cout<<"pilih : "<<endl;
        cin>>pil;
        switch (pil){
            case 0:
              cout<<"exit"<<endl;
              return 0;
            case 1:
              c= a+b;
              cout<<c<<endl;
            break;
            default:
              cout<<"pilihan salah"<<endl;
            break;
        }
        cout<<"pilih kembali?"<<endl;
        cin>>back;
    }
    while(back !='t');
    cout<<"thanks"<<endl;
    return 0;
}
