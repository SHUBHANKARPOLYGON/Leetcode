class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; // Pointer for the last element of nums1
        int j=n-1; // Pointer for the last element of nums2
        int k=m+n-1; // Pointer for the last position of the merged array

        // Merge nums1 and nums2 from the end
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }

        // Copy any remaining elements from nums2 to nums1
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}