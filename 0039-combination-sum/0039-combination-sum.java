class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        CS(candidates,target,0,new ArrayList<>());
        return list;
    }
    public void CS(int coins[],int target, int n,List<Integer> ans){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=n;i<coins.length;i++){
            if(target>=coins[i]){
                ans.add(coins[i]);
                CS(coins,target-coins[i],i,ans);
                ans.remove(ans.size()-1);
            }
        }
    }
}