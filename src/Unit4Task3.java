import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print(" input size:");
        int size = sc.nextInt();
        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = r.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int multiplication1 = 1;
        int multiplication2 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    multiplication1 = multiplication1 * array[i][j];
                }
                if (j == array.length - 1 - i) {
                    multiplication2 = multiplication2 * array[i][j];
                }
            }
        }
        System.out.println("multiplication of main diagonal; multiplication1= " + multiplication1);
        System.out.println("multiplication of side diagonal; multiplication2 = " + multiplication2);
        if (multiplication1 > multiplication2) {
            System.out.println("multiplication1 is more = " + multiplication1);
        } else {
            System.out.println("multiplication2 is more = " + multiplication2);
        }
    }
}





