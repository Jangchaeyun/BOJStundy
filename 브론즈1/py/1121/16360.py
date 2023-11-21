preudo = {'a': 'as', 'i': 'ios', 'y': 'ios', 'l': 'les', 'n': 'anes', 'ne': 'anes',
          'o': 'os', 'r': 'res', 't': 'tas', 'u': 'us', 'v': 'ves', 'w': 'was'}

for i in range(int(input())):
    word = list(input())
    if word[-1] in preudo:
        word[-1] = preudo[word[-1]]
    elif ''.join(word[-2::]) == 'ne':
        word[-2::] = preudo['ne']
    else:
        word.append('us')
    print(''.join(word))