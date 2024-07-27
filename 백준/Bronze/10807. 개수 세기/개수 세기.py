import sys

a = int(sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split()))
b = int(sys.stdin.readline())
count = numbers.count(b)

print(count)