#include <iostream>
using namespace std;

int main() {
	int n[3];
	for (int i = 0; i < 3; i++) cin >> n[i];
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3 - i - 1; j++) {
			if (n[j] < n[j + 1]) {
				int tmp = n[j];
				n[j] = n[j + 1];
				n[j + 1] = tmp;
			}
		}
	}
	if (n[0] == n[1] && n[1] != n[2]) {
		cout << 1000 + 100 * n[0];
	}
	else if (n[0] != n[1] && n[1] == n[2]) {
		cout << 1000 + 100 * n[1];
	}
	else if (n[0] == n[1] && n[1] == n[2]) {
		cout << 10000 + 1000 * n[0];
	}
	else {
		cout << 100 * n[0];
	}
}