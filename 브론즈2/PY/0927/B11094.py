N = int(input())

for order in range(N):
    order = input()

    Simon_says_index = order.find("Simon says")

    if Simon_says_index == -1:
        continue
    else:
        print(order[Simon_says_index + 10:])
