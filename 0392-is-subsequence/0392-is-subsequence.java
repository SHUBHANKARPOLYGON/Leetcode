class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        int Slen=s.length(), Tlen=t.length(); 

        while (i<Slen&&j<Tlen){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==Slen;
    }

}