public class Solution{
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=0;
        

        //moving non zero elements to the starting of array
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }

        //filling zero in the remaining indexes
        while(index<n){
            nums[index]=0;
            index++;
        }
    }
}
