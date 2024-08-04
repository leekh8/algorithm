import sys

input_list = list(map(int, sys.stdin.readline().split()))
result = []

result.append(1 - input_list[0])
result.append(1 - input_list[1])
result.append(2 - input_list[2])
result.append(2 - input_list[3])
result.append(2 - input_list[4])
result.append(8 - input_list[5])

print(' '.join(map(str, result)))