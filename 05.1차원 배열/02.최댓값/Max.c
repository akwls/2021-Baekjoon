#include <stdio.h>
int main() {
    int a[9];
    for(int i=0; i<9; i++) {
        scanf("%d", &a[i]);
    }
    int max = a[0];
    int max_index = 0;
    for(int i=0; i<9; i++) {
        if(a[i] > max) {
            max = a[i];
            max_index = i;
        }
    }
    printf("%d\n%d", max, max_index+1);
}