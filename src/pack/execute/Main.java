package pack.execute;

import java.util.Scanner;

/**
 * Created by Student on 27.09.17.
 */

public class Main {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        int size = text.nextInt();
        ArrayWorker sArr = new ArrayWorker(size);
        sArr.input();
        sArr.Print();
        sArr.Reverse();
        System.out.println("///");
        sArr.Print();
        System.out.println("Все ли элементы в массиве положительны: "+ sArr.IsPositive());
        System.out.println("Введите границы отрезка:");
        int a = text.nextInt();
        int b = text.nextInt();
        System.out.println("Количество элементов, принадлежащих этому отрезку: "+ sArr.BelongsTo(a,b));
        System.out.println("Сумма элементов массива равна: "+ sArr.Sum());
        System.out.println("Количество четных элементов: "+ sArr.EvenNum());
    }
}
