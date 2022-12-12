package btk;

public class Switch {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Gectiniz");
                break;
            case 'B':

            case 'C':
                System.out.println("Iyi ile gectiniz");
            case 'D':
                System.out.println("Fena degil, Gectiniz");
                break;
            case 'F':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }


    }
}
