#include <iostream>
#include <vector>
#include <sstream>
using namespace std;

int main() {
	while(true) {
		vector<int> arr;
		bool check = true;
		string str;
		getline(cin, str);

		if (str == ".") break;

		for (char c : str) {
			if (c == '(') {
				arr.push_back(1);
			}
			else if (c == '[') {
				arr.push_back(2);
			}
			else if (c == ')') {
				if (!arr.empty() && arr.at(arr.size() - 1) == 1) {
					arr.pop_back();
				}
				else {
					check = false;
					break;
				}
			}
			else if (c == ']') {
				if (!arr.empty() && arr.at(arr.size() - 1) == 2) {
					arr.pop_back();
				}
				else {
					check = false;
					break;
				}
			}
			else if (c == '.') {
				break;
			}
		}
		if (check == false || !arr.empty()) {
			cout << "no" << endl;
		}
		else cout << "yes" << endl;
	}
}