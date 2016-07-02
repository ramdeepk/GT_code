from math import *


def linearSearch(aList, num): #O(n), looks
#at each value in list
    numComp = 0
    for x in aList:
        if x == num:
            numComp = numComp + 1
            return (True, numComp)
        else:
            numComp = numComp + 1
    return (False, numComp)

def binarySearch(aSortedList, num): #O(log2(n)), checks the middle value of the list, splits if not
    aSortedList.sort()
    if num in aSortedList:
        if aSortedList[len(aSortedList) // 2] < num:
            print("Greater!")
            return binarySearch(aSortedList[(len(aSortedList) // 2) + 1:], num)
        elif aSortedList[len(aSortedList) // 2] > num:
            print("Less!")
            return binarySearch(aSortedList[0:(len(aSortedList) // 2)], num)
        elif aSortedList[len(aSortedList) // 2] == num:
            return "Yay!"
    else:
        return log(len(aSortedList), 2)





a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 99]
print(binarySearch(a, 99))