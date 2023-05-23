import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double z;
        System.out.print("Введите a:");
        float a = input.nextFloat();
        System.out.print("Введите b:");
        float b = input.nextFloat();
        System.out.print("Введите xn:");
        float xn = input.nextFloat();
        System.out.print("Введите xk:");
        float xk = input.nextFloat();
        System.out.print("Введите шаг:");
        float dx = input.nextFloat();
        float beg;
        System.out.println("|\tx\t|\tz\t|");
        beg=xn;
        while (xk>=beg)
        {
            System.out.printf("|\t%.3f\t",beg);
            if (beg<=a)
                z = pow(beg,2)+sin(beg);
            else if ((a<beg) && (beg<b))
                z = cos(pow(beg,2));
            else if ((beg>=b) && (beg!=3.14/2) && (beg != (3*3.14)/2))
                z = tan(beg);
            else z=0;
            System.out.printf("|\t%.3f\t|\n",z);
            beg += dx;
        };
    }
}
