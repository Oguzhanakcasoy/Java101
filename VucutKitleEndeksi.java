/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / (Boy(m) * Boy(m));

Örnek Çıktı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.492157923201
 */

import java.util.Scanner;

public class VucutKitleEndeksi {
        public static void main(String[] args){
             double kilo, boy, kitlendeksi;


            Scanner scan=new Scanner(System.in);
            System.out.print("Kilonuzu Giriniz : ");
            kilo=scan.nextDouble();
            Scanner Scan = new Scanner(System.in);
            System.out.print("Boyunuzu Giriniz : ");
            boy=scan.nextDouble();

            kitlendeksi = kilo/ (boy * boy);
            System.out.println("Vücut Kitle Endeksi: " + kitlendeksi);

        }
}
