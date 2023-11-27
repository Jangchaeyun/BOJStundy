from collections import Counter

def sort_by_frequency(word):
    answer = ""
    cnt_items = sorted(Counter(word).items(), key=lambda x: (-x[1], x[0]))

    for item in cnt_items:
        answer += item[0] * item[1]
    
    return answer

if __name__ == "__main__":
    word = input()
    print(sort_by_frequency(word=word))