a, b = map(int, input().strip().split())


def conversation(a, b):
    c = "0123456789ABCDEF"
    if a < b:
        return str(c[a])
    else:
        return conversation(a // b, b) + str(c[a % b])


print(conversation(a, b))
