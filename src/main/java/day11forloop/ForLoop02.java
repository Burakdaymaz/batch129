package day11forloop;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Verilen bir String'de 'a' character'i haric character'leri yazdiriniz.
        //          "Madagaskar" ==> Mdgkr
        String s = "Madagaskar";

        //1.Yol:
        String t = s.replace("a", "");
        System.out.println(t);//Mdgskr

        // 2.YOL:
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a') {
                System.out.print(s.charAt(i));//Mdgskr
            }
        }

        System.out.println();

        //3.Yol: Madagaskar
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='a'){
                continue;//continue keyword'u bazi sartlar icin loop'un adimlarini atlamamizi saglar

            }
            System.out.print(ch);////Mdgskr
        }
    }
}