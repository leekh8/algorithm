def solution(a, b):
    answer = a * (10 ** len(str(b))) + b
    answer2 = 2 * a * b

    if answer >= answer2:
        return answer
    else:
        return answer2
