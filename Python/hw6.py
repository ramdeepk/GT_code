## Krishna Ramdeep and Saneel Prabhu
## CS 1301 - A02
#Krishna Ramdeep and Saneel Prabhu
#e (Krishna Ramdeep and Saneel Prabhu) worked on the homework assignment alone, using only this semester's course materials.

from Myro import *

def findColor(pic):
    pixList = []
    cList = []
    greenCounter = 0
    redCounter = 0
    yellowCounter = 0
    whiteCounter = 0
    center = getHeight(pic) / 2
    for x in range((getWidth(pic) // 2) - 10, (getWidth(pic) // 2) + 10):
            pixList.append(getPixel(pic, x, center))

    for y in pixList:
        r = getRed(y)
        g = getGreen(y)
        b = getBlue(y)
        if r < 75 and g > 150 and b < 75:
            greenCounter = greenCounter + 1
        elif r > 200 and g <75 and b < 75:
            redCounter = redCounter + 1
        elif r > 200 and g > 200 and b < 75:
            yellowCounter = yellowCounter + 1
        else:
            whiteCounter = whiteCounter + 1

    cList.append(greenCounter)
    print("green:", greenCounter)
    cList.append(redCounter)
    cList.append(yellowCounter)
    cList.append(whiteCounter)
    cList.sort()
    print(cList)
    if cList[3] == greenCounter:
        return "green"
    elif cList[3] == redCounter:
        return "red"
    elif cList[3] == yellowCounter:
        return "yellow"
    else:
        return "white"



def turn():
    if heads():
        setLED("left", "on")
        wait(.5)
        setLED("left", "off")
        turnLeft(1, .6)
    else:
        setLED("right", "on")
        wait(.5)
        setLED("right", "off")
        turnRight(1, .6)

def stopLight():
    p = takePicture()
    col = findColor(p)

    while col != "red":
        if col == "green":
            forward(1, 2)
        elif col == "yellow":
            forward(.5, 2)
        elif col == "white":
            turn()
        p = takePicture()
        col = findColor(p)

    stop()
    beep(1, 1440)


