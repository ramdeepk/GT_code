#Krishna Ramdeep and Saneel Prabhu
#CS 1301 - A02
#We (Krishna Ramdeep and Saneel Prabhu) worked on the homework assignment alone, using only this semester's course materials.


from Myro import *



## orangeJuice = makeColor(255, 160, 19)
## reallyRed = makeColor(234, 34, 18)
## lightGold = makeColor(255, 252, 204)

def seeingRed(pic):
    for pix in getPixels(pic):
        setRed(pix, 255)

    show(pic)
    savePicture(pic, "redView" + pic)

def seeingBlue(pic): #15
    for pix in getPixels(pic):
        setBlue(pix, 255)

    show(pic)
    savePicture(pic, "blueView" + pic)

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
    count = 0

    for i in picList:
        savePicture(i, "fadeToBlack" + str(count) + ".gif")
        count = count + 1

## ## ## ## def overlay(pic): #35
## ## ## ##     midX = (getWidth(pic) // 2) - (getWidth(pic) // 10)
## ## ## ##     midY = (getHeight(pic) // 2) - (getHeight(pic) // 10)
## ## ## ##     for x in range(midX - 50, midX - 36):
## ## ## ##         for y in range(midY - 7, midY + 93):
## ## ## ##             setColor(getPixel(pic, x, y), orangeJuice)
## ## ## ## 
## ## ## ##     for x in range(midX + 36, midX + 50):
## ## ## ##         for y in range(midY - 7, midY + 93):
## ## ## ##             setColor(getPixel(pic, x, y), orangeJuice)
## ## ## ## 
## ## ## ##     for x in range(midX - 50, midX + 50):
## ## ## ##         for y in range(midY - 7, midY + 7):
## ## ## ##             setColor(getPixel(pic, x, y), reallyRed)
## ## ## ## 
## ## ## ##     for x in range(midX - 50, midX + 50):
## ## ## ##         for y in range(midY + 79, midY + 93):
## ## ## ##             setColor(getPixel(pic, x, y), reallyRed)
## ## ## ## 
## ## ## ##     show(pic)
## ## ## ##     savePicture(pic, "overlay.jpg")
## ## ## ## 
## ## ## ## 
## ## ## ## def greenWhiteScreen(pic1, pic2, pic3, pic4, pic5, bkcg): #50
## ## ## ##     picList = [pic1, pic2, pic3, pic4, pic5]
## ## ## ##     for pic in picList:
## ## ## ##         for x in range(getWidth(pic)):
## ## ## ##             for y in range(getHeight(pic)):
## ## ## ##                 if getRed(getPixel(pic, x, y)) > 210 and getGreen(getPixel(pic, x, y)) > 210 and getBlue(getPixel(pic, x, y)) > 210:
## ## ## ##                     setColor(getPixel(pic, x, y), getColor(getPixel(bkcg, x, y)))
## ## ## ##         show(pic)
## ## ## ## 
## ## ## ##     savePicture(picList, "greenWhiteScreen.jpg")
## ## ## ## 
## ## ## ## 
## ## ## ## def lensFlare(pic): #20, for a total of 155
## ## ## ##     midX = getWidth(pic) // 2
## ## ## ##     midY = getHeight(pic) // 2
## ## ## ##     for x in range(midX - 30, midX + 30):
## ## ## ##         for y in range(midY - 30, midY + 30):
## ## ## ##             setColor(getPixel(pic, x, y), lightGold)
## ## ## ##     show(pic)
## ## ## ## 
