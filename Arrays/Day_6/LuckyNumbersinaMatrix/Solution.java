package Day_6.LuckyNumbersinaMatrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Find the minimum element in each row
        int[] rowMin = new int[m];
        for (int i = 0; i < m; i++) {
            rowMin[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        // Step 2: Find the maximum element in each column
        int[] colMax = new int[n];
        for (int j = 0; j < n; j++) {
            colMax[j] = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Step 3: Check for lucky numbers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }

        return luckyNumbers;
    }
}