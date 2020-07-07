package array;

import java.util.Arrays;

public class SeparateOddEven {

    public static void main(String [] args){

        int ar[] = {12, 17, 70, 15, 22, 65, 21, 90};
        int l=0,r=ar.length-1;
        System.out.println(Arrays.toString(ar));
        while (l<r){

            if(ar[l]%2==0){
                l++;
            }else if(ar[r]%2!=0){
                r--;
            }else{
                int temp = ar[l];
                ar[l]= ar[r];
                ar[r]= temp;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
