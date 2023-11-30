#include <stdio.h>
#include <string.h>

char map[10][20];

int main() {
    int k;
    char s[100];
    scanf("%d", &k);
    scanf("%s", s);
    int len = strlen(s);

    for (int i = 0; i < len / k; i++) {
        if (i % 2 == 0) { 
            for (int j = 0; j < k; j++) {
                map[i][j] = s[i * k + j];
            }
        }
        else {
            int c = k - 1;
            for (int j = 0; j < k; j++) {
                map[i][j] = s[i * k + c];
                c--;
            }
        }
    }

    for (int i = 0; i < k; i++) {
        for (int j = 0; j < len / k; j++) {
            printf("%c", map[j][i]);
        }
    }
    printf("\n");

    return 0;
}
