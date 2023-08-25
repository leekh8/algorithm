a, b = map(int, input().split())
Y = list(map(int, input().split()))
count = 0

for i in Y:
    if (i < b):
        print(i, end=' ')