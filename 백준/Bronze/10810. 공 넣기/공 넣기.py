import sys

n, m = map(int, sys.stdin.readline().split())
basket = [0] * (n + 1)
for _ in range(m):
  i, j, k = map(int, sys.stdin.readline().split())
  for  b in range(i, j + 1):
    basket[b] = k

for s in range(1, n + 1):
  print(basket[s], end = ' ')