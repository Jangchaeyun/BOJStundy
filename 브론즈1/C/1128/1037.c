#include <stdio.h>

int main()
{
	int a_divisor = 0;
	long long max = 0, min = 1000001;

	int nums_of_divisiors;
	scanf("%d", &nums_of_divisiors);

	for (int i = 0; i < nums_of_divisiors; i++) {
		scanf("%d", &a_divisor);

		if (a_divisor > max)
			max = a_divisor;
		if (a_divisor < min)
			min = a_divisor;
	}

	printf("%lld\n", max * min);

	return 0;
}