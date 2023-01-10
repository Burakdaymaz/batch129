package day10switchloops;

public class Loops01 {

    public static void main(String[] args) {

         /*

       Code Standarts
       i)Tekrar (Repetition) olmamalıdır.
       ii)Dynamic olmalıdır.
        iii)Tamir(Fix) ve update kolay yapilabilmelidir.

        */

        //Example 1: Ekrana 5 kere "Hi!" yazdırınız.

        //1.Yol: Tavsiye edilmez.

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Yol:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop" lar kullanılır
        //Dort tane Loop var ; i)for-loop  ii)while-loop  iii)do-while-loop  iv)for-each-loop

        //i)for-loop
        // Baslangıç degeri    Loop'un calısma sartı  Increment/Decrement
        for (int i = 1; i < 6; i++) {

            System.out.println("Hi");
        }
        // 11 den 44 kadar yazan kodu yaz
        for (int i = 11; i < 45; i++) {
            ;

            System.out.println(i);
        }

        //example :40 dan 23 e kadar tüm çift tam sayıları ekrana yazdır
        for (int s = 40; s > 22; s--) {
            if (s % 2 == 0) {
                System.out.println(s);

            }

            // 4: 18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

            for(int i=18;  i<57;  i++){
                if(i%2!=0){
                    System.out.println(i + "");
                }
            }
        }
    }
    }