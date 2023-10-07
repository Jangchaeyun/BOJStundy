def find_key(first):
    key = 1
    while chr(ord(first) ^ key) != 'C':
        key += 1
    return key


def decrypt(key, s):
    rtn = ''
    for c in s:
        rtn += chr(ord(c) ^ key)
    return rtn


s = input()
key = find_key(s[0])
print(decrypt(key, s))
