package conditionalsstatements;

public class Main {
    public static void main(String[] args) {
        int sayi = 25;
        if (sayi < 20) {
            System.out.println("Sayi 20'den kucuktur");
        } else if (sayi == 20) {
            System.out.println("Sayi 20'ye esittir");
        } else {
            System.out.println("Sayi 20'den buyuktur");
        }
    }
}
