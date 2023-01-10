package day01variables.day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: yer degistirmek.   1.kap:Patates 2.kap:Domates ==> Swap  ==> 1.kap:Domates 2.kap:Patates

    public static void main(String[]args) {

        int a = 12;
        int b = 5;  //Swap`dan sonra ==> a5 ve b=12
        int temp = 8;

        System.out.println("a: " + a); //12
        System.out.println("b:" + b); //5


        //1.Adim
        temp = a;

        //2.Adim
        a = b;

        //3.Adim
        b = temp;

        System.out.println("a:" + a);//5
        System.out.println("b:" + b);//12

        //2.Yol:
        int x = 12;
        int y = 5;

        x = x + y;

        y = x - y;

        x = x - y;


    }

}

