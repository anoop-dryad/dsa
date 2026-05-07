import pytest
from python.src.data_structures.mathematics.get_digits import count_digits


@pytest.mark.parametrize(
    "input_value,expected_output",
    [(123, 3), (0, 1), (-500, 3), (10**49, 50), (999, 3), (1000, 4)],
)
def test_count_digits(input_value: int, expected_output: int):
    """Verify the count digits with various inputs"""
    assert count_digits(input_value) == expected_output
