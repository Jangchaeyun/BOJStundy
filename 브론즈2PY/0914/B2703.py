n = int(input())

for _ in range(n):
    input()
    s = input()
    cand = input().rstrip()

    result = ""

    for char in s:
        if char == ' ':
            result += " "
        else:
            pos = ord(char) - ord('A')
            result += cand[pos]

    print(result)
