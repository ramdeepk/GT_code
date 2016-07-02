## Krishna Ramdeep
## CS 1301 - A02
## 903063394
## kramdeep3@gatech.edu
## I worked on the homework assignment alone, using only this semester's course materials.

from Myro import *

def trick_ChaseYourTail():
    #make the robot rotate for 5 seconds
    for t in timer(5):
        print(t)
        move(1,1)
        wait(2.5)
    stop()

def trick_Spin():
    #make the robot spin
    for t in timer(6):
        rotate(3)
        print(t)
    stop()

def trick_WeaveBackAndForth():
    #make the robot weave back and forth
    for t in timer(10):
        forward(1, .25)
        turnRight(1, .5)
        forward(1, .25)
        turnLeft(1, .5)
        forward(1, .25)



def trick_MoveAndBeep():
    #the robot will go forward and beep, then go backward and beep, and then return to its original
    #location
    forward(.75, 3)
    beep(1, 1533)
    backward(.75, 6)
    beep(1, 1533)
    forward(.75, 3)


def sadTunes():
    for x in range(6, 1, -1):
        beep(1, x * 100)

def groovyTunes():
    for x in range(3):
        beep(.25, 750) #F
        beep(.25, 840) #A
        beep(.25, 894) #B
    beep(.25, 730) #E
    beep(.25, 694) #D
    beep(.25, 894) #B
    beep(.25, 662) #C
    beep(.25, 894) #B
    beep(.25, 792) #G
    beep(.25, 730) #E
    beep(.25, 694) #D
    beep(.25, 830) #E
    beep(.25, 792) #G
    beep(.25, 730) #E

def morningRoutine(i):
    listOfTricks = [trick_MoveAndBeep, trick_WeaveBackAndForth, trick_Spin, trick_ChaseYourTail, groovyTunes]
    if i <= 5 and i > 0:
        for x in range(i):
            listOfTricks[x]()
    elif i <= 0:
        print("Won't do a trick.")
    elif i > 5:
        morningRoutine(5)

def greetMenu():
    while True:
        choice = int(input("Pick which treat you want to give your robot:\n1. Tiny Treats\n2. OK Treats\n3. Jumbo Treats\n4. Quit Program"))
        while choice > 4 or choice < 1:
            choice = int(input("INVALID INPUT!\nPick which treat you want to give your robot:\n1. Tiny Treats\n2. OK Treats\n3. Jumbo Treats\n4. Quit Program"))
        if choice == 1:
            morningRoutine(choice + 1)
            sadTunes()
        elif choice == 2:
            morningRoutine(3)
        elif choice == 3:
            morningRoutine(5)
        else:
            print("Goodbye!")
            return None

