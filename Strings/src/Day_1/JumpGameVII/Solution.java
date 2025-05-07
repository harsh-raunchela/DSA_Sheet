package Day_1.JumpGameVII;

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] reachable = new boolean[n];
        reachable[0] = true;

        int winCount = 0;

        for(int i = 1; i < n; i++){
            if(i >= minJump){
                if(reachable[i - minJump]){
                    winCount++;
                }
            }

            if(i > maxJump){
                if(reachable[i - maxJump - 1]){
                    winCount--;
                }
            }

            if(s.charAt(i) == '0' && winCount > 0){
                reachable[i] = true;
            }
        }
        return reachable[n -1];
    }
}
