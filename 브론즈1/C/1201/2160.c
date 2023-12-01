#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define MAX 987654321

int main()
{
    int n;
    int answer = MAX;
    int firstPic, secondPic;
    char pic[5][7][50];

    scanf("%d", &n);

    for (int loop = 0; loop < n; loop++) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                scanf(" %c", &pic[i][j][loop]);
            }
        }
    }

    // 비교
    for (int pivot = 0; pivot < n; pivot++) {
        for (int target = pivot + 1; target < n; target++) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 7; j++) {
                    count += (pic[i][j][pivot] != pic[i][j][target]);

                    if (count > answer) break;
                }
            }
            if (count < answer) {
                answer = count;
                firstPic = pivot + 1;
                secondPic = target + 1;
            }
        }
    }

    printf("%d %d", firstPic, secondPic);

    return 0;
}