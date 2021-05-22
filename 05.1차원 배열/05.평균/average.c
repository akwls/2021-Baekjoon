#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
	int score[n];
    double score_re[n];
	int max = 0;
	double sum = 0;
	for(int i=0; i<n; i++) {
		scanf("%d", &score[i]);
	}
	for(int i=0; i<n; i++) {
		if(score[i] > max) max = score[i];
	}
	for(int i=0; i<n; i++) {
		score_re[i] = (double)score[i]/max*100;
		sum += score_re[i];
	}
	printf("%.5lf", sum/n);
}