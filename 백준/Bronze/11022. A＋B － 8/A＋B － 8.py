import sys

X = int(input())

for i in range(X):
    A, B = map(int, sys.stdin.readline().split())

    print(f'Case #{i+1}: {A} + {B} = {A+B}')