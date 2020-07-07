package array;

import java.util.Arrays;

public class Separate0and1 {

    public static void main(String [] args){

        int arr[] = {0,1,0,0,1,1,1,0,1};
        System.out.println(Arrays.toString(arr));
        int l=0,r=arr.length-1;
        while(l<r){

            if(arr[l]==0)
                l++;
            else if(arr[r]==1)
                r--;
            else{
                int temp = arr[l];
                arr[l]= arr[r];
                arr[r]= temp;
                l++;
                r--;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
