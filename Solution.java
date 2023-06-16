class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    private void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums,int index){
        if(index==nums.length) {list.add(new ArrayList(tempList));return;}
        else{
            for (int i = 0; i < nums.length; i++) {
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backTrack(list, tempList, nums, index+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}