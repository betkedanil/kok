package pack.execute;
import java.util.Scanner;

/**
 * Created by Student on 26.09.17.
 */
public class ArrayWorker {
    //private int arrSize = 0; // БЕЗ НАДОБНОСТИ
    private int[] arrElem;

    public void input() {
        Scanner text = new Scanner(System.in);
        for(int i = 0;i < arrElem.length; i++) {
            arrElem[i] = text.nextInt();
        }
    }
    public ArrayWorker(int size) {
        //TODO check size<=0
        arrElem = new int[size];
    }

    public void Print() {
        for(int i = 0;i < arrElem.length;i++) {
            System.out.print(arrElem[i] + " ");
        }
        System.out.println();
    }

    public void Put(int pos, int a) {
        if(pos >= 0 && pos <= arrElem.length) {
            arrElem[pos] = a;
        }
    }

    public int Sum() {
        int s = 0;
        for (int anArrElem : arrElem) {
            s += anArrElem;
        }
        return s;
    }

    public int EvenNum() {
        int c = 0;

        for (int anArrElem : arrElem) {
            if (anArrElem % 2 == 0) {
                c++;
            }
        }
        return c;
    }

    public int BelongsTo(int a, int b) {
        int c = 0;

        for(int i = 0;i < arrElem.length;i++) {
            if(arrElem[i] >= a && arrElem[i] <= b) {
                c++;
            }
        }

        return c;
    }

    public boolean IsPositive() {
        for (int anArrElem : arrElem) {
            if (anArrElem <= 0) {
                return false;
            }
        }
        return true;
    }

    public void Reverse() {
        int[] sArr = new int[arrElem.length];
        int size = arrElem.length;
        for(int i = 0;i < arrElem.length;i++) {
            sArr[i] = arrElem[size - (i+1)];
        }
        arrElem = sArr;
    }

    public int Size() {
        return arrElem.length;
    }


}
/*
 public class Main {
       public static void main(String[] args) {
           ArrayWorker sArr = new ArrayWorker(10);
           Scanner text = new Scanner(System.in);

           for(int i = 0;i < sArr.Size();i++) {
               System.out.println("Введите число:");
               sArr.Put(i, text.nextInt());
           }

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
*/