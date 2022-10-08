package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        int arraySize = getInfo("Введите размер списка: ");
        int maxValue = getInfo("Введите верхнюю границу для значений: ");
        logger.log("Создаём и наполняем список");
        List<Integer> list = getList(arraySize, maxValue);
        System.out.println("Вот случайный список:" + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int maxFil = getInfo("Введите порог для фильтра: ");
        Filter filter = new Filter(maxFil);
        list = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список:" + list);
        logger.log("Завершаем программу");
    }

    public static List<Integer> getList(int arraySize, int maxValue) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= arraySize; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }

    public static int getInfo(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);
        int rez = scanner.nextInt();
        return rez;
    }

}