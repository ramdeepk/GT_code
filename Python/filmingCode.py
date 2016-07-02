#Alexander Kimpel / Krishna Ramdeep / Anissa Saxton

#Sections: B02 / A02 / B02

#akimpel3@gatech.edu / kramdeep3@gatech.edu / asaxton@gatech.edu

#We worked on this homework assignment alone, using only this semester's course materials.

from Myro import *
def actingOne():
    for i in range (0,10):
        forward(1,1)
    wait(10) #Done to pick up filmer robot, reposition behind robotTwo.
    for j in range(0,10):
        forward(1,1)
    turnBy(-90)
    wait(6)
#function names are pretty self--explanatory -- correspond with parts in movies.
def filmWalkingTowards(): #films robot walking towards each other
   for i in range(0, 10):
        forward(1,.5)
        p = takePicture()
        savePicture(p, "robotOne" + str(i) + ".gif")
    wait(10)
    for j in range(0,10):
        forward(1,.5)
        p = takePicture()
        savePicture(p, "robotTwo" + str(j) + ".gif")
def filmTurning():
    for i in range(10, 13):
        p = takePicture()
        savePicture(p, "robotOne" +str(i) + ".gif")
    wait(10)
    for j in range(10, 13):
        p = takePicture()
        savePicture(p, "robotTwo" + str(j) + ".gif")
def runAway():
    for x in range(6):
        savePicture(takePicture(), "runningAway" + str(x) + ".gif")
        wait(8.3)
def ambulance():
    for x in range(10, 14):
        print("taking pic")
        savePicture(takePicture(), "ambulance" + str(x) + ".gif")
def fadeAway():
    for x in range(0, 14):
        print("taking pic")
        savePicture(takePicture(), "fadeaway" + str(x) + ".gif")















