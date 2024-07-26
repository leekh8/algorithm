import sys

sum = int(sys.stdin.readline())
n = int(sys.stdin.readline())
cal = 0

for j in range(1, n + 1):
  name, count = map(int, sys.stdin.readline().split())
  cal += name * count

if sum == cal:
  print('Yes')
else:
  print('No')