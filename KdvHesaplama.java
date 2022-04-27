/*import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdvsiz Tutar :" + tutar);
        System.out.println("Kdv Oranı :" + kdvOran);
        System.out.println("Kdv Tutarı :" + kdvTutar);
        System.out.println("Kdvli Tutarı :" + kdvliTutar);

    }
}
*/

import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar;

        Scanner scan=new Scanner(System.in);
        System.out.print("Ucret tutarini giriniz:");
        tutar=scan.nextDouble();

        double kdvOran = (tutar > 1000) ? 0.08 : 0.18;
        kdvTutar= tutar* kdvOran;
        kdvliTutar=tutar+ kdvTutar;

        System.out.println("Tutar:"+tutar);
        System.out.println("Kdv Orani:"+kdvOran);
        System.out.println("Kdv Tutari:"+kdvTutar);
        System.out.println("Kdvli Tutar"+kdvliTutar);

    }
}