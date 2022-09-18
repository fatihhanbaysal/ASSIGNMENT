package findnumber;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int aranacak = 11;
        boolean varMi = false;
        int i;
        for (i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println(aranacak + " sayisi var " + i + ". indexte bulunmaktadir.");
        } else {
            System.out.println("sayi bulunamadi.");
        }
    }
}
