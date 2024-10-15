import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj wartość b: ");
        int b = scanner.nextInt();

        Tablica mojaTablica = new Tablica(10);
        mojaTablica.wypelnij(a, b);
     System.out.println("Tablica: " + mojaTablica.getTablica());
        System.out.println("Maksymalna wartość: " + mojaTablica.maksimum());
        System.out.println("Minimalna wartość: " + mojaTablica.minimum());
        System.out.println("Druga maksymalna wartość: " + mojaTablica.maksimum2());
        System.out.print("Podaj wartość do wyszukania: ");
        int szukanaWartosc = scanner.nextInt();
        int indeks = mojaTablica.znajdz(szukanaWartosc);

        if (indeks != -1) {
            System.out.println("Wartość " + szukanaWartosc + " znaleziona na indeksie: " + indeks);
        } else {
            System.out.println("Wartość " + szukanaWartosc + " nie została znaleziona w tablicy.");
        }
    }
}
