mask = list(map(int, input().split()))
shirt = list(map(int, input().split()))
pants = list(map(int, input().split()))

array_1 = []
array_2 = []

array_1.extend((mask[0], shirt[1], pants[0]))
array_2.extend((mask[1], shirt[0], pants[1]))

array_1.sort()
array_2.sort()

answer_array = []
answer_array.extend((array_1[0], array_2[0]))
answer_array.sort()

if answer_array[1] - answer_array[0] not in [0, 1]:
    print(answer_array[0] * 2 + 1)
else:
    print(answer_array[0] + answer_array[1])