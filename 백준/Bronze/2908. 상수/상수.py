import sys

in1, in2 = list(sys.stdin.readline().split())

if int(''.join(reversed(in1))) > int(''.join(reversed(in2))):
  print(''.join(reversed(in1)))
else:
  print(''.join(reversed(in2)))