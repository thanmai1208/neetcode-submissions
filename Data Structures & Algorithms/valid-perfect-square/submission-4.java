class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int r=num;
        while(l<=r){
            int m=(l+r)/2;
            long s=(long) m*m;
            if(s==num){
                return true;
            }
            if(s>num){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return false;
        
    }
}