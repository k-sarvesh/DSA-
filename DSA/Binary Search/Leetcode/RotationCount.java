
public class RotationCount{
        public static void main(Strings[] args){
        int[] arr = {15,18,2,3,6,12};
        System.out.println(Rotationcount(arr));
        
    }
    static int Rotationcount(int[] arr){
        // int count =0;
        // int max = peak(arr);
        // for(int i = 0; i<max;i++){
        //     count ++;
        // }
        // return count;

        int max = peak(arr);
        return max + 1;

    }
    static  int peak(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while (start <= end){
            int mid = start + (end - start )/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<= arr[start]){
                end = mid-1 ;

            }
            else{
                start = mid +1 ;

            }
        }
    }

}