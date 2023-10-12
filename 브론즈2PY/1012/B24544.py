def sol(nums1, nums2):
    not_inview = 0

    entire = sum(nums1)
    for i in range(len(nums2)):
        if nums2[i] == 0:
            not_inview += nums1[i]
    print(entire)
    print(not_inview)


n = int(input())
nums1 = list(map(int, input().split()))
nums2 = list(map(int, input().split()))

sol(nums1, nums2)
