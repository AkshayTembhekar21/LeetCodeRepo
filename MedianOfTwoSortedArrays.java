class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int res[] = new int[totalLen];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
                k++;
            } else {
                res[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i<nums1.length){
            res[k] = nums1[i];
            i++;
            k++;
        }
        while (j< nums2.length) {
            res[k] = nums2[j];
            j++;
            k++;
        }
        
        if (totalLen%2!=0){
            return res[(totalLen/2)];
        } else {
            return (res[totalLen/2] + res[(totalLen/2)-1])/2f;
        }
    }

}