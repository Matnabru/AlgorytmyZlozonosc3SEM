public class Silnia {
    int silnia(int n) {
        if (n > 1)
            return n * silnia(n - 1);
        else
            return 1;
    }
}
