class Solution {
    public String reverseWords(String s) {
	String rev="";
		s=s.replaceAll("\\s+", " "); //it will remove the spacing
		String words[]=s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			rev=rev+words[i]+" ";
		}
		return rev.trim();
    }
}