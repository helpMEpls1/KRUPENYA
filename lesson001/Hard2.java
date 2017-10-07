package KRUPENYA.lesson001;
import java.util.Scanner;

/**
 * Created by Студент on 07.10.2017.
 */
public class Hard2 {

    public static void main(String[] arg) {
        Scanner n = new Scanner(System.in);
        int X;
        System.out.println("введите число X");
        X = n.nextInt();
        int A = X / 100;
        int B = X / 10 - (A * 10);
        int C = X - A * 100 - B * 10;
        System.out.printf("%d %d %d", A, B, C);
        if (A == B || B == C || C == A)
            System.out.printf(" Одинаковые числа");
        else System.out.printf(" Не одинаковы числа");

    }
}