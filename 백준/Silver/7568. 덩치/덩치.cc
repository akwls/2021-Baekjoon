#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    
    int a[n];
    int b[n];
    int rank[n];
    
    
    for(int i=0; i<n; i++) {
        rank[i] = 1;
        cin >> a[i] >> b[i];
    }
    
    for(int i=0; i<n-1; i++) {
        for(int j=i+1; j<n; j++) {
            if(a[i] > a[j] && b[i] > b[j]) {
                rank[j]++;
            }
            else if(a[i] < a[j] && b[i] < b[j]) {
                rank[i]++;
            }
            
        }
    }
    for(int i=0; i<n; i++) {
        cout << rank[i] << " ";
    }

}