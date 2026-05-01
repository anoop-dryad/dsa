import pytest

from src.data_structures.get_factorial import get_factorial_of_number

@pytest.mark.parametrize(
        "input,result",
        [
            (1,1),
            (2,2),
            (3,6),
            (4,24),
            (6,720),
            (0,1),
            (20,2432902008176640000)
        ])
def test_factorial(input, result):
    assert get_factorial_of_number(input) == result
