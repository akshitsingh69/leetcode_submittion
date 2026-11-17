class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((mid!=0)&&(mid!=n)&&(arr[mid-1]<arr[mid])&&(arr[mid]>arr[mid+1])){
                return mid;
            }
            else if ((mid!=n)&&(arr[mid]<arr[mid+1])){
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}