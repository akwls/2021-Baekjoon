#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main() {
	char a[100];
	int check = 0;
	scanf("%s", a);
	for (int i = 'a'; i <= 'z'; i++) {
		check = 0;
		for (int j = 0; j < strlen(a); j++) {
			if (i == a[j]) {
				printf("%d ", j);
				check = 1;
				break;
			}
		}
		if (check == 0) printf("-1 ");

	}

}