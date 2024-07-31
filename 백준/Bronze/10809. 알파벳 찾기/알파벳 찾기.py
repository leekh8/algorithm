import sys

s = list(sys.stdin.readline().strip())
positions = [-1] * 26

for i in range(len(s)):
  index = ord(s[i]) - ord('a')
  if positions[index] == -1:
    positions[index] = i

print(' '.join(map(str, positions)))