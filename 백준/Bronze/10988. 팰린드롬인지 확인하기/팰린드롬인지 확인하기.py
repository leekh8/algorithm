import sys

palindrome = list(sys.stdin.readline().strip())

result = 1

for i in range(len(palindrome) // 2):
    if palindrome[i] != palindrome[-(i + 1)]:
        result = 0
        break

print(result)