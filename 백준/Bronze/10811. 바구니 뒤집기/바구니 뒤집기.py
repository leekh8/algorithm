import sys

n, m = map(int, sys.stdin.readline().split())

numbers = list(range(1, n + 1))

for _ in range(m):
  a, b = map(int, sys.stdin.readline().split())
  numbers[a - 1:b] = reversed(numbers[a - 1:b])

print(" ".join(map(str, numbers)))