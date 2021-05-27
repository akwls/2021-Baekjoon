#include <iostream>
#include <cstring>
using namespace std;

int main() {
	string a;
	int check = 0;
	cin >> a;
	for (int i = 'a'; i <= 'z'; i++) {
		check = 0;
		for (int j = 0; j < a.length(); j++) {
			if (i == a.at(j)) {
				printf("%d ", j);
				check = 1;
				break;
			}
		}
		if (check == 0) printf("-1 ");

	}
}