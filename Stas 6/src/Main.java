import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int[] arr;

           //Вывести сред.арифметическое
    public static int midArifmetic() {
        return (a + b + c + d + e) / arr.length;

    }

           //Вывести макс и мин из массива
    public static void main(String[] args) {
        System.out.println("Vedite 5 numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();


        arr = new int[]{a, b, c, d, e};
        boolean isSorted = false;
        int buf;
        int max = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                    max = arr[arr.length - 1];
                }
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + arr[0]);
        System.out.println("Вывод массива " + Arrays.toString(arr));
        System.out.println("Среднеарифметическое " + midArifmetic());


        //Сумма, деление, произведение, разность
//        System.out.println("Введите число 1");
//        a = scanner.nextInt();
//        System.out.println("Введите число 2");
//        b = scanner.nextInt();
//
//        System.out.println("a+b = " + sum());
//        System.out.println("a/b = " + delenie());
//        System.out.println("a-b = " + raznost());
//        System.out.println("a*b = " + proizvodnay());
//
//    }
//
//    public static int sum() {
//        return a + b;
//    }
//
//    public static int delenie() {
//        return a / b;
//    }
//
//    public static int raznost() {
//        return a - b;
//    }
//
//    public static int proizvodnay() {
//        return a * b;
//    }
//}


    }}