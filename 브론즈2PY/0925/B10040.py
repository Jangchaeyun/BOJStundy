def find_funniest_contest(standard):
    for i in range(1, N + 1):
        if cost[i] <= standard:
            return i


def max_vote_idx():
    max_idx = 0
    max_vote = 0
    for i in range(1, N + 1):
        if vote[i] > max_vote:
            max_vote = vote[i]
            max_idx = i
    return max_idx


N, M = map(int, input().split())
cost = [0] + [int(input()) for _ in range(N)]
vote = [0] * (N + 1)

for _ in range(M):
    idx = find_funniest_contest(int(input()))
    vote[idx] += 1

print(max_vote_idx())
