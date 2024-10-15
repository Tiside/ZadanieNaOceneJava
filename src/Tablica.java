import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablica {
    private int n;
    private List<Integer> tablica;

    public Tablica(int n) {
        this.n = n;
        this.tablica = new ArrayList<>();
    }

    public List<Integer> getTablica() {
        return tablica;
    }

    public void wypelnij(int a, int b) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tablica.add(random.nextInt(b - a + 1) + a);
        }
    }

    public int maksimum() {
        int max = tablica.get(0);
        for (int tab : tablica) {
            if (tab > max) {
                max = tab;
            }
        }
        return max;
    }

    public int minimum() {
        int min = tablica.get(0);
        for (int tab : tablica) {
            if (tab < min) {
                min = tab;
            }
        }
        return min;
    }

    public int maksimum2() {
        int max1 = maksimum();
        int max2 = Integer.MIN_VALUE;
        for (int tab : tablica) {
            if (tab != max1 && tab > max2) {
                max2 = tab;
            }
        }
        return max2;
    }

    public int znajdz(int a) {
        for (int i = 0; i < tablica.size(); i++) {
            if (tablica.get(i) == a) {
                return i;
            }
        }
        return -1;
    }
}