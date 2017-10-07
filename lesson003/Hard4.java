package KRUPENYA.lesson003;
import java.util.Scanner;

/**
 * Created by Студент on 07.10.2017.
 */
public class Hard4 {
    public static void main(String[]arg){
        Scanner scn=new Scanner(System.in);
        double X;
        double Y;
        int n;
        System.out.print("Введи колличество ");
        n=scn.nextInt();
        for(int i = 0; i < n; i++){
            if(i %2 == 0){
                X=0.5*i;

            } else {
                X = 0.75*i;
            }
            Y=(Math.log(Math.abs(Math.exp(Math.pow(-X,2)+(Math.sin(X)-1)))));
            System.out.println("при x=" + X + "y = " + Y);
        }
    }
}
