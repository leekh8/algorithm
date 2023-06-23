A, B = map(int, input().split())

if (A >= 1) & (B >= 45):
    print("{} {}".format(A, B-45))
elif (A >= 1) & (B < 45):
    print("{} {}".format(A-1, 60-(45-B)))
elif (A < 1) & (B >= 45):
    print("{} {}".format(A, B-45))
elif (A < 1) & (B < 45):
    print("{} {}".format(23, 60-(45-B)))