package day01variables.day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[]args) {

        /*
             Example 1: Asagidaki kurallara göre kullanicinin girdigi password`u kontrol ediniz.
                      i)en az 8 character olsun
                      ii)Space character password`de olmasin
                      iii)En az bir tane buyuk harf olsun
                      iv)En az bir tane kucuk harf olsun
                      v)en az bir sembol olsun
                      vi)En az bir tane rakam olsun

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //i)En az 8 character olsun
        boolean first = pwd.length() > 7;
        System.out.println(first);

        //Space characteri password`de olmasin
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //iii)En az bir tane buyuk harf olsun
        //Note: Buyuk harf olmayanlari sil,
        //      Character sayisi sifir ise buyuk harf yok demektir,
        //      sifirdan buyuk ise buyuk harf var demektir.
        String regex;
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
         //Methodical ayni satirda yanyana kullanmaya Method chain denir.
        System.out.println(third);


    }

}

