from sys import stdin

isbn = stdin.readline().rstrip()
isbn_len = len(isbn)
except_star = 0
star_idx = None

for idx in range(isbn_len):
    if isbn[idx] == '*':
        star_idx = idx
        continue
    elif idx % 2 == 0:
        except_star += int(isbn[idx])
    elif idx % 2 == 1:
        except_star += int(isbn[idx]) * 3

for number in range(10):
    if star_idx % 2 == 0:
        if (except_star + number) % 10 == 0:
            print(number)
            break
    else:
        if (except_star + number * 3) % 10 == 0:
            print(number)
            break