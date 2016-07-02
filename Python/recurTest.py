a = [10, 60, 70, 100, 200]

def recursiveSum(numList, n): #returns the sum of the first n terms of the list
    if n == 0:
        return 0
    elif n == 1:
        return numList[0]
    else:
        return numList[n-1] + recursiveSum(a, n-1)


x = recursiveSum(a, 3)
print(x)