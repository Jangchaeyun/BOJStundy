#include <stdio.h>

int mycount[100000] = { 0 };

int main(void)
{
	int N;

	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		int temp;
		scanf("%d", &temp);
		mycount[temp]++;
	}
	for (int i = N; i >= 0; i--)
	{
		if (mycount[i] == i)
		{
			printf("%d\n", i);
			return 0;
		}
	}
	printf("-1\n");
	return 0;
}