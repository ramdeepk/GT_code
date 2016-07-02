a = [1, 2, [3, 4]]
b = a[:]

b[2] = a[2][:]
b[2][0] =99
print(a)
print(b)