import pytest

from average import NumsList


def test_first_arithmetic_mean_more():
    compare = NumsList([9, 8, 7], [1, 2, 3])
    result = compare.compare_nums_lists()
    assert result == "У первого списка среднее арифметическое больше"


def test_second_arithmetic_mean_more():
    compare = NumsList([1, 2, 3], [7, 8, 9])
    result = compare.compare_nums_lists()
    assert result == "У второго списка среднее арифметическое больше"


def test_equal_averages():
    compare = NumsList([1, 2, 3], [3, 2, 1])
    result = compare.compare_nums_lists()
    assert result == "Средние арифметические равны"

