from datetime import datetime

def covert_str_month_to_num(str_month):
    base_dict = {
        "January": 1, "February": 2, "March": 3, "April": 4, 
        "May": 5, "June": 6, "July": 7, "August": 8, 
        "September": 9, "October": 10, "November": 11,"December": 12
    }

    return base_dict[str_month]

def get_dat_month_from_birthday_string(birthday):
    day, month = birthday.split()

    day = int(day)

    month = covert_str_month_to_num(
        str_month = month
    )

    return day, month

def birthday_check_2007(birthday):
    day, month = get_dat_month_from_birthday_string(
        birthday = birthday
    )

    if day == 29 and month == 2:
        answer = "Unlucky"
    elif day == 4 and month == 8:
        answer = "Happy birthday"
    else:
        birthday_datetime = datetime(year = 2007, month = month, day = day)
        standard_datetime = datetime(year = 2007, month = 8, day = 4)

        if birthday_datetime < standard_datetime:
            answer = "Yes"
        else:
            answer = "No"
    return answer

if __name__ == "__main__":
    birthday_list = []

    while True:
        birthday = input()

        if birthday == "0 #":
            break

        birthday_list.append(birthday)
    
    for birthday in birthday_list:
        print(birthday_check_2007(birthday = birthday))