
import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" input size = ");
        int size = sc.nextInt();
        int array[][] = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



    }

}



