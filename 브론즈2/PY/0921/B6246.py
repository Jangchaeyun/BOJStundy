N, Q = map(int, input().split(' '))

balloon_state = [None for x in range(N)]

for i in range(Q):
    L, I = map(int, input().split(' '))

    for index in range(L - 1, N, I):
        balloon_state[index] = 'balloon'

blank_slot = balloon_state.count(None)

print(blank_slot)
