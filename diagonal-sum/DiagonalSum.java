class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Main diagonal
            sum += mat[i][n - 1 - i]; // Secondary diagonal
        }

        // If the matrix has an odd size, subtract the middle element
        if (n % 2 == 1) {
            int mid = n / 2;
            sum -= mat[mid][mid];
        }

        return sum;
    }
}