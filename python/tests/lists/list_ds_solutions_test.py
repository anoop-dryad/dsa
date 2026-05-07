import pytest
from python.src.data_structures.lists.list_ds_solutions import (
    get_largest_element_in_list,
    get_second_largest_element_in_list,
)


@pytest.mark.parametrize("input_list,result", [([1, 2, 3, 4, 5], 5)])
def test_get_largest_element_in_list(input_list: list, result: int):
    assert get_largest_element_in_list(input_list) == result


@pytest.mark.parametrize(
    "input_list,result",
    [
        ([1, 2, 3, 4, 5], 4),
        ([10, 2, 2], 2),
        ([-10, -5, -20, -2], -5),
    ],
)
def test_get_second_largest_element_in_list(input_list: list, result: int):
    assert get_second_largest_element_in_list(input_list) == result
