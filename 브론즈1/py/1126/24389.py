def plus_one(bin_num):
    temp = 1
    result = []

    for bi_idx, bi in enumerate(bin_num[::-1]):
        plus_result = int(bi) + temp
        
        if plus_result > 1:
            result.append(str(0))
        else:
            result.append(str(1))
            temp = 0

        if temp == 0:
            break
            
    return bin_num[:32-bi_idx-1] + result[::-1]

def two_complete(N):
    answer = 0
    binary = list(bin(N)[2:].zfill(32))

    reverse_binary = [str(abs(int(bi) - 1)) for bi in binary]

    complement = plus_one(bin_num=reverse_binary)

    for bi, co in zip(binary, complement):
        if bi != co:
            answer += 1
        
    return answer

if __name__ == "__main__":
    N = int(input())

    print(two_complete(N=N))