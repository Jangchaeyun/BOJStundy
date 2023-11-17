ip = input()

n_happy = ip.count(":-)")
n_sad = ip.count(":-(")

if n_happy < n_sad:
    print("sad")
elif n_happy > n_sad:
    print("happy")
elif n_happy == 0 and n_sad == 0:
    print("none")
elif n_happy == n_sad:
    print("unsure")