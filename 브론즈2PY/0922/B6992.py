for i in range(int(input())):
    sequence = list(map(int, input().split()))[1:]
    if len(sequence) == 0:
        continue
    if len(sequence) == 1:
        print("The next 5 numbers after [" +
              str(sequence[0]) + "] are: [", end="")
        for i in range(1, 6):
            if i == 5:
                print(str(sequence[0]+i) + "]")
                continue
            print(str(sequence[0]+i) + ", ", end="")
    elif len(sequence) == 2:
        print("The next 5 numbers after [" + str(sequence[0]
                                                 ) + ", " + str(sequence[1]) + "] are: [", end="")
        for i in range(sequence[1]-sequence[0], 6*(sequence[1]-sequence[0]), sequence[1]-sequence[0]):
            if i == 5*(sequence[1]-sequence[0]):
                print(str(sequence[1]+i) + "]")
                continue
            print(str(sequence[1]+i) + ", ", end="")
    else:
        d = sequence[1]-sequence[0]
        printed = False
        for i in range(1, len(sequence)-1):
            if sequence[i+1]-sequence[i] == d:
                continue
            print("The sequence", sequence, "is not an arithmetic sequence.")
            printed = True
            break
        if not printed:
            a = sequence[-1]
            print("The next 5 numbers after", sequence, "are: [", end="")
            for i in range(sequence[1]-sequence[0], 6*(sequence[1]-sequence[0]), sequence[1]-sequence[0]):
                if i == 5*(sequence[1]-sequence[0]):
                    print(str(a+i) + "]")
                    continue
                print(str(a+i) + ", ", end="")
