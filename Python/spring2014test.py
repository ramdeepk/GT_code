def encode(aStr):
    intList = []
    for letter in aStr:
        intList.append(ord(letter))
    return intList

def decode(aList):
    newStr = ""
    for num in aList:
        newStr = newStr + chr(num)
    return newStr

def emailFilter(filename):
    f = open(filename)
    readme = file("readme.txt", "w")
    for line in f.readlines():
        if "@pawnee.gov" not in line:
            readme.write(line)
    f.close()
    readme.close()


var = 6
num-is = 9
num_vars = 9