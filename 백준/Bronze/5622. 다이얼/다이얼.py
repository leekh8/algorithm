import sys

s = list(sys.stdin.readline().strip())
result = 0

for ss in s:
  if ord(ss) < 68:
    result += 3
  elif ord(ss) < 71:
    result += 4
  elif ord(ss) < 74:
    result += 5
  elif ord(ss) < 77:
    result += 6
  elif ord(ss) < 80:
    result += 7
  elif ord(ss) < 84:
    result += 8
  elif ord(ss) < 87:
    result += 9
  else:
    result += 10

print(result)