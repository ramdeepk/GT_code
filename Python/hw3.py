#Krishna Ramdeep
#CS 1301- Section A02
#kramdeep3@gatech.edu
#I worked on the homework assignment alone, using only this semester's course materials.
 
import string #for allLetters
 
#tallEnough()
def tallEnough(heightInches):
    heightCM = heightInches / .39370
    if heightCM > 120 and heightCM < 190:
        return True
    else:
        return False
 
 
#whereIsWaldo()
def whereIsWaldo(xPos, yPos):
    xGuess = int(input("Guess Waldo's x-coordinate"))
    yGuess = int(input("Guess Waldo's y-coordinate"))
    if xGuess == xPos and yGuess == yPos:
        return "You found Waldo!"
    else:
        return "Couldn't find Waldo. Better luck next time."
 
 
#allLetters()
def allLetters(userString):
    newString = ""
    for i in userString:
        if i in string.ascii_letters:
            newString = newString + i
    return newString
 
 
#replaceLetter
def replaceLetter(aString, aLetter):
    letterToReplace = input("Enter the letter to replace")
    newString = ""
    while aString.find(letterToReplace) == -1:
        letterToReplace = input("Letter not in string. Enter another letter to replace")
    for i in aString:
        if i != letterToReplace:
            newString = newString + i
        else:
            newString = newString + aLetter
    print(newString)
 
 
#countUp()
def countUp(start, end, increment):
    x = start
    while x <= end:
        print(x)
        x = x + increment
    print("Done!") #implicit return None
 
#numMountainRange()
def numMountainRange(x):
    maxNumCharsOnRow = 2 * x #total number of characters (numbers + spaces) on bottom row
    for i in range(1, x+1):
        print((str(i) * i) + (" " * (maxNumCharsOnRow - (2 * i))) + (str(i) * i))
        #maxNumCharsOnRow - (2 * i) gives the number of spaces that should be in between the numbers
 
 
#printTimestable()
def printTimestable():
    for rowValue in range(1, 10): #we want 1-9, so range must have a 10
        if rowValue == 1:
            print('Times:\t' + '1' + '\t' + '2' + '\t' + '3' + '\t' + '4' + '\t' + '5' + '\t' + '6' + '\t' + '7' + '\t' + '8' + '\t' + '9' + '\t')
        print(rowValue, end = "\t")
        for columnValue in range(1, 10):
            print(rowValue * columnValue, end = "\t")
            #if the output window is the correct size, the formatting works
 
 
 
#printTimes()
def printTimes(x):
    for rowValue in range(1, x+1): #we want 1-9, so range must have a 10
        if rowValue == 1:
            print("Times:", end = "\t")
            for i in range(1, x+1):
                print(str(i), end = "\t")
        print(rowValue, end = "\t")
        for columnValue in range(1, x+1):
            print(rowValue * columnValue, end = "\t")
            #if the output window is the correct size, the formatting works