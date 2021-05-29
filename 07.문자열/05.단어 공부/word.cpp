#include <iostream>
#include <cstring>
using namespace std;

int main() {
	int a[26] = { 0 };
	string s;
	cin >> s;
	for (int i = 0; i < s.length(); i++) {
		a[toupper(s.at(i))-65]++;
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
	cout << ch;
}
