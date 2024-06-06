package NeetCode;

public class HappyNumber {
    public boolean happyNumber(int n){
        int fast = n;
        int slow = n;

        do{
            fast = sqrNum(sqrNum(fast));
            slow = sqrNum(slow);
        }while(fast != slow);

        return fast == 1;
    }

    public int sqrNum(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum+= digit*digit;
            n/=10;
        }

        return n;
    }
}
