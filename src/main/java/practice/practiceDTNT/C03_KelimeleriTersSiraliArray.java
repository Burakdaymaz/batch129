package practice.practiceDTNT;

public class C03_KelimeleriTersSiraliArray {
    /*
      INTERWIEW SORUSU
     Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
     Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
     tersine çevirmek için kod yazınız.
     Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
     Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
     */

    public static void main(String[] args) {

        String str = " Kemal Can Kuzu ";
        String arr[] = str.split("");
        String tersStr = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            tersStr += arr[i]+" ";

        }

        System.out.print("trim basta ise yaradimi");


        System.out.print(tersStr);
        System.out.println("trim sonda ise yaradimi");

        System.out.print("trim basta ise yaradimi");
        System.out.print(tersStr.trim());
        System.out.println("trim sonda ise yaradimi");







    }//main
}//class

