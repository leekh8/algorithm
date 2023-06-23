A, B = map(int, input().split())
C = int(input())
T = A * 60 + B + C 
T = T % (24 * 60) 

print(T // 60, T % 60)