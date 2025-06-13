public class NQueens {
    private int[] queens;
    private int n;
    private int solutions = 0;

    public NQueens(int n) {
        this.n = n;
        this.queens = new int[n];
    }

    public void solve() {
        placeQueen(0);
        System.out.println("Total solutions: " + solutions);
    }

    private void placeQueen(int row) {
        if (row == n) {
            printSolution();
            solutions++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                queens[row] = col;
                placeQueen(row + 1);
            }
        }
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == row - i) {
                return false;
            }
        }
        return true;
    }

    private void printSolution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8;
        NQueens nq = new NQueens(n);
        nq.solve();
    }
}
