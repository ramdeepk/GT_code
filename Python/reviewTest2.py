def inverseSort(aList):
    aList.sort()
    for x in range(len(aList) // 2):
        swap(aList[x], aList[len(aList) - (1 + x)])
    return aList

def swap(val, valTwo):
    temp = val
    val = valTwo
    valTwo = temp



