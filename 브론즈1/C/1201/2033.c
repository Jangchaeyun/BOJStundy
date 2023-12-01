#include <stdio.h>
int main() {
	int result, n, i, count = 0;
	scanf("%d", &n);
	result = n;
	while (n / 10 > 0)
	{
		if (n % 10 > 4)
			n = n + 10;
		n = n / 10;
		count++;
	}
	for (int i = 0; i < count; i++)
		n = 10 * n;
	printf("%d", n);
}