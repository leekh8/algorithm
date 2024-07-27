import sys

a, b = map(int, sys.stdin.readline().split())
numbers = list(map(int, sys.stdin.readline().split()))
answers = []

for number in numbers:
  if number < b:
    answers.append(number)

for answer in answers:
  print(answer, end = ' ')