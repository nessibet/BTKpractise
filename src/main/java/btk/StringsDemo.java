package btk;

public class StringsDemo {
    public static void main(String[] args) {

        String mesaj = "bugun hava cok guzel";

        System.out.println(mesaj);

        System.out.println("Eleman sayisi: "+ mesaj.length());//harf sayisini verir
        System.out.println("5. eleman" + mesaj.charAt(4)); //5. harfi bulur

        System.out.println(mesaj.concat(" Yasasin!"));//metnimizin sonuna parantez icindeki mesaji ekler

        System.out.println(mesaj.startsWith("B"));//metnin parantez icindeki ifadeyle baslayip baslamadigini kontrol eder

        System.out.println(mesaj.endsWith(","));//metnin paranetz icindeki ifadeyle bitip bitmedigini dogru yanlis dondurerek kontrol eder

        char [] karakterler = new char[5];
       mesaj.getChars(0,5,karakterler,0);//bir metnin istedigimiz bir kismini index belirterek ekranda gormemizi saglar
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a'));//parantez icindeki karakterin ilk indexini bize verir
        System.out.println(mesaj.indexOf("av"));//parantez icindeki karakterin ilk indexini bize verir
        System.out.println(mesaj.lastIndexOf('a'));//parantez icindeki karakterin son indexini bize verir

        String yenimesaj = mesaj.replace(' ','-');
        System.out.println(yenimesaj);//virgulden once atadigimiz degeri virgulden sonraki degerle degistirir

        System.out.println(mesaj.substring(2));//metnin belirttigimiz indexten sonrasini parcalayarak yazdirir
        System.out.println(mesaj.substring(2,5));//metnin belirttigimiz indexler arasindaki kismini yazdirmamizi saglar

        for (String kelime :mesaj.split(" ")){ //metin icindeki her bir kelimeyi tek tek bosluklardan ayirarak yazdirir
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());//metin icindeki butun harfleri kucuk harfe cevirir
        System.out.println(mesaj.toUpperCase());//metin icindeki butun harfleri buyuk harfe cevirir

        System.out.println(mesaj.trim());//metnin basindaki ve sonundaki istenmeyen bosluklari siler




    }
}
