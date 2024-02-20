import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double height, weight, vKitleIndeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (m) giriniz:");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg) giriniz:");
        weight = input.nextDouble();
        // Vücut kitle indeksi hesaplama
        vKitleIndeks = weight/(height*height);
        System.out.println("Vücut kitle indeksiniz: " + vKitleIndeks);
    }
}
