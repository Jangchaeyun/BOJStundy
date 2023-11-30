#include <stdio.h>

int main(void) {
	int n, k;
	scanf("%d %d", &n, &k);
	int list[30] = { 0 };
	char buffer = 0;
	for (int i = 0; i < n; i++) {
		scanf("%d", &list[i]);
		scanf("%c", &buffer);
	}
	int point = n;
	while (k > 0)
	{
		for (int i = 0; i < point - 1; i++) {
			list[i] = list[i + 1] - list[i];
		}
		k--;
		point--;
	}
	for (int i = 0; i < point; i++) {
		printf("%d", list[i]);
		if (i < point - 1)
			printf(",");
	}
	return 0;
}