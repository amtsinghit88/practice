import java.util.Stack;

public class MaxInStack {


    static class StackWithMax{
        static Stack<Integer> myStack = new Stack<>();
        static Stack<Integer> trackStack = new Stack<>();

        static void push(int x){

            if(myStack.isEmpty()){
                myStack.push(x);
                trackStack.push(x);
            }else {
                int itr = trackStack.peek();
                if(x>itr){
                    trackStack.push(x);
                }else
                    trackStack.push(itr);
            }
            myStack.push(x);
        }

        static void pop(){
            myStack.pop();
            trackStack.pop();
        }

        static int getMax(){
            return trackStack.pop();
        }
    }


    public static void main(String [] args){

        StackWithMax.push(25);
        StackWithMax.push(100);
        StackWithMax.push(5);
        System.out.println(StackWithMax.getMax());
        StackWithMax.push(65);
        StackWithMax.push(15);
        System.out.println(StackWithMax.getMax());
        StackWithMax.push(75);
        StackWithMax.push(15);
        System.out.println(StackWithMax.getMax());


    }
}
