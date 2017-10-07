package KRUPENYA.lesson005;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Студент on 07.10.2017.
 */
public class Hard6 {
    public static void main(String[] arg){
        Random sss = new Random();
        Scanner xxx = new Scanner(System.in);
        int m;
        int n;
        int a;
        int g=0;
        int[][] veryHard;
        System.out.print("Колличество строк");
        m = xxx.nextInt();
        System.out.print("Колличество столбцов");
        n =  xxx.nextInt();
        System.out.print(" Введите число a");
        a = xxx.nextInt();
        veryHard = new int[m][n];
        for (int i = 0; i < veryHard.length; i++) {
            for (int j = 0; j < veryHard[i].length; j++) {
                veryHard[i][j] = sss.nextInt(10);
                System.out.print(veryHard[i][j] + " ");
            }
            System.out.println();

        }


        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(veryHard[i][j]==a){

                    g++;
                    System.out.println("Строка "+i + " " + "Столбец " +j );
                }
            }



        }
        System.out.println("колличество "+g );
    }
}
