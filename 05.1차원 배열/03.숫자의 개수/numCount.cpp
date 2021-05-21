#include <iostream>
using namespace std;
int main() {
    int num = 1;
    int n;
    int a;
    int answer[10] = {0};
    for(int i=0; i<3; i++) {
        scanf("%d", &n);
        num *= n;
    }
    while(num > 0) {
        a = num%10;
        answer[a]++;
        num /= 10;
    }
    for(int i=0; i<10; i++) {
        printf("%d\n", answer[i]);
    }
}