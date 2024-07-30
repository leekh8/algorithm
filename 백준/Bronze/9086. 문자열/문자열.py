import sys

count = int(sys.stdin.readline())

for _ in range(count):
  str = sys.stdin.readline()
  print(str[0] + str[len(str) - 2 : len(str) - 1])