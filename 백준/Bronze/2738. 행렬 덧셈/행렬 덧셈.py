import sys

N, M = map(int, sys.stdin.readline().split())
A = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]
B = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

result = [[A[i][j] + B[i][j] for j in range(M)] for i in range(N)]

for row in result:
    print(*row)