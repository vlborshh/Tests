from __future__ import annotations

class NumsList:
    def __init__(self, list1, list2):
        self.list1 = list1
        self.list2 = list2

    @staticmethod
    def arithmetic_mean(input_list):
        if len(input_list) == 0:
            return 0
        return sum(input_list) / len(input_list)

    def compare_nums_lists(self):

        average1 = self.arithmetic_mean(self.list1)
        average2 = self.arithmetic_mean(self.list2)

        if average1 > average2:
            return "Первый список имеет большее среднее значение"
        if average1 < average2:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"