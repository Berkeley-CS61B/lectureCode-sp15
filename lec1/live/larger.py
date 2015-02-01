print("i exist beyond the realm of all classes")

def larger(x, y):
	"""returns larger of x and y"""
	if (x > y):
		return x
	return y

print(larger(5, 10))
print(larger("pizza", "hamburger"))

print(larger(larger, larger))