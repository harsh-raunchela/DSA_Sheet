package Day_6.FindNUniqueIntegerwhoseSumisZero;

class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int num = 1;

        for(int i = 0; i < n/2; i++){
            ans[i] = num;
            ans[n - 1 - i] = -num;
            num++;
        }

        if(n % 2 != 0){
            ans[n/2] = 0;
        }
        return ans;
    }
}
