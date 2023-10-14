N = int(input())

for i in range(N):
    sentence = input().lower()

    missing_alphabet = ''

    for alphabet_ascii in range(ord('a'), ord('z') + 1):
        if sentence.find(chr(alphabet_ascii)) == -1:
            missing_alphabet += chr(alphabet_ascii)

    if missing_alphabet == '':
        print("pangram")
    else:
        print(f"missing {missing_alphabet}")
