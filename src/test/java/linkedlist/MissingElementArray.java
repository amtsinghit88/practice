package linkedlist;

public class MissingElementArray {

    public static void main(String [] args){

        int[] arr1={7,5,6,1,4,2};
        missingNum(arr1);
    }

    private static void missingNum(int[] arr1) {
        int n = arr1.length+1;
        int formula = n*(n+1)/2,sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }

        System.out.println("missing num "+(formula-sum));
    }
}
