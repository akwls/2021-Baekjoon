#include <iostream>
using namespace std;

int main() {
	int hour, minute;
	cin >> hour >> minute;
	int term;
	cin >> term;

	if (minute + term >= 60) {
		hour += (minute + term) / 60;
		cout << hour%24 << " " << (minute + term) % 60;
	}
	else {
		cout << hour%24 << " " << minute + term;
	}
}