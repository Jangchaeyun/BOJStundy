#include <stdio.h>
#include <stdlib.h>

#define ll long long

int n, ck[1000001];
int prime[1000001];
int primeCount = 0;

void makePrime() {
    for (ll i = 2; i <= 1000000; i++) {
        if (ck[i])
            continue;
        for (ll j = i + i; j <= 1000000; j += i) {
            ck[j] = 1;
        }
    }
    for (ll i = 2; i <= 1000000; i++) {
        if (!ck[i]) {
            prime[primeCount++] = i;
        }
    }
}

int isValid(ll num) {
    for (int i = 0; i < primeCount; i++) {
        if (num % prime[i] == 0) {
            return 0;
        }
    }
    return 1;
}

int main() {
    scanf("%d", &n);
    makePrime();
    for (int i = 0; i < n; i++) {
        ll num;
        scanf("%lld", &num);
        if (isValid(num)) {
            printf("YES\n");
        }
        else {
            printf("NO\n");
        }
    }

    return 0;
}
