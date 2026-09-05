class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> results = new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
        if(candies[i]+extraCandies>=max){
            results.add(true);
        }else{
            results.add(false);
        }
        }
        return results;
    }
}