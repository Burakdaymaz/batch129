package day23datetimestringbuilder;

public class StringBuffer01 {

    /*
    String olusturmak icin string class , StringBuilder Class, ve StringBuffer kullanilabilir.
    1)StringBuffer Java'nin string uretmek icin olusturdugu ile Class'dir. Java 5 de uretilmistir.
    2)StringBuffer "synchronized"dir, stringBuilder "synchronized" degildir.
    3)stringBuffer "thread-safe"(multi-thread'e uygun)dir, StringBuilder "thread-safe" degildir.
    4)StringBuffer ve StringBuilder ikiside mutable dir.

    Note 1: Immutable String lazim oldugunda string Class kullaniriz.
    note 2: mutable string lazim oldugunda StringBuilder veya stringBuffer kullaniriz.
    Note 3: StringBuffer "Multithread" ve "Synchronization" lazim oldugunda tercih edilir.
           StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.
     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity());//20

    }
}
