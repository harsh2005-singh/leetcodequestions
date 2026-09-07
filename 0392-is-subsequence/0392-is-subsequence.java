class Solution {
    public boolean isSubsequence(String s, String t) {
        int sn=s.length();
        int tn=t.length();
        int i=0;
        for(int j=0;j<tn;j++){
            if(i<sn && s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        return i==sn;
    }
}