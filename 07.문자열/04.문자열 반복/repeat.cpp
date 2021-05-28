#include <iostream>
#include <cstring>
using namespace std;

int main() {
	int n;
	cin >> n;
	int len;
	string s;
	for (int i = 0; i < n; i++) {
		cin >> len;
		cin >> s;
		for (int j = 0; j < s.length(); j++) {
			for (int k = 0; k < len; k++) {
				cout << s.at(j);
			}
		}
		cout << endl;
	}
}