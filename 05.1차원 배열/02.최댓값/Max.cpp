#include <iostream>
using namespace std;
int main() {
    int a[9];
    int max_index=0;
    for(int i=0; i<9; i++) {
        cin >> a[i];
    }
    int max = a[0];
    for(int i=0; i<9; i++) {
        if(a[i] > max) {
            max = a[i];
            max_index = i;
        }
    }
    cout << max << endl;
    cout << max_index+1;
    
}