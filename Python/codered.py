from Myro import *
def redWaterfall(picStr):
    pic = makePicture(picStr)
    count = 0
    width = getWidth(pic)
    inc = getHeight(pic) // 10
    start = 0
    end = inc
    for y in range(start, end + 1):
        for x in range(width + 1):
            setRed(getPixel(pic, x, y), 255)
            savePicture(pic, str(count) + picStr)
            count = count + 1
            start = start + inc
            end = end + inc
