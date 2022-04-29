import java.util.Scanner;

public class KasaProgramı {
    public static void main(String[] args) {
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.00;
        double satilanArmut, satilanElma, satilanDomates, satilanMuz, satilanPatlican;
        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç kilo ? : ");
        satilanArmut = scan.nextDouble();

        System.out.print("Elma Kaç kilo: ");
        satilanElma = scan.nextDouble();

        System.out.print("Domates Kaç kilo: ");
        satilanDomates = scan.nextDouble();

        System.out.print("Muz Kaç kilo: ");
        satilanMuz = scan.nextDouble();

        System.out.print("Patlıca Kaç kilo: ");
        satilanPatlican = scan.nextDouble();

        double tutar = (satilanArmut * Armut) + (satilanElma * Elma) + (satilanDomates * Domates) + (satilanMuz * Muz) + (satilanPatlican * Patlican);
        System.out.println("Ödencek Tutar : " +tutar);
    }
}

