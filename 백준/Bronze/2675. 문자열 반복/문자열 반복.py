import sys

t = int(sys.stdin.readline())

for _ in range(t):
  r, s = list(sys.stdin.readline().split())
  r = int(r)
  result = ''

  for char in s:
    result += char * r

  print(result)