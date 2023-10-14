while True:
    sentence = input()

    is_pangram = 'Y'

    if sentence == '*':
        break
    else:
        for alphabet in range(97, 123):
            if sentence.find(chr(alphabet)) == -1:
                is_pangram = 'N'
                break

        print(is_pangram)
