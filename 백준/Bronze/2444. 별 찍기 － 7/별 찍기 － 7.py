import sys

count = int(sys.stdin.readline())

for i in range(1, count):
  print(' ' * abs(count - i), '*' * ((i * 2) - 1), sep = '')

for i in range(count, 0, -1):
  print(' ' * abs(count - i), '*' * ((i * 2) - 1), sep = '')