#include <stdio.h>
int main() {
    int h, m;
    scanf("%d%d", &h, &m);
    if(m<45) {
        if(h<1) {
            h = 23;
        }
        else h -=1;
        m = 60 - (45-m);
    }
    else m -= 45;
    printf("%d %d", h, m);
}