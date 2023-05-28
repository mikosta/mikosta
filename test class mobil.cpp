#include <iostream>
using namespace std;

class Mobil {
public:
    string warna;
    int kecepatan;

    void maju() {
        cout << "Mobil bergerak maju dengan kecepatan " << kecepatan << " km/jam." << endl;
    }

    void berhenti() {
        cout << "Mobil berhenti." << endl;
    }
};

int main() {
    Mobil mobil1;
    mobil1.warna = "Merah";
    mobil1.kecepatan = 80;

    mobil1.maju();
    mobil1.berhenti();

    return 0;
}

