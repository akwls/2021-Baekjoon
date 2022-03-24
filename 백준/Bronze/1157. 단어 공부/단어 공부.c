#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
	char* s = (char*)malloc(1000000);
	int a[26] = { 0 };
	scanf("%s", s);
	for (int i = 0; s[i] != NULL; i++) {
		a[toupper(s[i]) - 65]++;
	}
	int max = -1;
	char ch;
	for (int i = 0; i < 26; i++) {
		if (a[i] > max) {
			max = a[i];
			ch = i + 65;
		}
		else if (a[i] == max) ch = '?';
	}
	printf("%c", ch);
}