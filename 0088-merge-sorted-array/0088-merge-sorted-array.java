class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        
        int x = m-1, y = n-1, z = arr1.length-1;
        while(y>=0)
        {
             if(x<0 || (arr1[x] < arr2[y]))
            {
                arr1[z] = arr2[y];
                z--;
                y--;
            }
            else
            {
                int temp = arr1[x];
                arr1[x] = arr1[z];
                arr1[z] = temp;
                x--;
                z--;
            }
        }
        
            
    }
}






















/*

        int i=0;
        if(n==0)
        return;
        while(i<m)
        {
            if(arr1[i]<arr2[0])
            i++;
            else
            {
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                Arrays.sort(arr2);
                i++;
            }
        }
        for(int k=0;k<n;k++)
        {
            arr1[i++]=arr2[k];
        }
        
        
        
        
        */