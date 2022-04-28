import java.util.Scanner;

public class DikÜcgendeHipotenüs {
        public static void main(String[] args){
            int a, b;
            double c;

            Scanner girdi = new Scanner(System.in);
            System.out.println("1. Kenarı Giriniz : ");
            a = girdi.nextInt();
            System.out.println("2. Kenarı Giriniz : ");
            b = girdi.nextInt();
            c = Math.sqrt((a*a) + (b*b)) ;
            System.out.println("Hipotenüs : " + c);

            double u = (a+b+c)/2;
            System.out.println("Perimeter of the triangle is : "+2*u);
            System.out.println("Area of triangle is : "+Math.sqrt(u*(u-a)*(u-b)*(u-c)));

        }
}
