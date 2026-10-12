class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        
        for(int i=0;i<=n;i++){
            int c=0;
            int j=i;
            while(j>0){
            if((j&1)!=0){
                c++;
            }
            j=j>>1;
            }
            arr[i]=c;

        }
        return arr;
        }
        
    }

