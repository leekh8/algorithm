X = int(input())
N = int(input())
D = 0

for i in range(N):
    A, B = (map(int, input().split()))
    C = A * B

    D = D + C

if D == X:
    print('Yes')
else:
    print('No')