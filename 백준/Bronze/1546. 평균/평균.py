import sys

count = int(sys.stdin.readline())
subjects = list(map(int, sys.stdin.readline().split()))
max = max(subjects)
sum = 0

for i in range(count):
  subjects[i] = subjects[i] / max * 100
  sum += subjects[i]

print(sum / count)
