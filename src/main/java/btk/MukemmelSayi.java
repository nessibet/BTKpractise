package btk;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= input.nextInt();
        int count =0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                count=count+i;
            }

        }

        if (count==sayi){
            System.out.println("Mukemmel sayi");
        }else {
            System.out.println("mukemmel degildir");
        }

    }
}
