#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main() {
    int a, b;
    scanf("%d%d", &a, &b);
    int* arr1 = malloc(sizeof(int) * a);
    int* arr2 = malloc(sizeof(int) * b);

    for (int i = 0; i < a; i++) {
        scanf("%d", &arr1[i]);
    }
    for (int i = 0; i < b; i++) {
        scanf("%d", &arr2[i]);
    }
    int* arr = malloc(sizeof(int) * (a + b));

    int idx = 0;
    int i, j;
    for (i = 0, j = 0; i < a && j < b;) {
        if (arr1[i] < arr2[j]) {
            arr[idx] = arr1[i];
            i++;
            idx++;
        }
        else {
            arr[idx] = arr2[j];
            j++;
            idx++;
        }
    }
    while (i < a) {
        arr[idx] = arr1[i];
        i++;
        idx++;
    }
    while (j < b) {
        arr[idx] = arr2[j];
        j++;
        idx++;
    }
    for (int k = 0; k < a + b; k++) {
        printf("%d ", arr[k]);
    }
}