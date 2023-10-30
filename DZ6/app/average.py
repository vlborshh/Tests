from __future__ import annotations


class NumsList:
    def __init__(self, list1: list[int | float], list2: list[int | float]):

        self.list1 = list1
        self.list2 = list2

    def get_lists_arithmetic_mean(self) -> tuple[float, float]:

        arithmetic_mean_list1 = 0
        if self.list1:
            arithmetic_mean_list1 = sum(self.list1) / len(self.list1)

        arithmetic_mean_list2 = 0
        if self.list2:
            arithmetic_mean_list2 = sum(self.list2) / len(self.list2)

        return arithmetic_mean_list1, arithmetic_mean_list2

    def arithmetic_mean_compare(self) -> None:

        arithmetic_mean_list1, arithmetic_mean_list2 = self.get_lists_arithmetic_mean()
        if arithmetic_mean_list1 > arithmetic_mean_list2:
            print('У первого списка среднее значение больше.')
        elif arithmetic_mean_list1 < arithmetic_mean_list2:
            print('У второго списка среднее значение больше.')
        else:
            print('Средние значения списков равны.')
