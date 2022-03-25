#include <stdio.h>

int main(void) {
	int n;
	int sum=0;
	scanf("%d", &n);
	char result[n][80];
	for(int i=0; i<n; i++) {
		sum = 0;
		scanf("%s", result[i]);
		for(int j=0; result[i][j] != 0; j++) {
			if(result[i][j] == 'O') {
				for(int k=j; result[i][k] == 'O'; k--) {
					sum++;
				}
			}
		}
		printf("%d\n", sum);
	}
	return 0;
}
