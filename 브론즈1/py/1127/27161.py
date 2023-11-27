import sys

sysInput = sys.stdin.readline

N = int(sysInput())

now = 1

AddTime = 1

for i in range(N):
    result = "NO"
    S, T = map(str, sysInput().split())

    if ((S == "HOURGLASS") & (now == int(T))):
        result = "NO"
    elif (S == "HOURGLASS"):
        AddTime *= -1
    else:
        if (now == int(T)):
            result = "YES"
    print(now, result)
    now += AddTime
    if (now == 13):
        now = 1
    if (now == 0):
        now = 12