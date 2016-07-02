## Krishna Ramdeep and Colin Brandys
## CS 1301 - A02
## kramdeep3@gatech.edu
## We (Krishna Ramdeep and Colin Brandys) worked on the homework assignment alone, using only this semester's course materials.
##
from Myro import *
from Graphics import *
import string

win = Window("Console", 100, 100)
f = open("myMovements.txt", "w")


def whatToDoForKeys(win, event):
    count = 0
    while True:
        print("You pressed:", event.key)
        if event.key == "Left":
            turnLeft(1, .1)
            c = "turnLeft"
            t = ".1"
            outputToFile(c, t)
        elif event.key == "Right":
            turnRight(1, .1)
            c = "turnRight"
            t = ".1"
            outputToFile(c, t)
        elif event.key == "Up":
            forward(1, .1)
            c = "forward"
            t = ".1"
            outputToFile(c, t)
        elif event.key == "Down":
            backward(1, .1)
            c = "backward"
            t = ".1"
            outputToFile(c, t)
        elif event.key == "b":
            beep(.5, 1440)
            c = "beep"
            t = ".5"
            outputToFile(c, t)
        elif event.key == "p":
            savePicture(takePicture(), "James Bond" + str(count) + ".jpg")
            c = "beep"
            t = ".5"
            count = count + 1
            outputToFile(c, t)
        else: #if you press anything other than up, left, down, or right, IT WILL EXIT, AND THE DOC WILL BE CREATED
            outputToFile("quit", 1)
            pass

def outputToFile(command, time):
    global f
    sense = str(getLight("left") / ((getLight("right") + getObstacle("right"))))
    if command == "quit":
        print("Closing file......")
        f.close()
        print("File closed!")
        win.close()
    elif command == "beep":
        print("Writing......")
        f.write(str(command) + " " + str(time) + "\n")
        print("Wrote!")
    else:
        print("Writing......")
        f.write(str(command) + " " + str(time) + " " + getSense() + "\n")
        print("Wrote!")

def getSense():
    sense = getLight("left") / ((getLight("right") + getObstacle("right")))
    senseStr = "{0:.3f}".format(sense)
    return senseStr

def collectData(fileName, command):
    fileToRead = open(fileName, "r")
    x = fileToRead.readlines()
    counter = 0
    totalTime = 0
    beepCounter = 0
    for line in x: #count num times doing this command
        if line.find(command) == 0:
            counter = counter + 1
        if line.find("beep") == 0:
            beepCounter = beepCounter + 1
        if line.find("backward") == 0 or line.find("forward") == 0 or line.find("turn") == 0:
            totalTime = totalTime + .1
    output = "The robot traveled for " + str(totalTime) + " seconds total, beeping " + str(beepCounter) + " times. This robot moved " + str(command) + " a total of " + str(counter) + " times."
    return output

onKeyPress(whatToDoForKeys)

def replay(fName):
    fileName=str(fName)
    d=open(fName,"r")
    g=d.readlines()
    for p in g:
        if p.find("forward")==0:
            forward(1,.1)
        elif p.find("backward")==0:
            backward(1,.1)
        elif p.find("turnRight")==0:
            turnRight(1,.1)
        elif p.find("turnLeft")==0:
            turnLeft(1,.1)
        elif p.find("beep")==0:
            beep(.5,1440)




