C = int(input())

Max = 0

for _ in range(C):
    Str = input()
    Count = 0

    Count += Str.count("for")
    Count += Str.count("while")

    if Count > Max:
        Max = Count

print(Max)
