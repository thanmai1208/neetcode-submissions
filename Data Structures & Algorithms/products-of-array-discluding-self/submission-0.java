class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int  arr[] = new int[n];
       
        for(int i=0;i<n;i++){
            int a=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    a*=nums[j];
                }
            }
              arr[i] =a;
        }

        return arr;


            
        }
        
    }
  
