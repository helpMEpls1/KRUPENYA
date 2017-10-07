package KRUPENYA.lesson004;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Студент on 07.10.2017.
 */
public class Hard5 {
    public static void main(String[]arg){
        Random sss = new Random();
        Scanner xxx = new Scanner(System.in);
        int n;
        int[] veryHard;
        System.out.print("колличество чисел в массиве = ");
        n = xxx.nextInt();
        veryHard = new int[n];
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++ ){
            veryHard[i] = sss.nextInt(99) + 1;
            System.out.print(veryHard[i] + " ");
        }
        for(int i = 0; i < n; i++){
            if(i %3 ==0){
                veryHard[i] =5;
            }
        }
        System.out.println("\nМассив после изменений:");
        for(int  i = 0; i < n; i++){
            System.out.print(veryHard[i] + " ");
        }
    }

}
