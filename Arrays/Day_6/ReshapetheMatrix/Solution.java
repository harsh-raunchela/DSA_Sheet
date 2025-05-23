package Day_6.ReshapetheMatrix;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // If reshape not possible, return original matrix
        if (m * n != r * c) return mat;

        int[][] ans = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }

        return ans;
    }
}

