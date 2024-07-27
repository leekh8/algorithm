import sys

numbers = []

for _ in range(9):
  n = int(sys.stdin.readline())
  numbers.append(n)

print(max(numbers), numbers.index(max(numbers)) + 1, sep = '\n')