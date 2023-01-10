package practice.practiceDTNT;

import java.util.Scanner;

public class C01_Ifstatemnet {


    public static void main(String[]args) {

        /*
          Kullanicidan bir gun alin
       - Eger gun cuma ise "Muslumanlar icin kutsal gun"
       - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
       - Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
         Yazdiran kodu yaziniz
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun = input.next().toLowerCase(); //kucuk harfe cevirdik Cuma

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }else if ("gun".equalsIgnoreCase("cmrtesi")){
        System.out.println(" yahudiler kutsal gun");
        }else if ("gun".equalsIgnoreCase("pazar")){
        System.out.println("hristiyanlar için kutssal gun");
      }
    }
}
