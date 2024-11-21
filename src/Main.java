import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // task 1

        System.out.println("Задача 1");
        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        double[] arrayTwo = {1.57, 7.654, 9.986};

        byte[] arrayThree = new byte[5];
        arrayThree[0] = 11;
        arrayThree[1] = 22;
        arrayThree[2] = 33;
        arrayThree[3] = 44;
        arrayThree[4] = 55;

        System.out.println("объявил массивы arrayOne, arrayTwo, arrayThree");


        // task 2

        System.out.println("Задача 2");

        System.out.print("элементы массива arrayOne: ");
        for (int i = 0; i < arrayOne.length; i++) {
            if (i == arrayOne.length - 1) {
                System.out.print(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.println();

        System.out.print("элементы массива arrayTwo: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i == arrayTwo.length - 1) {
                System.out.print(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i] + ", ");
        }
        System.out.println();

        System.out.print("элементы массива arrayThree: ");
        for (int i = 0; i < arrayThree.length; i++) {
            if (i == arrayThree.length - 1) {
                System.out.print(arrayThree[i]);
                break;
            }
            System.out.print(arrayThree[i] + ", ");
        }
        System.out.println();


        // task 3

        System.out.println("Задача 3");

        System.out.print("элементы массива arrayOne в обратном порядке: ");
        for (int i = arrayOne.length - 1; ; i--) {
            if (i == 0) {
                System.out.print(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.println();

        System.out.print("элементы массива arrayTwo в обратном порядке: ");
        for (int i = arrayTwo.length - 1; ; i--) {
            if (i == 0) {
                System.out.print(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i] + ", ");
        }
        System.out.println();

        System.out.print("элементы массива arrayThree в обратном порядке: ");
        for (int i = arrayThree.length - 1; ; i--) {
            if (i == 0) {
                System.out.print(arrayThree[i]);
                break;
            }
            System.out.print(arrayThree[i] + ", ");
        }
        System.out.println();


        // task 4

        System.out.println("Задача 4");

        for (int i = 0; i < arrayOne.length; i++) {
            if (i == arrayOne.length - 1 && arrayOne[i] % 2 != 0) {
                arrayOne[i] += 1;
                System.out.print(arrayOne[i]);
                break;
            } else if (arrayOne[i] % 2 != 0) {
                arrayOne[i] += 1;
            }
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.println();

    }
}