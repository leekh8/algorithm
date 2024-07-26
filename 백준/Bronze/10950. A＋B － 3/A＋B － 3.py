import sys

i = int(sys.stdin.readline())

for j in range(1, i + 1):
  a, b= map(int, sys.stdin.readline().split())
  print(a + b)