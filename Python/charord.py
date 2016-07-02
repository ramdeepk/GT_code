def makeAnti(word):
    anti = ""
    for cha in word:
        anti = anti + chr(219-ord(cha))

    return anti
