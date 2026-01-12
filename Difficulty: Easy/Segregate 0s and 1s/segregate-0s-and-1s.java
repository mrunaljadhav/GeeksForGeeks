// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length;
        int i=0,idx=n-1;
       // int[] res=new int[n];
        while(i<=idx){
            if(arr[i]==0){
               // res[i]=0;
                i++;
            }else if(arr[idx]==1){
               // res[idx]=1;
                idx--;
            }else{
                int temp = arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                i++;
                idx--;
            }
        }
        
      //  arr= res;
    }
}
