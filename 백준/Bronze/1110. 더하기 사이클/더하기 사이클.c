#include <stdio.h>

int main() {
    int num;
    int cnt = 0;
    scanf("%d", &num);
int n = num;
    while(1) {
        int a, b;
        a = n/10;
        b = n%10;
        int c = a + b;
        n = (b*10) + (c%10);
        cnt++;
        if(n == num) break;
    }
    printf("%d", cnt);
}