import sys

N, B = map(int, sys.stdin.readline().split())

digits = []
while N > 0:
    remainder = N % B
    if remainder < 10:
        digits.append(str(remainder))
    else:
        digits.append(chr(55 + remainder))
    N //= B
    answer = ''.join(digits[::-1])

print(answer)