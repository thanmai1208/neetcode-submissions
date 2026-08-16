class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] posi=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int pos=nums.length-1;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                posi[pos]=nums[left]*nums[left];
                left++;
            }else if(Math.abs(nums[left])<Math.abs(nums[right])){
                posi[pos]=nums[right]*nums[right];
                right--;
            }else{
                posi[pos]=nums[left]*nums[left];
                
                right--;
            }
            pos--;
        }
        return posi;

        
    }
}