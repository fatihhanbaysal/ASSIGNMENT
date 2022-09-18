package arrays;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Fatihhan";
        String ogrenci2 = "Ahmet";
        String ogrenci3 = "Pinar";
        String ogrenci4 = "Mehmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Fatihhan";
        ogrenciler[1] = "Ahmet";
        ogrenciler[2] = "Pinar";
        ogrenciler[3] = "Mehmet";

        for (int i = 0; i < ogrenciler.length; i++)
            System.out.println(ogrenciler[i]);

        System.out.println("-------------------------");

        for (String ogrenci:ogrenciler)
            System.out.println(ogrenci);
    }
}
