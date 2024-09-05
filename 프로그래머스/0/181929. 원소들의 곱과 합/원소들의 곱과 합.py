def solution(num_list):
    answer = sum(num_list)
    answer2 = 1
    for num in num_list:
        answer2 *= num

    if pow(answer, 2) >= answer2:
        return 1
    else:
        return 0