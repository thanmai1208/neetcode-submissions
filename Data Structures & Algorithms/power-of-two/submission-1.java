class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<n;i++){
            if((n&n-1)==0){
                return true;
            }
        }
            return false;
        }
        
    
        
    }
