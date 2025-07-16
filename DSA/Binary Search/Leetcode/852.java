// https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Search {
     public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start ){
           int mid = start + (end - start)/2;
           if(arr[mid]>arr[mid + 1]){
            end = mid;
           }
           else {
            start = mid + 1;
           }
        }
      return start ;
    }
}