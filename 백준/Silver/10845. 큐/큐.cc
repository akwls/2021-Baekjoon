#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	int arr[10000];

	int front = 0;
	int top = -1;
	int count = 0;
	string str;

	for (int i = 0; i < n; i++) {
        cin >> str;
		if (str == "push") {
			int a;
			scanf("%d\n", &a);
			arr[++top] = a;
			count++;
		}
        else if (str =="pop") {
            if (count > 0) {
                printf("%d\n", arr[front++]);
                count--;
            }
            else {
                printf("%d\n", -1);
            }
        }
        else if (str=="size") {
            printf("%d\n", count);
        }
        else if (str=="empty") {
            if (count == 0) {
                printf("%d\n", 1);
            }
            else {
                printf("%d\n", 0);
            }
        }
        else if (str=="front") {
            if (count > 0) {
                printf("%d\n", arr[front]);
            }
            else {
                printf("%d\n", -1);
            }
        }
        else if (str=="back") {
            if (count > 0) {
                printf("%d\n", arr[top]);
            }
            else {
                printf("%d\n", -1);
            }
        }
	}
}