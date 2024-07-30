import sys

count = int(sys.stdin.readline())
numbers = list(sys.stdin.readline().strip())
sum = 0

for i in range(count):
  sum += int(numbers[i])

print(sum)