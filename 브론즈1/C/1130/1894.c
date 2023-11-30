#include <stdio.h>

struct Point
{
	long double x, y;
};

typedef struct Point Point;

Point add(Point a, Point b) {
	Point result;
	result.x = a.x + b.x;
	result.y = a.y + b.y;
	return result;
}

Point subtract(Point a, Point b) {
	Point result;
	result.x = a.x - b.x;
	result.y = a.y - b.y;
	return result;
}

int isEqual(Point a, Point b) {
	return (a.x == b.x && a.y == b.y);
}

int isLessThan(Point a, Point b) {
	return (a.x > b.x || (a.x == b.x && a.y < b.y));
}

void readPoint(Point* point) {
	scanf("%Lf %Lf", &point->x, &point->y);
}

int main() {
	Point a, b, c, d;
	while (scanf("%Lf %Lf %Lf %Lf", &a.x, &a.y, &b.x, &b.y) == 4 &&
		scanf("%Lf %Lf %Lf %Lf", &c.x, &c.y, &d.x, &d.y) == 4) {
		Point res;
		if (isEqual(a, c)) res = add(d, subtract(b, a));
		if (isEqual(a, d)) res = add(c, subtract(b, a));
		if (isEqual(b, c)) res = add(d, subtract(a, b));
		if (isEqual(b, d)) res = add(c, subtract(a, b));
		printf("%.3Lf %.3Lf\n", res.x, res.y);
	}

	return 0;
}