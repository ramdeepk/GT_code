aList = [10, 1, 6, 9, 8, 4, 3, 5, 2, 7]

def insSort(aList):
    for i in range(0, len(aList)):
        temp = aList[i]
        j = i
        while j > 0 and aList[j - 1] > temp:
            aList[j] = aList[j - 1]
            j = j - 1
            aList[j] = temp


    return aList

x = insSort(aList)
print(x)