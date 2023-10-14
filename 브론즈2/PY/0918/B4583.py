reflect = ['b', 'd', 'p', 'q', 'i', 'o', 'v', 'w', 'x']

while True:
    word = input()

    if word == '#':
        break
    result = ''

    for alphabet in word:
        if alphabet not in reflect:
            result = "INVALID"
            break
        else:
            if alphabet == 'b':
                result += 'd'
            elif alphabet == 'd':
                result += 'b'
            elif alphabet == 'p':
                result += 'q'
            elif alphabet == 'q':
                result += 'p'
            else:
                result += alphabet
    if result != 'INVALID':
        print(result[::-1])
    else:
        print(result)
