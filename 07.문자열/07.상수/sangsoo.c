#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a, b;
	int aa=0, bb=0;
	scanf("%d%d", &a, &b);
	for (int i = 100; i >= 1; i /= 10) {
		aa += (a % 10) * i;
		a /= 10;
		bb += (b % 10) * i;
		b /= 10;
	}
	printf("%d", (aa > bb) ? aa : bb);
}