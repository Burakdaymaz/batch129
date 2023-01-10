package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[]args) {

    /*
            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
            Alemci ==> Gecerli


            Passwordun ilk harfi kucuk harf ise
            'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
            zehirli ==> gecerli

    */
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String pwd = input.nextLine();

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') { // Ilk harf buyuk harf mi kontrolu
            if (pwd.charAt(0) == 'A') { // password gecerli mi kontrolu
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password Cunku buyuk harf ama A degil...");
            }
        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') { // Ilk harf kucuk harf mi kontrolu
            if (pwd.charAt(0) == 'z') { // password gecerli mi kontrolu
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz Password Cunku kucuk harf ama z degil...");
            }

        } else {
            System.out.println("ilk character harf olmali");
        }
    }

    }
