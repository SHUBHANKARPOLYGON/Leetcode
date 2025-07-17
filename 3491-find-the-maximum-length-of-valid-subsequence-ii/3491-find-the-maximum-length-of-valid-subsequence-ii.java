class Solution {
    public int maximumLength(int[] nums, int k) {
        int n=nums.length;
        if(n==0)
        return 0;

        int[][] dp=new int[n][k];
        int maxLen=1;

        for(int i=0;i<n;i++){
            
            for(int r=0;r<k;r++){
                dp[i][r]=1;
            }

            for(int j=0;j<i;j++){
                int r=(nums[j]+nums[i])%k;
                int maxPrev=0;
            for(int rPrev=0;rPrev<k;rPrev++){
                if(rPrev==r){
                    maxPrev=Math.max(maxPrev,dp[j][rPrev]);
                }
            }
            dp[i][r]=Math.max(dp[i][r],maxPrev+1);
            maxLen=Math.max(maxLen,dp[i][r]);
            }
        }
        return maxLen;
    }
}