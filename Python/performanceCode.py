#Alexander Kimpel / Krishna Ramdeep / Anissa Saxton

#Sections: B02 / A02 / B02

#akimpel3@gatech.edu / kramdeep3@gatech.edu / asaxton@gatech.edu

#We worked on this homework assignment alone, using only this semester's course materials.

#Yes, I moved all the picture copies to a new folder with numbers as file names.
from Myro import *
import os
os.chdir("C:\\Users\\Alex\\Desktop\\Calico\\Pictures")
images = []
for i in range(1, 70):
    images.append(makePicture(str(i) + ".gif"))
for pic in images:
    show(pic)



