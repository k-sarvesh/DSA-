
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};
        int start = search(nums , target , true );
        int end = search(nums , target , false);
        ans[0]=start;
        ans[1]=end ;
        return ans ;
    }
    public int search(int[] nums , int target , boolean findstartindex){
        int ans = -1;
         int start=0;
        int end=nums.length-1;
        while(end>=start){
            int middle = start + (end - start)/2;
            if(target == nums[middle]){
                ans = middle;
                if(findstartindex){
                    end = middle -1 ;
                }
                else {
                    start = middle+1;
                }
            }
            else if(target > nums[middle]){
                start = middle + 1;
            }
            else {
                end = middle -1 ;
            }
        }
        return ans;
    }
}