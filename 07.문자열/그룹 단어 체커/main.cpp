#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int n;
	cin >> n;
	int answer = 0;

	for (int i = 0; i < n; i++) {
		string str;
		cin >> str;
		vector<char> tmp;
		tmp.push_back(str[0]);
		for (int j = 1; j < str.length(); j++) {
			if (str[j] != str[j - 1] && !(find(tmp.begin(), tmp.end(), str[j]) != tmp.end())) {
				tmp.push_back(str[j]);
			}
			else if (str[j] != str[j - 1] && (find(tmp.begin(), tmp.end(), str[j]) != tmp.end())) {
				answer++;
				break;
			}
			else if (str[j] == str[j - 1]) {
				continue;
			}
		}
	}
	cout << n-answer;
}