package day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[]artgs) {

        //Kullanicidaniki sayi alip  4 islem yapan ve islemlerin sonuclari ekrana yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }


}

