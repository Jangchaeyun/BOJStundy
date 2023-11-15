T = int(input())

for i in range(T):
    a, b = input().split()
    listA = list(a)
    listB = list(b)
    if sorted(listA) == sorted(listB):
        print(a, "&", b, "are anagrams.")
    else:
        print(a, "&", b, "are NOT anagrams.")