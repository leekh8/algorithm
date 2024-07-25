import sys
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
a3 = b % 10
a4 = int((b % 100 - a3) / 10)
a5 = int(b / 100)
print(a * a3, a * a4, a * a5, a * b, sep='\n')
