#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {
	int n;
	scanf("%d", &n);
	int len;
	char s[20];
	for (int i = 0; i < n; i++) {
		scanf("%d", &len);
		scanf("%s", s);
		for (int j = 0; j < strlen(s); j++) {
			for (int k = 0; k < len; k++) {
				printf("%c", s[j]);
			}
		}
		printf("\n");
	}
}