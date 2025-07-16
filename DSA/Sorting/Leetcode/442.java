// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
//  Find All Duplicates in an Array
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> nums = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<arr.length ; j++){
            if(arr[j]!=j+1){
                nums.add(arr[j]);
            }
        }
    
        return nums;
    }
    static void swap(int[] arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}