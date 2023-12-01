#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable: 4996)
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

char arr[1000][20];
char newArr[1000][20];
char ans[1000][20];

int main() {
    int n;
    int cnt = 0;
    while (1) {
        scanf("%d", &n);
        if (n == 0) {
            break;
        }
        for (int i = 0; i < n; i++) {
            char c[20] = {};
            scanf("%s", c);

            for (int j = 0; j < strlen(c); j++) {
                arr[i][j] = c[j];
                if (c[j] >= 'a' && c[j] <= 'z') {
                    c[j] = c[j] - 'a' + 'A';
                }
            }

            for (int j = 0; j < strlen(c); j++) {
                newArr[i][j] = c[j];
            }
        }
        int minindex = 0;

        for (int i = 0; i < n; i++) {
            int ans = 0;
            ans = strcmp(newArr[minindex], newArr[i]);
            if (ans > 0) {
                minindex = i;
            }
        }

        printf("%s", arr[minindex]);
        printf("\n");
    }

    return 0;
}