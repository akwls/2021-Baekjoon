#include <iostream>
using namespace std;

int check[10001] = { 0 };

int d(int n) {
	int nn = n;
	int result = n;
	while (nn > 0) {
		result += nn % 10;
		nn /= 10;
	}
	if (result < 10000) check[result] = 1;
	return result;
}

int main() {
	for (int i = 1; i <= 10000; i++) {
		d(i);
	}
	for (int i = 1; i < 10000; i++) {
		if (check[i] == 0) printf("%d\n", i);
	}
}
