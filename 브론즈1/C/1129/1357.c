#include <stdio.h>

int rev(int n) {
    int sum = 0;
    while (n) {
        sum = sum * 10 + n % 10;
        n /= 10;
    }
    return sum;
}

int main() {
    int x, y;
    scanf("%d %d", &x, &y);

    printf("%d", rev(rev(x) + rev(y)));
    return 0;
}
