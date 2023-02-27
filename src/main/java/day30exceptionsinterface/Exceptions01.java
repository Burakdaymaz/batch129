package day30exceptionsinterface;

public class Exceptions01 {

    /*
      1)Exceptions olsada , olmasada calistirmaniz gereken kod'lari "finally black" icine yazariz.
      2)DB ile baglantiyi kesme isini yapan code'lar gibi code'lar her halukarda calistirilmalidir, bu tarz code'lari
      "finally block" icine koyariz.
      3)"try black" yanliz kullanilamaz
      "try black" + 1 "catch black" mumkundur
      "try black" + 1 "catch black" + 1 "finally black" mumkundur
      "try block" + coklu "catch block" mumkundur
      "try block" + coklu "catch block" + 1 finally block mumkundur
      "try block" + 1 "finally block" mumkundur
      4)Coklu "finally block" kullanilamaz
     */


    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int[] c = {3, 6, 9, 12};

        m(c, a, b);

    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the DB");
        }
        }
    }

