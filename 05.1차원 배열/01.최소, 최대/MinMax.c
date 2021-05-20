#include <stdio.h>
int main() {
    int length;
    scanf("%d", &length);
    int a[length];
    for(int i=0; i<length; i++) {
        scanf("%d", &a[i]);
    }
    int max = a[0], min = a[0];
    for(int i=0; i<length; i++) {
        if(a[i] > max) max = a[i];
        if(a[i] < min) min = a[i];
    }
    printf("%d %d", min, max);
}