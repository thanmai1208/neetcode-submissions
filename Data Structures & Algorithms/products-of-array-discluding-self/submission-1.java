class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nith=nums.length;
        int arr[] = new int[nith];
        for(int i=0;i<nith;i++){
            int a=1;
            for(int j=0;j<nith;j++){
                if(i!=j){
                    a*=nums[j];
                }
            }
            arr[i]=a;
        }
        return arr;
        
    }
}  
