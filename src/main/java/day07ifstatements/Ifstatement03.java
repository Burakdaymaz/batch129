package day07ifstatements;

import java.util.Scanner;

public class Ifstatement03 {

    public static void main(String[]args) {

        //Example 3: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int nun = input.nextInt();

        if(nun>0) {
            System.out.println("Pozitif...");

        }else if (nun<0) {
            System.out.println("Negatif...");

        }else {
            System.out.println("Notr");
        }
    }


}
