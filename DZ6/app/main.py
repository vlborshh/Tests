from DZ6.app.average import NumsList


def main():

    nums_list = NumsList([0, 2, 4], [1, 3, 5])

    arithmetic_mean = nums_list.get_lists_arithmetic_mean()

    print(f"Среднее значение списка №1: {arithmetic_mean[0]}")
    print(f"Среднее значение списка №2: {arithmetic_mean[1]}")

    nums_list.arithmetic_mean_compare()


if __name__ == "__main__":
    main()
