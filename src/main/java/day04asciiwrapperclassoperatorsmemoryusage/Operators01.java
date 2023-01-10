package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

   /*
         1) +,-,*,/  islemleri Java`da matematik`te kullanildigi gibi kullanilir.
         Note 1: int / int ==> int olur
         Note 2: double + int  ==> double olur. Cünkü; Java`da matematiksel islemlerde farkli data type`lari kullanilirsa sonuc buyuk data type`inda olur.

         2)Java`da "logical operator"lar vardir.
         AND ve OR islemleri "logical operator"lardir
         i) AND isleminden true olabilmek icin  her sey true olmalidir.
            AND islemci "perfectionist"tir.
            AND isleminde  bir tane false sonucu false yapar.

         ii)OR isleminde bir tane true sonucu true yapmaya yeter .
            OR isleminde sonucu false olmasi icin hersey false olmalidir.
            OR islemi "polyanna" gibidir.

        iii)NOT Operation (!) true olani false , false olani true yapar.
            !true = false
            !false= true
            !!true= true

            3)Comporisan(Karsilastirma) Operators
            <,>, <==,>=, ==, !=
            Note: Karsilastirma operatörlerini kullandiginizda kesinlikle booleon(true veya false) alirsiniz.

            Note. Biz AND islemi icin "&&" kullaniriz ama "&" kullanim`da gecerlidir.
            Farklari nedir ?



    */

    public static void main (String[]args){

        boolean first =3<5;
        boolean second = 2+3 !=5;
        boolean third = 2+3*5 >= 19;

        System.out.println(first + " - " + second + "- " + third );

        System.out.println(first && second );

        System.out.println(first |  second  |  third);

    }


}