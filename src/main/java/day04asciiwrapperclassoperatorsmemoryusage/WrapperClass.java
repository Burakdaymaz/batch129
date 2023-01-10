package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[]args) {

        //primitive: char - booleon - byte -short - int - lang - float - double
        //Wrapper Class: Character - Booleon - Byte - Short - Integer - Long - Float - Double
        //Wrapper Class`lar nan-primitive`dir o yüzden memory`de cok yer kaplarlar, o yüzden sart degilse Wrapper Class kullanmayi tercih etmeyiz

        int n = 12; //"n" yazip "nokta" koyarsaniz hic method göremezsiniz, cünkü "primitive"ler method icermez
        Integer m = 12;//"n"yazip"nokta"koyarsaniz bircok method görürsünüz ,cünkü "wrapper class"lar method icerir

        byte p = 23;
        Byte r = 43;

        //Example 1: short data type`inin minimum ve maximum degerlerini kod yazarak bulunuz
        Short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);//32767

        short minShort;
        Short minshort = Short.MIN_VALUE;
        System.out.println(minshort);//-32768

        //Example 2: int data type`inin minimum degeri  ile byte data type`inin maximum degerinin toplami bulunuz .
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Toplam:" + (intMin + byteMax));// -2147483521

        //Example 3: i)Primitive int`i Wrapper Interger`a ceviriniz
        int nun = 22;

        Integer wrapperNum = nun;
        System.out.println(wrapperNum);//22
        //     ii)Wrapper Byte`i primitive byte`a ceviriniz .
        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);//43
        //Example  4: i)Primitive char`i Wrapper Character`e ceviriniz.(Autoboxing)
        //            i)Wrapper boolean`i primitive  boolean`a ceviriniz .(Unboxing)

        //example 5: Size String olan verilen iki fiyat`in toplamina ekrana yazdiriniz
        String shirt = "2300";
        String shoes = "5200";

        //Java`da "+" sembolu iki sayi arasinda kullanirsan "toplama islemi" olur.
        //Java`da "+" sembolu iki String arasinda veya bir String ve bir String ve bir sayi arasinda kullanirsa "concatenation islemi" olur.
        //"concatenation islemi" birlestirme yapar.
        //Note: Concatenation islemlerinde Java matematikteki islem önceligi kurallarini kullamir.
        //Islem önceligi kurallari : i)Önce uslu sayilar  ii)Parantez ici islemler yapilir  iii)Carpma ve bölme iv)Toplama ve cikarma
        System.out.println(shirt + shoes);//23005200

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //example 6: size String olarak verilen iki fiyat`in toplamini ekrana yazdiriniz

        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000

        int totalPrice = Integer.valueOf(tv)+ Integer.valueOf(radio);



    }
}
