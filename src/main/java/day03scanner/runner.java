package day03scanner;

public class runner {

    public static void main(String[]args) {


        //Object nasil olusturulur?
        //Class Ismi    Object Ismi   Atama Operatörü    "new" keyword     Construcktor
            Car             myCar          =                   new            Car();

        System.out.println(myCar.model);

        System.out.println(myCar.fiyat);

        myCar.hareket();

        myCar.dur();


        Student tomHanks = new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();

        tomHanks.feed();

    }




}
