package nighttime04;

import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {
         /*
          Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
         'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */

    //alacakaranlik==>2

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 'c' ve 'a'  harflerini iceren bir cumle girimiz...");
        String str = input.nextLine().toLowerCase();

        int sayac = 0;   //+==>0 2+0=0     *==> 1 2*1=2   str==>""  true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sayac++;
            } else if (str.charAt(i) == 'c') {
                break;
            }//else if
        }//for loop
        System.out.println("c'den onceki a'larin sayisi : " + sayac);
        // }else
        System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir cumle giriniz");

    }//main
}
