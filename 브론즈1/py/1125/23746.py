n = int(input())
dic = {}
for line in range(n):
    small, large = input().split()
    dic[large] = small
compact_str = input()
result = ""
for word in compact_str:
    result += dic[word]
s, e = map(int, input().split())
print(result[s - 1 : e])