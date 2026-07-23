class Solution {
    public int[] productExceptSelf(int[] nums) {
     int left=0;
     int[] result=new int[nums.length];
     while(left<nums.length){
        int product=1;
     for(int right=0;right<nums.length;right++){
     if (left != right) {
                    product*= nums[right];
                }

            }
            result[left] = product;
            left++;
        }
     return result; 
    }
}  
