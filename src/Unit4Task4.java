import java.util.Random;
import java.util.Scanner;

public class Unit4Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Input size = ");
        int size = sc.nextInt();
        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = r.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        boolean even = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if ((i < array.length - 1 - j) && array[i][j] % 2 == 0) {
                    even = true;
                    sum = sum + array[i][j];
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        if (even) {
            System.out.print("Sum of even elements over the side diagonal =" + sum);
        } else {
            System.out.print("Even elements over the side diagonal do not exist");
        }

    }
}

