package Day_1.RichestCustomerWealth;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int maxWealth = 0;
        for(int i = 0; i < m; i++){
            int customerWealth = 0;
            for(int j = 0; j < n; j++){
                customerWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        return maxWealth;
    }
}
