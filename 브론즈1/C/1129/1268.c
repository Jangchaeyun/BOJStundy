#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable: 4996)
#include <stdio.h>
#include <stdbool.h>

int student[1001];
int arr[1001][6];
int max = 0;
int maxIdx = 0;

int main() {
	int n;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		student[i] = 0;
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 5; j++) {
			scanf("%d", &arr[i][j]);
		}
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < 5; k++) {
				if (arr[i][k] == arr[j][k]) {
					student[i]++;
					break;
				}
			}
		}
	}

	for (int i = 0; i < n; i++) {
		if (max < student[i]) {
			max = student[i];
			maxIdx = i;
		}
		else if (max == student[i]) {
			if (maxIdx > i) {
				maxIdx = i;
			}
		}
	}

	printf("%d", maxIdx + 1);
}