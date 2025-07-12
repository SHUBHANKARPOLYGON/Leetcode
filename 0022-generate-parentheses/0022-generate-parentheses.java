class Solution {
    static List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
    list=new ArrayList<>();
		int total=generate("",0,0,n);
		System.out.println(list);
		System.out.println(total);
        return (list);
}
    
	public static int generate(String ans,int open,int close,int n) {
		if(open==n&&close==n) {
			System.out.println(ans);
			list.add(ans);
			return 1;
		}
		
		int o=0; int c=0;
		if(open<n) {
			o=generate(ans+"(", open+1, close, n);
		}
		if(close<open) {
			c=generate(ans+")",open,close+1,n);
		}
		return o+c;
    }
}