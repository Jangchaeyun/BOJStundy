T = int(input())

for i in range(T):
    string = input()

    if len(string) == 7 and (string[0] == string[1] == string[4]) and (string[2] == string[3] == string[5] == string[6]) and (string[0] != string[2]):
        print(1)

    else:
        print(0)
