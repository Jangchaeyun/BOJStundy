def eye_of_sauron(string):
    answer = "fix"

    left, right = string.split("()")

    if left == right:
        answer = "correct"

    return answer


if __name__ == "__main__":
    string = input()

    print(eye_of_sauron(string=string))
