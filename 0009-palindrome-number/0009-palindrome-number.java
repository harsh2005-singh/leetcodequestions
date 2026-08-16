class Solution {
    public boolean isPalindrome(int n) {
        int x=n;
        int rev=0;

        while(x!=0){
            int temp=x%10;
            x=x/10;
            rev=rev*10+temp;
        } 
        if(n!=rev || n<0){
            return false;
        }  
        return true;
    }
}