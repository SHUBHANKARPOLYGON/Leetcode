class Solution {
	public static void create(int n,int given_n, ArrayList<Integer> ans) {
		if(n>given_n)
			return;
        ans.add(n);
		n=n*10;
		if(n>given_n)
			return;
		for(int i=0;i<=9;i++) {
			create(n+i,given_n, ans);
		}
	}
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=9;i++) {
			create(i,n,ans);
        }
        return ans;
    }
}