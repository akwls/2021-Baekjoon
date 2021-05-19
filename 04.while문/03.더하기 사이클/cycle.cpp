#include <iostream>
using namespace std;

int main() {
    int num;
    int cnt = 0;
    cin >> num;
int n = num;
    while(true) {
        int a, b;
        a = n/10;
        b = n%10;
        int c = a + b;
        n = (b*10) + (c%10);
        cnt++;
        if(n == num) break;
    }
    cout << cnt;
}