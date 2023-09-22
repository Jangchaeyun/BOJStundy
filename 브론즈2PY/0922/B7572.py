tweleve = 'ABCDEFGHIJKL'
ten = '0123456789'
idx = int(input()) - 2013
print(tweleve[(idx + 5) % 12] + ten[(idx - 1) % 10])
