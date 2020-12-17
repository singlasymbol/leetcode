class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            int currentNumber = Math.abs(nums[i]);
            if(nums[currentNumber - 1] > 0) {
                nums[currentNumber - 1] = (-1) * nums[currentNumber -1];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                arr.add(i + 1);
            }
        }
        
        
        return arr;
    }
}