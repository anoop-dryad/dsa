from src.data_structures.is_number_palindrome import (
    check_if_given_number_is_palindrome,
    check_if_given_number_is_palindrome_half_way,
)
import pytest


@pytest.mark.parametrize(
    "input_value, expected_result",
    [(121, True), (123456, False), (6996, True), (0, True), (-121, False), (10, False)],
)
def test_if_number_palindrome(input_value: int, expected_result: bool):
    assert check_if_given_number_is_palindrome(input_value) == expected_result


@pytest.mark.parametrize(
    "input_value, expected_result",
    [(121, True), (123456, False), (6996, True), (0, True), (-121, False), (10, False)],
)
def test_if_number_palindrome_half_way(input_value: int, expected_result: bool):
    assert check_if_given_number_is_palindrome_half_way(input_value) == expected_result
