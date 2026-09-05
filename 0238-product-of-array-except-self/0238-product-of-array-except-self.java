class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
         // Left products
        int l=1;
        for(int i=0;i<n;i++){
            arr[i]=l;
            l*=nums[i];
        }
        // Right products
        int r=1;
        for(int i=n-1;i>=0;i--){
            arr[i]*=r;
            r*=nums[i];
        }
        return arr;
    }
}