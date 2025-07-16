class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> permute(int[] nums) {
        list=new ArrayList<>();
        permu(nums,new ArrayList<>());
        return list;
    }
    public void permu(int num[],List<Integer> ans){
        if(num.length==ans.size()){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(ans.contains(num[i])==false){
                ans.add(num[i]);
                permu(num,ans);
                ans.remove(ans.size()-1);
            }
        }
    }
}