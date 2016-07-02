def summingNestedLists(aList, n):
    total = 0
    if n == 0:
        return 0
    elif n == 1:
        return aList[0]
    else:
        for x in aList:
            if type(x) is list:
                total = total + summingNestedLists(x)
            else:
                total = total + x
    return total

a = [1, 1, 1, 1, [1, 10, 10], [10, [10, 10, 10]]]
print(summingNestedLists(a))

