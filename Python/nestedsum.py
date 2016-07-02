nestlist = [3,4,[5,6],3,[4,5],7,8,[2,3]]
def sum(t):
	total = 0
	for x in t:
		if type(x) == list:
			total = total + sum(x)
		elif type(x) == int:
			total = total + x
		else:
			print('You messed up, man.')
	return total


print(sum(nestlist))