#include <stdio.h>

int main() {
	int N;
	scanf("%d", &N);

	char input[100];
	scanf("%s", input);

	printf("%c\n", input[N - 1]);

	return 0;
}