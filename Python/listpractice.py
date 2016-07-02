from random import *
## list1 = []
## for x in range(99):
##     list1.append(x)
##     #print(list1)
## #del list1[1]
## print(list1)
## y = list1[4-2]
## if y == list1[2]:
##     print("list1[4-2] = list1[2], not list1[4] - list1[2]")
## list2sq = []
## for (x, value) in enumerate(list1):
##     list2sq.append(value**2)
## print(list2sq)


x = list("You cool jokers, lol!")
print(x)
print("Deleting spaces....")
while " " in x:
    x.remove(" ")
print("Deleting commas....")
while "," in x:
    x.remove(",")
print("".join(x))


for x in range(300):
    print(int(random() * 300))
