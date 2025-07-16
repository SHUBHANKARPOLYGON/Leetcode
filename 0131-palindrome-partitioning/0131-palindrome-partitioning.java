class Solution {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void partition(String s, ArrayList<String> list, List<List<String>> result){

        if(s.length() == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=1; i<=s.length(); i++){
            String str = s.substring(0, i);
            if(isPalindrome(str)){
                list.add(str);
                partition(s.substring(i), list, result);
                list.remove(list.size() - 1); // Backtrack
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        partition(s, list, result);

        return result;
    }
}