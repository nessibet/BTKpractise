package btk;

public class LoopDemo {
    public static void main(String[] args) {
        //For
        for (int i = 1; i < 10; i++) {
            System.out.println(i);

        }
        System.out.println("Dongu bitti");

        for (int j = 1; j < 10; j+=2) {
            System.out.println(j);

        }
        //While
        int k =1;
        while (k<10){
            System.out.print(k);
            k+=2;
        }
        System.out.println("While dongusu bitti");

        //do-wehile
        int t=1;
        do {
            System.out.println(t);
            t+=2;

        }while (t<10);
        System.out.println("Do-While dongusu bitti");


    }
}
