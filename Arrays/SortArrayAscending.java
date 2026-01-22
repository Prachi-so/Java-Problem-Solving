public class Solution{
    public int[] sortArray(int[] nums){
        
        //will compare ith element with the rest of array elements and switch
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }

           
        }

       
      return nums;
    }
}
