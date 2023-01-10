package qa02konutekrarlarivesorucozumleri;

import java.util.Scanner;

public class StringManipulations02 {

    public static void main(String[] args) {


        // Bir string olusturun ve bu stringde karakter sayisini hesaylayan kodu yaziniz..
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir cumle yaziniz..");
            String sun = input.nextLine();
            int sunRakam = sun.length() - 1;
            System.out.println(sunRakam);



      }
    }
