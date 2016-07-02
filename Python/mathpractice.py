a = range(35, 145, 10)
print(a)

b = []
for x in a:
    b.append(x * 1.4667)

print(b)

ave = []
for i in range(len(b)):
    if i < 10:
        ave.append((b[i] + b[i + 1])/2)
    else:
        pass

print(ave)

