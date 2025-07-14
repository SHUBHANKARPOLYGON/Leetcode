class Solution {
    public static void find(String ans, int idx, String digit, String[]key, List<String>result){
        if(idx==digit.length()) {
			result.add(ans);
			return;
		}
		int d=digit.charAt(idx)-'0';
		String s=key[d];
		for(int i=0;i<s.length();i++) {
			find(ans+s.charAt(i),idx+1,digit,key,result);
		}
    }
    public List<String> letterCombinations(String digits){
        String key[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return result;
        }
        find("",0,digits,key,result);
        return result;
    }
}

