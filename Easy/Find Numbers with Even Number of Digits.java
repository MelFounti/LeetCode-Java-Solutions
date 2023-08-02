
class Solution {
    
    int countDigit(long n ){
       int count = 0;
        while(n!=0){
            n =n/10;
            ++count;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
            int evenCount = 0;
            for (int i : nums) {
                if(countDigit(i)%2 == 0)
                evenCount++;
            }
            return evenCount;
    }}
