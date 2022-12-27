package btk;

public class MiniProje {
    public static void main(String[] args) {

        int sayi=25;
        int remainder= sayi%2;
        System.out.println(remainder);

        boolean isprime =true;
        if (sayi<=1)
            System.out.println("sayi asal de[ildir");

        for (int i = 2; i < sayi; i++) {
            if (sayi %i==0){
                isprime=false ;
            }

        }
        if (isprime){
            System.out.println("sayi asaldir");
        }else {
            System.out.println("sayi asal degildir");
        }



    }
}
