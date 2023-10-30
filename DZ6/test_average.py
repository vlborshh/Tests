import pytest

from average import NumsList


def test_first_arithmetic_mean_more():
    compare = NumsList([4, 5, 6], [1, 2, 3])
    result = compare.compare_nums_lists()
    assert result == "Первый список имеет большее среднее значение"


def test_second_arithmetic_mean_more():
    compare = NumsList([1, 2, 3], [4, 5, 6])
    result = compare.compare_nums_lists()
    assert result == "Второй список имеет большее среднее значение"


def test_equal_averages():
    compare = NumsList([1, 2, 3], [1, 2, 3])
    result = compare.compare_nums_lists()
    assert result == "Средние значения равны"


def test_empty_averages():
    compare = NumsList([], [])
    result = compare.compare_nums_lists()
    assert result == "Средние значения равны"