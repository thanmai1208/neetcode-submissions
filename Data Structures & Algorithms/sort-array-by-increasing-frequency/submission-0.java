class Solution {
    public int[] frequencySort(int[] nums) {
        int arr[] = new int[nums.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, map.get(nums[i]));
        }

        int k = 0;

        for (int i = 1; i <= max; i++) {
            for (int num = 100; num >= -100; num--) {
                if (map.containsKey(num) && map.get(num) == i) {
                    int freq = map.get(num);

                    for (int x = 0; x < freq; x++) {
                        arr[k++] = num;
                    }
                }
            }
        }

        return arr;
    }
}