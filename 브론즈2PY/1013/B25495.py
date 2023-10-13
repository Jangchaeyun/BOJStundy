def sol(nums):
    current_phone = nums[0]
    current_battery = 2
    accumulate_cnt = 1
    for i in range(1, len(nums)):

        if current_battery >= 100:
            current_phone = 0
            current_battery = 0
            accumulate_cnt = 1
        if current_phone == nums[i]:
            accumulate_cnt += 1
            current_battery += 2 ** accumulate_cnt
        else:
            accumulate_cnt = 1
            current_battery += 2

        current_phone = nums[i]
    if current_battery >= 100:
        current_phone = 0
        current_battery = 0
        accumulate_cnt = 1
    print(current_battery)


len_nums = int(input())
sol(list(map(int, input().split())))
