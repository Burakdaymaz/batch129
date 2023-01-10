package day01variables.day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir nan-primitive data  type`dir ve ayni zamanda bir class`dir.

    public static void main (String[]args) {

        String s = "Java is easy";

        //Example 1: "s" String`indeki tüm character`leri büyük harf yapiniz.
        String supper = s.toUpperCase();
        System.out.println(supper); //JAVA IS EASY

        //Example 2: "s" String`indeki tüm character`leri kücük harf yaziniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example 3: "s" String`indeki ilk character`i aliniz.
        char firstChar = s.charAt(8);
        System.out.println(firstChar);//j

        //Example 4: "s" String`indeki ikinci ve sondan ikinci character`i aliniz ve ekrana yanyana yazdiriniz.

        char secondChar = s.charAt(1);//a

        char secondLastChar = s.charAt(10);

        //1.Yol: Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.Yol: ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondLastChar);

        //Example 5: "s" String`inde kullanilan character sayisi bulunuz.
        int sLength = s.length();
        System.out.println(sLength);//12


        //Example 6: "s" String`indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index  dahil , "4" yani ikinci index haric dir.(0,4)
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        //Example 7: "s" String`indeki "is" kelimesini aliniz
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        //Example 8: "s" String`indeki "easy" kelimesi aliniz
        String sub3 = s.substring(8, 12);


    }



}

