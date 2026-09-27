class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int n = arr.length;
        int slargest=-1;
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
}
