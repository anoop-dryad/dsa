def check_if_given_number_is_palindrome(number: int):
    temp = number
    reversedNumber = 0
    while temp > 0:
        lastDigit = temp % 10
        temp = temp // 10
        reversedNumber = reversedNumber * 10 + lastDigit

    return reversedNumber == number


def check_if_given_number_is_palindrome_half_way(number: int):
    if number < 0 or (number % 10 == 0 and number != 0):
        return False

    reversedNumber = 0
    while number > reversedNumber:
        reversedNumber = reversedNumber * 10 + (number % 10)
        number //= 10

    return (reversedNumber == number) or (reversedNumber // 10 == number)
