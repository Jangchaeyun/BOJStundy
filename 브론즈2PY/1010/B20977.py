n = int(input())
s = input()
for i in ["J", "O", "I"]:
    print(i * s.count(i), end="")
