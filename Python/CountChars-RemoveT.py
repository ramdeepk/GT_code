## Krishna Ramdeep
## CS 1301 - A02
## 903063394
## kramdeep3@gatech.edu
## I worked on the homework assignment alone, using only this semester's course materials.


def countChars(aStr):
    counter = 0
    for ch in aStr:
        if ch != " ":
            counter = counter + 1
    return counter

#True means we are looking for lower t and T, False means we are ONLY looking for T
def removeT(aBool):
    outputString = ""
    thingToProcess = input("Enter the word or sentence you wish to process: ")
    while thingToProcess != "quit":
        if aBool:
            for x in thingToProcess:
                if x == "t" or x == "T":
                    outputString = outputString + " "
                else:
                    outputString = outputString + x
        else:
            for x in thingToProcess:
                if x == "T":
                    outputString = outputString + " "
                else:
                    outputString = outputString + x
        thingToProcess = input("Enter the word or sentence you wish to process: ")
    return outputString
