puzzle = input()

T = int(input())

for _ in range(T):
    check = True

    Str = input()

    for i in Str:
        if i not in puzzle:
            check = False
    if len(Str) < 4 or puzzle[0] not in Str:
        check = False

    if check:
        print(Str)
