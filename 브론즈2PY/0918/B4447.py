n = int(input())

for i in range(n):
    hero_name = input()

    gG_count = hero_name.count('g') + hero_name.count('G')
    bB_count = hero_name.count('b') + hero_name.count('B')

    if gG_count > bB_count:
        print(f"{hero_name} is GOOD")
    elif gG_count < bB_count:
        print(f"{hero_name} is A BADDY")
    else:
        print(f"{hero_name} is NEUTRAL")
