def count_digits(number:int):
    """
    Count the number of digits in a given number.
    Parameters:
    number (int): The number to count digits in.
    Returns:
    int: The number of digits in the input number.
    """
    if number == 0:
        return 1
    temp = abs(number)
    count = 0
    while temp > 0:
        temp = temp // 10
        count += 1

    return count
