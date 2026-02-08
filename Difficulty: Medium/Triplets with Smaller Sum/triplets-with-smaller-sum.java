// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        int count = 0;
        
        for(int i= 0;i<n-1;i++){
            int j = i+1;
            int k = n-1;
            
            
            while(j<k){
                long trip=arr[i]+arr[j]+arr[k];
            if(trip<sum){
                count = count + (k-j);
               j++;
            }else{
                k--;
            }
        }
        }
        return count;
    }
}
