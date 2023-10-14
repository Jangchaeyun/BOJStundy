string = str(input())
line = 2

while string != "Was it a cat I saw?":
    for i in range(0, len(string), line):
        print(string[i], end='')
    print()

    line += 1
    string = str(input())
