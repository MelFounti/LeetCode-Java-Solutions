
 class Solution {
  public void duplicateZeros(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;
       int start = 0, end = n-1; 
      while(start<end){
          if(arr[start]==0)
              end--;
          start++;    
      }      
        if (end == n - 1)
            return;

        for (int i = n - 1; i >= 0 && end>=0 ; i--,end--) {
            arr[i] = arr[end];
            if (arr[i] == 0 && end != start) {
                arr[i - 1] = 0;
                i--;
            }

        }
    }

}
