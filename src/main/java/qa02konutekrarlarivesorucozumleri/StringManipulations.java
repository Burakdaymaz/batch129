package qa02konutekrarlarivesorucozumleri;

import java.util.Scanner;

public class StringManipulations {

    public static void main(String[] args) {

        //Example 01: s String indeki tum character leri buyuk harf yapiniz.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Bir Cumle Giriniz");
        String cumle=scan.nextLine().toLowerCase();

        System.out.println(cumle);


        ////Example 2: "s" String'indeki ilk character'i aliniz.

        String ss="Evimiz güzel";

        char harf=ss.charAt(0);
        System.out.println(harf);

        String ali = "grubumuza Hosgeldiniz";
        char p = ali.charAt(1);
        char b = ali.charAt(19);
        System.out.print(p);
        System.out.println(b);

        //Example 5: "s" String'indeki "n" harflerini "XXX"a ceviriniz.

        String c = "komsunun tavugunu";
        String k = c.replace("n", "XXX");
        System.out.println(k);

        //Example 7: "t" String'indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz


        String t = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9";
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

    }
}
