#include <iostream>
using namespace std;

void tukarKoin(int nominal, int koin[], int jumlahKoin) {
    int jumlahKoinDiperlukan = 0;
    int i = 0;
    int jumlahSetiapKoin[jumlahKoin] = {0}; // Array untuk menyimpan jumlah setiap koin yang ditukar

    while (nominal > 0 && i < jumlahKoin) {
        if (nominal >= koin[i]) {
            int jumlah = nominal / koin[i];
            jumlahKoinDiperlukan += jumlah;
            jumlahSetiapKoin[i] = jumlah;
            nominal -= jumlah * koin[i];
        }
        i++;
    }

    if (nominal == 0) {
        cout << "Jumlah koin yang diperlukan: " << jumlahKoinDiperlukan << endl;
        cout << "Rincian koin yang ditukar:\n";
        for (int j = 0; j < jumlahKoin; j++) {
            if (jumlahSetiapKoin[j] > 0) {
                cout << "Nominal " << koin[j] << " sebanyak " << jumlahSetiapKoin[j] << " koin\n";
            }
        }
    } else {
        cout << "Tidak dapat menukar nominal dengan koin yang tersedia." << endl;
    }
}

int main() {
    int nominal;
    cout << "Masukkan nominal yang ingin ditukar: ";
    cin >> nominal;

    int jumlahKoin;
    cout << "Masukkan jumlah jenis koin yang tersedia: ";
    cin >> jumlahKoin;

    int koin[jumlahKoin];
    for (int i = 0; i < jumlahKoin; i++) {
        cout << "Masukkan nominal koin ke-" << i + 1 << ": ";
        cin >> koin[i];
    }

    tukarKoin(nominal, koin, jumlahKoin);

    return 0;
}

