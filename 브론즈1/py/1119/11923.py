MAX = 1000 + 1

def maxFruit(idx, cnt, total):
    global result

    if total >= 0:
        result = max(result, cnt)
    
    if idx > N or total < 0:
        return
    
    if total - fruit[idx] >= 0:
        maxFruit(idx + 1, cnt + 1, total - fruit[idx])
    else:
        maxFruit(idx + 1, cnt, total)

if __name__ == "__main__":
    result = 0
    
    N, C = map(int, input().split())
    fruit = [0] + list(map(int, input().split()))

    for i in range(1, N + 1):
        maxFruit(i, 0, C)
    
    print(result)