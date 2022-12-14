package btk;

public class reCapDemo02 {
    public static void main(String[] args) {
        double [] myList = {1.2,1.3,4.3,5.6,};

        double toplam =0;
        double  max = myList[0];
        for (double w:myList) {
            System.out.println(w);
        }
        for (double w:myList) {
            toplam=toplam+w;
            System.out.println(w);

        }
        System.out.println("toplam = " + toplam);
        for (double w:myList) {
            if (max<w){
                max=w;
            }
        }
            System.out.println(max);

    }
}
