package btk;

import java.util.Scanner;

public class ArkadasSayilar {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("2 adet sayi giriniz");
        int sayi1= input.nextInt();
        int sayi2 = input.nextInt();
        int sum1=0;
        int sum2=0;


        for (int i = 1; i < sayi1; i++) {
            if (sayi1%i==0){
                sum1=sum1+i;

            }

        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2%i==0){
                sum2=sum2+i;

            }

        }
        if (sayi1==sum2&& sayi2==sum1){
            System.out.println("bu iki sayi arkadastir");
        }else
            System.out.println("arkadas sayi degil");


    }
}
