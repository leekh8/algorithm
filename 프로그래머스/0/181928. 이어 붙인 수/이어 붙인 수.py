def solution(num_list):
    odd_answer = 0
    even_answer = 0
    
    for num in num_list:
        if num % 2 == 0:
            odd_answer = (odd_answer * 10) + num
        else:
            even_answer = (even_answer * 10) + num
    
    answer = even_answer + odd_answer
    
    return answer