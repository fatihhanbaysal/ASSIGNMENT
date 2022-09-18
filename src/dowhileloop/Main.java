package dowhileloop;

public class Main {
    public static void main(String[] args) {
        int i = 100;
        do {
            System.out.println(i);
            i++;
        } while (i < 1000);
        System.out.println("Do-While döngüsü bitti");
    }
}
