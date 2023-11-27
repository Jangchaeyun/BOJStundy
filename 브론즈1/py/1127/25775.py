from collections import Counter

def letter_frequency(word_list):
    max_word_len = max([len(word) for word in word_list])

    freq_dict = {}

    for letter_idx in range(max_word_len):
        freq_dict[letter_idx + 1] = Counter([
            word[letter_idx : letter_idx + 1] for word in word_list
            if word[letter_idx : letter_idx + 1] != ''
        ]).most_common()
    
    return freq_dict

def make_answer_string(freq_dict):
    answer_string = []

    for freq_num in freq_dict.keys():
        freq_str = " ".join([
            f"{freq_num}:",
            " ".join(sorted([freq_item[0] for freq_item in freq_dict[freq_num] if freq_dict[freq_num][0][1] == freq_item[1]]))
        ])

        answer_string.append(freq_str)

    return "\n".join(answer_string)

if __name__ == "__main__":
    word_list = []

    for _ in range(int(input())):
        word = input()
        word_list.append(word)
    
    freq_dict = letter_frequency(word_list=word_list)

    print(make_answer_string(freq_dict=freq_dict))