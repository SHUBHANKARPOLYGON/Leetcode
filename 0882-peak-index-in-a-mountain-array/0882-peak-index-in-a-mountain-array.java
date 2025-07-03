class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
		int j=arr.length-1;
		
		while(i<=j) {
			int m=(i+j)/2;
			
			if(arr[m]<arr[m+1])i=m+1;
			else j=m-1;
		}
		return i;
    }
}