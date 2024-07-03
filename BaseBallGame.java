package NeetCode;

import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length];

        int size = 0;

        for(String str : operations){
            if(str.equals("+")){
                stack[size] = stack[size-1] + stack[size-2];
                size++;
            }
            else if(str.equals("C")){
                size--;
            }
            else if(str.equals("D")){
                stack[size] = 2 * stack[size-1];
                size++;
            }
            else{
                int digit = Integer.parseInt(str);
                stack[size++] = digit ;
            }
        }

        int totalSum = 0;

        for(int i = 0 ; i < size ; i++){
            totalSum += stack[i];
        }

        return totalSum;
    }
    public int calPoints1(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String str : operations){
            if(str.equals("+")){
                int dig1 = stack.pop();
                int dig2 = stack.pop();

                int sum = dig1 + dig2;

                stack.push(dig2);
                stack.push(dig1);
                stack.push(sum);

            }
            else if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                stack.push(2 * stack.peek());
            }
            else{
                int dig1 = Integer.parseInt(str);
                stack.push(dig1);
            }
        }
        int totalSum = 0;

        while(!stack.isEmpty()){
            totalSum += stack.pop();
        }

        return totalSum;
    }
}
