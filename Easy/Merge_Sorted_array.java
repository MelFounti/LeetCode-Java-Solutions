class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m-1;
        int nIndex=n-1;
        int mergedIndex=m+n-1;
          while(mIndex>=0 && nIndex>=0){
            if(nums2[nIndex]>nums1[mIndex]){
               
                    nums1[mergedIndex]= nums2[nIndex--];
                
            }else if(nums2[nIndex]<nums1[mIndex]){
                    nums1[mergedIndex]=nums1[mIndex];
                    nums1[mIndex]=0;
                    mIndex--;
           }else if(nums2[nIndex]==nums1[mIndex]){
                   nums1[mergedIndex--]=nums1[mIndex--];
                   nums1[mergedIndex]= nums2[nIndex--];
           }
           mergedIndex--;
          }
          while(mIndex>=0){
          
            nums1[mergedIndex--]=nums1[mIndex--];
          }

          while(nIndex>=0){
            nums1[mergedIndex--]=nums2[nIndex--];
          }

        System.out.println(Arrays.toString(nums1));
        

    
    }
}
