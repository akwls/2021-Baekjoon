#include <iostream>
#include <math.h>
using namespace std;

int main() {
	int n;
	cin >> n;
	int tmp = 1;

	for (int i = 1; ; i++) {
		if (n <= tmp) {
			cout << i;
			return 0;
		}
		tmp += i * 6;
	}
}