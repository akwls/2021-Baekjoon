#include <iostream>
using namespace std;
 
int main() {
    int n;
    cin >> n;
    
    for(int i=1; i<n; i++) {
        int tmp = i;
        int a = 0;
        while(tmp > 0) {
            a += tmp%10;
            tmp /= 10;
        }
        if(i + a == n) {
            cout << i;
            return 0;
        }
    }
    cout << 0;
}