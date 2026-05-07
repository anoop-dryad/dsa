def get_largest_element_in_list(input_list: list):
    if len(input_list) < 1:
        raise ValueError("Invalid list provided.")

    max = input_list[0]
    for element in input_list:
        if element > max:
            max = element
    return max


def get_second_largest_element_in_list(input_list: list):
    if len(input_list) < 1:
        raise ValueError("Invalid list provided.")

    max = float("-inf")
    second_max = float("-inf")
    for element in input_list:
        if element > max:
            second_max = max
            max = element
        elif element > second_max and element != max:
            second_max = element

    if second_max == float("-inf"):
        raise ValueError("Second Max not able to decide.")
    return second_max
