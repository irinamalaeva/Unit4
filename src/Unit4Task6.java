import java.util.Scanner;
// It is not ready. I am trying  todo it
public class Unit4Task6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int gameField [][] = new int [n][n];
        for (int i = 0; i < gameField.length; i++){
            for (int j = 0; j < gameField.length; j++){
                System.out.println(" Player1 input coordinate x,y : ");
                int x1  = sc.nextInt();
                int y1 = sc.nextInt();
                gameField[x1][y1] = 0;
                System.out.print(gameField[x1][y1]);
                System.out.println(" Player2 input coordinate x,y : ");


                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
              //  boolean point1 = true;
                //point1 !=
                if ( gameField[x1][y1] != gameField[x2][y2]){
                    System.out.println();
                }
                gameField[x2][y2] = 1;
                System.out.print(gameField[x2][y2]);


            }
            System.out.println();
        }


    }


}
