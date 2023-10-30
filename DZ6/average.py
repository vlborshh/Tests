from __future__ import annotations

class NumsList:
    def __init__(self, list1, list2):
        self.list1 = list1
        self.list2 = list2

    @staticmethod
    def arithmetic_mean(list):
        if len(list) == 0:
            return 0
        return sum(list) / len(list)

    def compare_nums_lists(self):

        average1 = self.arithmetic_mean(self.list1)
        average2 = self.arithmetic_mean(self.list2)

        if average1 > average2:
            return "У первого списка среднее арифметическое больше"
        if average1 < average2:
            return "У второго списка среднее арифметическое больше"
        return "Средние арифметические равны"