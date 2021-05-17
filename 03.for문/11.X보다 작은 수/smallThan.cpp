#include <iostream>
using namespace std;
int main() {
    int cnt;
    cin >> cnt;
    int n;
    cin >> n;
    for(int i=0; i<cnt; i++) {
        int a;
        cin >> a;
        if(a < n) cout << a << " ";
    }
}