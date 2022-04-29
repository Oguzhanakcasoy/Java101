import java.util.Scanner;

public class DaireAlanıCevresi {
    public static void main(String[] args){
        int r, aci;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();
        System.out.println("Dairenin Alan hesabı için açı giriniz : ");
        aci = inp.nextInt();

        double alan = (pi * r * r)* aci /360 ;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + alan );
        System.out.println("Dairenin Çevresi : " + cevre );
        System.out.println("Yaricapi : "  + r + " acisi : "+ aci +" derece dairenin alanı: " + alan);
    }
}
