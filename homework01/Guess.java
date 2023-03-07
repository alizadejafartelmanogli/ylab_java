package homework01;

import java.util.Random;
import java.util.Scanner;

/**
 * ●	homework01.Guess. Игра угадайка. При запуске программа загадывает число от 1 до 99 (включительно) и дает пользователю 10 попыток отгадать.
 * Далее пользователь начинает вводить число. И тут возможен один из следующих вариантов:
 * - Пользователь отгадал число. В таком случае выводится строка
 * “Ты угадал с N попытки”, где N - номер текущей попытки пользователя
 * - Пользователь ввел число, меньше загаданного. В таком случае выводится сообщение “Мое число меньше! У тебя осталось M попыток”
 * где M - количество оставшихся попыток
 * - Пользователь ввел число, больше загаданного. В таком случае выводится сообщение “Мое число больше! У тебя осталось M попыток”
 * где M - количество оставшихся попыток
 * - У пользователя закончились попытки и число не было угадано. В таком случае выводится сообщение “Ты ну угадал”
 * <p>
 * Получить случайный элемент от 1 до 99 (включительно):
 * int number = new Random().nextInt(99) + 1;
 */
public class Guess {
    public static void main(String[] args) {
        int number = new Random().nextInt(100); // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
        boolean guess = false; //флажок если не отгадал за 10 попыток
        for (int i = 1; i <= maxAttempts; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи свой вариант ответа:");
            int userVariable = scanner.nextInt();
            if (userVariable > number)
                System.out.println("Мое число меньше! Осталось " + (maxAttempts - i) + " попыток");
            if (userVariable < number)
                System.out.println("Мое число больше! Осталось " + (maxAttempts - i) + " попыток");
            if (userVariable == number) {
                System.out.println("Ты угадал с " + i + " попытки!");
                i = maxAttempts + 1;
                guess = true;
            }
        }
        if (!guess)
            System.out.println("Ты не угадал");
    }
}
