package homework01;

import java.util.Scanner;

/**
 * ●	homework01.Pell. homework01.Pell numbers Числа Пелля задаются следующим соотношением:
 * <p>
 * На вход подается число n (0 <= n <= 30), необходимо распечатать n-e число Пелля
 * Пример:
 * Ввод:
 * 5
 * Вывод:
 * 29
 */
public class Pell {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            long x = 0;
            long p = 1;
            long xn;
            for (int i = 1; i <= n; i++) {
                xn = p + 2 * x;
                p = x;
                x = xn;
            }
            System.out.print(x);
        }
    }
}
