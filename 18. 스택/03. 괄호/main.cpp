#include <iostream>
#include <vector>
using namespace std;


int main() {
	int length;
	cin >> length;

	for (int i = 0; i < length; i++) {
		vector<int> arr;
		bool check = true;
		string str;
		cin >> str;

		for (char c : str) {
			if (c == '(') {
				arr.push_back(0);
			}
			else if (c == ')') {
				if (!arr.empty()) {
					arr.pop_back();
				}
				else {
					check = false;
					break;
				}
			}
		}
		if (check == false || !arr.empty()) {
			cout << "NO" << endl;
		}
		else if(arr.empty()) cout << "YES" << endl;
	}
}