#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int idx;
    int total;
    int point3;
    int point2;
} Student;

void addPoint(Student* v, int idx, int point) {
    if (point == 3)
        v[idx].point3++;
    else if (point == 2)
        v[idx].point2++;

    v[idx].total += point;
}

int compare(const void* a, const void* b) {
    const Student* studentA = (const Student*)a;
    const Student* studentB = (const Student*)b;

    if (studentA->total == studentB->total) {
        if (studentA->point3 == studentB->point3) {
            return studentB->point2 - studentA->point2;
        }
        return studentB->point3 - studentA->point3;
    }

    return studentB->total - studentA->total;
}

int main() {
    int n;
    scanf("%d", &n);
    Student* v = (Student*)malloc(3 * sizeof(Student));

    for (int i = 0; i < 3; i++)
        v[i].idx = i + 1;

    for (int i = 0; i < n; i++) {
        int a, b, c;
        scanf("%d %d %d", &a, &b, &c);

        addPoint(v, 0, a);
        addPoint(v, 1, b);
        addPoint(v, 2, c);
    }

    qsort(v, 3, sizeof(Student), compare);

    if (v[0].total == v[1].total)
        printf("0 %d\n", v[0].total);
    else
        printf("%d %d\n", v[0].idx, v[0].total);

    free(v);
    return 0;
}
