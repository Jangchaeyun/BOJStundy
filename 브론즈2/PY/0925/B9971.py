decrypt = {
    'A': 'V',
    'B': 'W',
    'C': 'X',
    'D': 'Y',
    'E': 'Z',
    'F': 'A',
    'G': 'B',
    'H': 'C',
    'I': 'D',
    'J': 'E',
    'K': 'F',
    'L': 'G',
    'M': 'H',
    'N': 'I',
    'O': 'J',
    'P': 'K',
    'Q': 'L',
    'R': 'M',
    'S': 'N',
    'T': 'O',
    'U': 'P',
    'V': 'Q',
    'W': 'R',
    'X': 'S',
    'Y': 'T',
    'Z': 'U'
}

while True:
    if input() == 'ENDOFINPUT':
        break
    for c in input():
        try:
            print(decrypt[c], end='')
        except:
            print(c, end='')
    input()
    print()
