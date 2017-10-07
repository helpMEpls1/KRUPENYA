package KRUPENYA.lesson000;
import java.util.Scanner;

/**
 * Created by Студент on 07.10.2017.
 */
public class Hard {
    public static void main  (String[]arg) {
        Scanner n =new Scanner(System.in);
        int Ax,Ay,Bx,By,Cx,Cy;
        System.out.println("Введите число Ax");
        Ax=n.nextInt();
        System.out.println("Введите число Ay");
        Ay=n.nextInt();
        System.out.println("Введите число Bx");
        Bx=n.nextInt();
        System.out.println("Введите число By");
        By=n.nextInt();
        System.out.println("Введите число Cx");
        Cx=n.nextInt();
        System.out.println("Введите число Cy");
        Cy=n.nextInt();
        double BC=Math.sqrt((Cx-Bx)^2+(Cy-Cy)^2);
        double AB=Math.sqrt((Bx-Ax)^2+(By-Ay)^2);
        double AC=Math.sqrt((Cx-Ax)^2+(Cy-Ay)^2);
        double P=AB+BC+AC;
        System.out.println("периметр"+P);
        double S=Math.sqrt(P*(P-AB)*(P-BC)*(P-AC));
        System.out.println("Площадь" +S);



    }
}
