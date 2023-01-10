package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

    /*
    Java "Nested if`leri calistirirken cok zamana ihtiyac duyar.(time Consuming
     */
    public static void main(String[]args) {

           /*
              Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
               Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
               Eger ucgen ise "eskenar"
               Ucgen olma durumunu
               kontrol ediniz.
               INFO :
               Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
               herhangi iki kenar farki ucuncu kenardan kucuk olmali
               a+b>c>a-b
               a+c>b>a-c
               b+c>a>b-c
               a=b=c ise eskenar ucgen
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Üçkenin kenarları için 3 uzunluk giriniz:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //Kullanicinin negatif sayi girmesini affetmiyorum
        if (a < 0 || b < 0 || c < 0) {

            System.out.println("Ucgenin kenarlari negatif olamaz");

        } else if ((a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c))) {


            if (a == b && b == c && a == c) {
                System.out.println("Ucgen hem de eskenar ucgen...");
            } else {
                System.out.println("Ucgen ama eskenar degil...");
            }

        } else {
            System.out.println("Sen ucgen degilsin...");
        }

      }

    }










