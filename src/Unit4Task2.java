import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input size = ");
        int size = sc.nextInt();
        int array[][] = new int[size][size];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" odd elements under the main diagonal: ");
        boolean odd = false;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i][j] % 2 != 0 && i > j) {
                    odd = true;
                    System.out.print(+array[i][j] + " ");
                }
            }
        }
        if (odd == false) {
            System.out.println(" do not exist");
        }
    }
}

