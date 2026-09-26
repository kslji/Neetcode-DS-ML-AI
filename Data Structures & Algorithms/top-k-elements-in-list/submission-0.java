class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int num : frequency.keySet()) {
            int freq = frequency.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }
        int[] result = new int[k];
        int index = 0 ;
        for(int iter = buckets.length - 1 ; iter >= 0 ; iter--){
            if(buckets[iter] != null){
                for(int num : buckets[iter]){
                    result[index++] =num;
                    if(index == k){
                        break;
                    } 
                }
            }
            if(index == k){
                break;
            }
        }
        return result;
    }
     
}
