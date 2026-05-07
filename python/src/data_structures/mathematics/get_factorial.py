def get_factorial_of_number(number:int):
    if number<0:
        raise ValueError("min=0 and max=1000")
    factorial=1
    for i in range(1, number+1):
        factorial=factorial*i
    
    return factorial