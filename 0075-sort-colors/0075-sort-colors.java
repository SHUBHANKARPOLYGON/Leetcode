class Solution {
    public void sortColors(int[] arr) {
        int s=0;
		int e=arr.length-1;
		int i=0;
		
		while(i<=e) {
			if (arr[i]==0) {
				
				//swap
				int t=arr[s];
				arr[s]=arr[i];
				arr[i]=t;
				s++;
				i++;
			}
			else if(arr[i]==2) {
				int t=arr[e];
				arr[e]=arr[i];
				arr[i]=t;
				e--;
			}
			else i++;
		}
    }
}