package number;

public class Fibonaccai {

    public static void main(String [] args){

        int range = 20;
        printFibonaccai(range);
    }

    private static void printFibonaccai(int range) {
        int itr=0,itr1=1,itr2=0;
        int cnt=0;

            System.out.print(itr+","+itr1);
        for(int i=2;i<range;i++){
             cnt++;
            itr2 = itr+itr1;
            itr = itr1;
            itr1 = itr2;
            System.out.print(","+ itr2);
            if(cnt==10){
                System.out.println();
                cnt=0;
            }
        }

    }
}
