import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double Kmbasi, Yol, Ucret;
        Scanner veri = new Scanner(System.in);

        System.out.println("Yol Uzunluğunu giriniz: ");
        Yol = veri.nextDouble();

        System.out.println("Km Başı Ücreti Giriniz : ");
        Kmbasi = veri.nextDouble();

        Ucret = Yol * Kmbasi;

        System.out.println("Ödemeniz Gereken Ücret: " + Ucret);

        veri.close();
    }
}