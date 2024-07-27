import sys

n, m = map(int, sys.stdin.readline().split())
basket = []
temp = 0

for i in range(0, n+1):
  basket.append(i)

for _ in range(m):
  i, j = map(int, sys.stdin.readline().split())
  temp = basket[i]
  basket[i] = basket[j]
  basket[j] = temp

for s in range(1, n + 1):
  print(basket[s], end = ' ')