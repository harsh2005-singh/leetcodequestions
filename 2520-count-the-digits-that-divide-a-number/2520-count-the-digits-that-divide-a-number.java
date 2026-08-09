class Solution {
    public int countDigits(int num) {
        int n=num;
        int count=0;
        while(n>0){
            int div=n%10;
            n/=10;
            if(num%div==0){
            count++;
            }
        }
        return count;
    }
}