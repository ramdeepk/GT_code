#Krishna Ramdeep and Saneel Prabhu
#CS 1301 - A02
#We (Krishna Ramdeep and Saneel Prabhu) worked on the homework assignment alone, using only this semester's course materials.


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