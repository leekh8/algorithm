A = 1
B = 1

while (A+B) != 0:
    A, B = map(int, input().split())
    if A + B != 0:
        print(B+A)
    else:
        break