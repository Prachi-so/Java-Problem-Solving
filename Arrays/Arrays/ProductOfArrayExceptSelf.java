public class Solution{
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arrResult=new int[n];  //result array

        arrResult[0]=1;
        //calculating prefix product
        for(int i=1;i<nums.length;i++){
            arrResult[i]=arrResult[i-1]*nums[i-1];
        }

        int n1=1;
        //calculating suffix product 
        for(int i=n-1;i>=0;i--){
            arrResult[i]=arrResult[i]*n1;
            n1=n1*nums[i];
        }
       
        return arrResult;

        
    }
}
