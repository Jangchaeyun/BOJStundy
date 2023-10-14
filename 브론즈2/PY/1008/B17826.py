scores = list(map(int, input().split(' ')))

hongik_score = int(input())
hongik_rank = scores.index(hongik_score) + 1

if 1 <= hongik_rank <= 5:
    print('A+')
elif 6 <= hongik_rank <= 15:
    print('A0')
elif 16 <= hongik_rank <= 30:
    print('B+')
elif 31 <= hongik_rank <= 35:
    print('B0')
elif 36 <= hongik_rank <= 45:
    print('C+')
elif 46 <= hongik_rank <= 48:
    print('C0')
else:
    print('F')
