import math

memo = [0] * 5001


def divisor(target_num):
    arr = []
    sqrt = int(math.sqrt(target_num))
    for i in range(1, sqrt + 1):
        if target_num % i == 0:
            if i * i == target_num:
                arr.append(i)
            else:
                arr.append(i)
                arr.append(target_num // i)
    return arr


def is_abundant_number(target_num, arr):
    size = len(arr)
    _sum = 0
    for i in range(size):
        if arr[i] == target_num:
            continue
        _sum += arr[i]

    if _sum > target_num:
        memo[target_num] = 1
        return True

    if _sum == target_num:
        memo[target_num] = 3 
    else:
        memo[target_num] = 2

    return False


def main():
    sb = []

    memo[1] = 2
    memo[2] = 2
    memo[3] = 3

    t = int(input())
    for _ in range(t):
        temp = int(input())
        arr = divisor(temp)

        if memo[temp] != 0 and memo[temp] != 1:
            sb.append("BOJ 2022\n")
            continue
        elif memo[temp] == 0 and not is_abundant_number(temp, arr):
            sb.append("BOJ 2022\n")
            continue

        size = len(arr)
        flag = True
        for j in range(size):
            if arr[j] == temp:
                continue

            if memo[arr[j]] == 1:
                sb.append("BOJ 2022\n")
                flag = False
                break

            if memo[arr[j]] == 2 or memo[arr[j]] == 3:
                continue

            if is_abundant_number(arr[j], divisor(arr[j])):
                sb.append("BOJ 2022\n")
                flag = False
                break

        if flag:
            sb.append("Good Bye\n")

    print("".join(sb))


if __name__ == "__main__":
    main()
