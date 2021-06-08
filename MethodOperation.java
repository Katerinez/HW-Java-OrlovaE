package Lesson02.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 05.06.2021
 */

public class MethodOperation {

    public static void main(String[] args) {
        //RESULT = A * B + C * D

        //A = a + b * c - d
        //B = b * c - a + d
        //C = a * b * c - d
        //D = a - b - c - d

        int result;

        result = valueA(valueA(valueA(valueA(48,49,50,51),34,35,36),valueB(37,38,39,40),valueC(41,42,43,44),valueD(44,45,46,47)), valueB(21,22,23,24), valueC(25,26,27,28), valueD(29,30,31,32)) *
                valueB(5, 6, 7, 8) +
                valueC(9, 10, 11, 12) *
                valueD(13, 14, 15, 16);

        System.out.println("Result = " + result);
    }

    public static int valueA(int a, int b, int c, int d) {
        return a + b * c - d;
    }

    public static int valueB(int a, int b, int c, int d) {
        return b * c - a + d;
    }

    public static int valueC(int a, int b, int c, int d) {
        return a * b * c - d;
    }

    public static int valueD(int a, int b, int c, int d) {
        return a - b - c - d;
    }
}
