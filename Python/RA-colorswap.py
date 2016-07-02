#Krishna Ramdeep
#903063394
#kramdeep3@gatech.edu
#I worked on the homework assignment alone, using only this semester's course materials.


#Cases:
#Red highest
#Blue highest
#green highest
#2/3 highest
from Myro import *
p = makePicture("C:\Users\Krishna\Documents\Georgia Tech\Fall 2014\CS 1301\CODE\RA_colorswap_source.jpg")

for pix in getPixels(p):
    r = getRed(pix)
    g = getGreen(pix)
    b = getBlue(pix)

    if r == g and r > b and g > b:
        #red green both highest
        #so do nothing
        pass
    elif r == b and r > g and b > g:
        #red blue both highest
        #so do nothing
        pass
    elif g == b and g > r and b > r:
        #green blue both highest
        #so do nothing
        pass
    elif r == g and r == b:
        #all equal
        #so do nothing
        pass
    else:
        if r > g and r > b:
            #red max, so set green
            setRed(pix, 0)
            setGreen(pix, 255)
            setBlue(pix, 0)
        elif g > r and g > b:
            #green max, so set blue
            setRed(pix, 0)
            setGreen(pix, 0)
            setBlue(pix, 255)
        elif b > r and b > g:
            #blue max, so set red
            setRed(pix, 255)
            setGreen(pix, 0)
            setBlue(pix, 0)

savePicture(p, "RA-colorswap_recolor.jpg")


