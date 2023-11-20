N = int(input())
cost = 0
SAexists = False
ZIexists = False
ZAexists = False

for i in range(N):
    plan = input()

    if plan == "botswana":
        cost += 0
    elif plan == "ethiopia" or plan == "kenya" or plan == "tanzania":
        cost += 50
    elif plan == "namibia":
        if SAexists:
            cost += 40
        else:
            cost += 140
    elif plan == "south-africa":
        SAexists = True
        cost += 0
    elif plan == "zambia":
        ZAexists = True
        if ZIexists:
            cost += 20 + 0
        else:
            cost += 50
    elif plan == "zimbabwe":
        ZIexists = True
        if ZAexists:
            cost += 0
        else:
            cost += 30

    if plan not in ["zambia", "zimbabwe"]:
        ZAexists = False
        ZIexists = False

print(cost)
