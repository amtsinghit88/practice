package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAmount {

    public static void main(String [] args){
        calculateAmount();

    }

    private static void calculateAmount() {
        List<Integer> prices = new ArrayList<>();

        prices.add(10);
        prices.add(18);
        prices.add(1);
        prices.add(1);
        prices.add(16);
        prices.add(12);
        prices.add(10);
        prices.add(18);
        prices.add(19);
        prices.add(6);
        prices.add(6);

        long sum = prices.get(0);



        for(int i =1;i<prices.size();i++){
            ArrayList<Integer> list = new ArrayList<>();
            int min =0,fmin=1;
            int j = 0;
            while(j<i){

                fmin = Math.min(prices.get(j),prices.get(j+1));
                list.add(fmin);
                j++;

            }

            min = Collections.min(list);
            if(min>0){
                min = prices.get(i)-min;
                sum+=min;
            }
        }
        System.out.println(sum);
    }
}
