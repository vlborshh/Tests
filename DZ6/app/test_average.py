import pytest


from DZ6.app.average import NumsList

@pytest.fixture
def list1():
    return [1, 2, 3, 4, 5]

@pytest.fixture
def list2():
    return [2, 3, 4, 5, 6]


def test_init(list1, list2):
    nums_list = NumsList(list1, list2)
    assert nums_list.list1 == list1
    assert nums_list.list2 == list2


def test_get_lists_arithmetic_mean(list1, list2):
    nums_list = NumsList(list1, list2)
    assert nums_list.get_lists_arithmetic_mean() == (3, 4)

@pytest.mark.parametrize('list1, list2, result', [([1, 2, 3], [], (2, 0)), ([], [1, 2, 3], (0, 2)), ([], [], (0, 0))])
def test_get_empty(list1, list2, result):
    nums_list = NumsList(list1, list2)
    assert nums_list.get_lists_arithmetic_mean() == result


def test_first_arithmetic_mean_more(list1, list2, compare):
    nums_list = NumsList(list2, list1)
    nums_list.arithmetic_mean_compare()
    captured = compare.readouterr()
    assert captured.out.strip() == 'У первого списка среднее значение больше.'


def test_second_arithmetic_mean_more(list1, list2, compare):
    nums_list = NumsList(list1, list2)
    nums_list.arithmetic_mean_compare()
    captured = compare.readouterr()
    assert captured.out.strip() == 'У второго списка среднее значение больше.'


def test_equal_averages(list1, compare):
    nums_list = NumsList(list1, list1)
    nums_list.arithmetic_mean_compare()
    captured = compare.readouterr()
    assert captured.out.strip() == 'Средние значения списков равны.'
