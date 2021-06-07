import java.util.Random;
import java.util.Scanner;

public class Unit4Task5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("input size = ");
        int size = sc.nextInt();
        int array[][] = new int [size][size];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j ++){
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int arrayNew[][] = new int[array.length][array.length];

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                arrayNew[j][i]= array[i][j];
            System.out.print(arrayNew[j][i] + " ");
            }
            System.out.println();
        }

    }
}
