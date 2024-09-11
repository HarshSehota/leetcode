class Solution {
    public void moveZeroes(int[] nums) {
         int counter=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[counter];
                nums[counter]=nums[i];
                nums[i]=temp;
                counter++;
            }
         }
         
        
    }
}