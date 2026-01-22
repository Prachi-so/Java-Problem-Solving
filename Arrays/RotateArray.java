public class Solution{
     public int[] rotate(int[] nums, int k) {
          int n=nums.length;
          k=k%n;  //when k is grater than array length

          reverse(nums,0,n-1);  //reversre entire array
          reverse(nums,0,k-1);  //reversing first k elements
          reverse(nums,k,n-1);  //reversing rest of the elements

          return nums;  //returning modified array


     }

     static void reverse(int[] nums, int start, int end){
         // swapping until start is less than end
          while(start<end){
               int temp=nums[start];
               nums[start]=nums[end];
               nums[end]=temp;
               start++;
               end--;
          }
     }
}
