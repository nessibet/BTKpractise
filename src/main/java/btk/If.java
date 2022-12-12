package btk;

public class If {
    public static void main(String[] args) {
        int sayi =24;
        if (sayi<20){
            System.out.println("sayi 20den kucuktur");
        }
        if (sayi<15) {
            System.out.println("Sayi 15den kucuktur");
        }else if (sayi==20){
            System.out.println("sayi 20 ye esittir");

        }else
            System.out.println("Sayi 20den buyuktur");
    }
}
