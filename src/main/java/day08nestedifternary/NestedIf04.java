package day08nestedifternary;

import java.util.Scanner;

public class NestedIf04 {

    public static void main(String[]args) {

        /*
        Kullanici 0`dan kucuk 120`den buyuk deger giremeyecek sekilde datalari aldiktan sonra

        Eger calisan kadin ise ;
        65 yasindan buyukse "Emekli Olabilir" yazdirin

        Eger calisan erkek ise;
        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz. Erkek , Kadin, Digerleri");
        String gender = String.valueOf(input.nextInt());

        System.out.println("Yasinizi giriniz...");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("Kadin")) {
            if(age>60){
                System.out.println("Emekli olabilir...");
            }else{
                System.out.println("Calismali...");
            }
        }else if (gender.equalsIgnoreCase("Erkek")){
            if (age>65){
                System.out.println("Emekli olabilir...");
            }else{
                System.out.println("Kesinlikle calismali...");
            }
        }else{
            System.out.println("Tanimli degil...");
        }


    }





}
