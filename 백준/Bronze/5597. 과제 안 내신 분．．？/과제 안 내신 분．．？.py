import sys

students = [0] * 31

for i in range(1, 29):
  students[int(sys.stdin.readline())] = 1

for i in range(1, 31):
  if students[i] != 1:
    print(i)