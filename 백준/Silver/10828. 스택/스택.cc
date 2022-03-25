#include <iostream>
#include <vector>
using namespace std;


int main() {
	int length;
	cin >> length;

	vector<int> arr;
	int top = -1;

	for (int i = 0; i < length; i++) {
		string input;
		cin >> input;
		if (input == "push") {
			int n;
			cin >> n;
			arr.push_back(n);
			top++;
		}
		else if (input == "size") {
			cout << arr.size() << endl;
		}
		else if (input == "pop") {
			if (!arr.empty()) {
				cout << arr.at(top) << endl;
				arr.pop_back();
				top--;
			}
			else {
				cout << top << endl;
			}
		}
		else if (input == "empty") {
			if (arr.empty()) {
				cout << 1 << endl;
			}
			else {
				cout << 0 << endl;
			}
		}
		else if (input == "top") {
			if (arr.empty()) {
				cout << top << endl;
			}
			else {
				cout << arr.at(top) << endl;
			}
		}
	}

}