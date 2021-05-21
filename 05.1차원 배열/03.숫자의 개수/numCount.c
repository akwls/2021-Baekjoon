#include <stdio.h>
int main() {
    int n;
    int a, b, c;
    int answer[10] = {0};
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    int num = a * b * c;
    while(num > 0) {
        n = num%10;
        answer[n]++;
        num/=10;
    }
    for(int i=0; i<10; i++) {
        printf("%d\n", answer[i]);
    }
}