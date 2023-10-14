def sicomlove_2022(N):
    slice_num = N % 10

    sicomlove = "SciComLove"

    return sicomlove[slice_num:] + sicomlove[:slice_num]


if __name__ == "__main__":
    N = int(input())

    print(sicomlove_2022(N=N))
