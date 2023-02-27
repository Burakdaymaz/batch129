package practice.nighttime08;

public class Browser {
    public static  void main(String[] args) {
        String adresCubugu = "Her Browserde adresCubugu vardir";

    Edge edge = new Edge();
    edge.search();
    edge.sifreKaydetme();
    edge.get();

    Edge edge2 = new Edge(adresCubugu);
    System.out.println(edge2.adresCubugu);
    }


    public void get() {
        System.out.println("Browserlar Web sayfasina gider");
    }
        public void search() {
            System.out.println("Browserlar Web sayfasinda arastirma yapar");
        }
        public void sifreKaydetme() {
            System.out.println("Browser istenildiginde sifre kaydeder");
        }



}
