import sys

count = 0
answers = [0] * 10
unique_remainders = set()

for i in range(10):
  answers[i] = int(sys.stdin.readline()) % 42
  unique_remainders.add(answers[i])

print(len(unique_remainders))