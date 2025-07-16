class Solution {
    public int maximumLength(int[] nums) {
        if(nums.length<2)
        return nums.length;

        boolean allSameParity=true;
        int firstParity=nums[0]%2;
        for(int num:nums){
            if(num%2!=firstParity){
                allSameParity=false;
                break;
            }
        }
        if(allSameParity)
        return nums.length;

        int[]dpSame=new int[2];
        int[]dpAlt=new int[2];
        dpSame[nums[0]%2]=1;
        dpAlt[nums[0]%2]=1;
        int maxLen=1;

        for(int i=1;i<nums.length;i++){
            int currentParity=nums[i]%2;
            int newSameLength=dpSame[currentParity]+1;
            int newAltLength=dpAlt[1-currentParity]+1;
            dpSame[currentParity]=Math.max(dpSame[currentParity],newSameLength);
            dpAlt[currentParity]=Math.max(dpAlt[currentParity],newAltLength);
            maxLen=Math.max(maxLen, Math.max(dpSame[currentParity], dpAlt[currentParity]));
        }
        return maxLen;
    }
}