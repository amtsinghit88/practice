package array;

public class SecondLargestEleArray {

    public static void main(String [] args){

        int [] ar = {7,5,6,1,4,2};
        findSecondLargest(ar);

    }

    private static void findSecondLargest(int[] ar) {

        int max = Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
        for(int i=0;i<ar.length-1;i++) {

            if (ar[i] > max){
                secondMax= max;
                max = ar[i];
            }else if (ar[i]>secondMax){
                secondMax=ar[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
