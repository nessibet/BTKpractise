package btk;

public class sesliHarf {
    public static void main(String[] args) {
        char harf ='A';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin harfler");
                break;
            default:
                System.out.println("Ince harfler");
        }
    }
}
