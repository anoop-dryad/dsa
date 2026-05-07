import pytest
from python.src.data_structures.mathematics.trailing_zeros_in_factorial import (
    get_trailing_zeros_in_factorial,
)


@pytest.mark.parametrize(
    "number,result",
    [(5, 1), (10, 2), (100, 24), (10, 2), (251, 62)],
)
def test_get_trailing_zeros(number: int, result: int):
    assert get_trailing_zeros_in_factorial(number)
