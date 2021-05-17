#include <stdio.h>
int main() {
    int cnt, n;
    scanf("%d%d", &cnt, &n);
    for(int i=0; i<cnt; i++) {
        int a;
        scanf("%d", &a);
        if(a < n) printf("%d ", a);
    }
}