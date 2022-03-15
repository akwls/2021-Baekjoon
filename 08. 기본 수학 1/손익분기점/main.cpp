#include <iostream>
#include <math.h>
using namespace std;

int main() {
	int a, b, c;
	cin >> a >> b >> c;
	int result = -1;

	if (c <= b) {
		cout << -1;
		return 0;
	}
	int answer = a / (c - b);
	if (a % (c - b) == 0) {
		answer += 1;
	}
	else {
		answer = (int)ceil((double)a / ((double)c - b));
	}
	cout << answer;
}