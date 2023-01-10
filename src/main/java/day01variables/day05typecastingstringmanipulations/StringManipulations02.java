package day01variables.day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[]args){

        String s = "Learn Java earn money";

        //Example 1: "s" String`inin "money" ile bitip bitmadigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2:"s" String`indeki "money" kelimesi "dollar" kelimesine ceviriniz.
        String s1 = s.replace("target:earn", "replacemet:win");
        System.out.println("s2");//Lwin Java win money

    }




}
