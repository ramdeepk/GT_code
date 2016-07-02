#Alexander Kimpel / Krishna Ramdeep / Anissa Saxton

#Sections: B02 / A02 / B02

#akimpel3@gatech.edu / kramdeep3@gatech.edu / asaxton@gatech.edu

#We worked on this homework assignment alone, using only this semester's course materials.

from Myro import *


def shooter():
    p = makePicture("theShooter.jpg")
    show(p)
for x in range(625,650):
        for y in range(350, 450):
            pix = getPixel(p,x,y)
            setRed(pix, 0)
            setGreen(pix,0)
            setBlue(pix,0)
    for x in range(650,700):
        for y in range(350, 375):
            pix = getPixel(p,x,y)
            setRed(pix, 0)
            setGreen(pix,0)
            setBlue(pix,0)

    show(p)
    savePicture(p, "shooter.gif")

def seeingGunshot():
    pic = makePicture("shooter.gif")
    for pix in getPixels(pic):
        setGreen(pix, 200)
        setRed(pix, 200)
    show(pic)
    savePicture(pic, "shot.gif")

from Myro import *
def fadeToRed(pic1, pic2, pic3, pic4, pic5):#35
    picList = [pic1, pic2, pic3, pic4, pic5]
    step = 255 // len(picList)
    newPicList = []
    i = (255 / step) - len(picList) + 1
    for p in picList:
        print(i)
        for pix in getPixels(p):
            setRed(pix, getRed(pix) + (step * i))
            setGreen(pix, getGreen(pix) - (step * i))
            setBlue(pix, getBlue(pix) - (step * i))
        show(p)
        newPicList.append(p)
        i = i + 1
    count = 0

    for i in picList:
        savePicture(i, "fadeToRed" + str(count) + ".gif")
        count = count + 1

fadeToRed(makePicture("theShooter.jpg"),makePicture("theShooter.jpg"),makePicture("theShooter.jpg"),makePicture("theShooter.jpg"),makePicture("theShooter.jpg"))

def seeingRed(picStr): #15
    pic = makePicture(picStr)
    for pix in getPixels(pic):
        setRed(pix, 255)
    show(pic)
    savePicture(pic, "redView" + picStr)

def seeingBlue(picStr): #15
    pic = makePicture(picStr)
    for pix in getPixels(pic):
        setBlue(pix, 255)
    show(pic)
    savePicture(pic, "blueView" + picStr)

def fadeToBlack(pic1, pic2, pic3, pic4, pic5):#35
    picList = [pic1, pic2, pic3, pic4, pic5]
    step = 255 // len(picList)
    newPicList = []
    i = (255 / step) - len(picList) + 1
    for p in picList:
        print(i)
        for pix in getPixels(p):
            setRed(pix, getRed(pix) - (step * i))
            setGreen(pix, getGreen(pix) - (step * i))
            setBlue(pix, getBlue(pix) - (step * i))
        show(p)
        newPicList.append(p)
        i = i + 1
    savePicture(newPicList, "fadeToBlack.gif")

seeingBlue("ambulance0.gif")
seeingBlue("ambulance2.gif")
seeingBlue("ambulance4.gif")
seeingBlue("ambulance6.gif")
seeingBlue("ambulance8.gif")
seeingBlue("ambulance10.gif")
seeingBlue("ambulance12.gif")

seeingRed("ambulance1.gif")
seeingRed("ambulance3.gif")
seeingRed("ambulance5.gif")
seeingRed("ambulance7.gif")
seeingRed("ambulance9.gif")
seeingRed("ambulance11.gif")
seeingRed("ambulance13.gif")


def fadeToBlack(pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8):#35
    picList = [pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8]
    step = 255 // len(picList)
    newPicList = []
    i = (255 / step) - len(picList) + 1
    for p in picList:
        print(i)
        for pix in getPixels(p):
            setRed(pix, getRed(pix) - (step * i))
            setGreen(pix, getGreen(pix) - (step * i))
            setBlue(pix, getBlue(pix) - (step * i))
        show(p)
        newPicList.append(p)
        i = i + 1
    count = 0

    for i in picList:
        savePicture(i, "fadeToBlack" + str(count) + ".gif")
        count = count + 1

