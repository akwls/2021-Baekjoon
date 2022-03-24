#include <iostream>
#include <string>
using namespace std;

int main() {
	int n, m;
	cin >> n >> m;
	string arr[n];
	int min = 64;

	for (int i = 0; i < n; i++) cin >> arr[i];

	for (int k = 0; k <= n - 8; k++) {
		for (int l = 0; l <= m - 8; l++) {
			int a = 0, b = 0;
			for (int i = 0+k; i < k + 8; i++) {
				for (int j = 0+l; j < l+8; j++) {
					if (i % 2 == 0) {
						if (j % 2 == 0) {
							if (arr[i][j] != 'W') {
								a++;
							}
							else b++;
						}
						else {
							if (arr[i][j] != 'B') {
								a++;
							}
							else b++;
						}
					}
					else {
						if (j % 2 == 0) {
							if (arr[i][j] != 'B') {
								a++;
							}
							else b++;
						}
						else {
							if (arr[i][j] != 'W') {
								a++;
							}
							else b++;
						}
					}
				}
			}
			if (a < b) {
				if (a < min) min = a;
			}
			else {
				if (b < min) min = b;
			}
		}
	}
	
	cout << min;
}