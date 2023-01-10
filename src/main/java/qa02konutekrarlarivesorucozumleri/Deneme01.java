package qa02konutekrarlarivesorucozumleri;

public class Deneme01 {

    public static void main(String[] args) {

        System.out.println();
        //example 1; Verilen bir String de ilk d harfinden onceki tum karakterleri ekrana-konsola yazdiriniz.

        String str = " nereye döndün  ? ";

        for(int i = 0; i<str.length(); i++) {

            char b = str.charAt(i);
            if (b =='d')  {

                break;
            }

            System.out.print(b);

        }
       System.out.println();
        //Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz

        String a = "Germany";

        for (int i=a.length()-1; i>=0; i--){

            char c = a.charAt(i); {

            }
        System.out.print(c);
        }

       System.out.println() ;
    //Example 3: Verilen bir String de 'a' character leri haric tum character leri yazdiriniz.

        String il="adana"; //dn

        for(int i=0; i<il.length(); i++){
            char b1=il.charAt(i);
            if (b1== 'a'){
                continue;
            }
        System.out.print(b1);

        }

    }
}
