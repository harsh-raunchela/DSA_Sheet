package Day_5.FindtheHighestAltitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans[] = new int[n + 1];
        ans[0] = 0;

        for(int i = 1; i <= n; i++){
            ans[i] = ans[i - 1] + gain[i - 1];
        }
        int high = findLargest(ans);

        return high;
    }

    private static int findLargest(int ans[]){
        int n = ans.length;
        int largest = 0;

        for(int i= 0 ;i < n; i++){
            if(largest < ans[i]){
                largest = ans[i];
            }
        }
        return largest;
    }
}
