line = input().strip().split("|")

abe_minor = ['A', 'D', 'E']
cfg_major = ['C', 'F', 'G']

abe_minor_cnt = 0
cfg_major_cnt = 0

for i in line:
    if i[0] in abe_minor:
        abe_minor_cnt += 1
    if i[0] in cfg_major:
        cfg_major_cnt += 1

if abe_minor_cnt == cfg_major_cnt:
    if line[-1][-1] in cfg_major:
        cfg_major_cnt += 1
    if line[-1][-1] in abe_minor:
        abe_minor_cnt += 1

if abe_minor_cnt < cfg_major_cnt:
    print("C-major")
else:
    print("A-minor")