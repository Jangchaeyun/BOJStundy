from sys import stdin

T = int(stdin.readline().rstrip())

for test_case_idx in range(T):
    n = int(stdin.readline().rstrip())
    grampus_cards = sorted(list(stdin.readline().rstrip().split(' ')))
    dolphin_cards = sorted(list(stdin.readline().rstrip().split(' ')))

    if grampus_cards == dolphin_cards:
        print("NOT CHEATER")
    else:
        print('CHEATER')
