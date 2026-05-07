def get_trailing_zeros_in_factorial(number: int):
    trailing_zeros = 0
    i = 5
    while i <= number:
        trailing_zeros = trailing_zeros + (number / i)
        i = i * 5

    return trailing_zeros
