class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet < Integer>  map = new HashSet <>();
        for(int num:nums){
            map.add(num);
        }
        int longest=0;
        for(int num:map){
            if(!map.contains(num-1)){
                int current = num;
                int count=1;
                while(map.contains(current+1)){
                    count++;
                    current++;
                }
                longest = Math.max(longest, count);
            }

        }
        return longest;
       
            
        }
} 

