package Day_4.JumpGame;

class Solution {
    public boolean canJump(int[] nums) {
        int i  = 0;
        int j = 0;

        while(i < nums.length && i <= j) {
            j = Math.max(j , i + nums[i]);
            i++;
        }
        return j >= nums.length - 1;
    }
}
