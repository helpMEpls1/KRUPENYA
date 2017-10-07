package KRUPENYA.lesson002;
import java.util.Scanner;

/**
 * Created by Студент on 07.10.2017.
 */
public class Hard3 {
    public static void main(String[]arg){
        int K=1;
        int N=1;
        while (N<10000){
            System.out.println(N);
            K++;
            N=N*K;
        }
        System.out.println(K);


    }
}
