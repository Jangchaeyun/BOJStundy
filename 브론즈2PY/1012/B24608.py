def average_character(string):
    total_ascii_code = 0
    for word in list(string):
        ascii_code = ord(word)
        total_ascii_code += ascii_code

    avg_ascii = total_ascii_code // len(string)

    return chr(avg_ascii)


if __name__ == "__main__":
    string = input()

    print(average_character(string=string))
