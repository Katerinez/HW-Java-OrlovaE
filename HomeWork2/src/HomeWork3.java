import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] arg) {

        System.out.println("*** Task 1 ***");
        task1();
        System.out.println("*** Task 2 ***");
        task2();
        System.out.println("*** Task 3 ***");
        task3();
        System.out.println("*** Task 4 ***");
        task4();
        System.out.println("*** Task 5 ***");
        task5();
        System.out.println("*** Task 6 ***");
        task6();
        System.out.println("*** Task 7 ***");
        task7();
        System.out.println("*** Task 8 ***");
        task8(-2);

    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void task1() {
        int[] myArrayInt = new int[5];
        for (int i = 0; i < 5; i++) {
            myArrayInt[i] = random.nextInt(2);
            System.out.print("myArrayInt[" + i + "] = " + myArrayInt[i] + " | ");

            if (myArrayInt[i] == 0) {
                myArrayInt[i] = 1;
            } else {
                myArrayInt[i] = 0;
            }
        }
        System.out.println();
        System.out.println("Replace 1 = 0 and 0 = 1");
        for (int i = 0; i < 5; i++) {
            System.out.print("myArrayNew[" + i + "] = " + myArrayInt[i] + " | ");
        }
        System.out.println();
    }

    /*
    2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void task2() {
        int[] array100 = new int[100];
        for (int i = 0; i < 100; i++) {
            array100[i] = i + 1;
            System.out.print("array[" + i + "]= " + array100[i] + " | ");
        }
        System.out.println();
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;
     */
    public static void task3() {
        int[] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < 12; i++) {
            System.out.print("arrayTask3[" + i + "]=" + arrayTask3[i] + " | ");
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            if (arrayTask3[i] < 6) {
                arrayTask3[i] = arrayTask3[i] * 2;
            }
            System.out.print("arrayTask3[" + i + "]=" + arrayTask3[i] + " | ");
        }
        System.out.println();
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
     элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void task4() {
        int[][] arrayTask4 = new int[9][9];
       /*for (int a=0; a<9; a++){
            for (int b=0; b<9; b++){
                arrayTask4[a][b] = 0;
            }
        }*/
        for (int i = 0; i < 9; i++) {
            arrayTask4[i][i] = 1;
            arrayTask4[i][8 - i] = 1;
            for (int j = 0; j < 9; j++) {
                System.out.print(arrayTask4[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
    }

    /*
    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
    равна initialValue;
     */
    public static void task5() {
        int len = scanner.nextInt();
        int initialValue = scanner.nextInt();
        System.out.println("len = "+ len + ", initialValue = "+ initialValue);
        int[] arrayTask5 = new int[len];
        for (int i = 0; i < len; i++) {
            arrayTask5[i] = initialValue;
            System.out.print(arrayTask5[i] + " | ");
        }
        scanner.close();
        System.out.println();

    }

    /*
    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    public static void task6() {
        int[] arrayTask6 = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayTask6[i] = random.nextInt(20);
            System.out.print(arrayTask6[i] + "  |  ");
        }
        System.out.println();

        int max = 0;
        int maxIndex = 0;

        for (int j = 0; j < 5; j++) {
            if (arrayTask6[j] > max) {
                max = arrayTask6[j];
                maxIndex = j + 1;
            }
        }
        System.out.println("max: arrayTask[" + maxIndex + "] = " + max);

        int minIndex = 0;

        for (int j = 0; j < 5; j++) {
            if (arrayTask6[j] < max) {
                max = arrayTask6[j];
                minIndex = j + 1;
            }
        }
        System.out.println("min: arrayTask[" + minIndex + "] = " + max);

    }

    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    **Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     */

    // запускать приходится несколько раз, чтобы условие выполнилось (при этом запуск task5() отправляю в коментарий, так быстрее))
    public static void task7() {
        int[] arrayTask7 = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayTask7[i] = random.nextInt(5);
            System.out.print(arrayTask7[i] + "  |  ");
        }
        System.out.println();

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < 4; i++) {
            sumLeft = sumLeft + arrayTask7[i];
            // System.out.println("sumLeft="  + sumLeft + " = [" + i + "] ");
            for (int j = i + 1; j < 5; j++) {
                sumRight = sumRight + arrayTask7[j];
                //  System.out.print("sumRight "  + sumRight + " + [" + j + "] " + arrayTask7[j]);
                //System.out.println();
            }

            if (sumLeft == sumRight) {
                System.out.println( (i+1)+") TRUE   sumLeft = " + sumLeft + " = sumRight = " + sumRight + "  after arrayTask7["+(i+1)+"]");

                for (int a=0; a<i+1; a++){
                    System.out.print(arrayTask7[a] +" , ");
                }
                System.out.print("  =  ");
                for (int a=i+1; a<5; a++){
                    System.out.print(arrayTask7[a] +" , ");
                }
                System.out.println();
                // return true;
            }else{
                System.out.println( (i+1) + ") condition impossible ");
            }



            sumRight = 0;
        }

    }

    /*
    8. *** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить
    все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения
    задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     */
    // только не смогла передать массив методу
    public static void task8(int n) {
        int[] arrayTask8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int a = arrayTask8[0];
                for (int i = 0; i < 10; i++) {
                    if (i == 9) {

                        arrayTask8[i] = a;
                    } else {
                        arrayTask8[i] = arrayTask8[i + 1];
                    }
                }
            }
        } else {
            for (int j = 0; j < (n*(-1)); j++) {
                int a = arrayTask8[9];
                for (int i = 9; i>=0; i--) {
                    if (i == 0) {
                        arrayTask8[i] = a;
                    } else {
                        arrayTask8[i] = arrayTask8[i - 1];
                    }
                }
            }


        }

        if (n>0) {
            System.out.println("n = " + n + ", сдвиг влево на " + n + " шагов");
            for (int i = 0; i < 10; i++) {
                System.out.print(arrayTask8[i] + " | ");
            }
        }else{
            System.out.println("n = "+ n+ ", сдвиг вправо на "+n+" шагов");
            for (int i = 0; i < 10; i++) {
                System.out.print(arrayTask8[i] + " | ");
            }
        }

    }

}





