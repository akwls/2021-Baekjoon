#include <iostream>
#include <vector>
using namespace std;


int main() {
	int length;
	cin >> length;

	vector<int> arr;

	for (int i = 0; i < length; i++) {
		int n;
		cin >> n;
		if (n != 0) {
			arr.push_back(n);
		}
		else {
			arr.pop_back();
		}
	}

	int result = 0;
	for (auto item : arr) {
		result += item;
	}
	cout << result;
}