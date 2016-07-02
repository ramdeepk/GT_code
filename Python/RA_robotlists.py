## Krishna Ramdeep
## CS 1301 - A02
## 903063394
## kramdeep3@gatech.edu
## I worked on the homework assignment alone, using only this semester's course materials.


from Myro import *
init()


def getValues(numSamples):
    listLightValues = []
    for x in range(numSamples):
        listLightValues.append(getLight("center"))
        turnLeft(1, .25)
    return listLightValues

## Helper function for print statistics
def numEven(aList):
    counter = 0
    for x in aList:
        if x % 2 == 0:
            counter = counter + 1
    return counter


def printStatistics(aList):
    #sum, len, min, and max are all built in
    mean = sum(aList) / len(aList)
    print("You gave me a list of ", len(aList)," numbers. Their average was ", mean,". The minimum value was ", min(aList)," and the maximum value was ", max(aList),". Only ", numEven(aList)," of them were even numbers.")