class Solution {
    public int[] twoSum(int[] nums, int target) {
        int nith=nums.length;
        for(int i=0;i<nith;i++){
            for(int j=i+1;j<nith;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        
    }
}
