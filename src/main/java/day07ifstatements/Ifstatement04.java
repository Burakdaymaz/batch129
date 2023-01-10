package day07ifstatements;

import java.util.Scanner;

public class Ifstatement04 {

    public static void main(String[]args){

        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz...");
        byte nun = input.nextByte();

        if(nun==1) {
            System.out.println("Sunday");
        }else if (nun==2) {
            System.out.println("Monday");
        }else if(nun==3) {
            System.out.println("Tuesday");
        }else if(nun==4) {
            System.out.println("Wednesday");
        }else if (nun==5) {
            System.out.println("Thursday");
        }else if(nun==6) {
            System.out.println("Friday");
        }else if(nun==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Hatalı giriş yaptınız. Lütfen 1 ile 7 arasında bir sayı giriniz...");
        }
    }


}

