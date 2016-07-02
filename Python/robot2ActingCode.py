#Alexander Kimpel / Krishna Ramdeep / Anissa Saxton

#Sections: B02 / A02 / B02

#akimpel3@gatech.edu / kramdeep3@gatech.edu / asaxton@gatech.edu

#We worked on this homework assignment alone, using only this semester's course materials.

#############################ROBOT 2#############################
def actingOne():
    for i in range (0,10):
        forward(1,.5)
        wait(8.3)
  #Done to pick up filmer robot, reposition behind robotTwo.
    for j in range(0,10):
        forward(1,1)
        wait (10)
        turnBy(30)
        wait(9)
        turnBy(30)
        wait(9)
        turnBy(30)
        wait(9)
        wait(6)
#Turn after shooting
        turnBy(-20)
        wait(8)
        turnBy (-20)
        wait(8)
        turnBy (-20)
        wait(8)
        turnBy (-20)
        wait(8)
        turnBy (-20)
        wait(8)
        turnBy (-20)
        wait(8)
        turnBy (-20)
        wait(8)
        turnBy (-20)
        wait(8)
        turnBy (-20)
        wait(8)
##Moving away from dead robot

        for i in range (0,6):
            forward(1,1)
            wait(8.3)
##Ambulance
        for h in range (0,10):
            forward (1,.2)
            wait (8.3)

















