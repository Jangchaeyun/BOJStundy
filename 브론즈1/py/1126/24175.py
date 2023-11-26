from collections import Counter

while True:
    players = []
    for i in range(int(input())):
        d = input().split()
        players.append([int(d[0]), d[2]])
    if players == []:
        break
    players.sort(key=lambda x:x[0])
    print(Counter([x[0] for x in players if x[1] == 'Gold']).most_common(1)[0][0], Counter([x[0] for x in players]).most_common(1)[0][0])