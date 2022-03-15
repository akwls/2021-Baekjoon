#include <iostream>
using namespace std;
 
int main() {
    int n, m;
    cin >> n >> m;
    int tmp = 0;
    int max = 0;
    int answer = 0;
    int arr[n];
    
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }
    
    for(int i=0; i<n; i++) {
        for(int j=i+1; j<n; j++) {
            for(int k=j+1; k<n; k++) {
                tmp = arr[i] + arr[j] + arr[k];
                if(tmp > max && tmp <= m) {
                    max = tmp;
                }
            }
        }
    }
    cout << max;
}