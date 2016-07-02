## Krishna Ramdeep and Saneel Prabhu
## CS 1301 - A02
## We (Krishna Ramdeep and Saneel Prabhu) worked on the homework assignment alone, using only this semester's course materials.

from Myro import *

def findColor(pic):
    cList = []
    pixList = []
    greenCounter = 0
    redCounter = 0
    yellowCounter = 0
    whiteCounter = 0

    for x in range((getWidth(pic) // 2), (getWidth(pic) // 2) + 10): #Get a sequence of pixels in
        pixList.append(getPixel(pic, x, (getHeight(pic) // 2) - 6)) #the center of te picture

    for y in pixList:
        r = getRed(y) #Get the rgb values of the pixels and add them to a list
        g = getGreen(y)
        b = getBlue(y)

        if r < 130 and g > 130 and b < 130:
            greenCounter = greenCounter + 1 #count the colors of the pixels, and determine
        elif r > 140 and g < 160 and b < 160: #which color shows up the most
            redCounter = redCounter + 1
        elif r > 200 and g > 200 and b < 210:
            yellowCounter = yellowCounter + 1
        elif r > 210 and g > 210 and b > 210:
            whiteCounter = whiteCounter + 1


    cList.append(greenCounter)
    cList.append(redCounter)
    cList.append(yellowCounter)
    cList.append(whiteCounter)
    cList.sort()
    if cList[3] == greenCounter: #return whichever color is the greatest
        return "green"
    elif cList[3] == redCounter:
        return "red"
    elif cList[3] == yellowCounter:
        return "yellow"
    else:
        return "white"



def turn():
    if heads(): #if its true, turn left
        setLED("right", "on") #the LEDs are reversed, so right is actually the left LED
        wait(.25)
        setLED("right", "off")
        turnLeft(1, .75)
    else:           #if false, turn right
        setLED("left", "on")
        wait(.25)
        setLED("left", "off")
        turnRight(1, .75)

def stopLight():
    for p in [makePicture("green.gif"), makePicture("yellow.gif"), makePicture("white.jpg"), makePicture("red.gif")]:
        show(p) #another TA allowed us to use the pics from the class website
        col = findColor(p)
        print(col) #this was originally a while loop, but because of the camera and format of the
        if col == "green": #demo, we did if/elif statements instead
            forward(1, 2)
        elif col == "yellow":
            forward(.5, 2)
        elif col == "white":
            turn()
        elif col == "red":
            stop()
            beep(1, 1440)


