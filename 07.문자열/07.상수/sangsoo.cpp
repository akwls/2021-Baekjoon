#include <iostream>
using namespace std;

int main() {
	int a, b;
	int aa=0, bb=0;
	cin >> a >> b;
	for (int i = 100; i >= 1; i /= 10) {
		aa += (a % 10) * i;
		a /= 10;
		bb += (b % 10) * i;
		b /= 10;
	}
	cout << ((aa > bb) ? aa : bb);
}