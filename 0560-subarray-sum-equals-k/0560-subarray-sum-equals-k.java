class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;

        for(int s=0;s<n;s++){
            int sum=0;
            for(int e=s;e<n;e++){
                sum+=nums[e];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}