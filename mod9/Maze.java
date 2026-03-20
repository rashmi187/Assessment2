package mod9;
public class Maze {
    static void solve(int i, int j, int n) {
        if (i == n - 1 && j == n - 1) {
            System.out.println("Reached End");
            return;
        }

        if (i < n - 1) solve(i + 1, j, n);
        if (j < n - 1) solve(i, j + 1, n);
    }

    public static void main(String[] args) {
        solve(0, 0, 3);
    }
}
